package modificadores.acceso.herencia;

public class Cliente extends Persona{
	
	
	
	
	public static void main(String[] args) {
		
		
	Cliente cliente01 = new Cliente();
	
	cliente01.id=2;
	
	System.out.println(cliente01.toString());
	
	
	cliente01.setId(3);
	
	System.out.println(cliente01.toString());
	
	cliente01.nombre = "Juancito";
	
	System.out.println(cliente01.toString());
	
	cliente01.setNombre("Marcos");
	cliente01.setApellido("Maidana");
	
	System.out.println(cliente01.toString());
	
	
	cliente01.setNroCuentaSecundario("671256712513");
	
	System.out.println(cliente01.toString());
	
	
	cliente01.saldo = 2323232;
	
	cliente01.setSaldo(17825371);
	
	System.out.println(cliente01.toString());
	
	
	

		
	}
	
}
