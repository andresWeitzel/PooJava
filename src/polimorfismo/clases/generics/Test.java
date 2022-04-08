package polimorfismo.clases.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		//https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=91&codigo=171&inicio=80
		
		
		//Para comprender de una manera mas clara el polimorfismo de clases con generics
		//vamos a implementarlo con listas usando java8
		
		
		Persona p01 = new Persona("Juan","Perez");
		Persona p02 = new Persona("Marcelo","Ramirez");
		Animal a01 = new Animal("Putin","Putin");
		Animal a02 = new Animal("Animalia","Mamifero");
		
		
		List<Persona> listaPersonas = new ArrayList<Persona>();
		List<Animal> listaAnimales = new ArrayList<Animal>();
		
		
		listaPersonas.add(p01);
		listaPersonas.add(p02);
		
		listaAnimales.add(a01);
		listaAnimales.add(a02);
		
		
		//Recorremos la lista
		listaPersonas.forEach(p->System.out.println(p.toString()));
		
		listaAnimales.forEach(a->System.out.println(a.toString()));
		
		
		
		
		
		
	}
	

}
