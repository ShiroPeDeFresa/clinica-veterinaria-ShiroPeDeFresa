package com.example.demo.service;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dueno;
import com.example.demo.model.Mascota;
import com.example.demo.repository.RepositoryDueno;

@Service
public abstract class AbstractDuenoService implements ServiceDueno {

	Logger l = org.apache.logging.log4j.LogManager.getLogger();

	public String socio;
	public String raza;
	
	@Autowired
	@Qualifier("list")
	public RepositoryDueno repository;

	@Override
	public void guardarDueno(Dueno dueno) {
		l.info("guardando dueño en Veterinaria");
		dueno.socio = socio;
		System.out.println(dueno.toString());
		repository.saveDueno(dueno);

	}
	
	public List<Dueno> getAllDuenos(){
		return repository.getListDuenos();
	}
	
	@Override
	public void guardarMascota(Mascota mascota) {
		l.info("guardando dueño en Veterinaria");
		mascota.raza = raza;
		repository.saveMascota(mascota);

	}
	
	public List<Mascota> getAllMascotas(){
		return repository.getListMascotas();
	}

	@Override
	public Mascota findMascotaById (Mascota mascotaChange) {
		
		return repository.findMascotaById(mascotaChange);
	}
	@Override
	public Dueno findDuenoById (Dueno duenoChange) {
		
		return repository.findDuenoById(duenoChange);
	}
}
