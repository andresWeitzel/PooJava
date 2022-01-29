package modificadoresaccesoherencia;


/*
== PRIVATE ==: únicamente la clase puede acceder a la propiedad o método.

== PACKAGE PRIVATE == valor por defecto si no se indica ninguno. solo las clases 
en el mismo paquete pueden acceder a la propiedad o método.

== PROTECTED == las clases del mismo paquete y que heredan de la clase pueden 
acceder a la propiedad o método.

== PUBLIC == la propiedad o método es accesible desde cualquier método de otra clase.

*/
public class Persona {
	

	//El public es por defecto
	
	//public int id;
	int id;
	
	String nombre;
	
	String apellido;
	
	private String nro_cuenta; 
	
	protected double saldo;

	
	
	public Persona(int id, String nombre, String apellido, String nro_cuenta, double saldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nro_cuenta = nro_cuenta;
		this.saldo = saldo;
	}
	
	public Persona() {
		super();
	}

	
	
	
	
	
	
	
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

	public String getNro_cuenta() {
		return nro_cuenta;
	}

	public void setNro_cuenta(String nro_cuenta) {
		this.nro_cuenta = nro_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nro_cuenta=" + nro_cuenta
				+ ", saldo=" + saldo + "]";
	}
	
	
	
	
	
	
	

}
