package generics.clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestPersona {
	
	public static void main(String[] args) {
		
		/*
		 * -El generic se comporta como el tipo de dato de la clase
		 * -No se aceptan primitivos
		 * */
		
		Persona<Empleado> persona01 = new Persona<>();
		Persona<Cliente>  persona02 = new Persona<>();
		
		persona01.clasificarPersona(new Empleado());
		persona02.clasificarPersona(new Cliente());
		
		//Si dejamos el generic tipo generico hay que agregar un main
		//de tipo generico, nos dara un grado de abstraccion mayor
		//Persona<T> persona03 = new Persona<>();
		
		//Otra forma es usar comodin de tipo, se usa mucho con metodos
		//de tipo return
		//Persona<?> persona03 = new Persona<>();
		
		
		//============================================================
		
		Empleado nuevoEmpleado01 = new Empleado(1,12312,LocalDate.of(2022,3,12)
				,LocalTime.of(12, 45));
		Empleado nuevoEmpleado02 = new Empleado(2,232312,LocalDate.of(2020,4,22)
				,LocalTime.of(10, 59));
		
		Cliente nuevoCliente01 = new Cliente(1,12312,20,LocalDate.of(2022,3,12)
				,LocalTime.of(12, 45));
		Cliente nuevoCliente02 = new Cliente(2,65656,120,LocalDate.of(2021,1,21)
				,LocalTime.of(9, 12));
		
		
		System.out.println("\n===== Agregamos Personas de Varios Tipos ======="); 

		//Solo se puede usar el objeto del tipo creado Persona<Empleado>
		persona01.agregarPersonas(nuevoEmpleado01);
		persona01.agregarPersonas(nuevoEmpleado02);
		
		//Solo se puede usar el objeto del tipo creado Persona<Cliente>
		persona02.agregarPersonas(nuevoCliente01);
		persona02.agregarPersonas(nuevoCliente02);
		
	
		System.out.println("\n===== Listamos Personas de Varios Tipos ======="); 

		System.out.println(persona01.listarPersonas());
		
		System.out.println(persona02.listarPersonas());
		
		

		System.out.println("\n===== Listamos Personas de Varios Tipos con Streams ======="); 

		persona01.listarPersonas().stream().forEach(System.out::println);
		
		persona02.listarPersonas().stream().forEach(System.out::println);
		
		
		System.out.println("\n===== Clasificamos las Personas según el Tipo ========");
		
		persona01.clasificarPersona(nuevoEmpleado01);
		persona01.clasificarPersona(nuevoEmpleado02);
		
		persona02.clasificarPersona(nuevoCliente01);
		persona02.clasificarPersona(nuevoCliente02);
		
		
		
		
		
		
		
	}

}
