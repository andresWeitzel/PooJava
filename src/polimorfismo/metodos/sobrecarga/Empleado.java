package polimorfismo.metodos.sobrecarga;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString(callSuper=true, includeFieldNames=true)
public class Empleado extends Persona{
	
	//Constructor Padre tendremos que definirlo
	@Builder(builderMethodName="empleadoBuilder")
	public Empleado(long id, String nombre, String apellido
			, String nroCuenta, double saldo) {
		
		super(id, nombre, apellido, nroCuenta, saldo);
		
	}
	
	@Override
	public String realizarAccion01(String accion) {
		return "La acción que realiza el empleado es "+accion+" !!";
	}
	
	@Override
	public String realizarAccion02(String accion, int cantidad) {
		return "La acción que realiza el empleado es "+accion
				+", un número de" +cantidad+" veces !!";
	}
	
	

}
