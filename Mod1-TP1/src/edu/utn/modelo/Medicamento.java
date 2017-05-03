package edu.utn.modelo;

public class Medicamento {
	private String nombre;
	private String laboratorio;
	private String droga;
	
	public Medicamento(String nombre, String laboratorio, String droga) {
		super();
		this.nombre = nombre;
		this.laboratorio = laboratorio;
		this.droga = droga;
	}
	
	public Medicamento altaMedicamento(String nombre, String laboratorio, String droga){
		return new Medicamento(nombre, laboratorio, droga);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getDroga() {
		return droga;
	}

	public void setDroga(String droga) {
		this.droga = droga;
	}
	
}
