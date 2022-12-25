package generics.collections.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListasGenerics {

	public static void main(String[] args) {

		/*
		 * El uso de genericos y listas de la api collection van de la mano. Antes de
		 * java 8 las operaciones de listas eran muy tediosas. Hoy en dia la ventaja es
		 * muy grande
		 */
		
		System.out.println("\n============================");
		System.out.println("=== RECORRIDO DE LISTAS ===");
		System.out.println("============================");

		System.out.println("\n---------- SIN GENERICS -------------");
		// uso de listas sin generics
		// Teniamos que wrappear todos los primitivos y luego trabajar con iterator
		// para el recorrido
		List listaNums = Arrays.asList(new Integer[] { new Integer(1), new Integer(2), new Integer(3) });
		
		
		for (Iterator it = listaNums.iterator(); it.hasNext();) {
			int n = ((Integer) it.next()).intValue();
			
			System.out.println(n);
		}
		
		//Sin Generics podiamos realizar el recorrido de la lista de objetos solo
		//con iteradores
		//for(List l : listaNums) {System.out.println(l);}
		
		System.out.println("\n---------- CON GENERICS -------------");
		//Trabajando con generics y lambdas tenemos simplificancion de codido
		List<Integer> listaNumsGeneric = Arrays.asList(1,2,3);
		listaNumsGeneric.forEach(System.out::println);
		
		System.out.println("\n=================================");
		System.out.println("=== OBTENER ELEMENTOS DE LISTAS ===");
		System.out.println("===================================");
	System.out.println("\n---------- SIN GENERICS -------------");
		
		List listaNums02 = Arrays.asList(new Integer[] { new Integer(1), new Integer(2), new Integer(3) });
		
		//Agregamos elementos
		listaNums02.add(1231);
		listaNums02.add(99281);
		listaNums02.add(26172);

		//Almacenamos ciertos elementos de la lista en variables
		//Debiamos castear cada uno de los elementos ya que la lista no estaba definida
		//int num01 = (listaNums02.get(0)); --> error sin casteo
		int num01 = ((int)listaNums02.get(0));
		int num02 = ((int)listaNums02.get(1));
		int num03 = ((int)listaNums02.get(2));
		
		System.out.println("\n---------- CON GENERICS -------------");
		
		List<Integer> listaNumsGeneric02 = Arrays.asList(1,2,3);
		
		//Agregamos elementos
		listaNumsGeneric02.add(1231);
		listaNumsGeneric02.add(99281);
		listaNumsGeneric02.add(26172);

		//No es necesario castear los elementos, nos ahorramos comprobaciones
		//y reducimos margenes de errores
		int num04 = (listaNumsGeneric02.get(0));
		int num05 = (listaNumsGeneric02.get(1));
		int num06 = (listaNumsGeneric02.get(2));
		
	
		
	}
}
