package objetos;


//Una instancia es como una copia de una Clase Modelo
public class InstanciasDeClases {
	

	public static void main(String[] args) {
		
		
		//instanciamos la clase ComponenteElectronico creando un objeto CELULAR
		
		ComponenteElectronico objetoCelular = new ComponenteElectronico();

		ComponenteElectronico objetoNotebook = new ComponenteElectronico("Asus njui8");

		ComponenteElectronico objetoMonitor = new ComponenteElectronico("Samsung","nhgt789");

	
		System.out.println(objetoCelular);
		System.out.println(objetoNotebook);
		System.out.println(objetoMonitor);

}


}

//Creamos una clase que contendra los atributos y sus funcionalidades
//Recordar que en un .java solo una clase sera publica y sera del mismo
//nombre que el archivo, tambien se pueden crear multiples clases

class ComponenteElectronico{
	
	// ATRIBUTOS-CAMPOS DE LA CLASE
	public String nombre;
	public String marca;
	
	
	// CONSTRUCTORES DE LA CLASE
	
	// CONSTRUCTOR COMPLETO
	public ComponenteElectronico(String nombre, String marca) {
		
		this.nombre = nombre;
		this.marca = marca;

	}
	
	// CONSTRUCTOR SEMI COMPLETO
	public ComponenteElectronico(String nombre) {
		
		this.nombre = nombre;
		this.marca = marca;

	}
	
	// CONSTRUCTOR VACIO
	public ComponenteElectronico() {
		
		this.nombre = nombre;
		this.marca = marca;

	}
	
	
	
	
	
	
	
	
}
	
	
	
