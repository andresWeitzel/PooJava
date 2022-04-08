package polimorfismo.metodos.sobrecarga.interfaces;

import java.time.LocalDate;
import java.time.LocalTime;

//Puede ocurrir el escenario de heredar de una clase e implementar de una interfaz
public class Competidor extends Atleta implements I_Cualidad{


	String nroCompetidor;
	LocalDate fechaCompeticion;
	LocalTime horaCompeticion;
	
	
	

	public Competidor(String nombre, String apellido, int edad, String tipoDoc, String nroDoc, String nroCompetidor,
			LocalDate fechaCompeticion, LocalTime horaCompeticion) {
		super(nombre, apellido, edad, tipoDoc, nroDoc);
		this.nroCompetidor = nroCompetidor;
		this.fechaCompeticion = fechaCompeticion;
		this.horaCompeticion = horaCompeticion;
	}
	
	

	public String getNroCompetidor() {
		return nroCompetidor;
	}



	public void setNroCompetidor(String nroCompetidor) {
		this.nroCompetidor = nroCompetidor;
	}



	public LocalDate getFechaCompeticion() {
		return fechaCompeticion;
	}



	public void setFechaCompeticion(LocalDate fechaCompeticion) {
		this.fechaCompeticion = fechaCompeticion;
	}



	public LocalTime getHoraCompeticion() {
		return horaCompeticion;
	}



	public void setHoraCompeticion(LocalTime horaCompeticion) {
		this.horaCompeticion = horaCompeticion;
	}



	@Override
	public String cualidad(String cualidad01) {
		return "La cualidad es "+cualidad01;
		
		
	}



	@Override
	public String cualidad(String cualidad01, String cualidad02) {
		return "Las cualidades son "+cualidad01+" y "+cualidad02;
		
	}



	@Override
	public String cualidad(String cualidad01, String cualidad02, String cualidad03) {
		return "Las cualidades son "+cualidad01+", "+cualidad02+" y "+ cualidad03;
		
	}



	@Override
	public String toString() {
		return super.toString()+"Competidor [nroCompetidor=" + nroCompetidor + ", fechaCompeticion=" + fechaCompeticion
				+ ", horaCompeticion=" + horaCompeticion + "]";
	}



	
	
	
}
