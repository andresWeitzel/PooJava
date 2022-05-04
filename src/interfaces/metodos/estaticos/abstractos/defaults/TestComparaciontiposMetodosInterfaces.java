package interfaces.metodos.estaticos.abstractos.defaults;

//implementamos la interfaz de metodos estaticos
public class TestComparaciontiposMetodosInterfaces implements I_MetodosStatic{
public static void main(String[] args) {
	
	ComparacionTiposMetodos obj = new ComparacionTiposMetodos();
	
	obj.accion_01_00();
	
	obj.accion_01_01();
	
	obj.accion_01_02();
	
	System.out.println(obj.accion_02_00());
	
	System.out.println(obj.accion_02_01());
	
	System.out.println(obj.accion_02_02());
	
	
	
	//UTILIZAMOS METODOS DEFAULT SIN IMPLEMENTACION
	obj.accion_03_00();
	
	obj.accion_03_01();
	
	obj.accion_04_00();
	
	obj.accion_04_01();
	
	
	//LOS METODOS STATIC NECESITAREMOS USARLOS DIRECTAMENTE DESDE LA INTERFAZ
	I_MetodosStatic.accion_05_00();
	
	I_MetodosStatic.accion_05_01();
	
	System.out.println(I_MetodosStatic.accion_06_00());
	
	System.out.println(I_MetodosStatic.accion_06_01());
	

	//Entonces atenti al usar abstractos con estaticos juntos, puede llevar a 
	//un problema muy grande, si usamos los default con estaticos no hay problema

	
}


}
