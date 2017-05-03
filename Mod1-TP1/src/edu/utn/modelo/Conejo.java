package edu.utn.modelo;

import edu.utn.modelo.enumerable.*;

public class Conejo extends Animal{
	
	private RazaConejo raza;

	public Conejo(String apodo, int edad, TipoEnum tipo, RazaConejo raza) {
		super(apodo, edad, tipo);
		this.setRaza(raza);
	}

	public RazaConejo getRaza() {
		return raza;
	}

	public void setRaza(RazaConejo raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return super.toString() + "Conejo [raza=" + raza + "]";
	}
	
	
}
