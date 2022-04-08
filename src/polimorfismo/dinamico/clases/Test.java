package polimorfismo.dinamico.clases;

public class Test {
	
	public static void main(String[] args) {
		
		
		//https://guru99.es/java-inheritance-polymorphism/
		
		//El Polimorfismo dinamico nos permite en una sola referencia cambiar 
		//el tipo de clase quese use
		
		//Creacion de objetos convencionales
		Cliente cliente01 = new Cliente(1,"Laura","Castillo","1782681296",122.22
				,"Aptitud","No Adeuda");
		
		System.out.println(cliente01);
		
		System.out.println(cliente01.metodoClasePersona());
		
		
		
		
		//===========================================================
		
		
		//Creacion de objetos polimorficos dinamicos
		Persona cliente02 = new Cliente(1,"Laura","Castillo","1782681296",122.22
				,"Aptitud","No Adeuda");
		
		System.out.println(cliente02);
		
		System.out.println(cliente02.metodoClasePersona());
		
	}
	

	

}
