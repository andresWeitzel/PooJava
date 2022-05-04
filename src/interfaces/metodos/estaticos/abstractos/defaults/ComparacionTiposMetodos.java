package interfaces.metodos.estaticos.abstractos.defaults;

public class ComparacionTiposMetodos implements I_MetodosDefaultAbstract{

	
	//Implementamos y Sobreescribimos todos los metodos abstractos, los dafault
	//y estaticos no seran necesarios
	@Override
	public void accion_01_00() {
		System.out.println( " abstract accion_01_00");
		
	}

	@Override
	public void accion_01_01() {
		System.out.println( " abstract accion_01_01");
		
	}

	@Override
	public void accion_01_02() {
		System.out.println( " abstract accion_01_02");
		
	}

	@Override
	public String accion_02_00() {
		 
		return "abstract accion_02_00";
	}

	@Override
	public String accion_02_01() {
		return "abstract accion_02_01";
	}

	@Override
	public String accion_02_02() {
		return "abstract accion_02_02";
	}


}
