package polimorfismo.dinamico.clases;

public class TestPersonaCliente {
	
	public static void main(String[] args) {
		
		
		//https://guru99.es/java-inheritance-polymorphism/
		
		//El Polimorfismo dinamico nos permite en una sola referencia cambiar 
		//el tipo de clase que se use y a su vez la funcionalidad que se desee
		//implementar, osea, sus metodos
		
		//Creacion de objetos convencionales
		System.out.println("\n==== OBJETO DE LA CLASE PERSONA DE TIPO PERSONA=========");
		
		Persona cliente01 = new Persona(1,"Laura","Castillo","1782681296",122.22);
		
		System.out.println(cliente01);
		
		System.out.println(cliente01.metodoClasePersona());
		
		//===========================================================
		
		System.out.println("\n==== OBJETO DE LA CLASE CLIENTE DE TIPO PERSONA =========");
		
		Persona cliente02 = new Cliente(1,"Laura","Castillo","1782681296",122.22
				,"Perseverancia","No Adeuda");
		
		System.out.println(cliente02);
		
		System.out.println(cliente02.metodoClasePersona());
		
		
		
		
		//===========================================================
		
		System.out.println("\n==== OBJETO DE LA CLASE CLIENTE DE TIPO CLIENTE =========");
		
		
		//Creacion de objetos polimorficos dinamicos
		Cliente cliente03 = new Cliente(1,"Laura","Castillo","1782681296",122.22
				,"Aptitud","No Adeuda");
		
		System.out.println(cliente03);
		
		System.out.println(cliente03.metodoClasePersona());
		
	}
	

	

}
