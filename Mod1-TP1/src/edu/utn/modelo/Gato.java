package edu.utn.modelo;

import edu.utn.modelo.enumerable.*;

public class Gato extends Animal{
	
	private RazaGato raza;

	public Gato(String apodo, int edad, TipoEnum tipo, RazaGato raza) {
		super(apodo, edad, tipo);
		this.setRaza(raza);
	}

	public RazaGato getRaza() {
		return raza;
	}

	public void setRaza(RazaGato raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return super.toString() + "Gato [raza=" + raza + "]";
	}
	
	
}
