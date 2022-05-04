package interfaces.metodos.estaticos.abstractos;

//Si tenemos interfaces con metodos estaticos tenemos que implementar dicha 
//interfaz en la clase principal, entonces para que la implementamos tambien en 
//la otra clase?? Porque usamos los metodos abstractos, atenti a esto

public class TestTeclado implements I_Teclado{
	
	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		//INVOCAMOS METODO DE LA CLASE
		System.out.println(teclado.escribiendo(true));
		
		//INVOCAMOS METODO ABSTRACTO DE LA INTERFAZ IMPLEMENTADO EN LA CLASE 
		System.out.println(teclado.medirTemperatura(false));
		
		
		//INVOCAMOS LOS METODOS ESTATICOS DE LA INTERFAZ SIN INSTANCIAR UN OBJETO
		System.out.println(I_Teclado.encender(true)); 
		System.out.println(I_Teclado.cargar(true));
		System.out.println(I_Teclado.apagar(true));
		
		
		
		
		
	}

	@Override
	public String medirTemperatura(boolean estado) {
		// TODO Auto-generated method stub
		return null;
	}

}
