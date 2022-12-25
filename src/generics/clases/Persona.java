package generics.clases;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Podemos crear instancias de objetos con tipos específicos
 *  de la clase genérica. Esto nos permite una gran oportunidad
 *   de reutilizar el software.
 * */

//USO DE CLASES GENERICAS

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona<T> {
	//Identificadores validos para generics son T (TYPE) y E (ELEMENT) para estructuras
	
	long id;
	String nombre;
	String apellido;
	int edad;
	String tipoDoc;
	String nroDoc;
	
	
	
	public void clasificarPersona(T objeto) {
		
		System.out.println("La Persona ha sido clasificada y es de "
				+ "tipo "+objeto+" !!");
		
		
	}

	//Creamos una lista de tipo generica
	List<T> lista = new ArrayList<T>();
	
	//agregamos objetos segun el tipo pasado
	//Este es un metodo generico...lo veremos a detalle luego
	public void agregarPersonas(T objeto){
		lista.add(objeto);
	} 
	
	//listamos los objetos segun el tipo pasado
	public List<T> listarPersonas(){
		return lista;
	}

}
