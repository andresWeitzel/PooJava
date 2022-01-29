package objetos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class UsoGettersSettersStreamsFiltersJava8 {

	public static void main(String[] args) {
		
		
		Empleados empleado01 = new Empleados
				(1 , "Juan" , "Contreras", 34 , LocalDate.of(1977, 1, 9) 
				, "DNI" , "38867353" , "11-38867353-0" , "Los Patos 22" 
				, LocalDate.of(2020, 8, 12) , 49000f );
	
		
		Empleados empleado02 = new Empleados
				(2 , "Damian" , "Perez", 29 , LocalDate.of(1981, 4, 2) 
				, "DNI" , "39876451" , "12-39876451-9" , "Av. Córdoba 1024" 
				, LocalDate.of(2020, 2, 22) , 53000f );
		
		Empleados empleado03 = new Empleados
				(3 , "Sofia" , "Aguilar", 22 , LocalDate.of(1998, 2, 12) 
				, "DNI" , "39765243" , "10-39765243-1" , "Juan Bautista Alberdi 07" 
				, LocalDate.of(2020, 2, 10) , 46000f );
		
		Empleados empleado04 = new Empleados
				(4 , "Marcos" , "Bustamante" , 33 , LocalDate.of(1976,2,1)  , "DNI" , "389333635"
				,"11-389333635-1" , "Av. San Vicente 112" ,  LocalDate.of(2019,2,1), 54000f
				);
		
		Empleados empleado05 = new Empleados
				(5 , "Jimena" , "Martinez" , 39 , LocalDate.of(1973,2,1)  , "DNI" , "367786533"
				,"20-367786533-2" , "Las Niñas 22" ,  LocalDate.of(2020,2,1), 50200f
				);
		
	
		//https://www.arquitecturajava.com/java-stream-filter-y-predicates/
		//https://www.clubdetecnologia.net/blog/2015/java-8-uso-del-metodo-filter/
		//https://refactorizando.com/streams-filter-java/
				
		ArrayList<Empleados> listaEmpleados = new ArrayList();
		
		listaEmpleados.add(empleado01);
		listaEmpleados.add(empleado02);
		listaEmpleados.add(empleado03);
		listaEmpleados.add(empleado04);
		listaEmpleados.add(empleado05);
		
		

		System.out.println("\n---------------------------");
		System.out.println("--- LISTA DE EMPLEADOS ---");
		System.out.println("---------------------------\n");

		//MOSTRAMOS TODOS LOS EMPLEADOS
		System.out.println("\n === EMPLEADOS ===");
				
		//listaEmpleados.forEach(objetoEmpleado -> System.out.println(objetoEmpleado));	
		
		listaEmpleados.forEach(System.out::println);	
		
		
		
		
		System.out.println("\n---------------------------");
		System.out.println("--- LISTA DE EMPLEADOS ---");
		System.out.println("---------------------------\n");
	
	
		listaEmpleados.stream().forEach(System.out::println);	
		
		
		System.out.println("\n-----------");
		System.out.println("--- AÑOS ---");
		System.out.println("-------------\n");
	
		System.out.println("\n---------------------------------");
		System.out.println("--- EMPLEADOS MAYORES DE 25 AÑOS---");
		System.out.println("-----------------------------------\n");
	
		
	
		listaEmpleados
			.stream()
			.filter(empleado -> empleado.getEdad() > 25)
			.forEach(empleado -> System.out.println(empleado));	
		
		System.out.println("\n====");
		
		listaEmpleados
		.stream()
		.filter(empleado -> empleado.getEdad() > 25)
		.forEach(System.out::println);	
		
		
		
		System.out.println("\n---------------------------------");
		System.out.println("--- EMPLEADOS MENORES DE 27 AÑOS---");
		System.out.println("-----------------------------------\n");
	
		
	
		listaEmpleados
			.stream()
			.filter(empleado -> empleado.getEdad() < 27)
			.forEach(System.out::println);	
		
		
		
		System.out.println("\n-----------");
		System.out.println("--- SUELDO---");
		System.out.println("-------------\n");
	
		
		System.out.println("\n--------------------------------------------");
		System.out.println("--- EMPLEADOS CON SUELDOS MENORES A $50000---");
		System.out.println("-------------------------------------------\n");
	
		
		
	
		listaEmpleados
			.stream()
			.filter(empleado -> empleado.getSueldo() < 50000f)
			.forEach(System.out::println);	
		
		

		System.out.println("\n------------------------------------------------");
		System.out.println("--- EMPLEADOS CON SUELDOS ENTRE $50000 Y $60000---");
		System.out.println("---------------------------------------------------\n");
	
		
		
	
		listaEmpleados
			.stream()
			.filter(empleado -> (empleado.getSueldo() >= 50000f) 
					&& (empleado.getSueldo() <= 60000f))
			.forEach(System.out::println);	
		
	
		System.out.println("\n-------------------");
		System.out.println("--- AÑOS Y SUELDOS---");
		System.out.println("---------------------\n");
		
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("--- EMPLEADOS MENORES DE 25 AÑOS CON SUELDOS MAYORES A $25000---");
		System.out.println("---------------------------------------------------------------\n");
	
		
		
		listaEmpleados
		.stream()
		.filter(empleado -> (empleado.getEdad() < 25) 
				&& (empleado.getSueldo() > 25000f))
		.forEach(System.out::println);	
	
		
		
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("--- EMPLEADOS MAYORES DE 35 AÑOS CON SUELDOS MAYORES A $50000---");
		System.out.println("---------------------------------------------------------------\n");
	

		

		listaEmpleados
		.stream()
		.filter(empleado -> (empleado.getEdad() > 35) 
				&& (empleado.getSueldo() > 50000f))
		.forEach(System.out::println);	
		
		
		
		System.out.println("\n-----------------------");
		System.out.println("--- FECHA DE INGRESO---");
		System.out.println("-----------------------\n");
	
	
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("--- EMPLEADOS CUYA FECHA DE INGRESO SEA POSTERIOR A 2018-01-02---");
		System.out.println("---------------------------------------------------------------\n");
	

		listaEmpleados
		.stream()
		.filter(empleado -> (empleado.getFecha_ingreso().isAfter(LocalDate.of(2018,01,02))))
		.forEach(System.out::println);	
		
		
		
		System.out.println("\n----------------------------------------------------------------------------");
		System.out.println("--- EMPLEADOS CUYA FECHA DE INGRESO SEA POSTERIOR A 2019-03-12 o 2020-01-21---");
		System.out.println("-------------------------------------------------------------------------------\n");
	

		listaEmpleados
		.stream()
		.filter(empleado -> (empleado.getFecha_ingreso().isAfter(LocalDate.of(2019,03,12))
							|| (empleado.getFecha_ingreso().isAfter(LocalDate.of(2020,01,21)))))
		.forEach(System.out::println);	
		
		
		
		System.out.println("\n----------------------------------------------------------------------------");
		System.out.println("--- EMPLEADOS CUYA FECHA DE INGRESO SEA ANTERIOR A 2020-01-22 ---");
		System.out.println("-------------------------------------------------------------------------------\n");
	

		listaEmpleados
		.stream()
		.filter(empleado -> (empleado.getFecha_ingreso().isBefore(LocalDate.of(2020,01,22))))
		.forEach(System.out::println);	
		
		
		System.out.println("\n----------------------------------------------------------------------------");
		System.out.println("--- EMPLEADOS CUYA FECHA DE INGRESO SEA POSTERIOR A 2019-03-12 Y ANTERIOR A 2020-03-12---");
		System.out.println("-------------------------------------------------------------------------------\n");
	

		listaEmpleados
		.stream()
		.filter(empleado -> (empleado.getFecha_ingreso().isAfter(LocalDate.of(2019,03,12))
							&& (empleado.getFecha_ingreso().isBefore(LocalDate.of(2020,03,12)))))
		.forEach(System.out::println);	
		
	
	}
	
	
	
}


