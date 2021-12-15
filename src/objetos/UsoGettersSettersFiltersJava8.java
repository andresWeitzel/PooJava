package objetos;

public class UsoGettersSettersFiltersJava8 {

	public static void main(String[] args) {
		
		Empleado administrador = new Empleado(1 ,"Juan","Gutierrez","459987645",35.000f);
		Empleado gerente = new Empleado(2 ,"Sergio","Martinez","466787645",45.000f);
		Empleado programadora = new Empleado(3 ,"Mariana","Mendez","333787645",39.000f);
		Empleado programador = new Empleado(4 ,"Andres","Weitzel","39765844",41.000f);
		
		
		
	}
}

class Empleado {
	
	
	//ATRIBUTOS-CAMPOS
	int 	id; //Identificador del Empleado
	
	String  nombre;
	String  apellido;
	String  nro_doc;
	float 	sueldo;
	
	
	// CONSTRUCTORES
	public Empleado() {
		super();
	}
	public Empleado(String nombre, String apellido, String nro_doc, float sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nro_doc = nro_doc;
		this.sueldo = sueldo;
	}
	public Empleado(int id, String nombre, String apellido, String nro_doc, float sueldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nro_doc = nro_doc;
		this.sueldo = sueldo;
	}
	
	
	//GETTERS AND SETTERS
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNro_doc() {
		return nro_doc;
	}
	public void setNro_doc(String nro_doc) {
		this.nro_doc = nro_doc;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	
	@Override
	public String toString() {
		return "Empleados [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nro_doc=" + nro_doc
				+ ", sueldo=" + sueldo + "]";
	}
	
	
	
	
}

