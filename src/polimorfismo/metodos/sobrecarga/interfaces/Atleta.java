package polimorfismo.metodos.sobrecarga.interfaces;

public class Atleta implements I_Atleta{
	
	

	String nombre;
	String apellido;
	int edad;
	String tipoDoc;
	String nroDoc;
	
	
	
	public Atleta(String nombre, String apellido, int edad, String tipoDoc, String nroDoc) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
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





	@Override
	public String entrenar() {
		return "El Atleta realiza el entrenamiento";
		
	}

	@Override
	public String entrenar(int horas) {
		return "El atleta realiza el entrenamiento por dia "+horas+" horas";
		
	}

	@Override
	public String entrenar(int horas, int dias) {
		return "El atleta realiza el entrenamiento "+horas+" horas los "+dias
				+" de la Semana";
		
		
	}

	@Override
	public String entrenar(int horas, int dias, String tipoEntren) {
		return "El atleta realiza el entrenamiento "+horas+" horas los "+dias
				+" de la Semana y el Tipo de Entrenamiento es "+tipoEntren;
		
	}

	@Override
	public String entrenar(int horas, int dias, String tipoEntren, String competencias) {
		return "El atleta realiza el entrenamiento "+horas+" horas los "+dias
			    +" de la Semana, el Tipo de Entrenamiento es "+tipoEntren
			    +" compitiendo "+competencias;
		
	}





	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", tipoDoc=" + tipoDoc
				+ ", nroDoc=" + nroDoc + "]";
	}
	
	

}
