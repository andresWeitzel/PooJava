package objetos;

public class CicloDeVidaObjetos {

	public static void main(String[] args) {

		/*
		 * ========================================== 
		 * == ETAPAS DE CICLO DE VIDA DE UN OBJETO == 
		 * ==========================================
		 * 
		 * == 1) Fase de Creacion == - Asignación de espacio de almacenamiento para el
		 * mismo - Construcción del Objeto - Invocación al metodo de constucción -
		 * Inicialización de la instancia del objeto y su variable - Ejecución del
		 * Método
		 * 
		 * 
		 * == 2) Fase de Aplicación == - Uso de la referencia de ese objeto
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
		 * garbagge iniciará la recuperacion de espacio de este objeto
		 * 
		 * == 7) Reasignacion del Espacio en Memoria == - En esta etapa el recolector de
		 * basura se encarga del objeto y reutiliza el espacio en memoria de este
		 * objeto, osea el garbagge reasigna el espacio de memoria para otros procesoss,
		 * variables , etc.
		 * 
		 */

		// == Que sería el Garbagge Collector? ==
		// Este algoritmo administra de forma automatica la memoria, libera de la
		// misma los objetos, conexiones, streams, etc

		
		// ============================================================
				// ========= ETAPA 01) FASE DE CREACIÓN DE UN OBJETO ==========
				// ============================================================

				// -Se asigna el espacio en memoria
				// -Se construye el objeto vacio
				// -Se llama al metodo constructor de la clase Object
				// -Se inicializa el objeto con una instancia de la clase
				// -Ejecutamos el metodo constructor

				Object objetoTest01 = new Object();

				// ============================================================
				// ============= ETAPA 02) FASE DE APLICACIÓN =================
				// ============================================================

				// - Hacemos uso de la referencia FUERTE en memoria del Objeto
				// -Podemos visualizar en la salida de la consola la referencia del objeto
				// -Obtenemos una cadena formada por el nombre de la clase, el @ y la
				// representacion hexadecimal sin signo del codigo hash del objeto(resumido)

				// El concepto de referencia está íntimamente ligado con el comportamiento del
				// recolector de basura. Dependiendo de las referencias que tenga un determinado
				// objeto, este podrá ser elegido para ser limpiado de memoria (referencia
				// débil)
				// o, por el contrario, puede seguir residiendo en el Heap (referencia fuerte).
				// El Heap es un espacio en memoria que se utiliza para almacenar datos en
				// tiempo de ejecución

				// == Análisis Tecnico==
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

				System.out.println("\n ======== OBJETO TEST 01 =======");

				System.out.println(objetoTest01.toString());

				// -Representacion real del hash del objeto, no deberían haber 2 hash iguales
				// para objetos diferentes

				System.out.println(objetoTest01.hashCode());
				System.out.println(objetoTest01.hashCode());

				// --------------------------------------------------------------------

				Object objetoTest02 = new Object();

				System.out.println("\n ======== OBJETO TEST 02 =======");

				System.out.println(objetoTest02.toString());

				System.out.println(objetoTest02.hashCode());

				// ================================================================================
				// ============= ETAPA 03 Y 04) FASE INVISIBLE E INALZANZABLE=================
				// ================================================================================

				// -Esta etapa esta directamente relacionada con el scope del objeto, si
				// estamos usando variables-objetos locales se adentra a un escenario invisible
				// osea que no podemos hacer referencia a este en otra parte del codigo. En
				// caso que trabajemos con una variable-global no presentará un escenario
				// invisible
				// -Esta etapa sirve para que el GB pueda determinar el bloque de memoria
				// asignado por el asignador para el objeto.
				// -El escenario inalcanzable aplica cuando ya el objeto no tiene ninguna
				// referencia, ni fuerte, debil, fantasma.

				// ------------------------------------------------------------

				// -- EJEMPLO DE ESCENARIO INVISIBLE --
				// -El objeto entra en fase de creacion, aplicacion e invisibilidad
				// -El objeto pasará a tener una referencia debil para que le GC se ocupe

				for (int i = 0; i < 2; i++) {
					Object objetoTest03 = new Object();
				}

				// No es posible acceder al objeto fuera del for
				// objetoTest03.

				// -- OTRO EJEMPLO DE ESCENARIO INVISIBLE --
				try {
					Object objetoTest03 = new Object();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// No es posible acceder al objeto fuera del for
				// objetoTest03.

				// ------------------------------------------------------------

				// -- EJEMPLO DE ESCENARIO NO INVISIBLE --

				Object objetoTest04 = null;

				for (int i = 0; i < 2; i++) {
					objetoTest04 = new Object();
				}

				// Es posible acceder al objeto fuera del for porque tiene nu scope global
				objetoTest04.hashCode();

				// -- OTRO EJEMPLO DE ESCENARIO INVISIBLE --
				// Inicializamos 2 veces el mismo objeto, pero podemos extender su scope

				Object objetoTest05 = new Object();

				try {
					objetoTest05 = new Object();

				} catch (Exception e) {
					e.printStackTrace();
				}

				// Es posible acceder al objeto fuera del for porque tiene nu scope global
				objetoTest05.hashCode();

				// ========================================================================
				// == ETAPA 05)06)07) FASE DE RECOPILADO , FINAL Y REASIG. DE MEMORIA =====
				// ========================================================================
				// -Cualquier objeto que no tenga referencia o no sea accesible entra a
				// esta etapa, y el GC se encarga de el, caso contrario el objeto no pasa por
				// esta etapa
				// -Cada etapa conlleva conceptos y puntos minuciosis, se debera analizar
				// a tal nivel en un curso especifico, veremos solamente las generalidades
				// -IDEALMENTE el siguiente ejemplo es como el GC trbajaría, REALMENTE NO
				//LO ES, YA QUE EL ANALISIS SE DEBE HACER A BAJO NIVEL(HARDWARE)
				
				System.out.println("\n==============");
				
				
				try {
					
					Object fuo_01 = new Object();
					Object fuo_02 = new Object();
					Object fuo_03 = new Object();
					Object fuo_04 = new Object();
					
					System.out.println(fuo_01.toString());
					System.out.println(fuo_02.toString());
					System.out.println(fuo_03.toString());
					System.out.println(fuo_04.toString());
					
					//fuo_01 = null;
					//fuo_02 = null;
					//fuo_03 = null;
					//fuo_04 = null;
					
					
					// Get the Java runtime
					Runtime runtime = Runtime.getRuntime();
					
					
					//Se finalizan los objetos
					System.runFinalization();
					
					
					//Se Llama al GC
					runtime.gc();
					
				
					// Se calcula el espacio de memoria
					long memory = runtime.totalMemory() - runtime.freeMemory();
					System.out.println("Used memory is bytes: " + memory);

					//562680 --> Tamaño con 4 objetos MÁS en Memoria
					
					//562744 --> Tamaño con 4 objetos MENOS en Memoria
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				//-IDEALMENTE el ejemplo es como el GC trbajaría, REALMENTE NO
				//LO ES, YA QUE EL ANALISIS SE DEBE HACER A BAJO NIVEL(HARDWARE)
				

		
		
	}

}
