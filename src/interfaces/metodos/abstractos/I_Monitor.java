package interfaces.metodos.abstractos;

public interface I_Monitor {


	//Las Interfaces abstractas solo contendran métodos abstractos, los metodos
	//abstractos son metodos que no necesitan implementacion(cuerpo) en donde 
	//se defina, en este caso la interfaz, pero si se deberá implementar en la 
	//clase que implemente dicha interfaz
	

	public abstract String encender();
	
	
	public abstract String apagar();
	
	
	// APLICAMOS SOBRECARGA DE METODOS
	
	public abstract String bajarVolumen();
	
	
	
	public abstract String bajarVolumen(String mensaje);
	
	
	
	public abstract String aumentarVolumen();
	
	public abstract String aumentarVolumen(String mensaje);
	
	public abstract String aumentarVolumen(boolean pulsacion);
	
}
