package objetos;

public class CicloDeVidaObjetos {

	public static void main(String[] args) {

		/*
		 * ========================================== 
		 * == ETAPAS DE CICLO DE VIDA DE UN OBJETO == 
		 * ==========================================
		 * 
		 * == 1) Fase de Creacion == - Asignaci�n de espacio de almacenamiento para el
		 * mismo - Construcci�n del Objeto - Invocaci�n al metodo de constucci�n -
		 * Inicializaci�n de la instancia del objeto y su variable - Ejecuci�n del
		 * M�todo
		 * 
		 * 
		 * == 2) Fase de Aplicaci�n == - Uso de la referencia de ese objeto
		 * 
		 * 
		 * == 3) Fase Invisible == - No hay referencias fuertas al objeto aunque
		 * existan, la ejecucion del programa ha excedido al alcance del objeto
		 * 
		 * == 4) Fase Inalcanzable == - En esta estapa tampoco se tienen referencias
		 * fuertes sobre el objeto, la diferencia es que no existen
		 * 
		 * == 5) Fase de Recopilado == - El garbagge collector se encarga de encontrar
		 * os objetos que estan en la etapa 4, la inalcanzable, entonces este ya esta a
		 * la espera de reasignar el espacio de memoria del objeto, el objeto entra en
		 * fase de recoleccion
		 * 
		 * 
		 * == 6) Etapa Final == - En esta estapa se realiza la transiccion anterior y el
		 * garbagge iniciar� la recuperacion de espacio de este objeto
		 * 
		 * == 7) Reasignacion del Espacio en Memoria == - En esta etapa el recolector de
		 * basura se encarga del objeto y reutiliza el espacio en memoria de este
		 * objeto, osea el garbagge reasigna el espacio de memoria para otros procesoss,
		 * variables , etc.
		 * 
		 */

		// == Que ser�a el Garbagge Collector? ==
		// Este algoritmo administra de forma automatica la memoria, libera de la
		// misma los objetos, conexiones, streams, etc
		
		
		
		// == ETAPA 01) FASE DE CREACION DE UN OBJETO
		
		Object objetoTest01 = new Object();
		Object objetoTest02 = new Object();
		
		
		// == ETAPA 02) FASE DE APLICACI�N
		//Hacemos uso de la referencia FUERTE en memoria del objeto
		 //-Podemos visualizar en la salida de la consola la referencia del objeto
			// -Obtenemos una cadena formada por el nombre de la clase, el @ y la
			// representacion hexadecimal sin signo del codigo hash del objeto(resumido)

			// El concepto de referencia est� �ntimamente ligado con el comportamiento del
			// recolector de basura. Dependiendo de las referencias que tenga un determinado
			// objeto, este podr� ser elegido para ser limpiado de memoria (referencia
			// d�bil)
			// o, por el contrario, puede seguir residiendo en el Heap (referencia fuerte).
			// El Heap es un espacio en memoria que se utiliza para almacenar datos en
			// tiempo de ejecuci�n

			// == An�lisis Tecnico==
			// -Referencia Fuerte : lo que sucede es que la JVM analiza y encuentra todas
			// las rutas
			// que hacen referencia al objeto desde el conjunto de referencias raiz(Root
			// Set)
			// Cuando cualquier ruta a un objeto no contiene ese objeto, la referencia es
			// fuerte, es como un enlace fuerte.
			// -Referencia Suave : Cuando se necesita memoria, el GC se encarga de
			// sobreescribir
			// los objetos que tengan esta referencia en memoria. De esta forma se
			// administra
			// mejor la memoria
		
		System.out.println("\n ====== OBJETO TEXT 01 ========");
		System.out.println(objetoTest01.toString());
		System.out.println(objetoTest01.hashCode());
		

		System.out.println("\n ====== OBJETO TEXT 02 ========");
		System.out.println(objetoTest02.toString());
		System.out.println(objetoTest02.hashCode());
		
		
		// ================================================================================
		// ============= ETAPA 03 Y 04) FASE INVISIBLE E INALZANZABLE=================
		// ================================================================================

		// -Esta etapa esta directamente relacionada con el scope del objeto, si
		// estamos usando variables-objetos locales se adentra a un escenario invisible
		// osea que no podemos hacer referencia a este en otra parte del codigo. En
		// caso que trabajemos con una variable-global no presentar� un escenario
		// invisible
		// -Esta etapa sirve para que el GB pueda determinar el bloque de memoria
		// asignado por el asignador para el objeto.
		// -El escenario inalcanzable aplica cuando ya el objeto no tiene ninguna
		// referencia, ni fuerte, debil, fantasma.

		// ------------------------------------------------------------

		// -- EJEMPLO DE ESCENARIO INVISIBLE --
		// -El objeto entra en fase de creacion, aplicacion e invisibilidad
		// -El objeto pasar� a tener una referencia debil para que le GC se ocupe
		
		//-------------------------------------------------------------
		for(int i=0; i <= 2 ; i++) {
			
			Object objetoTest03 = new Object();
			
			System.out.println(objetoTest03.toString());
		}
		
		//-------------------------------------------------------------
	
		
		try {
			
			 Object objetoTest04 = new Object();
			
			System.out.println(objetoTest04.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//-------------------------------------------------------------
		
		
		
	Object objetoTest05 = null;
		
		try {
			
			 objetoTest05 = new Object();
			
			System.out.println(objetoTest05.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//-------------------------------------------------------------
		
		
		
		
		//objetoTest03.toString();
		//objetoTest04.toString();
		objetoTest05.toString();
		
		
		
		
		// ========================================================================
		// == ETAPA 05)06)07) FASE DE RECOPILADO , FINAL Y REASIG. DE MEMORIA =====
		// ========================================================================
		// -Cualquier objeto que no tenga referencia o no sea accesible entra a
		// esta etapa, y el GC se encarga de el, caso contrario el objeto no pasa por
		// esta etapa
		// -Cada etapa conlleva conceptos y puntos minuciosis, se debera analizar
		// a tal nivel en un curso especifico, veremos solamente las generalidades
		// -IDEALMENTE el siguiente ejemplo es como el GC trbajar�a, REALMENTE NO
		//LO ES, YA QUE EL ANALISIS SE DEBE HACER A BAJO NIVEL(HARDWARE)
		
		
		System.out.println("\n=============================================");
	
		try {
			
			/*
			Object o01 = new Object();
			Object o02 = new Object();
			Object o03 = new Object();
			Object o04 = new Object();
			
			System.out.println(o01.toString());
			System.out.println(o02.toString());
			System.out.println(o03.toString());
			System.out.println(o04.toString());
			*/
			
			Runtime run = Runtime.getRuntime();
			
			//Finalizazmos los objetos en Memoria
			System.runFinalization();
			
			//Llamamos al GC 
			run.gc();
			
			long memory = run.totalMemory() - run.freeMemory();
			
			System.out.println("Memoria Usada en Bytes "+ memory);

			//563200
			
			//562744
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
			
	}

}
