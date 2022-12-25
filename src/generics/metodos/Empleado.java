package generics.metodos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
	
	long id;
	long nroEmpleado;
	LocalDate fechaIngreso;
	
	

	//Metodo generico de tipo lista generica con parametro generico sobrecargado 
	public <T> List<T> listaEmpleados(T empleado01){
		
		List<T> lista = new ArrayList<T>();
		
		lista.add(empleado01);
		
		return lista;
	}
	
	//Metodo generico de tipo lista generica con parametro generico sobrecargado
	public <T> List<T> listaEmpleados(T empleado01, T empleado02){
		
		List<T> lista = new ArrayList<T>();
		
		//Atenti, aca el nivel de abstraccion tendremos que respetarlo, si usamos
		//la clase Arrays tambien sera de tipo generica
		lista.add((T) Arrays.asList(empleado01,empleado02));
		
		return lista;
	}
	

	
	

}
