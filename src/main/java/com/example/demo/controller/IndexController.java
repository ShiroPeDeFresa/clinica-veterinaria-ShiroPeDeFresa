package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Dueno;
import com.example.demo.model.Mascota;
import com.example.demo.service.ServiceDueno;

@Controller
public class IndexController {
	//añado el logger para tener informacion de la aplicacion en arranque.
	Logger l = org.apache.logging.log4j.LogManager.getLogger();
	

	public ServiceDueno serviceDueno;

	@Autowired
	public IndexController(ServiceDueno serviceDueno) {
		this.serviceDueno = serviceDueno;
	}

	@GetMapping("/")
	public ModelAndView goToIndexPage() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("dueno", new Dueno());
		modelAndView.addObject("mascota", new Mascota());
		modelAndView.addObject("allMascotas", serviceDueno.getAllMascotas());
		return modelAndView;
	}	

	@PostMapping("addDuenoForm")
	public String logDuenoInfoAndSendToEndPage(@ModelAttribute("dueno") Dueno duenoConString) {
		String mascotaAMontar = duenoConString.mascotasDescompuesto;
		String[] parts = mascotaAMontar.split("\\|");              
		System.out.println(Arrays.asList(parts));
		
		int numChip = Integer.parseInt(parts[0]);
		String nombre = parts[1];
		boolean vacunado = false;
		if(parts[2] == "true") {
			vacunado = true;
		}
		
		Mascota mascotaFinal = new Mascota(numChip, nombre, vacunado);
		Dueno dueno = new Dueno(duenoConString.dni, duenoConString.nombre, mascotaFinal);
		serviceDueno.guardarDueno(dueno);
		l.info(dueno.toString());
		return "end";
	}
	
	@GetMapping("listadoDuenos")
	public ModelAndView goToDuenoList() {
		ModelAndView modelAndView = new ModelAndView("duenoList");
		List<Dueno> duenoList = serviceDueno.getAllDuenos();
		modelAndView.addObject("allMascotas", serviceDueno.getAllMascotas());

		modelAndView.addObject("dueno", new Dueno());

		modelAndView.addObject(duenoList);
		return modelAndView;
	}
	
	@PostMapping("addMascotaForm")
	public String logMascotaInfoAndSendToEndPage(@ModelAttribute("mascota") Mascota mascota) {
		serviceDueno.guardarMascota(mascota);
		l.info(mascota.toString());
		return "end";
	}
	
	@GetMapping("listadoMascotas")
	public ModelAndView goToMascotaList() {
		ModelAndView modelAndView = new ModelAndView("mascotaList");
		List<Mascota> mascotaList = serviceDueno.getAllMascotas();
		modelAndView.addObject(mascotaList);
		modelAndView.addObject("mascota", new Mascota());

		return modelAndView;
	}
	
	@PostMapping("editarMascotas")
	public ModelAndView EditMascota(@ModelAttribute("mascota") Mascota mascota) {
		ModelAndView modelAndView = new ModelAndView("mascotaEdit");
		System.out.println(mascota.toString());
		Mascota mascotaCambiada = serviceDueno.findMascotaById(mascota);
		modelAndView.addObject("mascota", mascotaCambiada);
		return modelAndView;
	}
	@PostMapping("editarDuenos")
	public ModelAndView EditDueno(@ModelAttribute("dueno") Dueno dueno) {
		ModelAndView modelAndView = new ModelAndView("duenoEdit");
		System.out.println(dueno.toString());
		Dueno duenoCambiado = serviceDueno.findDuenoById(dueno);
		modelAndView.addObject("dueno", duenoCambiado);
		return modelAndView;
	}
	
	

}
