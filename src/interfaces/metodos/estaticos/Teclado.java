package interfaces.metodos.estaticos;

public class Teclado implements I_Teclado{
	
	
	//Implementamos el metodo abstracto de la interfaz y declaramos uno de la clase
	
	//METODO DE ESTA CLASE
	public String escribiendo(boolean estado) {
		
		return "Escribiendo "+ estado;
	}

	//METODO DE LA INTERFAZ
	@Override
	public String medirTemperatura(boolean estado) {
		// TODO Auto-generated method stub
		return "Midiendo Temperatura"+estado;
	}

	
	
}
