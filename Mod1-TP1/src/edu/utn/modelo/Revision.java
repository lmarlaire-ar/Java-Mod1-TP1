package edu.utn.modelo;

import java.util.Calendar;

import java.util.Date;

import edu.utn.modelo.enumerable.*;
import edu.utn.modelo.*;

public class Revision {

	private int idRevision=0;
	private Animal animal;
	private Doctor doctor;
	private MotivoAtencion motivoAtencion;
	private String resultado; 
	private Medicamento medicamento;
	private Calendar fechaAlta, fechaUltimaRevision ;
	
	public Revision(){
		
	}
	
	public Revision(int idRevision, Animal animal, MotivoAtencion motivoAtencion, Calendar fechaAlta,
			Calendar fechaUltimaRevision) {
		this.idRevision = idRevision;
		this.animal = animal;
		this.motivoAtencion = motivoAtencion;
		this.fechaAlta = fechaAlta;
		this.fechaUltimaRevision = fechaUltimaRevision;
	}
	
	public Revision(int idRevision, Animal animal, MotivoAtencion motivoAtencion) {
		this.idRevision = idRevision;
		this.animal = animal;
		this.motivoAtencion = motivoAtencion;
		this.fechaAlta = Calendar.getInstance();
		this.fechaUltimaRevision = Calendar.getInstance();
		
	}
	
	public int getIdRevision() {
		return idRevision;
	}

	public MotivoAtencion getMotivoAtencion() {
		return motivoAtencion;
	}

	public String getResultado() {
		return resultado;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public Calendar getFechaAlta() {
		return fechaAlta;
	}
	
	public Animal getAnimal() {
		return animal;
	}

	public Calendar getFechaUltimaRevision() {
		return fechaUltimaRevision;
	}

	public void setIdRevision(int idRevision){
		this.idRevision = idRevision;
	}
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}

	public void asignaRevisionDoctor(Revision revision, Doctor doctor){
		doctor.agregaRevision(revision);	
	}
	
	public Revision drActualizaRevision(Revision revision, String resultado){
		revision.setResultado(resultado);
		return revision;
	}
	
	public Revision drActualizaRevision(Revision revision, String resultado, Medicamento medicamento){
		revision.setResultado(resultado);
		revision.setMedicamento(medicamento);
		return revision;
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", animal=" + animal + ", doctor=" + doctor + ", motivoAtencion="
				+ motivoAtencion + ", resultado=" + resultado + ", medicamento=" + medicamento + "]";
	}
	
	
}
