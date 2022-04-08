package interfaces.metodos.estaticos;

public interface I_Teclado {
	
	//Vamos a declarar metodos estaticos y abstractos
	public abstract String medirTemperatura(boolean estado);
	
	
	//JAVA 8 INCORPORO METODOS ESTATICOS Y DEFAULTS EN INTERFACES
	
	public static String encender(boolean estado) {
		return "Encendiendo Teclado"+ estado;
	}

	
	public static String cargar(boolean estado) {
		return "Cargando Teclado"+ estado;
		
	}
	
	public static String apagar(boolean estado) {
		return "Apagando Teclado"+ estado;
	}

	

}
