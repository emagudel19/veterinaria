package com.uniquindio.edu.co.back.veterinaria.model;

public class UsuarioRequest {

	private String nombre;
	private String mascota;

	public UsuarioRequest(String nombre, String mascota) {
		super();
		this.nombre = nombre;
		this.mascota = mascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMascota() {
		return mascota;
	}

	public void setMascota(String mascota) {
		this.mascota = mascota;
	}

}
