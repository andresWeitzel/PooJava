package interfaces.metodos.estaticos.abstractos.defaults;

public interface I_MetodosDefaultAbstract {

	/*
	 * RECORDEMOS PARA INTERFACES SOLO ES POSIBLE:
	 * 
	 * 
	 * - METODOS DEFAULT VOID/STRING/DOUBLE/ETC - METODOS ABSTRACT
	 * VOID/STRING/DOUBLE/ETC - METODOS STATIC VOID/STRING/DOUBLE/ETC
	 * 
	 * - NO METODOS AISLADOS DE TIPO STRING, INT, DOUBLE, GETTERS, VOID ETC (LOS
	 * USADOS EN CLASES NORMALMENTE)
	 * 
	 * 
	 * 
	 * == FUNCIÓN PRINCIPAL METODOS DEFAULT== Los Metodos por defecto nos permitiran
	 * poder implementarlos o no en una clase que implemente una interfaz. Por enda
	 * podemos usarlos sin necesidad de sobreescritura en una clase
	 * 
	 * 
	 * 
	 * == FUNCIÓN PRINCIPAL METODOS ABSTRACTOS== El propósito de un método abstracto
	 * es dejar que las clases que heredan de éstas puedan implementar un método de
	 * diferentes maneras. Este mecanismo es fundamental para hacer uso del
	 * polimorfismo, uno de los conceptos principales de la programación orientada a
	 * objetos, así como la mayoría de patrones de diseño más usados.
	 * 
	 * 
	 * 
	 * == FUNCIÓN PRINCIPAL METODOS ESTATICOS== Utilizar dicho metodo segun la
	 * declaracion propuesta en la interfaz, no podemos cambiar la firma(lo que
	 * hace) solamente utilizarlo invocandolo con la interfaz, osea que dichos  
	 * metodos no se implementaran, solo invocar y ademas no es necesario la creacion de un
	 * objeto para su uso
	 * 
	 * 
	 * 
	 */

	// ===================================================

	// === TIPOS DE METODOS NO PERMITIDOS ===

	// --STRING, BOOLEAN , ETC--
	/*
	 * public String accion() { return "Accion"; }
	 * 
	 * //Se puede pensar que solo definiendo el metodo //este sera de tipo void,
	 * string, etc. Pero java //lo toma como abstacto. Podemos o no colocar el
	 * abstract. //pero este sera abstract public String accion(String accion) ;
	 * 
	 * 
	 * 
	 * public boolean accion(boolean estado) { return estado; }
	 * 
	 */

	// -- VOID--
	/*
	 * public void accion() { System.out.println("Accion"); };
	 */

	// =================================================

	// === TIPOS DE METODOS PERMITIDOS ===

	// ==========ABSTRACT==========
	// --ABSTRACT VOID--
	// Formas de definicion

	public abstract void accion_01_00();

	// OJO NO EXISTE EL M.A. PROTECTED EN INTERFACES
	// SI NO SE COLOCA ES PUBLIC
	// protected void accion_01_01();
	abstract void accion_01_01();

	void accion_01_02();

	// --ABSTRACT STRING, BOOLEAN, ETC--
	public abstract String accion_02_00();

	abstract String accion_02_01();

	String accion_02_02();

	// ==========DEFAULT==========
	// --DEFAULT VOID--
	public default void accion_03_00() {
		System.out.println("default accion_03_00");
	};

	default void accion_03_01() {
		System.out.println("default accion_03_01");
	};

	// --ABSTRACT STRING, BOOLEAN, ETC--
	public default String accion_04_00() {
		return "default accion_04_00";
	};

	default String accion_04_01() {
		return " default accion_04_01";
	};
	
	//NO INCLUIMOS LOS METODOS STATIC POR QUE SINO TENDREMOS 
	//QUE IMPLEMENTAR LA INTERFAZ EN LA CLASE TEST Y ESO CONLLEVA A 
	//LA SOBREESCRITURA DE LOS METODOS ABSTRACT

	

}
