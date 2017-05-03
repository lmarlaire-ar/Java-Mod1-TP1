package edu.utn.modelo;

import edu.utn.modelo.enumerable.*;

public class Perro extends Animal{
	
	private RazaPerro raza;
	
	public Perro(String apodo, int edad, TipoEnum tipo, RazaPerro raza) {
		super(apodo, edad, tipo);
		this.setRaza(raza);
	}

	public RazaPerro getRaza() {
		return raza;
	}

	public void setRaza(RazaPerro raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return super.toString() + "Perro [raza=" + raza + "]";
	}
	
	
}
