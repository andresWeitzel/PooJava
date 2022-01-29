package objetos;

import java.util.ArrayList;
import java.util.List;

public class UsoGettersSettersJava8 {

	public static void main(String[] args) {
		
		Celular celular01= new Celular(1,"JKIOU97LL"
				,"Xiaomi"
				, "Xiaomi Redmi 9A Dual SIM 32 GB gris granito 2 GB RAM"
				,39.000);
		
		Celular celular02= new Celular(2,"KLIO09HUJY"
				,"Samsung"
				, "Celular Samsung Galaxy A02 Negro 64GB"
				,23.999);
		
		Celular celular03= new Celular(3,"JDHFTRH556"
				,"Motorola"
				, "Motorola E7i Power"
				,18.999);
		
		
		//List<Celular> listaCelulares = new ArrayList<Celular>();
		
		List<Celular> listaCelulares = new ArrayList();
		
		
		listaCelulares.add(celular01);
		listaCelulares.add(celular02);
		listaCelulares.add(celular03);
		
		
		
		
		
		
		System.out.println("\n---------------------------");
		System.out.println("--- TIENDA DE CELULARES ---");
		System.out.println("---------------------------\n");
		
		
		//MOSTRAMOS TODOS LOS OBJETOS
		System.out.println("\n === CELULARES ===");
				
		listaCelulares.forEach(objetoCelular -> System.out.println(objetoCelular));	
		
		
		//MOSTRAMOS TODOS LOS OBJETOS
		System.out.println("\n === CELULARES ===");
	
		listaCelulares.forEach(System.out::println);
		
		
		System.out.println("\n===================================");
		
		//MOSTRAMOS TODOS LOS OBJETOS
		System.out.println("\n === MARCAS ===");
	
		listaCelulares.forEach(objetoCelular -> System.out.println(objetoCelular.getMarca()));	
		
		
		
		System.out.println("\n------------------");
		System.out.println(" ID   |   MARCAS");
		System.out.println("------------------");
		//ITERAMOS TODAS LAS MARCAS CON EL FOREACH
		
		listaCelulares.forEach(objetoCelular -> System.out.println(
				
				"ID: "+objetoCelular.getId()+" | MARCA: "+objetoCelular.getMarca()));	
		
		
		System.out.println("\n===================================");
		
		
		
		System.out.println("\n------------------");
		System.out.println(" ID   |   NOMBRES");
		System.out.println("------------------");
		//ITERAMOS TODAS LOS NOMBRES CON EL FOREACH
		
		listaCelulares.forEach(objetoCelular -> System.out.println(
				
				"ID: "+objetoCelular.getId()+" | NOMBRE: "+objetoCelular.getNombre()));	
		
		
	
	System.out.println("\n===================================");
		
		
		
		System.out.println("\n------------------");
		System.out.println(" ID   |   PRECIO");
		System.out.println("------------------");
		//ITERAMOS TODAS LOS NOMBRES CON EL FOREACH
		
		listaCelulares.forEach(objetoCelular -> System.out.println(
				
				"ID: "+objetoCelular.getId()+" | PRECIO: "+objetoCelular.getPrecio()));	
		
		
	
		
		
		
		
	}
	
	
	
}

class Celular{
	
public int id;
public String codigo;
public String marca;
public String nombre;
public double precio;


public Celular(int id, String codigo, String marca, String nombre, double precio) {
	super();
	this.id = id;
	this.codigo = codigo;
	this.marca = marca;
	this.nombre = nombre;
	this.precio = precio;
}


public Celular(String codigo, String marca, String nombre, double precio) {
	super();
	this.codigo = codigo;
	this.marca = marca;
	this.nombre = nombre;
	this.precio = precio;
}


public Celular() {
	super();
}









public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getCodigo() {
	return codigo;
}


public void setCodigo(String codigo) {
	this.codigo = codigo;
}


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}





@Override
public String toString() {
	return "Celular [id=" + id + ", codigo=" + codigo + ", marca=" + marca + ", nombre=" + nombre + ", precio=" + precio
			+ "]";
}






	
	
}


