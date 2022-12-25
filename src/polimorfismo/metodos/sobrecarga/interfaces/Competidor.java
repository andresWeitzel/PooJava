package polimorfismo.metodos.sobrecarga.interfaces;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import polimorfismo.metodos.sobrecarga.Empleado;

//Puede ocurrir el escenario de heredar de una clase e implementar de una interfaz
@Data
@AllArgsConstructor
@ToString(callSuper = true, includeFieldNames = true)
public class Competidor extends Atleta implements I_Cualidad {

	String nroCompetidor;
	LocalDate fechaCompeticion;
	LocalTime horaCompeticion;

	// Constructor Padre tendremos que definirlo
	@Builder(builderMethodName = "competidorBuilder")
	public Competidor(String nombre, String apellido, int edad, String tipoDoc, String nroDoc, String nroCompetidor,
			LocalDate fechaCompeticion, LocalTime horaCompeticion) {
		super(nombre, apellido, edad, tipoDoc, nroDoc);

	}

	@Override
	public String cualidad(String cualidad01) {
		return "La cualidad es " + cualidad01;

	}

	@Override
	public String cualidad(String cualidad01, String cualidad02) {
		return "Las cualidades son " + cualidad01 + " y " + cualidad02;

	}

	@Override
	public String cualidad(String cualidad01, String cualidad02, String cualidad03) {
		return "Las cualidades son " + cualidad01 + ", " + cualidad02 + " y " + cualidad03;

	}

	@Override
	public String toString() {
		return super.toString() + "Competidor [nroCompetidor=" + nroCompetidor + ", fechaCompeticion="
				+ fechaCompeticion + ", horaCompeticion=" + horaCompeticion + "]";
	}

}
