package abstraccion.subclases.metodos.herencia;

public class TestPlacaMadre extends PlacaMadre{

	@Override
	public void tipoPlaca(String tipo) {
		System.out.println("Tipo de Placa Madre : "+tipo);
		
	}

	@Override
	public void tipoMemoria(String tipo) {
		System.out.println("Tipo de Memoria : "+tipo);
		
	}
	
	
	public static void main(String[] args) {
		
		TestPlacaMadre objetoTest = new TestPlacaMadre();
		
		objetoTest.tipoMemoria("DDR4 24 MB");
		objetoTest.tipoPlaca("ATX Nvidia");
		
	}

}
