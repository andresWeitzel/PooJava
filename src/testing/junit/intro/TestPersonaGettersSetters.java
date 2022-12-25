package testing.junit.intro;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TestPersonaGettersSetters {

	/*
	 * === DEFINICION DE JUNIT(Pruebas Unitarias) === Es un marco de pruebas de
	 * c�digo abierto para programadores java. El programador java puede crear casos
	 * de prueba y probar su propio c�digo.
	 * 
	 * Es uno de los marcos de pruebas unitarias. La versi�n actual es junit 4.
	 * 
	 * Para realizar pruebas unitarias, necesitamos crear casos de prueba. El caso
	 * de prueba unitaria es un c�digo que garantiza que la l�gica del programa
	 * funcione como se esperaba.
	 * 
	 * El paquete org.junit contiene muchas interfaces y clases para pruebas de
	 * junit como Assert, Test, Before, After, etc.
	 * 
	 * 
	 * === DEFINICION DE METODOS ===
	 * 
	 * -Los metodos de prueba tienen diversas definiciones segun como se utilice. En
	 * mi caso voy a definirlo de forma casi completa. En cada metodo creamos un
	 * objeto de la clase a testear, declaramos variables que usen los metodos de la
	 * clase y testeamos dichos metodos.
	 * 
	 * -Los metodos de prueba deberan tener la terminacion del metodo que se
	 * implemente de testing..comparacion de valores, comparacion de booleanos, etc
	 * Ej: assertEquals para comparar dos resultados.... definimos nuestro metodo
	 * para testing con la terminacion del metodo que se usa....
	 * comprobarValoresEquals o comprobarValoresShouldTrue..etc
	 * 
	 * === ANOTATIONS ===
	 * 
	 * @Test anotaci�n especifica que el m�todo es el m�todo de prueba.
	 * 
	 * @Test(timeout=1000) especifica que se producir� un error en el m�todo si
	 * tarda m�s de 1000 milisegundos (1 segundo).
	 * 
	 * @BeforeClass anotaci�n especifica que el m�todo se invocar� solo una vez,
	 * antes de comenzar todas las pruebas.
	 * 
	 * @Before anotaci�n especifica que el m�todo se invocar� antes de cada prueba.
	 * 
	 * @After anotaci�n especifica que el m�todo se invocar� despu�s de cada prueba.
	 * 
	 * @AfterClass anotaci�n especifica que el m�todo se invocar� solo una vez,
	 * despu�s de finalizar todas las pruebas.
	 * 
	 * Recomiendo : https://www.javatpoint.com/junit-tutorial
	 * 
	 * 
	 * === CLASE ASSERT === (Comprobacion de la logica de nuestro programa)
	 * 
	 * M�todos de la clase Assert Los m�todos comunes de la clase Assert son los
	 * siguientes:
	 * 
	 * -void assertEquals(booleano esperado, booleano real): comprueba que dos
	 * primitivas/objetos son iguales. Est� sobrecargado. 
	 * 
	 * -void assertTrue(condici�n
	 * booleana):comprueba que una condici�n es verdadera.
	 * 
	 * -void assertFalse(condici�n booleana):comprueba que una condici�n es falsa. 
	 *  
	 * -void assertNull(Object obj): comprueba que el objeto es null. 
	 *  
	 *  
	 * -void assertNotNull(Object obj): comprueba que el objeto no es null.
	 * 
	 */


	//======================= ASSERT EQUALS ================================
		
		@Test
		public void getIdEquals() {
			// Creacion de un Objeto
			Persona persona = new Persona(12312133, "Juan", "Perez", 33, LocalDate.of(2022, 03, 12));

			// Almacenamos el valor de nuestra funcionalidad de la clase
			long personaId = persona.getId();

			// Comprobamos la funcionalidad con JUnit
			// Esta funcion tendremos que pasarle como primer parametro el valor que
			// NOSOTROS ESPERAMOS QUE DEVUELVA LA FUNCION, y como segundo parametro LOS
			// VALORES
			// QUE ARROJA LA FUNCION EN SI

			assertEquals(12312133, persona.getId());
			assertEquals(12312133, personaId);

		}
		
		// NOTAR QUE NO NOS INTERESA LA FUNCIONALIDAD DEL OBJETO, SE SUPONE QUE YA ESTA
		// DEFINIDA, NOS INTERESA LA FUNCIONALIDAD DE CADA UNO DE LOS METODOS
		// DESARROLLADOS
		// SIEMPRE, PERO SIEMPRE LOS PROBLEMAS VIENEN DE LA MANO DE METODOS O
		// FUNCIONES....

		@Test
		public void setIdEquals() {

			Persona persona = new Persona();

			persona.setId(345345);

			// Forzamos el error
			//assertEquals(345342, persona.getId());
			
			assertEquals(345345, persona.getId());

		}
		
		@Test
		public void getFechaIngresoEquals() {
			
			Persona persona = new Persona(12312133, "Juan", "Perez", 33, LocalDate.of(2022, 03, 12));

			//Podemos modularizar los valores de uso en variables.
			
			LocalDate fechaIngresoPersona = persona.getFechaIngreso();
			
			//LocalDate fechaIngresoEsperada = LocalDate.of(2020, 2, 2);
			LocalDate fechaIngresoEsperada = LocalDate.of(2022, 3, 12);
			
			assertEquals(fechaIngresoEsperada , fechaIngresoPersona);

		}
		
		@Test
		public void setFechaIngresoEquals() {
			
			Persona persona = new Persona(12312133, "Juan", "Perez", 33, LocalDate.of(2022, 03, 12));

			persona.setFechaIngreso(LocalDate.of(2020, 2, 2));
			
			LocalDate fechaIngresoPersona = persona.getFechaIngreso();
			
			LocalDate fechaIngresoEsperada = LocalDate.of(2020, 2, 2);
			//LocalDate fechaIngresoEsperada = LocalDate.of(2022, 3, 12);
			
			assertEquals(fechaIngresoEsperada , fechaIngresoPersona);

		}
		
		//======================= ASSERT TRUE================================
		@Test
		public void getIdShouldBeTrue() {

			Persona persona = new Persona(12312133, "Juan", "Perez", 33, LocalDate.of(2022, 03, 12));

			assertTrue(persona.getId() == 12312133);

		}


		@Test
		public void setIdShouldBeTrue() {

			Persona persona = new Persona();

			persona.setId(345345);

			assertTrue(persona.getId() == 345345);
			
			//Podemos comprobar ciertos casos concretos, ids que no deberian existir...
			assertTrue(persona.getId() != 0);
			
			assertTrue(persona.getId() > 0);

		}
		//======================= ASSERT FALSE================================
		@Test
		public void getIdShouldBeFalse() {

			Persona persona = new Persona(12312133, "Juan", "Perez", 33, LocalDate.of(2022, 03, 12));

			
			
			//En mi opinion, los casos de prueba true y false son los mas importante, ya que con testing
			//reducimos las peores condiciones para el caso concreto. como por ejemplo 
			//un id 0
			assertFalse(persona.getId() == 0);
			
			assertFalse(persona.getId() < 0);

		}
		







}
