package generics.introduccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GerenicIntro {
	
	public static void main(String[] args) {
		
		
		
		/*
		 -Se implementan en clases y metodos.
		 -Se denotan <E> <T> (E:Element y T:type). Segun la convencion E se usan 
		 para elementos en estructuras de datos commo listas, arrays, etc y T para
		 el tipo de dato a usar.
		 ej...
		 
		 public class Persona<T> --> Clase Genérica
		 
		 public List<E> listado() --> Método List Genérico
		 
		 Generic vs Polimorfismo?? casos diferentes...pero los generic es la 
		 evolucion del polimorfismo...imaginate que uses polimorfismo en varias 
		 funciones, tenes que estar sobreescribiendolas constantemente segun la 
		 necesidad para una misma funcionalidad, en cambio, con el uso de genericos 
		 se redefine el tipo y no la funcion en si...
		 ej...
		 
		  ////| Polimorfismo con funciones |/////
		  
		  ----------------------------------------------------------
		  public class Persona{
		  	
				  	public void accion(int num){
				  		
				  		List<Integer> lista = new ArrayList<>();
				  		lista.add(num);
				  }
				  	public void accion02(double num){
				  		
				  		List<Double> lista = new ArrayList<>();
				  		lista.add(num);
				  }
				  
				  ......
		  
		  }
		  ----------------------------------------------------------
		   
		  
		  sobreescribimos esta funcion en otras clases..
		  
		  ----------------------------------------------------------
		  public class Cliente extends Persona{
		  
			 
				  	public void accion(int num){
				  		
				  		List<Integer> lista = new ArrayList<>();
				  		lista.add(num + 121212);
				  }
				  
				  
				  	public void accion02(double num){
				  		
				  		List<Double> lista = new ArrayList<>();
				  		lista.add(num + 1123.1212);
				  }
				  
				  ......
		  
		  } 
		  ----------------------------------------------------------
		  
		  
		  //EN CUANTO NECESITEMOS MÁS FUNCIONALIDADES TENDREMOS QUE DESARROLLAR
		  //MAS CANTIDAD DE FUNCIONES, EN CAMBIO CON LOS GENERIC LA CANTIDAD DE 
		  //CODIGO SE REDUCE
		  
		  
		  ////| Generic con funciones |/////
		 
		 ----------------------------------------------------------
		 
		 public class Persona{
		  	
				  	public void accion(T num){
				  		
				  		List<T> lista = new ArrayList<T>();
				  		lista.add(num);
				  }
				
		  }
		 ----------------------------------------------------------
		  
		  
		  	//NOS DESPREOCUPAMOS DEL TIPO....IMPORTANTISIMO ESTO...
			//DE N FUNCIONES QUE REALICEN LA MISMA FUNCIONALIDAD LA RESUMIMOS
			//A UNA
			

		  //sobreescribimos esta funcion en otras clases..
		  
		  ----------------------------------------------------------
		  public class Cliente extends Persona{
		 
		 			public void accion(T num){
				  		
				  		List<T> lista = new ArrayList<T>();
				  		lista.add(num + 121212);
				  }
				  
			}
			
		----------------------------------------------------------	
		 
		//OJO QUE EL GENERIC NO ES NI MEJOR NI PEOR QUE EL POLIMORFISMO...
		//SOLAMENTE DESDE MI PUNTO DE VISTA ES UNA EVOLUCION, QUE SE IMPLEMENTA
		//PARA CASOS DIFERENTES Y OBJETIVOS DIFERENTES..LOS CASOS MÁS USADOS EN
		//JAVA8 SON EN INTERFACES DE LA API COLLECTION Y POR LO GENERAL LOS GENERIC
		//Y EL POLIMORFISMO SE USAN JUNTOS
		 
		 
		 
		 
		 
		 
			
		 */
		
	}

}
