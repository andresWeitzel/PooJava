package herencia.interfaces.crud.metodos.java8;

import java.time.LocalDate;
import java.time.LocalTime;


public class Empleado {


	long id;
	String nombre;
	String apellido;
	int edad;
	LocalDate fechaNac;
	String tipoDoc;
	String nroDoc;
	String cuil;
	String direc;
	LocalDate fechaIngreso;
	LocalTime horaIngreso;
	double sueldo;
	
	
	
	public Empleado(long id, String nombre, String apellido, int edad, LocalDate fechaNac, String tipoDoc,
			String nroDoc, String cuil, String direc, LocalDate fechaIngreso, LocalTime horaIngreso, double sueldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNac = fechaNac;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
		this.cuil = cuil;
		this.direc = direc;
		this.fechaIngreso = fechaIngreso;
		this.horaIngreso = horaIngreso;
		this.sueldo = sueldo;
	}
	
	
	

	public Empleado() {
		super();
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
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




	public LocalDate getFechaNac() {
		return fechaNac;
	}




	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}




	public String getTipoDoc() {
		return tipoDoc;
	}




	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}




	public String getNroDoc() {
		return nroDoc;
	}




	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}




	public String getCuil() {
		return cuil;
	}




	public void setCuil(String cuil) {
		this.cuil = cuil;
	}




	public String getDirec() {
		return direc;
	}




	public void setDirec(String direc) {
		this.direc = direc;
	}




	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}




	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}




	public LocalTime getHoraIngreso() {
		return horaIngreso;
	}




	public void setHoraIngreso(LocalTime horaIngreso) {
		this.horaIngreso = horaIngreso;
	}




	public double getSueldo() {
		return sueldo;
	}




	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}




	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", fechaNac="
				+ fechaNac + ", tipoDoc=" + tipoDoc + ", nroDoc=" + nroDoc + ", cuil=" + cuil + ", direc=" + direc
				+ ", fechaIngreso=" + fechaIngreso + ", horaIngreso=" + horaIngreso + ", sueldo=" + sueldo + "]";
	}


	
	
	
	
	
	
	
	


}

