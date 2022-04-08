package polimorfismo.metodos.parametrico;

public class Empleado extends Persona{
	
	@Override
	public String realizarUnaAccion(String accion) {
		
		return "La accion que realiza el empleado es "+accion+" !!";
	}
	

}
