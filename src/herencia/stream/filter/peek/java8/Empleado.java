package herencia.stream.filter.peek.java8;

import java.time.LocalDate;

public class Empleado {
	
		
	int id;
	String nombre;
	String apellido;
	int edad;
	LocalDate fecha_nac;
	String tipo_doc;
	String nro_doc;
	String cuil;
	String direccion;
	LocalDate fecha_ingreso;
	float sueldo;
	
	


	public Empleado(int id, String nombre, String apellido, int edad
			, LocalDate fecha_nac, String tipo_doc, String nro_doc,String cuil
			, String direccion, LocalDate fecha_ingreso, float sueldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fecha_nac = fecha_nac;
		this.tipo_doc = tipo_doc;
		this.nro_doc = nro_doc;
		this.cuil = cuil;
		this.direccion = direccion;
		this.fecha_ingreso = fecha_ingreso;
		this.sueldo = sueldo;
	}


	public Empleado(String nombre, String apellido, int edad, LocalDate fecha_nac
			, String tipo_doc, String nro_doc,String cuil, String direccion
			, LocalDate fecha_ingreso, float sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fecha_nac = fecha_nac;
		this.tipo_doc = tipo_doc;
		this.nro_doc = nro_doc;
		this.cuil = cuil;
		this.direccion = direccion;
		this.fecha_ingreso = fecha_ingreso;
		this.sueldo = sueldo;
	}
	
	public Empleado() {
		
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


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public LocalDate getFecha_nac() {
		return fecha_nac;
	}


	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}


	public String getTipo_doc() {
		return tipo_doc;
	}


	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}


	public String getNro_doc() {
		return nro_doc;
	}


	public void setNro_doc(String nro_doc) {
		this.nro_doc = nro_doc;
	}


	public String getCuil() {
		return cuil;
	}


	public void setCuil(String cuil) {
		this.cuil = cuil;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public LocalDate getFecha_ingreso() {
		return fecha_ingreso;
	}


	public void setFecha_ingreso(LocalDate fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}


	public float getSueldo() {
		return sueldo;
	}


	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" 
				+ apellido + ", edad=" + edad+ ", fecha_nac=" + fecha_nac 
				+ ", tipo_doc=" + tipo_doc + ", nro_doc=" + nro_doc + ", cuil=" + cuil
				+ ", direccion=" + direccion + ", fecha_ingreso=" + fecha_ingreso 
				+ ", sueldo=" + sueldo + "]";
	}

}

