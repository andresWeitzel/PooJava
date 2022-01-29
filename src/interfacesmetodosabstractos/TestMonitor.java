package interfacesmetodosabstractos;

public class TestMonitor {
	
	public static void main(String[] args) {
		
		Monitor samsungT22563 = new Monitor();
		
		System.out.println(samsungT22563.encender());
		
		System.out.println(samsungT22563.aumentarVolumen());
		
		System.out.println(samsungT22563.aumentarVolumen(true));
		
		System.out.println(samsungT22563.aumentarVolumen("Aumentando Volumen Correctamente"));
		
		
		System.out.println(samsungT22563.bajarVolumen());
		
		System.out.println(samsungT22563.bajarVolumen("Bajando Volumen Correctamente"));
		
	
		System.out.println(samsungT22563.apagar());
	
	
	
	}
	
	
	
	

}
