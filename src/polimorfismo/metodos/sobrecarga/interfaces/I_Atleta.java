package polimorfismo.metodos.sobrecarga.interfaces;

public interface I_Atleta {
	
	public abstract String entrenar();
	
	public abstract String entrenar(int horas);
	
	public abstract String entrenar(int horas, int dias);
	
	public abstract String entrenar(int horas, int dias, String tipoEntren);
	
	public abstract String entrenar(int horas, int dias, String tipoEntren, String competencias);
	
	

}
