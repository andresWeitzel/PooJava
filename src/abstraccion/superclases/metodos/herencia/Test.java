package abstraccion.superclases.metodos.herencia;

public class Test {
	
	public static void main(String[] args) {
		
	//No se puede instanciar la clase cosa
	//Cosa c=new Cosa();
	
	Persona persona = new Persona();
	Animal animal = new Animal();
	
	persona.accion("Caminando", 10);
	animal.accion("Saltando", 12);
	
	
	}
	
	
}
