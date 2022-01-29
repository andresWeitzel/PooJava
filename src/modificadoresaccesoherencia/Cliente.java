package modificadoresaccesoherencia;

public class Cliente extends Persona{
	
	public static void main(String[] args) {
	

		Persona cliente01 = new Persona();
		
		//El atributo es privado
		//cliente01.nro_cuenta = 3333443;

		//Si el atributo es privado podemos modificar desde el setter
		cliente01.setNro_cuenta("7575784894");
		
		System.out.println(cliente01.getNro_cuenta());
		
		//Si el atributo no es privado podemos modificar desde el mismo o el setter
		cliente01.nombre = "Juan";
		cliente01.setNombre("Juan");
		
		System.out.println(cliente01.getNombre());
		
		// Si el atributo es protected solamente se puede modificar con atributo y setter
		//desde el mismo paqueto o clases que heredan
		cliente01.saldo = 333.444;
		cliente01.setSaldo(333.444);
		
		System.out.println(cliente01.getSaldo());
		
	}
	
}
