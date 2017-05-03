package edu.utn.controlador;

import java.util.ArrayList;
import edu.utn.modelo.*;
import edu.utn.modelo.enumerable.*;

public class AnimalControlador {
	
	private ArrayList<Animal> listaAnimales;
	
	public AnimalControlador(){
		this.listaAnimales = new ArrayList<Animal>();
	}
	
	public  void altaAnimal(String apodo, int edad, TipoEnum tipo, RazaPerro raza ){
		this.listaAnimales.add(new Perro(apodo, edad, tipo, raza));
	}
	
	public  void altaAnimal(String apodo, int edad, TipoEnum tipo, RazaGato raza ){
		this.listaAnimales.add(new Gato(apodo, edad, tipo, raza));
	}
	
	public  void altaAnimal(String apodo, int edad, TipoEnum tipo, RazaConejo raza ){
		this.listaAnimales.add(new Conejo(apodo, edad, tipo, raza));
	}

	public ArrayList<Animal> getListaAnimales() {
		return listaAnimales;
	}
	
	
}	
