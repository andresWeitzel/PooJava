package herencia.interfaces.crud.metodos.java8;

import java.time.LocalDate;
import java.time.LocalTime;

//Esta clase hereda de empleado sus caracteristicas y pasa a ser una Subclase o
//clase hija, la clase Empleado es la superclase o clase padre
public class GestionEmpleados extends Empleado {

	public static void main(String[] args) {

		/*
		 * 
		 * // -- Repaso Ventajas de la Herencia -- // -Podemos reutilizar clases,
		 * atributos, metodos, etc, predefinidas y // desarrolladas. // -Eficiencia de
		 * códido y recursos. // -Reutilizacion de nombres pero en clases diferentes. //
		 * -Mantenimiento // -Escalabilidad
		 * 
		 */

		Empleado empleado01 = new Empleado(1, "Juan", "Contreras", 34, LocalDate.of(1977, 1, 9), "DNI", "389987635",
				"20-389987635-2", "Los Patos 22", LocalDate.of(2020, 8, 2), LocalTime.of(12, 45), 49000f);

		Empleado empleado02 = new Empleado(2, "Damian", "Perez", 29, LocalDate.of(1981, 4, 2), "DNI", "396354332",
				"11-396354332-4", "Av. Córdoba 33", LocalDate.of(2018, 2, 2), LocalTime.of(10, 10), 51000f);

		Empleado empleado03 = new Empleado(3, "Sofia", "Aguilar", 22, LocalDate.of(1998, 6, 2), "DNI", "392456722",
				"28-392456722-1", "Juan Baustita Alberdi 07", LocalDate.of(2020, 2, 21), LocalTime.of(9, 22), 46000f);

		Empleado empleado04 = new Empleado(4, "Marcos", "Bustamante", 33, LocalDate.of(1976, 2, 1), "DNI", "389333635",
				"11-389333635-1", "Av. San Vicente 112", LocalDate.of(2019, 2, 1), LocalTime.of(20, 17), 54000f);

		Empleado empleado05 = new Empleado(5, "Jimena", "Martinez", 39, LocalDate.of(1973, 2, 1), "DNI", "367786533",
				"20-367786533-2", "Las Niñas 22", LocalDate.of(2020, 2, 1), LocalTime.of(18, 12), 50200f);

		// --------------------------------------------------------------------

		
		EmpleadoRepository emplRepository = new EmpleadoRepository();

		System.out.println("\n========== AGREGAMOS EMPLEADOS ==============");
		emplRepository.addEmpleado(empleado01);
		emplRepository.addEmpleado(empleado02);
		emplRepository.addEmpleado(empleado03);
		emplRepository.addEmpleado(empleado04);
		emplRepository.addEmpleado(empleado05);

		// System.out.println(emplRepository.listEmpleados());

		// ======================================================================
		// ============================ =========================
		// ============================ OPERACIONES CRUD =============================
		// ======================================================================

		// https://www.arquitecturajava.com/java-stream-filter-y-predicates/
		// https://www.clubdetecnologia.net/blog/2015/java-8-uso-del-metodo-filter/
		// https://refactorizando.com/streams-filter-java/

		System.out.println("\n========== LISTADO DE EMPLEADOS ==============");
		emplRepository.listEmpleados().stream().forEach(System.out::println);
		
		
		System.out.println("\n========== AGREGAMOS UN EMPLEADO ==============");
		emplRepository.addEmpleado(new Empleado(6,"Juan","Perez", 23, LocalDate.of(1998, 12, 2), "DNI", "12312313635",
				"11-12312-1", "Av. San Marcios 122", LocalDate.of(2019, 2, 1), LocalTime.of(20, 17), 34000f));
		
		System.out.println("\n========== LISTADO DE EMPLEADOS ==============");
		emplRepository.listEmpleados().stream().forEach(System.out::println);
		
		
		
		
		System.out.println("\n========== EDITAMOS UN EMPLEADO ==============");
		

		Empleado empleado05Editado = new Empleado(5, "Jimena", "Martinez", 45, LocalDate.of(1967, 2, 1), "DNI", "367786533",
				"20-367786533-2", "Las Niñas 22", LocalDate.of(2020, 2, 1), LocalTime.of(18, 12), 50200f);
		
		emplRepository.updateEmpleado(empleado05Editado);
		
		
		
		System.out.println("\n========== LISTADO DE EMPLEADOS ==============");
		emplRepository.listEmpleados().stream().forEach(System.out::println);
		
		
		
System.out.println("\n========== ELIMINAMOS UN EMPLEADO ==============");
		

		emplRepository.deleteEmpleado(empleado05Editado);
		
		
		
		System.out.println("\n========== LISTADO DE EMPLEADOS ==============");
		emplRepository.listEmpleados().stream().forEach(System.out::println);
		

		// ======================================================================
		// ============================ =========================
		// ============================ METODOS JAVA 8 =============================
		// ======================================================================

		System.out.println("\n========================");
		System.out.println("======== SUELDOS =========");
		System.out.println("==========================");
		
		System.out.println("\n========== ACTUALIZACION DE TODOS LOS SUELDOS ==============");
		
		System.out.println("\n========== USAMOS EL MÉTODO .MAP ==============");
		// Con el .map se obtiene una secuencia de elementos de cualquier tipo
		// En este caso devolvemos un objeto de tipo Empleado modificado.
		// Este es un metodo para la modificación de atributos de las clases

		emplRepository
			.listEmpleados()
			.stream()
			.map(empleado -> {
				empleado.setSueldo(empleado.getSueldo() + 5000);
				return empleado;	
			})
			.forEach(System.out::println);

	
		System.out.println("\n========== ACTUALIZACION DE TODOS LOS SUELDOS SEGUN FECHA DE INGRESO (ANTERIOR A ) ==============");
		
		System.out.println("\n========== USAMOS EL MÉTODO .MAP .FILTER ==============");
		// Con el .map se obtiene una secuencia de elementos de cualquier tipo
		// En este caso devolvemos un objeto de tipo Empleado modificado.
		// Este es un metodo para la modificación de atributos de las clases

		emplRepository
			.listEmpleados()
			.stream()
			.filter(empleado->empleado.getFechaIngreso().isBefore(LocalDate.of(2020, 1, 1)))
			.map(empleado -> {
				empleado.setSueldo(empleado.getSueldo() + 5000);
				return empleado;	
			})
			.forEach(System.out::println);
		

		System.out.println("\n========== ACTUALIZACION DE TODOS LOS SUELDOS SEGUN FECHA DE INGRESO (PORTERIOR A ) ==============");
		
		System.out.println("\n========== USAMOS EL MÉTODO .MAP .FILTER ==============");
		// Con el .map se obtiene una secuencia de elementos de cualquier tipo
		// En este caso devolvemos un objeto de tipo Empleado modificado.
		// Este es un metodo para la modificación de atributos de las clases

		emplRepository
			.listEmpleados()
			.stream()
			.filter(empleado->empleado.getFechaIngreso().isAfter(LocalDate.of(2020, 1, 1)))
			.map(empleado -> {
				empleado.setSueldo(empleado.getSueldo() + 5000);
				return empleado;	
			})
			.forEach(System.out::println);

		
		
System.out.println("\n========== ACTUALIZACION DE TODOS LOS SUELDOS ==============");
		
		System.out.println("\n========== USAMOS EL MÉTODO .PEEK ==============");
		// Con el .peek consumimos todos los elementos definidos en su argumento
		// Este es un metodo para la modificación de atributos de clases
		// Es mas limpia la implementacion pero menos evidente la codificacion
		
		

		emplRepository
			.listEmpleados()
			.stream()
			.peek(empleado -> {
				empleado.setSueldo(empleado.getSueldo() + 5000);	
			})
			.forEach(System.out::println);
		
		
		
		
System.out.println("\n========== ACTUALIZACION DE TODOS LOS SUELDOS SEGUN FECHA DE INGRESO (PORTERIOR A ) ==============");
		
		System.out.println("\n========== USAMOS EL MÉTODO .PEEK .FILTER ==============");
		

		emplRepository
			.listEmpleados()
			.stream()
			.filter(empleado->empleado.getFechaIngreso().isAfter(LocalDate.of(2020, 1, 1)))
			.peek(empleado -> {
				empleado.setSueldo(empleado.getSueldo() + 5000);	
			})
			.forEach(System.out::println);
		
		
		
		
		
		/*
		 * -Usamos .peek() cuando no deseamos cambiar el tipo de elemento, valores o
		 * solo deseamos cambiar el estado interno del elemento(atributos). El
		 * procesamiento se realiza elemento a elemento en forma secuencial
		 * 
		 * -Usamos .map() para cambiar el tipo de elemento o valores. El procesamiento
		 * se realiza en conjunto, se obtiene un resultado a partir de la secuencia
		 * aplicada.
		 * 
		 * NO HAY MUCHA DOCUMENTACIÓN AL RESPECTO SOBRE LAS DIFERENCIAS DE ESTOS METODOS
		 * A NOSOTROS NOS VA A INTERESAR MANEJAR LA INFORMACION PRODUCIENDO UN CODIGO
		 * MÁS LIMPIO
		 */

		
		
	}

}
