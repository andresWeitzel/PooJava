package polimorfismo.dinamico.clases;

public class Cliente extends Persona{
	
	String cualidades;
	String deudas;
	
	public Cliente(int id, String nombre, String apellido, String nro_cuenta, double saldo, String cualidades,
			String deudas) {
		super(id, nombre, apellido, nro_cuenta, saldo);
		this.cualidades = cualidades;
		this.deudas = deudas;
	}

	
	
	public String metodoClasePersona() {
		return "Metodo de la clase Persona Sobreescrito";
	}
	
	public String getCualidades() {
		return cualidades;
	}

	public void setCualidades(String cualidades) {
		this.cualidades = cualidades;
	}

	public String getDeudas() {
		return deudas;
	}

	public void setDeudas(String deudas) {
		this.deudas = deudas;
	}

	@Override
	public String toString() {
		return "Cliente [cualidades=" + cualidades + ", deudas=" + deudas + "]";
	}

	
	
}
