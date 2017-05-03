package edu.utn.vista;

import edu.utn.modelo.*;
import edu.utn.modelo.enumerable.*;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

import edu.utn.controlador.*;

public class MainTest {

	public static void main(String[] args) {
		//Creo la lista de controladores para Animales, Doctores y Revisiones
		AnimalControlador animalCtl = new AnimalControlador();
		DoctorControlador doctorCtl = new DoctorControlador();
		RevisionControlador revisionCtl = new RevisionControlador();
		MedicamentoControlador medicamentoCtrl = new MedicamentoControlador();
		
		//ALTA DE MEDICOS
		doctorCtl.altaDoctor("DR001", "Bruce", "Lee");
		doctorCtl.altaDoctor("Dr002", "Arturo", "Puig");
		doctorCtl.altaDoctor("Dr003", "Antonio", "Banderas");
		doctorCtl.altaDoctor("Dr004", "Emma", "Thompson");
		doctorCtl.altaDoctor("Dr005", "Catherine", "Fulop");
		System.out.println("========================= PRUEBA DE CAPACIDAD MAX DE DOCTORES =========================");
		doctorCtl.altaDoctor("Dr006", "Rocky", "Balboa");
	//	doctorCtl.altaDoctor("Dr007", "Rocky II", "Balboa");
		
		
		//ALTA DE MEDICAMENTOS
		medicamentoCtrl.altaMedicamento(new Medicamento("VIRUS AFUERA", "LABOR 1", "Droga 1"));
		medicamentoCtrl.altaMedicamento(new Medicamento("BACTERIAS AFUERA", "LABOR 1", "Droga 2"));
		medicamentoCtrl.altaMedicamento(new Medicamento("VIRUS AFUERA RELOADED", "LABOR 2", "Droga 3"));
		medicamentoCtrl.altaMedicamento(new Medicamento("NOSIRVEPANADA", "LABOR 2", "Droga 4"));
		
		
		//ALTA DE UN PERRO PARA TENERLO EN LA BASE
		animalCtl.altaAnimal("Milou", 4, TipoEnum.PERRO, RazaPerro.RazaPerro2);
		animalCtl.altaAnimal("Kimba", 1, TipoEnum.PERRO, RazaPerro.RazaPerro1);
		animalCtl.altaAnimal("Garfield", 1, TipoEnum.GATO, RazaGato.RazaGato3);
		animalCtl.altaAnimal("Pilufo", 5, TipoEnum.GATO, RazaGato.RazaGato2);
		animalCtl.altaAnimal("Bonaparte", 6, TipoEnum.GATO, RazaGato.RazaGato1);
		animalCtl.altaAnimal("Michifus", 7, TipoEnum.GATO, RazaGato.RazaGato3);
		animalCtl.altaAnimal("Terrier", 6, TipoEnum.PERRO, RazaPerro.OTRO);
		animalCtl.altaAnimal("Rojer", 6, TipoEnum.CONEJO, RazaConejo.OTRO);
		animalCtl.altaAnimal("Bugs", 6, TipoEnum.CONEJO, RazaConejo.OTRO);
		animalCtl.altaAnimal("Tambor", 6, TipoEnum.CONEJO, RazaConejo.Raza_Conejo1);
		animalCtl.altaAnimal("Lasie", 1, TipoEnum.PERRO, RazaPerro.RazaPerro1);
		animalCtl.altaAnimal("Wolf", 6, TipoEnum.PERRO, RazaPerro.RazaPerro1);
		animalCtl.altaAnimal("Otto", 6, TipoEnum.PERRO, RazaPerro.RazaPerro1);
		animalCtl.altaAnimal("Colmillo", 6, TipoEnum.PERRO, RazaPerro.RazaPerro1);
		animalCtl.altaAnimal("Wau", 6, TipoEnum.PERRO, RazaPerro.RazaPerro1);
		animalCtl.altaAnimal("Mickey", 6, TipoEnum.PERRO, RazaPerro.RazaPerro1);
		animalCtl.altaAnimal("Can", 2, TipoEnum.PERRO, RazaPerro.RazaPerro1);
		animalCtl.altaAnimal("Manchita",3, TipoEnum.PERRO, RazaPerro.RazaPerro1);
		animalCtl.altaAnimal("Canela", 6, TipoEnum.PERRO, RazaPerro.RazaPerro1);
		animalCtl.altaAnimal("Ron-ron", 6, TipoEnum.GATO, RazaConejo.OTRO);
		/// REPETIDOS PARA PROBAR MAS DE 20
		System.out.println("");
		System.out.println("========================= PRUEBA DE CANTIDAD MAX REVISACIONES =========================");
		animalCtl.altaAnimal("Lasie", 1, TipoEnum.PERRO, RazaPerro.RazaPerro1);
	
		
		//ALTA DE REVISIONES
		for (Animal animal : animalCtl.getListaAnimales()) {
			if(animal.getEdad()<3){
				
				revisionCtl.altaRevision(MotivoAtencion.CONTROL, animal);
			}
			else
				revisionCtl.altaRevision(MotivoAtencion.GUARDIA, animal);
		}
		
		for (int i = 0; i < revisionCtl.getListaRevisiones().size(); i++) {
			
		}
		
		//ASIGNA REVISIONES A DR
		int i=0;
//		ArrayList<String> lista = new ArrayList<String>(5);
		for (Revision revision : revisionCtl.getListaRevisiones()) {
			if(revision != null){
				if(i>4 || doctorCtl.getListaDoctores().get(i)== null)
					i=0;
				revision.asignaRevisionDoctor(revision, doctorCtl.getListaDoctores().get(i++));
			}
			
		}
		
		//DOCTORES ACTUALIZAN LA REVISACION
		for (Doctor doctor : doctorCtl.getListaDoctores()){
			for (Revision revision : doctor.getListaRevisiones()) {
				revision.drActualizaRevision(revision, "RESULTADO OK. ALTA ASEGURADA");
			}
		}
		
		//Detalle de numeros de animales que atendió cada doctor
		System.out.println("");
		System.out.println("====================  CANTIDAD DE PERROS ATENDIDOS POR DOCTOR  =======================");
		revisionCtl.escribeFecha();
		for (Doctor doctor : doctorCtl.getListaDoctores()) {
			if(doctor.getListaRevisiones().size()==0)
				System.out.println("Doctor : " + doctor.getApellido() +" "+doctor.getNombre()+" no atendió ningún animal en el día.");
			else
				System.out.println("Doctor : " + doctor.getApellido() +" "+doctor.getNombre()+" atendió "+doctor.getListaRevisiones().size()+" animales.");
		}
		
		
		//System.out.println("Clase : " +vehiculo.getClass().getSimpleName());
		
//		System.out.println("");
//		System.out.println(" ------------------ Lista de revisiones ----------------");
//		for (Revision revision : revisionCtl.getListaRevisiones()) {
//			System.out.println(revision);
			
//		}
		System.out.println(" ------------------ Lista de doctores ----------------");

		for (Doctor doctor : doctorCtl.getListaDoctores()) {
			System.out.println(doctor);
			
		}
	
		
	}

}
