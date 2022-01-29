package objetos;

public class AnalisisRefrenciaObjetosEnMemoria {

	public static void main(String[] args) {
		
		//https://programmerclick.com/article/61241902672/
		
		//ANALIZAMOS EL ESPACIO Y TIEMPO DE PROCESAMIENTO EN MEMORIA
		

		long startTime = System.currentTimeMillis();

		long total = 0;
		
		
		

		// == EJEMPLO DEL BUEN USO DE OBJETOS EN MEMORIA ==

		// Todos los objetos en el cuerpo del bucle deberian ser solamente referenciados
		// en memoria, no creados, a menos que se quiera crear dichos objetos para una
		// finalidad x

		System.out.println("\n ======== OBJETO TEST 04 =======");

		Object objetoTest04 = null;

		for (int i = 0; i < 1000000; i++) {
			objetoTest04 = new Object();

			System.out.println("Objeto : " + objetoTest04);

			total += i;

		}

		// Fijate el hash resumido de cada objeto, tambien son diferentes, pero
		// solamente referenciamos n cantidad de veces dicho objeto, no creamos objetos
		// sino referencias en memoria , dichas referencias apuntan al objeto
		// originalmente creado
		// ATENTI: LA FUNCIONALIDAD QUE SE VE AFECTADA EN GRAN MEDIDA ES EL
		// RENDIMIENTO
		//A veces, un error muy pequeño en el software de la aplicación reducirá en 
		//gran medida el rendimiento de todo el sistema.

		

		// ====================== ESPACIO EN MEMORIA ===========================
		// Get the Java runtime
		Runtime runtime = Runtime.getRuntime();
		// Run the garbage collector
		runtime.gc();
		// Calculate the used memory
		long memory = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("Used memory is bytes: " + memory);

		
		// ============== TIEMPO DE PROCESAMIENTO EN MEMORIA =============
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime + " Milisegundos");
	}

}
