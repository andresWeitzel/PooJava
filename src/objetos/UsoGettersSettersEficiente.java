package objetos;

import java.util.ArrayList;
import java.util.List;


public class UsoGettersSettersEficiente {

	public static void main(String[] args) {
		
		
		//INSTANCIAMOS LA CLASE CON CONSTRUCTOR COMPLETO 
		Notebook notebook01 = new Notebook(1,"Lenovo IdeaPad 3i","Lenovo",95.000);
		Notebook notebook02 = new Notebook(2,"HP 240 G7","HP",77.000);
		Notebook notebook03 = new Notebook(3,"Asus x543ua","Asus",80.000);
				
		
		
		//INSTANCIAMOS LA CLASE CON CONSTRUCTOR VACIO
		Notebook notebook04 = new Notebook();
						
		//IMPLEMENTAMOS LOS GETTERS Y SETTERS
		notebook04.setId(4);
		notebook04.setNombre("Lenovo Legion 5 PRO");
		notebook04.setMarca("Lenovo");
		notebook04.setPrecio(341.000);
		
		
		
		
		
		//MOSTRAMOS EL CONTENIDO
		System.out.println("\n---------------------------");
		System.out.println("-----TIENDA DE NOTEBOOKS----");
		System.out.println("---------------------------");
		System.out.println("\n");
		
		
		System.out.println(notebook01.toString());
		System.out.println(notebook02.toString());
		System.out.println(notebook03.toString());
		System.out.println(notebook04.toString());
		
		
		
		//MOSTRAMOS SOLO LAS MARCAS
		System.out.println("\n === MARCAS ===\n");
		System.out.println("ID: "+notebook01.id+" | Marca: "+notebook01.getMarca());
		System.out.println("ID: "+notebook02.id+" | Marca: "+notebook02.getMarca());
		System.out.println("ID: "+notebook03.id+" | Marca: "+notebook03.getMarca());
		System.out.println("ID: "+notebook04.id+" | Marca: "+notebook04.getMarca());
		
		
		//MOSTRAMOS SOLO LOS NOMBRES
		System.out.println("\n === NOMBRES ===\n");
		System.out.println("ID: "+notebook01.id+" | Nombre: "+notebook01.getNombre());
		System.out.println("ID: "+notebook02.id+" | Nombre: "+notebook02.getNombre());
		System.out.println("ID: "+notebook03.id+" | Nombre: "+notebook03.getNombre());
		System.out.println("ID: "+notebook04.id+" | Nombre: "+notebook04.getNombre());

		
		//MOSTRAMOS SOLO LOS PRECIOS
		System.out.println("\n === PRECIOS ===\n");
		System.out.println("ID: "+notebook01.id+" | Precio: "+notebook01.getPrecio());
		System.out.println("ID: "+notebook02.id+" | Precio: "+notebook02.getPrecio());
		System.out.println("ID: "+notebook03.id+" | Precio: "+notebook03.getPrecio());
		System.out.println("ID: "+notebook04.id+" | Precio: "+notebook04.getPrecio());

		
		//AUMENTAMOS LOS PRECIOS DE LA MARCA LENOVO
		System.out.println("\n === SE AUMENTA EL PRECIO DE LA MARCA LENOVO ===\n");
				
		if(notebook01.getMarca() == "Lenovo" ) {
			
			notebook01.setPrecio( (notebook01.getPrecio()) + 20.000 );
		}
		if(notebook02.getMarca() == "Lenovo" ) {
			
			notebook02.setPrecio( (notebook02.getPrecio()) + 20.000 );
		}
		if(notebook03.getMarca() == "Lenovo" ) {
			
			notebook03.setPrecio( (notebook03.getPrecio()) + 20.000 );
		}
		if(notebook04.getMarca() == "Lenovo" ) {
			
			notebook04.setPrecio( (notebook04.getPrecio()) + 20.000 );
		}
		
		
		//MOSTRAMOS SOLO LOS PRECIOS
		System.out.println("\n === PRECIOS ===\n");
		System.out.println("ID: "+notebook01.id+" | Precio: "+notebook01.getPrecio());
		System.out.println("ID: "+notebook02.id+" | Precio: "+notebook02.getPrecio());
		System.out.println("ID: "+notebook03.id+" | Precio: "+notebook03.getPrecio());
		System.out.println("ID: "+notebook04.id+" | Precio: "+notebook04.getPrecio());

		
		
		// Y SI TENEMOS 400 OBJETOS?? COMPLICADO TODO A MANO 
		
		
		
		
		
		System.out.println("\n||||||||||||||||||||||||||||||||||||||||");
		System.out.println("||||||| CÓDIGO EFICIENTE POO |||||||||||");
		System.out.println("||||||||||||||||||||||||||||||||||||||||\n");
		
		
		
		//USAMOS LISTAS(COLECCIONES) Y FOR EACH PARA GUARDAR Y RECORRER DICHOS OBJETOS
				
		List<Notebook> listaNotebooks = new ArrayList<Notebook>();		
				
		
		
		listaNotebooks.add(notebook01);
		listaNotebooks.add(notebook02);
		listaNotebooks.add(notebook03);
		listaNotebooks.add(notebook04);
				
		
		
		

		
		//MOSTRAMOS EL CONTENIDO
		System.out.println("\n---------------------------");
		System.out.println("-----TIENDA DE NOTEBOOKS----");
		System.out.println("---------------------------");
		System.out.println("\n");
		
		
		//CON EL FOR EACH ITERAMOS ELEMENTO A ELEMENTO
		for(Notebook notebook : listaNotebooks) {
			
			System.out.println(notebook);
		}
		
		
		//MOSTRAMOS SOLO LAS MARCAS
		System.out.println("\n === MARCAS ===\n");
		for(Notebook notebook : listaNotebooks) {
			
			System.out.println("ID: "+notebook.id+" | Marca: "+notebook.getMarca());
			
		}
		
		//MOSTRAMOS SOLO LAS NOMBRES
		System.out.println("\n === NOMBRES ===\n");
		for(Notebook notebook : listaNotebooks) {
			
			System.out.println("ID: "+notebook.id+" | Nombre: "+notebook.getNombre());
			
		}
		
		//MOSTRAMOS SOLO LOS PRECIOS
		System.out.println("\n === PRECIOS ===\n");
		for(Notebook notebook : listaNotebooks) {
					
			System.out.println("ID: "+notebook.id+" | Precio: "+notebook.getPrecio());
					
		}
		
		
		//AUMENTAMOS LOS PRECIOS DE LA MARCA LENOVO
		System.out.println("\n === SE AUMENTA EL PRECIO DE LA MARCA LENOVO ===\n");
		for(Notebook notebook : listaNotebooks) {
							
			if(notebook.getMarca()=="Lenovo") {
				
				notebook.setPrecio( (notebook.getPrecio()) + 20.000);
			}
		}
		
		//MOSTRAMOS SOLO LOS PRECIOS
		System.out.println("\n === PRECIOS ===\n");
		for(Notebook notebook : listaNotebooks) {
							
			System.out.println("ID: "+notebook.id+" | Precio: "+notebook.getPrecio());
							
		}
				
				
		
		
		
	}
}


class Notebook{
	
	//ATRIBUTOS-CAMPOS DE LA CLASE
	public int id;
	public String nombre;
	public String marca;
	public double precio;
	
	//CONSTRUCTORES DE LA CLASE

	//Parametrizado
	public Notebook(int id,String nombre, String marca, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}
	
	//Vacio
	public Notebook() {
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
