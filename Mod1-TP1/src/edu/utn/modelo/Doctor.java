package edu.utn.modelo;

import java.util.ArrayList;

public class Doctor {
	private String idDoctor;
	private String nombre;
	private String apellido;
	private ArrayList<Revision> listaRevisiones;
	
	public Doctor(String idDoctor, String nombre, String apellido) {
		super();
		this.idDoctor = idDoctor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.listaRevisiones = new ArrayList<Revision>(5);
	}
	
//	public Doctor(String idDoctor, String nombre, String apellido, ArrayList<Revision> listaRevisiones) {
//		this.idDoctor = idDoctor;
//		this.nombre = nombre;
//		this.apellido = apellido;
//		this.contRevisiones = 0;
//		this.listaRevisiones = listaRevisiones;
//	}

	
	public String getIdDoctor() {
		return idDoctor;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public ArrayList<Revision> getListaRevisiones() {
		return listaRevisiones;
	}

	public Revision agregaRevision(Revision revision) {
		if(this.listaRevisiones.size()<5)
			this.listaRevisiones.add(revision);
		else
			System.out.println("El Dr. "+ this.getApellido() + " alcanzó el maximo de revisiones diario");
		return revision;
	}

	@Override
	public String toString() {
		return "Doctor [idDoctor=" + idDoctor + ", nombre=" + nombre + ", apellido=" + apellido + ", listaRevisiones="
				+ listaRevisiones + "]";
	}

}
