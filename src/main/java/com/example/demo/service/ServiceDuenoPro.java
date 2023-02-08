package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Pro")
public class ServiceDuenoPro extends AbstractDuenoService {
	
	public ServiceDuenoPro() {
		socio = "No";
		raza= "Labrador";
	}

	
	
	
	
	
	
	
}
