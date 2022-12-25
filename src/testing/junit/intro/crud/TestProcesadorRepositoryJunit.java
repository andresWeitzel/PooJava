package testing.junit.intro.crud;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.junit.Test;

/*
 * Principio FIRST
Fast: Rápida ejecución.
Isolated: Independiente de otros test.
Repeatable: Se puede repetir en el tiempo.
Self-Validating: Cada test debe poder validar si es correcto o no a sí mismo.
Timely: ¿Cuándo se deben desarrollar los test? ¿Antes o después de que esté todo implementado? Sabemos que cuesta hacer primero los test y después la implementación (TDD: Test-driven development), pero es lo suyo para centrarnos en lo que realmente se desea implementar.
 * 
 * 
 * 
 * */


public class TestProcesadorRepositoryJunit {

	// Creamos un objeto del repository y otro procesador fuera de los metodos test
	//para poder no instanciar un objeto por cada metodo, por cada ejecucion de los 
	//metodos test se esta creando y borrando los objetos del repository
	ProcesadorRepository procesadorRepository = new ProcesadorRepository();
	
	Procesador procesador01 = new Procesador(1, "Intel Celeron N3050", "Intel", "ERT-92383-11", "1.60 Ghz", 0.11, 2,
			"2 MB L2");
	
	Procesador procesador02 = new Procesador(2, "AMD Ryzen 221AJJU", "AMD", "JHS-2727-2211", "2.50 Ghz", 0.22, 3,
			"6 MB L3");
	Procesador procesador03 = new Procesador(3, "Intel Core i7", "Intel", "SSA-JJS-737", "2.30 Ghz", 0.33, 2,
			"3 MB L2");

	
	//============================== INSERT ================================

	// Comprobamos que la funcion agregar funcione correctamente
	@Test
	public void assertAddProcesadorShouldBeTrue() {
	
		// Agregamos el objeto procesador
		procesadorRepository.agregarProcesador(procesador01);
		
		//comprobamos si el objeto esta en la lista
		boolean comprObj = (procesadorRepository.listaProcesadores().contains(procesador01)) ? true : false;

		// Comprobamos si es cierto que realiza lo esperado nuestra funcion
		assertTrue(comprObj);

	}

	@Test
	public void assertAddProcesadorShouldBeFalse() {

		Procesador procesador02 = null;

		
		//Comprobamos si nuestra logica de negocios de objetos nulos funciona
		procesadorRepository.agregarProcesador(procesador02);


		// Comprobamos si esta el objeto en la lista
		assertFalse(procesadorRepository.listaProcesadores().contains(procesador02));

	}
	
	// Comprobamos que la funcion agregue varios objetos
	@Test
	public void assertAddProcesadoresShouldBeTrue() {
	
		// Agregamos los objetos procesadores
		procesadorRepository.agregarProcesador(procesador01);
		procesadorRepository.agregarProcesador(procesador02);
		procesadorRepository.agregarProcesador(procesador03);
		
		//comprobamos si los objetos estan en la lista
		boolean comprObj01 = (procesadorRepository.listaProcesadores().contains(procesador01)) ? true : false;
		boolean comprObj02 = (procesadorRepository.listaProcesadores().contains(procesador02)) ? true : false;
		boolean comprObj03 = (procesadorRepository.listaProcesadores().contains(procesador03)) ? true : false;

		// Comprobamos si es cierto que realiza lo esperado nuestra funcion
		assertTrue(comprObj01);
		assertTrue(comprObj02);
		assertTrue(comprObj03);

	}




	//============================== FIN INSERT ================================
	//============================== READ ================================

	@Test
	public void assertReadListaProcesadoresShouldBeTrue() {

		procesadorRepository.agregarProcesador(procesador01);
		procesadorRepository.agregarProcesador(procesador02);
		procesadorRepository.agregarProcesador(procesador03);
		
		//Comprobamos que la lista de procesadore sea de tipo ArrayList
		ArrayList<Procesador> listaProcs = procesadorRepository.listaProcesadores(); 
	
		// Comprobamos si hay objetos en la lista
		assertTrue(listaProcs.size() > 0);

	}
	

	@Test
	public void assertIsEmptyListaProcesadoresShouldBeFalse() {
		
		//Recordar que para cada ejecucion de los metodos test se limpian los 
		//objetos en memoria, por ende tendremos que volver a declarar y agregar
		//dichos objetos
		
		// Agregamos el objeto procesador
		procesadorRepository.agregarProcesador(procesador01);

		// Comprobamos si esta el objeto en la lista
		assertFalse(procesadorRepository.listaProcesadores().isEmpty());

	}
	
	
	//============================== FIN READ ================================

	
	