class Empleados{
	
	int id;
	String nombre;
	String apellido;
	int edad;
	LocalDate fecha_nac;
	String tipo_doc;
	String nro_doc;
	String cuil;
	String direccion;
	LocalDate fecha_ingreso;
	float sueldo;
	
	


	public Empleados(int id, String nombre, String apellido, int edad
			, LocalDate fecha_nac, String tipo_doc, String nro_doc,String cuil
			, String direccion, LocalDate fecha_ingreso, float sueldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fecha_nac = fecha_nac;
		this.tipo_doc = tipo_doc;
		this.nro_doc = nro_doc;
		this.cuil = cuil;
		this.direccion = direccion;
		this.fecha_ingreso = fecha_ingreso;
		this.sueldo = sueldo;
	}


	public Empleados(String nombre, String apellido, int edad, LocalDate fecha_nac
			, String tipo_doc, String nro_doc,String cuil, String direccion
			, LocalDate fecha_ingreso, float sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fecha_nac = fecha_nac;
		this.tipo_doc = tipo_doc;
		this.nro_doc = nro_doc;
		this.cuil = cuil;
		this.direccion = direccion;
		this.fecha_ingreso = fecha_ingreso;
		this.sueldo = sueldo;
	}
	
	public Empleados() {
		
	}

	
	
	
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public LocalDate getFecha_nac() {
		return fecha_nac;
	}


	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}


	public String getTipo_doc() {
		return tipo_doc;
	}


	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}


	public String getNro_doc() {
		return nro_doc;
	}


	public void setNro_doc(String nro_doc) {
		this.nro_doc = nro_doc;
	}


	public String getCuil() {
		return cuil;
	}


	public void setCuil(String cuil) {
		this.cuil = cuil;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public LocalDate getFecha_ingreso() {
		return fecha_ingreso;
	}


	public void setFecha_ingreso(LocalDate fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}


	public float getSueldo() {
		return sueldo;
	}


	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Empleados [id=" + id + ", nombre=" + nombre + ", apellido=" 
				+ apellido + ", edad=" + edad+ ", fecha_nac=" + fecha_nac 
				+ ", tipo_doc=" + tipo_doc + ", nro_doc=" + nro_doc + ", cuil=" + cuil
				+ ", direccion=" + direccion + ", fecha_ingreso=" + fecha_ingreso 
				+ ", sueldo=" + sueldo + "]";
	}
	
	
	

	
	
	
}
