package objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsoGettersSettersJava8 {

	public static void main(String[] args) {
		
	
	
	//INSTANCIAMOS LA CLASE CON CONSTRUCTOR COMPLETO 
	Celular celular01 = new Celular(1,"Xiaomi Redmi 9A","Xiaomi",27.000);
	Celular celular02 = new Celular(2,"Samsung Galaxi s2","Samsung",33.000);
	Celular celular03 = new Celular(3,"Iphone 10 Plus","Iphone",200.000);
			
	
	
	//INSTANCIAMOS LA CLASE CON CONSTRUCTOR VACIO
	Celular celular04 = new Celular();
					
	//IMPLEMENTAMOS LOS GETTERS Y SETTERS
	celular04.setId(4);
	celular04.setNombre("Samsung Galaxi S9+");
	celular04.setMarca("Samsung");
	celular04.setPrecio(29.000);
	
	
	
	
	
	
	
	
	System.out.println("\n||||||||||||||||||||||||||||||||||||||||");
	System.out.println("||||||| CÓDIGO EFICIENTE POO |||||||||||");
	System.out.println("||||||||||||||||||||||||||||||||||||||||\n");
	
	
	
	//USAMOS LISTAS(COLECCIONES) Y FOR EACH PARA GUARDAR Y RECORRER DICHOS OBJETOS
			
	List<Celular> listaCelulares = new ArrayList<Celular>();		
			
	
	
	listaCelulares.add(celular01);
	listaCelulares.add(celular02);
	listaCelulares.add(celular03);
	listaCelulares.add(celular04);
			
	
	
	

	
	//MOSTRAMOS EL CONTENIDO
	System.out.println("\n---------------------------");
	System.out.println("-----TIENDA DE CELULARES----");
	System.out.println("---------------------------");
	System.out.println("\n");
	
	
	//CON EL FOR EACH ITERAMOS ELEMENTO A ELEMENTO
	for(Celular notebook : listaCelulares) {
		
		System.out.println(notebook);
	}
	
	
	//MOSTRAMOS SOLO LAS MARCAS
	System.out.println("\n === MARCAS ===\n");
	for(Celular notebook : listaCelulares) {
		
		System.out.println("ID: "+notebook.id+" | Marca: "+notebook.getMarca());
		
	}
	
	//MOSTRAMOS SOLO LAS NOMBRES
	System.out.println("\n === NOMBRES ===\n");
	for(Celular notebook : listaCelulares) {
		
		System.out.println("ID: "+notebook.id+" | Nombre: "+notebook.getNombre());
		
	}
	
	//MOSTRAMOS SOLO LOS PRECIOS
	System.out.println("\n === PRECIOS ===\n");
	for(Celular notebook : listaCelulares) {
				
		System.out.println("ID: "+notebook.id+" | Precio: "+notebook.getPrecio());
				
	}
	
	
	//AUMENTAMOS LOS PRECIOS DE LA MARCA LENOVO
	System.out.println("\n === SE AUMENTA EL PRECIO DE LA MARCA IPHONE ===\n");
	for(Celular notebook : listaCelulares) {
						
		if(notebook.getMarca()=="Iphone") {
			
			notebook.setPrecio( (notebook.getPrecio()) + 6.000);
		}
	}
	
	//MOSTRAMOS SOLO LOS PRECIOS
	System.out.println("\n === PRECIOS ===\n");
	for(Celular notebook : listaCelulares) {
						
		System.out.println("ID: "+notebook.id+" | Precio: "+notebook.getPrecio());
						
	}
	
	
	
	System.out.println("----------------------------------------------------------------");
	
	System.out.println("\n|||||||||||||||||||||||||||||||");
	System.out.println("||||||| CÓDIGO JAVA 8 |||||||||||");
	System.out.println("|||||||||||||||||||||||||||||||||\n");
	
	
	

	
	//USAMOS LISTAS(COLECCIONES) Y FOR EACH PARA GUARDAR Y RECORRER DICHOS OBJETOS
			
	List<Celular> listaCelulares02 = new ArrayList<Celular>();		
			
	
	
	listaCelulares02.add(celular01);
	listaCelulares02.add(celular02);
	listaCelulares02.add(celular03);
	listaCelulares02.add(celular04);
			
	
	
	

	
	//MOSTRAMOS EL CONTENIDO
	System.out.println("\n---------------------------");
	System.out.println("-----TIENDA DE CELULARES----");
	System.out.println("---------------------------");
	System.out.println("\n");
			
	

	//MOSTRAMOS TODOS LOS OBJETOS
	System.out.println("\n === CELULARES ===\n");
	
	//USANDO LAMBDAS EXPRESSIONS Y FOR EACH  LOGRAMOS LO MISMO DE UNA MANERA MAS CONCISA
	listaCelulares02.forEach(objetoCelular -> System.out.println(objetoCelular));
	
	
	//MOSTRAMOS TODOS LOS OBJETOS
	System.out.println("\n === CELULARES ===\n");
		
	//PODEMOS USAR UN LAMBDA EXPRESSION MAS RESUMIDO
	listaCelulares02.forEach(System.out::println);
	
	
	

	
	//MOSTRAMOS SOLO LAS MARCAS
	System.out.println("\n === MARCAS ===\n");
	
	
	//EJEMPLO LADO DEL BACKEND
	listaCelulares02.forEach(objetoCelular -> System.out.println(objetoCelular.getMarca()));
	
	//EJEMPLO LADO DEL FRONTEND
	listaCelulares02.forEach(objetoCelular -> System.out.println(
			
			"ID: " + objetoCelular.getId() + " | MARCA: " + objetoCelular.getMarca()
			
	));
	
	
	//ATENTI, ACA QUE YO SEPA NO HAY FORMA DE OBTENER UN VALOR DE UN CAMPO DE LA 
	//CLASE A TRAVES DE UN GETTER( SI APLICANDO UN FILTER Y STREAM, PERO NO USANDO
	// UN LAMBDA EXPRESSION IMPLICITO DE ESTA FORMA
	
	//MOSTRAMOS SOLO LAS MARCAS
	//System.out.println("\n === MARCAS ===\n");
	//listaCelulares02.forEach(System.out::println);
	
	
	//MOSTRAMOS SOLO LOS NOMBRES
	System.out.println("\n === NOMBRES ===\n");
	
	
	listaCelulares02.forEach(objetoCelular -> System.out.println(objetoCelular.getNombre()));
	
	
	//EJEMPLO LADO DEL FRONTEND
	listaCelulares02.forEach(objetoCelular -> System.out.println(
				
		"ID: " + objetoCelular.getId() + " | NOMBRE: " + objetoCelular.getNombre()
				
		));
	
	
	//MOSTRAMOS SOLO LOS PRECIOS
	System.out.println("\n === PRECIOS ===\n");
	
		
	listaCelulares02.forEach(objetoCelular -> System.out.println(objetoCelular.getPrecio()));
		
	
	//EJEMPLO LADO DEL FRONTEND
	listaCelulares02.forEach(objetoCelular -> System.out.println(
					
		"ID: " + objetoCelular.getId() + " | PRECIO: " + objetoCelular.getPrecio()
					
		));
		
	
	
	
	}
	
	
}



class Celular{

//ATRIBUTOS-CAMPOS DE LA CLASE
public int id;
public String nombre;
public String marca;
public double precio;

//CONSTRUCTORES DE LA CLASE

//Parametrizado
public Celular(int id,String nombre, String marca, double precio) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.marca = marca;
	this.precio = precio;
}

//Vacio
public Celular() {
	super();
}





//METODOS GETTERS Y SETTERS

public int getId() {
	
	return id;
}

public void setId(int id) {
	this.id=id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}


//METODO TOSTRING
@Override
public String toString() {
	return "Notebook [ID = "+id+" , Nombre = " + nombre + ", Marca = " + marca + " , Precio = "+precio+" ]";
}
	
	
}
