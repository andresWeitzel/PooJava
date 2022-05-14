package interfaces.metodos.estaticos.abstractos.defaults;


//Implementamos la interfaz de metodos estaticos
public class TestComparaciontiposMetodosInterfaces implements I_MetodosStatic{

	public static void main(String[] args) {
		
		ComparacionTiposMetodos obj = new ComparacionTiposMetodos();
		
		//Metodos abstractos void
		obj.accion_01_00();
		obj.accion_01_01();
		obj.accion_01_02();
		
		//Metodos abstractos String
		System.out.println(obj.accion_02_00());
		System.out.println(obj.accion_02_01());
		System.out.println(obj.accion_02_02());
		
		
		//Metodos default de tipo void (SIN IMPLEMENTACION)
		obj.accion_03_00();
		obj.accion_03_01();
		
		
		//Metodos default de tipo String (SIN IMPLEMENTACION)
		System.out.println(obj.accion_04_00());
		System.out.println(obj.accion_04_01());
		
		
		
		//Los metodos static necesitaremos usarlos directamente desde la interfaz
		
		//Metodos Static de tipo void(SIN IMPLEMENTACION)
		I_MetodosStatic.accion_05_00();
		I_MetodosStatic.accion_05_01();
		
		
		//Metodos Static de tipo String(SIN IMPLEMENTACION)
		System.out.println(I_MetodosStatic.accion_06_00());
		System.out.println(I_MetodosStatic.accion_06_01());
		
		
		//Entonces atenti al usar abstractos con estaticos juntos, puede llevar a 
		//un problema muy grande, si usamos los default con estaticos no hay problema
		
	}
	

}
