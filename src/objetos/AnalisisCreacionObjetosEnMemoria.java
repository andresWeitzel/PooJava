package objetos;

public class AnalisisCreacionObjetosEnMemoria {

	public static void main(String[] args) {

		// https://programmerclick.com/article/61241902672/

		// Analizamos el espacio y tiempo de procesamiento en memoria

		long tiempoInicial = System.currentTimeMillis();

		long total = 0;

		// CONSIDERACIONES PARA LA CREACION DE OBJETOS EN MEMORIA
		// -Evitar crear objetos en el cuerpo del bucle , aunque ocupen poco espacio

		// == EJEMPLO DEL MAL USO DE OBJETOS EN MEMORIA ==

		// Podemos tener una lista, un vector o cualquier estructura de dato y
		// declaramos un objeto dentro del bucle, en este caso no solamente estamos
		// referenciando ese objeto n cantida de veces, sino que lo estamos creando
		// esa n cantidad de veces, ERROR GRAVISIMO

		for (int i = 0; i < 200; i++) {

			Object objeto03 = new Object();

			System.out.println(objeto03.toString());

		}
		

		// Fijate el hash resumido de cada objeto, si este objeto tiene peso en memoria
		// podemos creashear una aplicacion solo con las referencias de objetos
		// o en el mejor de los casos sobrecargar la memoria y procesador
		// ATENTI: LA FUNCIONALIDAD QUE SE VE AFECTADA EN GRAN MEDIDA ES EL
		// RENDIMIENTO
		// A veces, un error muy pequeño en el software de la aplicación reducirá en
		// gran medida el rendimiento de todo el sistema.

		// ====================== ESPACIO EN MEMORIA ===========================

		Runtime run = Runtime.getRuntime();
		
		//Finalizazmos los objetos en Memoria
		System.runFinalization();
		
		//Llamamos al GC 
		run.gc();
		
		long memory = run.totalMemory() - run.freeMemory();
		
		System.out.println("Memoria Usada en Bytes "+ memory);
		

		// ====================== TIEMPO DE PROCESAMIENTO EN MEMORIA ===========================

		
		long tiempoFinal = System.currentTimeMillis();
		
		
		long tiempoResultado = tiempoFinal - tiempoInicial;
		
		System.out.println(tiempoResultado + " Milisegundos!" );
		
		
	}
}
