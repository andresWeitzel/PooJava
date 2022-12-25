package abstraccion.subclases.metodos.herencia;

public class TestComputadora extends Computadora{
	
	//Si heredamos de una class abstract implementamos sus abstractos
	//IMPORTANTE--> EL METODO SOBREESCRITO AHORA YA NO ES ABSTRACTO, SINO CONVENCIONAL...
	//GRACIAS A ESTA CONVERSION AUTOMATICA ES QUE MODELAMOS UN PSEUDO COMPARTAMIENTO
	//POLIMORFICO....SI QUEREMOS TRABAJAR AHORA ESTA FUNCION COMO ABSTRACT LA CLASE
	//PASARA A SERLA TAMBIEN
	
	//PODEMOS TOMAR LAS FUNCIONALIDADESS QUE DESEAMOS SEGUN EL NIVEL DE JERARQUIA 
	//SI HEREDAMOS DE COMPUTADORA TRAEMOS TODAS LAS FUNCIONALIDADES DE LAS DEMAS CLASES
	//SI ES DE PLACA, SOLO PLACA Y MEMORIA, ETC...
	
	

	@Override
	public void tipoComputadora(String tipo) {
		System.out.println("Computadora : "+tipo);
		
	}

	@Override
	public void tipoPlaca(String tipo) {
		System.out.println("Placa Madre : "+tipo);
		
	}

	@Override
	public void tipoMemoria(String tipo) {
		System.out.println("Memoria : "+tipo);
		
	}

	
	
	
	public static void main(String[] args) {
		
	
	
		TestComputadora objetoTest = new TestComputadora();
		
		objetoTest.tipoMemoria("DDR4");
		objetoTest.tipoPlaca("Micro ATX Asus");
		objetoTest.tipoComputadora("Asus i7 6ta Gen");
		
	
	
	}







}
