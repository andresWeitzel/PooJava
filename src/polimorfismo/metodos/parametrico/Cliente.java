package polimorfismo.metodos.parametrico;


public class Cliente extends Persona {
	
	
	@Override
	public String realizarUnaAccion(String accion, int cantidad) {
		
		return "La accion que realiza el cliente es "+accion+" y la realiza "+cantidad +" veces!!";
	}
	

}
