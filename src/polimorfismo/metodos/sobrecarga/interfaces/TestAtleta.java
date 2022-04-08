package polimorfismo.metodos.sobrecarga.interfaces;

public class TestAtleta {
	
	public static void main(String[] args) {
	
		Atleta atleta01 = new Atleta("Carlos","Gomez",22,"DNI","1281291219");
		
		System.out.println(atleta01);
		
		System.out.println("\n=== ENTRENAMIENTOS ===\n");
		System.out.println(atleta01.entrenar());
		System.out.println(atleta01.entrenar(4));
		System.out.println(atleta01.entrenar(4,6));
		System.out.println(atleta01.entrenar(4,6,"Running"));
		System.out.println(atleta01.entrenar(4,6,"Running","100 mts"));
		
		
	}
	
	
	

}
