package polimorfismo.metodos.parametrico;


public class Test {
	
	public static void main(String[] args) {

		//Aplicamos Polimorfirmo dinamico
		Persona cliente = new Cliente();
		Persona empleado = new Empleado();
		
		System.out.println(cliente.realizarUnaAccion("Comprar un Producto",2));
		System.out.println(empleado.realizarUnaAccion("Vender un Producto"));
		
		//Importante, en parametrización polimorfica y de sobrecarga deberán estar 
		//definidos los métodos en la clase padre, sino no se podrá ni aplicar 
		//sobrecarga ni parametrizacion con la herencia
	}

}
