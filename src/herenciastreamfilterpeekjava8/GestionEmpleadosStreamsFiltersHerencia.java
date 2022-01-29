package herenciastreamfilterpeekjava8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;


//Esta clase hereda de empleado sus caracteristicas y pasa a ser una Subclase o
//clase hija, la clase Empleado es la superclase o clase padre
public class GestionEmpleadosStreamsFiltersHerencia extends  Empleado {
	
	public static void main(String[] args) {
		
		// -- Ventajas de la Herencia --
		//-Podemos reutilizar clases, atributos, metodos, etc, predefinidas y desarrolladas.
		//-Eficiencia de códido y recursos.
		//-Reutilizacion de nombres pero en clases diferentes.
		//-Mantenimiento
		//-Escalabilidad
		

		Empleado empleado01 = new Empleado
				(1 , "Juan" , "Contreras" , 34 , LocalDate.of(1977,1,9)  , "DNI" , "389987635"
				,"20-389987635-2" , "Los Patos 22" ,  LocalDate.of(2020,8,2), 49000f
				);
		
		Empleado empleado02 = new Empleado
				(2 , "Damian" , "Perez" , 29 , LocalDate.of(1981,4,2)  , "DNI" , "396354332"
				,"11-396354332-4" , "Av. Córdoba 33" ,  LocalDate.of(2018,2,2), 51000f
				);
		
		Empleado empleado03 = new Empleado
				(3 , "Sofia" , "Aguilar" , 22 , LocalDate.of(1998,6,2)  , "DNI" , "392456722"
				,"28-392456722-1" , "Juan Baustita Alberdi 07" ,  LocalDate.of(2020,2,21), 46000f
				);
		
		Empleado empleado04 = new Empleado
				(4 , "Marcos" , "Bustamante" , 33 , LocalDate.of(1976,2,1)  , "DNI" , "389333635"
				,"11-389333635-1" , "Av. San Vicente 112" ,  LocalDate.of(2019,2,1), 54000f
				);
		
		Empleado empleado05 = new Empleado
				(5 , "Jimena" , "Martinez" , 39 , LocalDate.of(1973,2,1)  , "DNI" , "367786533"
				,"20-367786533-2" , "Las Niñas 22" ,  LocalDate.of(2020,2,1), 50200f
				);
		


		ArrayList<Empleado> listaEmpleados = new ArrayList();
		
		listaEmpleados.add(empleado01);
		listaEmpleados.add(empleado02);
		listaEmpleados.add(empleado03);
		listaEmpleados.add(empleado04);
		listaEmpleados.add(empleado05);
		
		
		
		//https://www.arquitecturajava.com/java-stream-filter-y-predicates/
		//https://www.clubdetecnologia.net/blog/2015/java-8-uso-del-metodo-filter/
		//https://refactorizando.com/streams-filter-java/
		
		
		System.out.println("\n-----------------------------------");
		System.out.println("-------- Lista de Objetos ---------");
		System.out.println("-------------------------------------");
		
		listaEmpleados.stream().forEach(System.out::println);
		


		System.out.println("\n========================");
		System.out.println("======== SUELDOS =========");
		System.out.println("==========================");
		
		
		
		System.out.println("\n----------------------------------------------------");
		System.out.println("-------- Actualización de todos los sueldos ----------");
		System.out.println("------------------------------------------------------");
		
		System.out.println("\n----------- Usando Método .map ------------------");
		
		//Con el .map se obtiene una secuencia de elementos de cualquier tipo
		//En este caso devolvemos un objeto de tipo Empleado modificado.
		//Este es un metodo para la modificación de atributos de clases
				
		listaEmpleados
		.stream()
		.map(empleado->{
				empleado.setSueldo(empleado.getSueldo() + 5000);
				return empleado;
			})
		.forEach(System.out::println);
		
		
		
		System.out.println("\n----------- Usando Método .peek ------------------");
		
		//Con el .peek consumimos todos los elementos definidos en su argumento
		//Este es un metodo para la modificación de atributos de clases
		//Es mas limpia la implementacion pero menos evidente la codificacion
		listaEmpleados
			.stream()
			.peek(empleado->empleado.setSueldo(empleado.getSueldo() + 5000))
			.forEach(System.out::println);
			
		
		/*
		-Usamos .peek() cuando no deseamos cambiar el tipo de elemento, valores o solo
		deseamos cambiar el estado interno del elemento(atributos). El 
		procesamiento se realiza elemento a elemento en forma secuencial
		
		-Usamos .map() para cambiar el tipo de elemento o valores. El procesamiento se realiza
		en conjunto, se obtiene un resultado a partir de la secuencia aplicada.
		
		NO HAY MUCHA DOCUMENTACIÓN AL RESPECTO SOBRE LAS DIFERENCIAS DE ESTOS METODOS
		A NOSOTROS NOS VA A INTERESAR MANEJAR LA INFORMACION PRODUCIENDO UN CODIGO
		MÁS LIMPIO
		*/
		
		
		


		System.out.println("\n========================");
		System.out.println("===== ID Y SUELDOS =======");
		System.out.println("==========================");
		
		
		System.out.println("\n----------------------------------------------------");
		System.out.println("-------- Mostrar ID Y Sueldo ----------");
		System.out.println("------------------------------------------------------");
		
		
		
		System.out.println("\n----------- Usando Método .map ------------------");
		

		listaEmpleados
		.stream()
		.map(empleado->{
				empleado.getSueldo();
				return "ID : "+empleado.getId()+" | SUELDO: "+empleado.getSueldo();
			})
		.forEach(System.out::println);
		
		
		
		System.out.println("\n----------- Usando Método .peek ------------------");
		
		//En este caso no seria posible modificar el resultado requerido
		listaEmpleados
		.stream()
		.peek(empleado->empleado.getSueldo())
		.forEach(System.out::println);
		
		

		System.out.println("\n----------------------------------------------------");
		System.out.println("-------- Actualizar Sueldo y mostrarlo junto con el ID ----------");
		System.out.println("------------------------------------------------------");
		
		
		
		System.out.println("\n----------- Usando Método .map ------------------");
		

		listaEmpleados
		.stream()
		.map(empleado->{
				empleado.setSueldo(empleado.getSueldo() + 2000);
				return "ID : "+empleado.getId()+" | SUELDO: "+empleado.getSueldo();
			})
		.forEach(System.out::println);
		
		
		
		System.out.println("\n----------------------------------------------------");
		System.out.println("-------- Actualizar 15% del Sueldo y mostrarlo junto con el ID ----------");
		System.out.println("------------------------------------------------------");
		
		
		
		System.out.println("\n----------- Usando Método .map ------------------");
		

		listaEmpleados
		.stream()
		.map(empleado->{
				empleado.setSueldo(empleado.getSueldo() + ((empleado.getSueldo()*15)/100));
				return "ID : "+empleado.getId()+" | SUELDO: "+empleado.getSueldo();
			})
		.forEach(System.out::println);
		
		
		
		
		
		
		System.out.println("\n===========================================");
		System.out.println("======== ID, FECHA DE INGRESO Y SUELDOS =========");
		System.out.println("=============================================");
		
		
		

		System.out.println("\n---------------------------------------------------------------");
		System.out.println("-------- Aumento del 2% del Sueldo Empleados menos de 1 año ----------");
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("\n----------- Usando Método .map ------------------");
	
		listaEmpleados
		.stream()
		.filter(empleado->empleado.getFecha_ingreso().isAfter(LocalDate.of(2020,1,1)))
		.map(empleado->{
				empleado.setSueldo(empleado.getSueldo() + ((empleado.getSueldo()*2)/100));
				return empleado;
			})
		.forEach(System.out::println);
		
		
		System.out.println("\n----------- Id y Sueldo Usando Método .map  ------------------");
		
		listaEmpleados
		.stream()
		.filter(empleado->empleado.getFecha_ingreso().isAfter(LocalDate.of(2020,1,1)))
		.map(empleado->{
				empleado.setSueldo(empleado.getSueldo() + ((empleado.getSueldo()*2)/100));
				return "ID : "+empleado.getId()+" | SUELDO: "+empleado.getSueldo();
			})
		.forEach(System.out::println);
		
		
		System.out.println("\n----------- Id, Sueldo Y Fecha de Ingreso Usando Método .map  ------------------");
		
		listaEmpleados
		.stream()
		.filter(empleado->empleado.getFecha_ingreso().isAfter(LocalDate.of(2020,1,1)))
		.map(empleado->{
				empleado.setSueldo(empleado.getSueldo() + ((empleado.getSueldo()*2)/100));
				return "ID : "+empleado.getId()
				+" | SUELDO: "+empleado.getSueldo()
				+ " | FECHA INGRESO: "+empleado.getFecha_ingreso();
			})
		.forEach(System.out::println);
		
		
		
		
		
		System.out.println("\n----------- Usando Método .peek ------------------");
		
	
		listaEmpleados
			.stream()
			.filter(empleado->empleado.getFecha_ingreso().isAfter(LocalDate.of(2020,1,1)))
			.peek(empleado->empleado.setSueldo(empleado.getSueldo() + ((empleado.getSueldo()*2)/100)))
			.forEach(System.out::println);
			
		

		System.out.println("\n---------------------------------------------------------------");
		System.out.println("-------- Aumento del 4% del Sueldo Empleados con menos de 2 años ----------");
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("\n----------- Usando Método .map ------------------");
	
		listaEmpleados
		.stream()
		.filter(empleado->empleado.getFecha_ingreso().isAfter(LocalDate.of(2019,1,1)))
		.map(empleado->{
				empleado.setSueldo(empleado.getSueldo() + ((empleado.getSueldo()*4)/100));
				return empleado;
			})
		.forEach(System.out::println);
		
		
		
	System.out.println("\n----------- Id, Sueldo Y Fecha de Ingreso Usando Método .map  ------------------");
		
		listaEmpleados
		.stream()
		.filter(empleado->empleado.getFecha_ingreso().isAfter(LocalDate.of(2019,1,1)))
		.map(empleado->{
				empleado.setSueldo(empleado.getSueldo() + ((empleado.getSueldo()*4)/100));
				return "ID : "+empleado.getId()
				+" | SUELDO: "+empleado.getSueldo()
				+ " | FECHA INGRESO: "+empleado.getFecha_ingreso();
			})
		.forEach(System.out::println);
		
		
		
		
		
		System.out.println("\n----------- Usando Método .peek ------------------");
		
	
		listaEmpleados
			.stream()
			.filter(empleado->empleado.getFecha_ingreso().isAfter(LocalDate.of(2019,1,1)))
			.peek(empleado->empleado.setSueldo(empleado.getSueldo() + ((empleado.getSueldo()*4)/100)))
			.forEach(System.out::println);
		
		

		System.out.println("\n---------------------------------------------------------------");
		System.out.println("-------- Aumento del 6% del Sueldo Empleados con mas de 3 años ----------");
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("\n----------- Usando Método .map ------------------");
				
		listaEmpleados
		.stream()
		.filter(empleado->empleado.getFecha_ingreso().isBefore(LocalDate.of(2019,1,1)))
		.map(empleado->{
				empleado.setSueldo(empleado.getSueldo() + ((empleado.getSueldo()*6)/100));
				return empleado;
			})
		.forEach(System.out::println);
		
		
		
		System.out.println("\n----------- Id, Sueldo Y Fecha de Ingreso Usando Método .map  ------------------");
		
		
		listaEmpleados
		.stream()
		.filter(empleado->empleado.getFecha_ingreso().isBefore(LocalDate.of(2019,1,1)))
		.map(empleado->{
				empleado.setSueldo(empleado.getSueldo() + ((empleado.getSueldo()*6)/100));
				return "ID : "+empleado.getId()
				+" | SUELDO: "+empleado.getSueldo()
				+ " | FECHA INGRESO: "+empleado.getFecha_ingreso();
			})
		.forEach(System.out::println);
		
		
		
		
		
		System.out.println("\n----------- Usando Método .peek ------------------");
		
	
		listaEmpleados
			.stream()
			.filter(empleado->empleado.getFecha_ingreso().isBefore(LocalDate.of(2019,1,1)))
			.peek(empleado->empleado.setSueldo(empleado.getSueldo() + ((empleado.getSueldo()*6)/100)))
			.forEach(System.out::println);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		

		System.out.println("\n========================");
		System.out.println("======== FECHA DE INGRESO =========");
		System.out.println("==========================");
		
		
		//VAMOS A UTILIZAR EL FRAMEWORK COLLECTION
		//https://es.myservername.com/java-collections-framework-tutorial
		


		System.out.println("\n---------------------------------------------------------------");
		System.out.println("-------- Lista de Empleados ordenada por fecha de ingreso ----------");
		System.out.println("----------------------------------------------------------------");
		
	
				
		listaEmpleados
		.stream()
		.sorted()
		.filter(empleado->empleado.getFecha_ingreso().isBefore(LocalDate.of(2019,1,1)))
		.peek(empleado->empleado.setSueldo(empleado.getSueldo() + ((empleado.getSueldo()*6)/100)))
		.forEach(System.out::println);
		
		*/

	}

}
