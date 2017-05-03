package edu.utn.controlador;

import java.util.ArrayList;

import edu.utn.modelo.Doctor;

public class DoctorControlador {

	private ArrayList<Doctor> listaDoctores;
	
	public DoctorControlador(){
		this.listaDoctores = new ArrayList<Doctor>();
	}
	
	public Doctor altaDoctor(String idDr, String nombre, String apellido){
		Doctor dr = new Doctor(idDr, nombre, apellido);
		if (listaDoctores.size()<5){
			this.listaDoctores.add(dr);
		}
		else
			//Restricción de enunciado
			System.err.println("No se pudo agregar al Dr/a  "+dr.getApellido()+" porque supera la cantidad maxima permitida de Veterinarios");
		return dr;
	}

	public ArrayList<Doctor> getListaDoctores() {
		return listaDoctores;
	}
	
}		
