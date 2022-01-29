package modificadoresacceso;



/*
== PRIVATE ==: únicamente la clase puede acceder a la propiedad o método.

== DEFAULT == valor por defecto si no se indica ninguno. solo las clases 
en el mismo paquete pueden acceder a la propiedad o método. Las clases que hereden
fuera del paquete no podran acceder a la propiedad o metodo

== PROTECTED == solo las clases del mismo paquete podrán acceder o mismo las que
 heredan de la clase fuera del paquete.

== PUBLIC == la propiedad o método es accesible desde cualquier método de otra clase.

*/

public class Persona {
	


	
	public int id; //public
	
	String nombre;//default
	
	String apellido;//default
	
	String nroCuentaPrincipal;//default
	
	private String nroCuentaSecundaria;//privado 
	
	protected double saldo;//protegido

	
	
	public Persona(int id, String nombre, String apellido, String nroCuentaPrincipal, String nroCuentaSecundaria,
			double saldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroCuentaPrincipal = nroCuentaPrincipal;
		this.nroCuentaSecundaria = nroCuentaSecundaria;
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



	public String getNroCuentaSecundaria() {
		return nroCuentaSecundaria;
	}



	public void setNroCuentaSecundaria(String nroCuentaSecundaria) {
		this.nroCuentaSecundaria = nroCuentaSecundaria;
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
				+ nroCuentaPrincipal + ", nroCuentaSecundaria=" + nroCuentaSecundaria + ", saldo=" + saldo + "]";
	}

	
	
	

}
