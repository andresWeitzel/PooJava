package polimorfismo.metodos.sobrecarga;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString(callSuper=true, includeFieldNames=true)
public class Cliente extends Persona{

	
	//Constructor Padre tendremos que definirlo
	@Builder(builderMethodName="clienteBuilder")
	public Cliente(long id, String nombre, String apellido
			, String nroCuenta, double saldo) {
		
		super(id, nombre, apellido, nroCuenta, saldo);
		
	}
	
	
	@Override
	public String realizarAccion01(String accion) {
		return "La acción que realiza el cliente es "+accion+" !!";
	}
	
	@Override
	public String realizarAccion02(String accion, int cantidad) {
		return "La acción que realiza el cliente es "+accion
				+", un número de" +cantidad+" veces !!";
	}
	
	
	
	

}
