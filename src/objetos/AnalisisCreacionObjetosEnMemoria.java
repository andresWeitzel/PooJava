package objetos;

public class AnalisisCreacionObjetosEnMemoria {

	public static void main(String[] args) {

		//https://programmerclick.com/article/61241902672/
		
		
		// ANALIZAMOS EL ESPACIO Y TIEMPO DE PROCESAMIENTO EN MEMORIA

		long startTime = System.currentTimeMillis();

		long total = 0;

		
		
		
		
		
		// CONSIDERACIONES PARA LA CREACION DE OBJETOS EN MEMORIA
		// -Evitar crear objetos en el cuerpo del bucle , aunque ocupen poco espacio

		// == EJEMPLO DEL MAL USO DE OBJETOS EN MEMORIA ==

		// Podemos tener una lista, un vector o cualquier estructura de dato y
		// declaramos un objeto dentro del bucle, en este caso no solamente estamos
		// referenciando ese objeto n cantida de veces, sino que lo estamos creando
		// esa n cantidad de veces, ERROR GRAVISIMO

		System.out.println("\n ======== OBJETO TEST 03 =======");
		for (int i = 0; i < 1000000; i++) {
			Object objetoTest03 = new Object();
			System.out.println("Objeto : " + objetoTest03);

			total += i;
		}

		// Fijate el hash resumido de cada objeto, si este objeto tiene peso en memoria
		// podemos creashear una aplicacion solo con las referencias de objetos
		// o en el mejor de los casos sobrecargar la memoria y procesador
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

		
		// ====================== TIEMPO DE PROCESAMIENTO EN MEMORIA ===========================
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime + " Milisegundos");

	}
}