	//============================== UPDATE ================================
	@Test
	public void assertUpdateProcesadorShouldBeTrue() {
		
		//Como se limpian los obj en memoria por cada ejecucion, agregamos primero
		//y editados luego
		
		procesadorRepository.agregarProcesador(procesador03);
		

		Procesador procesador03Editado = new Procesador(3, "Intel Core i3"
				, "Intel", "SJUI-222-J78", "2.30 Ghz", 0.45, 2,
				"2 MB L2");

		
		// Agregamos el objeto procesador editado
		procesadorRepository.editarProcesador(procesador03Editado);
		
		
		//comprobar si el obj "procesador03Editado" esta en la lista no es valido, ya que 
		//la operacion de edicion no agrega el objeto en la lista, por ende deberiamos
		//RECUPERAR EL OBJETO EDITADO DE LA LISTA Y COMPROBAR SI DICHO OBJETO POSEE
		//LAS CARACTERISTICAS DEL EDITADO... ES UN TANTO COMPLEJO AL PRINCIPIO, PERO
		//NECESARIAMENTE IMPORTANTE PARA ADQUIRIR HABILIDADES TECNICAS EN CRUD
		
		Procesador procesadorRecovered = 
			(Procesador) 
			procesadorRepository
					.listaProcesadores()
					.stream()
					.filter(obj->obj.getId() == 3)
					//Una vez que se aplica el stream devolvemos
					//en formato lista(ES NECESARIO PARA RECUPERAR EL OBJETO)
					.collect(Collectors.toList())
					//DEVOLVEMOS EL OBJETO (EL PRIMERO DE LA 
					//LISTA, PORQUE NOS INTERESA EL OBJETO EN SI, NO LA LISTA.
					//PODRIAMOS TENER VARIOS OBJETOS CON EL MISMO ID PORQUE HUBO
					//UN ERROR EN LAS COMPROBACIONES DEL SISTEMA AL AGREGAR OBJETOS,
					//ESO SE DEPURA, POR ESO ES QUE TRABAJAMOS CON IDS, TECNICAMENTE
					//DEBERIAN SER UNICOS
					.get(0);
		
		
		//Comprobamos dicho objeto
		boolean procesador03Check = (
				
				(procesador03Editado.getId() == procesadorRecovered.getId()) 
				&& (procesador03Editado.getModelo() == procesadorRecovered.getModelo())
				&& (procesador03Editado.getCodigo() == procesadorRecovered.getCodigo())
				&& (procesador03Editado.getFabricante() == procesadorRecovered.getFabricante())
				&& (procesador03Editado.getConsumo() == procesadorRecovered.getConsumo())
				 
				)? true : false;
		
		

		// Comprobamos si esta el objeto en la lista
		assertTrue(procesador03Check);

	}
	
	//============================== FIN UPDATE ================================
	
	//============================== DELETE ================================
	@Test
	public void assertDeleteProcesadorShouldBeTrue() {
	
		
		procesadorRepository.agregarProcesador(procesador03);
		

		// Eliminamos el objeto procesador editado
		procesadorRepository.eliminarProcesador(procesador03);
		
		
	
		boolean comprObj03Eliminado = (
				procesadorRepository
				.listaProcesadores()
				.contains(procesador03)) ? true : false;

		//Comprobamos por consola la lista(NO ES RECOMENDABLE USO DE CONSOLA)
		procesadorRepository.listaProcesadores().stream().forEach(System.out::println);
		

		// Comprobamos si es que no esta el objeto en la lista (CONDICION NEGADA)
		assert(!(comprObj03Eliminado));

	}
	
	@Test
	public void assertDeleteProcesadorShouldBeFalse() {
	
		
		procesadorRepository.agregarProcesador(procesador01);
		

		// Eliminamos otro objeto procesador QUE NO SEA EL AGREGADO
		procesadorRepository.eliminarProcesador(procesador02);
		
		
	
		boolean comprObj01Eliminado = (
				procesadorRepository
				.listaProcesadores()
				.contains(procesador01)) ? true : false;

		//Comprobamos por consola la lista(NO ES RECOMENDABLE USO DE CONSOLA)
		procesadorRepository.listaProcesadores().stream().forEach(System.out::println);
		

		// Comprobamos si es que esta el objeto en la lista 
		//(MODELAMOS UNA MALA CONDICION DE USO EN LA ELIMINACION DE EL OBJETO DESEADO)
		assert(comprObj01Eliminado);

	}
	
	//============================== FIN DELETE ================================
	
	

}
