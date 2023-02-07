package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Dueno;
import com.example.demo.model.Mascota;

@Repository("list")
public class ListRepositoryDueno implements RepositoryDueno{

	List<Dueno> list = new ArrayList<Dueno>();
	
	@Override
	public void saveDueno(Dueno dueno) {
		list.add(dueno);

		for (Dueno s : list) {
			System.out.println(s);
		}
	}
	
	public List<Dueno> getListDuenos() {
		return this.list;
	}
	
	List<Mascota> listMascotas = new ArrayList<Mascota>();

	@Override
	public void saveMascota(Mascota mascota) {
		listMascotas.add(mascota);

		for (Mascota s : listMascotas) {
			System.out.println(s);
		}
	}

	@Override
	public List<Mascota> getListMascotas() {
		return this.listMascotas;
	}

	@Override
	public Mascota findMascotaById(Mascota mascotaChange) {
	    for (Mascota mascota : listMascotas) {
	        if (mascota.numChip == mascotaChange.numChip) {
	            mascota.nombre = mascotaChange.nombre;
	            mascota.vacunado = mascotaChange.vacunado;
	        }
	    }
	    return mascotaChange;
	}
	
	@Override
	public Dueno findDuenoById(Dueno duenoChange) {
	    for (Dueno dueno : list) {
	        if (dueno.nombre.equals(duenoChange.nombre)) {
	        	dueno.dni = duenoChange.dni;
	        	
	    		String[] parts = duenoChange.mascotasDescompuesto.split("\\|");              
	    		
	    		int numChip = Integer.parseInt(parts[0]);
	    		String nombre = parts[1];
	    		boolean vacunado = false;
	    		if(parts[2] == "true") {
	    			vacunado = true;
	    		}
	    		Mascota mascotaFinal = new Mascota(numChip, nombre, vacunado);
	    		dueno.mascota =  mascotaFinal;
	    		
	        }
	        System.out.println("no tan miau");
	    }
	    
	    return duenoChange;
	}
}
