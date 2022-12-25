package generics.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ListasGenericsObjects {

	public static void main(String[] args) {
		
		Cliente cli01= new Cliente(1,"3778hh2b1212b","Juan","Castro","juanCastro@gmail.com");		
		Cliente cli02= new Cliente(2,"asdaa112b1212b","Sofia","Martinez","sofi.889@gmail.com");
		Cliente cli03= new Cliente(3,"23232s8hh2b1212b","Javier","Perez","javier.Perez@gmail.com");
		Cliente cli04= new Cliente(4,"sassaa112b1212b","Marcos","Antonio","marcosAntonioCanh@gmail.com");
		Cliente cli05= new Cliente(5,"dsa123h2b1212b","Marcela","Bustamante","marcela@gmail.com");
		
		
		System.out.println("\n---------- SIN GENERICS -------------");

		List listaCli = Arrays.asList(new Cliente[]{ 
				cli01,cli02,cli03,cli04,cli05 
				});
		
		//Podemos trabajar una lista sin generic, java la autoconvierte...pero en
		//su momento no existian las lambdas consumer como la siguiente
		//listaCli.forEach(System.out::println);
		
		
		//Teniamos que trabajarla con iterators como lo que ya conocemos
		for (Iterator it = listaCli.iterator(); it.hasNext();) {
			Cliente n = ((Cliente) it.next());
			
			System.out.println(n);
		}
		
		
		System.out.println("\n---------- CON GENERICS -------------");
		
		List<Cliente> listaCliGeneric = new ArrayList<Cliente>(
				Arrays.asList(cli01,cli02,cli03,cli04,cli05)
		);
		
		listaCliGeneric.forEach(System.out::println);
		
	}
	
	
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Cliente{
	int id;
	String nroCliente;
	String nombre;
	String apellido;
	String email;
}


