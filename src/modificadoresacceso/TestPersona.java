package modificadoresacceso;

public class TestPersona {
	
	public static void main(String[] args) {

Persona javierRamirez = new Persona();

		
		//CON UN MODIFICADOR PUBLICO PODEMOS ACCEDER AL ATRIBUTO FUERA Y DENTRO DEL
		//PAQUETE
		javierRamirez.id = 1;
		
		System.out.println(javierRamirez.toString());
		
		//NO SERIA IDEAL ACCEDER DIRECTAMENTE AL ATRIBUTO SIN
		//PASAR POR UN SETTER U OTRO METODO CON SEGURIDAD
		//AL TENER ATRIBUTOS SIN MODIFICADORES, OSEA DEFAULT, SE APLICA LA SEGURIDAD 
		//DE PODER ACCEDER AL ATRIBUTO DESDE EL MISMO PAQUETE SOLAMENTE, NO SE 
		//PODRA ACCEDER FUERA DEL PAQUETE NI AUNQUE APLIQUEMOS HERENCIA
		javierRamirez.nroCuentaPrincipal = "HJYW7721912KL22";
		
		
		System.out.println(javierRamirez.toString());
		
		
		//AL UTILIZAR MODIFICADORES PRIVADOS NO TENEMOS VISIBILIDAD FUERA DE LA CLASE
		//A MENOS QUE USEMOS UN SETTER U OTRO METODO
		//javierRamirez.nroCuentaSecundaria = "LLSG6653GDTY99";
		//javierRamirez.setNroCuentaSecundaria("LLSG6653GDTY99");
		
		System.out.println(javierRamirez.toString());
		
		
		//AL UTILIZAR MODIFICADORES DE TIPO PROTECTED PODEMOS ACCEDER DESDE FUERA
		//DE LA CLASE PERO NO FUERA DEL PAQUETE (A MENOS QUE SE APLIQUE HERENCIA)
		javierRamirez.saldo = 34.999;
		
		System.out.println(javierRamirez.toString());
		
		
	}
	
	
	

	
	

}
