package polimorfismo.metodos.parametrico;

public class Persona {
	
	int id;
	
	String nombre;
	
	String apellido;
	
	String nro_cuenta; 
	
	double saldo;

	
	
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
	
	
	public String realizarUnaAccion(String accion) {
		
		return "La accion que realiza la Persona es "+accion+" !!";
	}
	
	
	public String realizarUnaAccion(String accion, int cantidad) {
		
		return "La accion que realiza la Persona es "+accion+" y la realiza "+cantidad +" veces!!";
	}
	
	

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nro_cuenta=" + nro_cuenta
				+ ", saldo=" + saldo + "]";
	}
	

}



