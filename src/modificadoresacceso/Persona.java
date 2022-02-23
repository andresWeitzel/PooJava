package modificadoresacceso;



/*
== PRIVATE ==: únicamente la clase puede acceder a la propiedad o método.

== DEFAULT == valor por defecto si no se indica ninguno. solo las clases 
en el mismo paquete pueden acceder a la propiedad o método. Las clases que hereden
fuera del paquete no podran acceder a la propiedad o metodo

== PROTECTED == solo las clases del mismo paquete podrán acceder o mismo las que
 heredan de la clase fuera del paquete.

== PUBLIC == la propiedad o método es accesible desde cualquier método de otra clase.
Dentro o fuera del paquete

*/

public class Persona {
	
	public int id; //public
	
	String nombre; //default
	
	String apellido; //default
	
	String nroCuentaPrincipal;//default
	
	private String nroCuentaSecundario;//private
	
	protected double saldo;//protected

	
	
	
	
	public Persona(int id, String nombre, String apellido, String nroCuentaPrincipal, String nroCuentaSecundario,
			double saldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroCuentaPrincipal = nroCuentaPrincipal;
		this.nroCuentaSecundario = nroCuentaSecundario;
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





	public String getNroCuentaPrincipal() {
		return nroCuentaPrincipal;
	}





	public void setNroCuentaPrincipal(String nroCuentaPrincipal) {
		this.nroCuentaPrincipal = nroCuentaPrincipal;
	}





	public String getNroCuentaSecundario() {
		return nroCuentaSecundario;
	}





	public void setNroCuentaSecundario(String nroCuentaSecundario) {
		this.nroCuentaSecundario = nroCuentaSecundario;
	}





	public double getSaldo() {
		return saldo;
	}





	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}





	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nroCuentaPrincipal="
				+ nroCuentaPrincipal + ", nroCuentaSecundario=" + nroCuentaSecundario + ", saldo=" + saldo + "]";
	}
	

	
	
	
	

	
	

}
