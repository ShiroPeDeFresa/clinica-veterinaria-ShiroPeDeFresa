package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Vet")
public class ServiceDuenoVet extends AbstractDuenoService {
	
	public ServiceDuenoVet() {
		socio = "Si";
		raza="nose mucho de perros";
	}

	
	
	
	
	
	
	
}
