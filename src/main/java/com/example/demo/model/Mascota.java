package com.example.demo.model;

public class Mascota {

	public int numChip;
	public String  nombre;
	public boolean vacunado;
	public String raza;
	
	
	
	public Mascota(int numChip, String nombre, boolean vacunado, String raza) {
		super();
		this.numChip = numChip;
		this.nombre = nombre;
		this.vacunado = vacunado;
		this.raza = raza;
	}

	public Mascota() {
		super();
	}
	
	public Mascota(int numChip, String nombre, boolean vacunado) {
		super();
		this.numChip = numChip;
		this.nombre = nombre;
		this.vacunado = vacunado;
	}
	public int getNumChip() {
		return numChip;
	}
	public void setNumChip(int numChip) {
		this.numChip = numChip;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isVacunado() {
		return vacunado;
	}
	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}
	
	@Override
	public String toString() {
		return numChip + "|" + nombre + "|" + vacunado + "|" + raza;
	}
	
	
	
}
