package abstraccion.superclases.metodos.herencia;

public class Animal extends Cosa{

	//Si heredamos de una class abstract implementamos sus abstractos
		@Override
		public void accion(String accion, int cantidad) {
			System.out.println("Esta Cosa Ahora es un Animal(excepto un Homo Sapiens)"
					+ ", la acción que realiza es "+accion+" un número de "+cantidad+" veces!");
			
		}

}
