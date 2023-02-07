package com.example.demo.model;

public class Dueno {

	public String nombre;
	public String dni;
	public Mascota mascota;
	public String mascotasDescompuesto;

	
	public Dueno() {
		super();
	}
	
	public Dueno(String nombre, String dni, Mascota mascota) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.mascota = mascota;
	}
	
	
	public Dueno(String nombre, String dni, String mascotasDescompuesto) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.mascotasDescompuesto = mascotasDescompuesto;
	}


	public String getMascotasDescompuesto() {
		return mascotasDescompuesto;
	}
	public void setMascotasDescompuesto(String mascotasDescompuesto) {
		this.mascotasDescompuesto = mascotasDescompuesto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	
	@Override
	public String toString() {
		return "Dueno [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	
	
}
