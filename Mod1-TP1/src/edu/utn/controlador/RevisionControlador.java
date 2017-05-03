package edu.utn.controlador;

import java.util.*;

import edu.utn.modelo.*;
import edu.utn.modelo.enumerable.MotivoAtencion;

public class RevisionControlador {

	private ArrayList<Revision> listaRevisiones;
		
	public RevisionControlador() {
		this.listaRevisiones = new ArrayList<Revision>();
	}

	public Revision altaRevision(MotivoAtencion motivoAtencion, Animal animal){
		if(listaRevisiones.size()<20){
			int idRevision = listaRevisiones.size();
			Revision revision = new Revision(idRevision, animal, motivoAtencion);
			this.listaRevisiones.add(revision);
			return revision;
		}
		else{
			System.out.println("No se permiten agregar mas revisaciones. Alcanzó el limite diario posible.");
			System.out.println("Lo esperamos otro día. Muchas gracias por su comprensión.");
			return listaRevisiones.get(0);
//			return new Revision(idRevision, animal, motivoAtencion, cal, cal);
		}
	}
	
	/***
	 * El doctor actualiza la revision agregando el resultado
	 * @param revision
	 * @param resultado
	 * @return
	 */
	public Revision drActualizaRevision(Revision revision, String resultado){
		revision.setResultado(resultado);
		return revision;
	}
	
	/***
	 * El doctor actualiza la revision agregando el resultado y el medicamento
	 * @param revision
	 * @param resultado
	 * @param medicamento
	 * @return
	 */
	public Revision drActualizaRevision(Revision revision, String resultado, Medicamento medicamento){
		revision.setResultado(resultado);
		revision.setMedicamento(medicamento);
		return revision;
	}

	public ArrayList<Revision> getListaRevisiones() {
		return listaRevisiones;
	}

	public String escribeFecha(){
	      Calendar cal = Calendar.getInstance();
	      int year = cal.get(Calendar.YEAR);
	      int month = cal.get(Calendar.MONTH);      // 0 to 11
	      int day = cal.get(Calendar.DAY_OF_MONTH);
	   
	      System.out.printf("%2d/%02d/%04d\n", day, month+1, year);
	      //System.out.println(Calendar.getInstance().toString());
	      return Calendar.getInstance().toString();
	   }
	
	public void escribeFecha(Calendar cal){
	      int year = cal.get(Calendar.YEAR);
	      int month = cal.get(Calendar.MONTH);      // 0 to 11
	      int day = cal.get(Calendar.DAY_OF_MONTH);
	   
	      System.out.printf("%2d/%02d/%04d\n", day, month+1, year);
	   }

}
