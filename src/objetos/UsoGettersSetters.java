package objetos;

public class UsoGettersSetters {
	

		public static void main(String[] args) {
			
			//instanciamos la clase ComponenteElectronico creando un objeto CELULAR
			
			ComponenteElectronico02 objetoCelular = new ComponenteElectronico02();
			ComponenteElectronico02 objetoNotebook = new ComponenteElectronico02("Asus njui8");
			ComponenteElectronico02 objetoMonitor = new ComponenteElectronico02("Samsung","nhgt789");
			
			System.out.println("-------------------------------------------------");
		
			System.out.println(objetoCelular);
			System.out.println(objetoNotebook);
			System.out.println(objetoMonitor);
			
			
			
			
			
			System.out.println("-------------------------------------------------");
			
			
			ComponenteElectronico02 objetoTeclado = new ComponenteElectronico02();
			
			
			objetoTeclado.setNombre("PHP Mécanico RGB");
			objetoTeclado.setMarca("PHP");
			
			System.out.println(objetoTeclado.toString());
			
			System.out.println(objetoTeclado.getNombre());
			System.out.println(objetoTeclado.getMarca());
			

			
	
		}

	}




class ComponenteElectronico02{
	
	// ATRIBUTOS-CAMPOS DE LA CLASE
	public String nombre;
	public String marca;
	
	
	// CONSTRUCTORES DE LA CLASE
	

	// CONSTRUCTOR COMPLETO
	public ComponenteElectronico02(String nombre, String marca) {
		
		this.nombre = nombre;
		this.marca = marca;

	}
	
	// CONSTRUCTOR SEMI COMPLETO
	public ComponenteElectronico02(String nombre) {
		
		this.nombre = nombre;
		this.marca = marca;

	}
	
	// CONSTRUCTOR VACIO
	public ComponenteElectronico02() {
		
		this.nombre = nombre;
		this.marca = marca;

	}
	
	
	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	//TO STRING
	@Override
	public String toString() {
		return "Componente [nombre=" + nombre + ", marca=" + marca + "]";
	}
	
	
	
	
}

