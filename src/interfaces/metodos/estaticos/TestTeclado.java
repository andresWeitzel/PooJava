package interfaces.metodos.estaticos;

//Si tenemos interfaces con metodos estaticos tenemos que implementar dicha 
//interfaz en la clase principal, entonces para que la implementamos tambien en 
//la otra clase?? Porque usamos los metodos abstractos, atenti a esto

public class TestTeclado extends Teclado implements I_Teclado{
	
	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		//INVOCAMOS METODO DE LA CLASE
		teclado.escribiendo(true);
		
		//INVOCAMOS METODO ABSTRACTO DE LA INTERFAZ IMPLEMENTADO EN LA CLASE 
		teclado.medirTemperatura(false);
		
		
		//INVOCAMOS LOS METODOS ESTATICOS DE LA INTERFAZ SIN INSTANCIAR UN OBJETO
		I_Teclado.encender(true);
		I_Teclado.cargar(true);
		I_Teclado.apagar(true);
		
		
		
		
		
	}

}
