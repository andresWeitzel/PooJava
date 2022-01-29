package objetos;

import java.util.ArrayList;
import java.util.List;


public class UsoGettersSettersEficiente {

	public static void main(String[] args) {
		
		
		Notebook notebook01 = new Notebook(1, "20TES0X200","Lenovo ThinkPad E15 2da Gen","ThinkPad",179.999);
		Notebook notebook02 = new Notebook(2, "RZ09-02812EQ1","Razer Blade 15","Razer",460.786);
		Notebook notebook03 = new Notebook(3, "AT550","Notebook BGH Positivo","BGH",59.849);
		
		Notebook notebook04 = new Notebook();
		
		notebook04.setId(4);
		notebook04.setModelo("82A3001FAR");
		notebook04.setNombre("Yoga Slim 7i 14\" - Slate Grey");
		notebook04.setMarca("Yoga");
		notebook04.setPrecio(156.999);
		
		
		System.out.println("\n---------------------------");
		System.out.println("--- TIENDA DE NOTEBOOKS ---");
		System.out.println("---------------------------\n");
		
		System.out.println(notebook01.toString());
		System.out.println(notebook02.toString());
		System.out.println(notebook03.toString());
		System.out.println(notebook04.toString());
		
		
		//MOSTRAMOS SOLO LAS MARCAS
		System.out.println("\n === MARCAS ===");
		
		System.out.println("------------------");
		System.out.println(" ID   |   MARCAS");
		System.out.println("------------------");
		
		System.out.println("    "+notebook01.getId()+"    "+notebook01.getMarca());
		System.out.println("    "+notebook02.getId()+"    "+notebook02.getMarca());
		System.out.println("    "+notebook03.getId()+"    "+notebook03.getMarca());
		System.out.println("    "+notebook04.getId()+"    "+notebook04.getMarca());

		System.out.println("\n----------------------------------------");
		
		
		//MOSTRAMOS SOLO LOS NOMBRES
		System.out.println("\n === NOMBRES ===");
		
		System.out.println("------------------");
		System.out.println(" ID   |   NOMBRES");
		System.out.println("------------------");
		
		System.out.println("    "+notebook01.getId()+"    "+notebook01.getNombre());
		System.out.println("    "+notebook02.getId()+"    "+notebook02.getNombre());
		System.out.println("    "+notebook03.getId()+"    "+notebook03.getNombre());
		System.out.println("    "+notebook04.getId()+"    "+notebook04.getNombre());

		
		System.out.println("\n----------------------------------------");
		
		
		//MOSTRAMOS SOLO LAS MODELO
		System.out.println("\n === MODELO ===");
		
		System.out.println("------------------");
		System.out.println(" ID   |   MODELOS");
		System.out.println("------------------");
		
		System.out.println("    "+notebook01.getId()+"    "+notebook01.getModelo());
		System.out.println("    "+notebook02.getId()+"    "+notebook02.getModelo());
		System.out.println("    "+notebook03.getId()+"    "+notebook03.getModelo());
		System.out.println("    "+notebook04.getId()+"    "+notebook04.getModelo());

		System.out.println("\n----------------------------------------");
		
		
		
		//MOSTRAMOS SOLO LOS PRECIOS
		System.out.println("\n === PRECIOS ===");
		
		System.out.println("------------------");
		System.out.println(" ID   |   PRECIOS");
		System.out.println("------------------");
		
		System.out.println("    "+notebook01.getId()+"    "+notebook01.getPrecio());
		System.out.println("    "+notebook02.getId()+"    "+notebook02.getPrecio());
		System.out.println("    "+notebook03.getId()+"    "+notebook03.getPrecio());
		System.out.println("    "+notebook04.getId()+"    "+notebook04.getPrecio());

		
		System.out.println("\n----------------------------------------");
		
		//AUMENTAMOS PRECIOS POR MARCA
		System.out.println("\n == SE AUMENTA EL PRECIO POR MARCA ==");
		
		if(notebook01.getMarca() == "ThinkPad") {
			
			notebook01.setPrecio(notebook01.getPrecio() + 5.000);
		}
		if(notebook02.getMarca() == "ThinkPad") {
			
			notebook02.setPrecio(notebook02.getPrecio() + 5.000);
		}
		if(notebook03.getMarca() == "ThinkPad") {
			
			notebook03.setPrecio(notebook03.getPrecio() + 5.000);
		}
		if(notebook04.getMarca() == "ThinkPad") {
			
			notebook04.setPrecio(notebook04.getPrecio() + 5.000);
		}
		
		
		System.out.println("\n----------------------------------------");
		
		
		
		//MOSTRAMOS SOLO LOS PRECIOS
		System.out.println("\n === PRECIOS ===");
		
		System.out.println("------------------");
		System.out.println(" ID   |   PRECIOS");
		System.out.println("------------------");
		
		System.out.println("    "+notebook01.getId()+"    "+notebook01.getPrecio());
		System.out.println("    "+notebook02.getId()+"    "+notebook02.getPrecio());
		System.out.println("    "+notebook03.getId()+"    "+notebook03.getPrecio());
		System.out.println("    "+notebook04.getId()+"    "+notebook04.getPrecio());

		
		System.out.println("\n----------------------------------------");
		
	
		
		System.out.println("\n---------------------------");
		System.out.println("--- CÓDIGO EFICIENTE ---");
		System.out.println("---------------------------\n");
		
		//Usamos Listas (colecciones) y For Eachs para guardar y recorrer dichos objetos
		
		//No es necesario pasarle el tipo de lista en el constructor
		//List<Notebook> listaNotebook = new ArrayList<Notebook>();
		List<Notebook> listaNotebooks = new ArrayList();
		
		
		listaNotebooks.add(notebook01);
		listaNotebooks.add(notebook02);
		listaNotebooks.add(notebook03);
		listaNotebooks.add(notebook04);
		
		
		//ITERAMOS ELEMENTO A ELEMENTO CON EL FOREACH
		for(Notebook objetoNotebook : listaNotebooks ) {
			
			System.out.println(objetoNotebook);
		}
		
		System.out.println("\n===================================");
		
		System.out.println("------------------");
		System.out.println(" ID   |   MARCAS");
		System.out.println("------------------");
		//ITERAMOS TODAS LAS MARCAS CON EL FOREACH
		for(Notebook objetoNotebook : listaNotebooks ) {
					
			System.out.println("    "+objetoNotebook.getId()+"    "+objetoNotebook.getMarca());
		}
		
		
		System.out.println("\n===================================");
		
		System.out.println("------------------");
		System.out.println(" ID   |   NOMBRES");
		System.out.println("------------------");
		//ITERAMOS TODAS LOS NOMBRES CON EL FOREACH
		for(Notebook objetoNotebook : listaNotebooks ) {
					
			System.out.println("    "+objetoNotebook.getId()+"    "+objetoNotebook.getNombre());
		}
		
		
		System.out.println("\n===================================");
		
		System.out.println("------------------");
		System.out.println(" ID   |  MODELOS");
		System.out.println("------------------");
		//ITERAMOS TODAS LOS MODELOS CON EL FOREACH
		for(Notebook objetoNotebook : listaNotebooks ) {
					
			System.out.println("    "+objetoNotebook.getId()+"    "+objetoNotebook.getModelo());
		}
		
		
		System.out.println("\n===================================");
		
		System.out.println("------------------");
		System.out.println(" ID   |  PRECIOS");
		System.out.println("------------------");
		//ITERAMOS TODAS LOS PRECIOS CON EL FOREACH
		for(Notebook objetoNotebook : listaNotebooks ) {
					
			System.out.println("    "+objetoNotebook.getId()+"    "+objetoNotebook.getPrecio());
		}
		
		
		
		System.out.println("\n===================================");
		
		System.out.println(" === SE AUMENTA EL PRECIO DE LA MARCA RAZER ===");
		
		for(Notebook objetoNotebook : listaNotebooks ) {
					
			if(objetoNotebook.getMarca() == "Razer") {
				
				objetoNotebook.setPrecio(objetoNotebook.getPrecio() + 2.000);
			}
			
		}
		
		
		
		
		System.out.println("\n===================================");
		
		System.out.println("------------------");
		System.out.println(" ID   |  PRECIOS");
		System.out.println("------------------");
		//ITERAMOS TODAS LOS PRECIOS CON EL FOREACH
		for(Notebook objetoNotebook : listaNotebooks ) {
					
			System.out.println("    "+objetoNotebook.getId()+"    "+objetoNotebook.getPrecio());
		}
		
		
		
		
	}


}

class Notebook{
	
	public int id;
	public String modelo;
	public String nombre;
	public String marca;
	public double precio;
	
	
	
	
	
	public Notebook(int id, String modelo, String nombre, String marca, double precio) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}


	public Notebook(String codigo, String nombre, String marca, double precio) {
		super();
		this.modelo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}


	public Notebook() {
		super();
	}

	
	
	
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
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


	
	@Override
	public String toString() {
		return "Notebook [id=" + id + ", modelo=" + modelo + ", nombre=" + nombre + ", marca=" + marca + ", precio="
				+ precio + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}







