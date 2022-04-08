package polimorfismo.metodos.inclusion;

public class TestAireAcondicionado {
	
	public static void main(String[] args) {
		
		//https://ifgeekthen.nttdata.com/es/polimorfismo-en-java-programaci%C3%B3n-orientada-objetos
		
		
		//Como resumen el polimorfismo de inclusion nos permite redefinir metodos
		//ya sea de una superclase a una subclase, o una interfaz a una clase
	
	
		AireAcondicionado aire = new AireAcondicionado();
		
		System.out.println(aire.encender());
		System.out.println(aire.medirTemperatura());
		System.out.println(aire.apagar());
	
	
	}

}
