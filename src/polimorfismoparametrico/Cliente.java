package polimorfismoparametrico;


public class Cliente extends Persona {
	
	
	public String realizarUnaAccion(String accion, int cantidad) {
		
		return "La accion que realiza el cliente es "+accion+" y la realiza "+cantidad +" veces!!";
	}
	

}
