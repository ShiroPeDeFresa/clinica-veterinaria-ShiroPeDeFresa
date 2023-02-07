package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Dueno;
import com.example.demo.model.Mascota;

public interface ServiceDueno {

	void guardarDueno(Dueno dueno);
	
	List<Dueno> getAllDuenos();
	
	void guardarMascota(Mascota mascota);
	
	List<Mascota> getAllMascotas();
	
	Mascota findMascotaById(Mascota mascotaChange);
	
	Dueno findDuenoById(Dueno duenoChange);
}
