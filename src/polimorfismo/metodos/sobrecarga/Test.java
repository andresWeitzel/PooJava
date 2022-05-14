package polimorfismo.metodos.sobrecarga;

public class Test {
	
	public static void main(String[] args) {
		
		//El Polimorfismo es la capacidad que tienen los objetos de una clase
		//en ofrecer respuesta distinta e independientes, osea el objeto puede
		//contener valores de diferentes tipos durante la ejecucion del programa
		
		Persona persona = new Persona(1,"Ramiro","Perez","82719182789",56000);
		Persona cliente = new Cliente(1,"Martina","Gomez","82828271",86000);
		Persona empleado = new Empleado(1,"Juan","Castro","992828111",90000);
		
		Persona empleado02=Empleado.empleadoBuilder()
				.id(1)
				.nombre("Juan")
				.apellido("Castro")
				.nroCuenta("8627836423")
				.saldo(45000)
				.build();
		
		
		System.out.println("\n============ PERSONAS ================");
		System.out.println(persona);
		System.out.println(cliente);
		System.out.println(empleado);
		System.out.println(empleado02);
		
		
		System.out.println("\n============ ACCIONES ================");
		System.out.println("=============== Persona ===============");
		System.out.println(persona.realizarAccion01("Caminando"));
		System.out.println(persona.realizarAccion02("Comiendo",4));
		
		System.out.println("=============== Empleado ===============");
		System.out.println(empleado.realizarAccion01("Corriendo"));
		System.out.println(empleado.realizarAccion02("Durmiendo",2));
		
		
		System.out.println("=============== Cliente ===============");
		System.out.println(cliente.realizarAccion01("Leyendo"));
		System.out.println(cliente.realizarAccion02("Estudiando",5));
		
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
