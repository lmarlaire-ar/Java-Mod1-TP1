package edu.utn.controlador;

import java.util.ArrayList;
import edu.utn.modelo.*;

public class MedicamentoControlador {
	
	private ArrayList<Medicamento> listaMedicamentos;
	
	public MedicamentoControlador(){
		this.listaMedicamentos = new ArrayList<Medicamento>();
		
	}
	
	public Medicamento altaMedicamento(Medicamento medicamento){
		this.listaMedicamentos.add(medicamento);
		return medicamento;
	}

	public ArrayList<Medicamento> getListaMedicamentos() {
		return listaMedicamentos;
	}
	
}
