package polimorfismosobrecarga;

public class Test {
	
	public static void main(String[] args) {
		
		//El Polimorfismo es la capacidad que tienen los objetos de una clase
		//en ofrecer respuesta distinta e independientes, osea el objeto puede
		//contener valores de diferentes tipos durante la ejecucion del programa
		
		Persona cliente = new Cliente();
		Persona empleado = new Empleado();
		
		System.out.println(cliente.realizarUnaAccion("Comprar un Producto"));
		System.out.println(empleado.realizarUnaAccion("Vender un Producto"));
		

		//SIN HERENCIA NO HAY POLIMORFISMO, sino se deberia instanciar un objeto
		//del mismo tipo que su clase y no de otra...ej
		//Cliente cliente = new Cliente();
		
		//Hay 3 tipos de Polimorfismos -> Sobrecarga, Parametrico e Inclusion
		
		//Sobrecarga es lo realizado aca, usando funciones con el mismo nombre
		//en clases independientes
		
		//Parametrico aplica en cuanto a usar funciones con el mismo nombre(sobrecargado)
		//pero de diferentes tipos de parametros, parametro int, double, String, etc
		
		//La Inclusion se aplica invocando una funcion sin conocer el tipo, se usa 
		//una interfaz para eso
	}

}
