package interfaces.metodos.estaticos.abstractos.defaults;

public interface I_MetodosStatic {
	
	/*
	 * 
	 * == FUNCIÓN PRINCIPAL METODOS ABSTRACTOS== El propósito de un método abstracto
	 * es dejar que las clases que heredan de éstas puedan implementar un método de
	 * diferentes maneras. Este mecanismo es fundamental para hacer uso del
	 * polimorfismo, uno de los conceptos principales de la programación orientada a
	 * objetos, así como la mayoría de patrones de diseño más usados.
	 * 
	 * 
	*/
	// ==========STATIC==========
		// --STATIC VOID--
		public static void accion_05_00() {
			System.out.println("static accion_05_00");
		};
		

		static void accion_05_01() {
			System.out.println("static accion_05_01");
		};

		// --STATIC STRING, BOOLEAN, ETC--
		public static String accion_06_00() {
			return "static accion_06_00";
		};

		static String accion_06_01() {
			return "static accion_06_01";
		};

}
