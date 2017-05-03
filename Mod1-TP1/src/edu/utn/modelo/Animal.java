package edu.utn.modelo;

import edu.utn.modelo.enumerable.*;

public abstract class Animal {
	
	private String apodo;
	private int edad; 
	//la edad la trato como entero, porque considero que la gran mayoría no conoce la fecha exacta de nacimiento de su mascota
	private TipoEnum tipo;
	
	public Animal(String apodo, int edad, TipoEnum tipo) {
		super();
		this.apodo = apodo;
		this.edad = edad;
		this.tipo = tipo;
	}

	public String getNombre() {
		return apodo;
	}

	public void setNombre(String nombre) {
		this.apodo = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public TipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Animal [apodo=" + apodo + ", edad=" + edad + ", tipo=" + tipo + "]";
	}


}
