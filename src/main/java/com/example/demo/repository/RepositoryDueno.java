package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Dueno;
import com.example.demo.model.Mascota;

public interface RepositoryDueno {
	
	void saveDueno(Dueno student);
	
	List<Dueno> getListDuenos();
	
	void saveMascota(Mascota mascota);
	
	List<Mascota> getListMascotas();
	
	Mascota findMascotaById(Mascota mascotaChange);
	
	Dueno findDuenoById(Dueno duenoChange);

}
