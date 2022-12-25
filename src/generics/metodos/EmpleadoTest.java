package generics.metodos;

import java.time.LocalDate;

public class EmpleadoTest {
public static void main(String[] args) {
	
	Empleado supervisor01 = new Empleado();
	
	
	//==========================================================================
	System.out.println("\n======= AGREGAMOS EMPLEADOS TIPO STRING ========");
	//Notar que nos ahorramos la declaracion de tipo y podemos aplicar lo que necesitemos
	System.out.println(supervisor01.listaEmpleados( "Marcelo Gutierrez"));
	
	System.out.println(supervisor01.listaEmpleados( "Carla Martinez","Jeremias Rodriguez"));
	
	
	//==========================================================================
	System.out.println("\n======== AGREGAMOS EMPLEADOS TIPO  PERSONA ======");
	
	System.out.println(supervisor01.listaEmpleados(new Persona(1,"Ramon","Castro",22,"DNI","121231231")));
	
	//==========================================================================	
	System.out.println("\n======== AGREGAMOS EMPLEADOS TIPO STRING Y PERSONA ======");
	
	Persona marcosGutierrez = new Persona(2,"Marcos","Gutierrez",43,"DNI","123423423");
	
	String joseAlvarez = "José Alvarez , 34 años, DNI, 12312312";
	
	System.out.println(supervisor01.listaEmpleados(marcosGutierrez, joseAlvarez));
	
	//==========================================================================
	System.out.println("\n======== AGREGAMOS EMPLEADOS TIPO EMPLEADO Y PERSONA ======");
	
	Persona juanGustamante = new Persona(3,"Juan","Gustamante",38,"DNI","812896121");
	
	Empleado sofiaContriri = new Empleado(1, 123111 , LocalDate.of(2022, 2, 12));
	
	System.out.println(supervisor01.listaEmpleados(juanGustamante, sofiaContriri));
	
	

}
}
