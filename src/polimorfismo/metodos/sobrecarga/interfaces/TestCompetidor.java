package polimorfismo.metodos.sobrecarga.interfaces;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestCompetidor {

	public static void main(String[] args) {
		
		Competidor competidor01 = new Competidor("Juan","Castro",34,"DNI"
				,"867826423","A9908",LocalDate.of(2022, 03, 11), LocalTime.of(13, 34));
		
		System.out.println(competidor01);
		
		
		//YA QUE HEREDAMOS DE UNA CLASE QUE IMPLEMENTA METODOS DE UNA INTERFAZ
		//PODEMOS IMPLETAR DICHOS METODOS
		System.out.println("\n=== ENTRENAMIENTOS ===\n");
		System.out.println(competidor01.entrenar());
		System.out.println(competidor01.entrenar(3));
		System.out.println(competidor01.entrenar(3,3));
		System.out.println(competidor01.entrenar(3,3,"Basquetball"));
		System.out.println(competidor01.entrenar(3,3,"Basquetball","3 vs 3"));
		
		
		//ADEMAS DE LOS METODOS DE LA INTERFAZ HEREDADOS PODEMOS IMPLEMENTAR
		//LOS METODOS DE LA INTERFAZ QUE IMPLEMENTA ESTA CLASE
		System.out.println("\n=== CUALIDADES ===\n");
		System.out.println(competidor01.cualidad("Altura"));
		System.out.println(competidor01.cualidad("Altura","Perseverancia"));
		System.out.println(competidor01.cualidad("Altura","Perseverancia","Aptitud"));
		
		
		//COMO RESUMEN: USAMOS 2 INTERFACES DIFERENTES IMPLEMENTANDO EN 2 CLASES
		//UNA PADRE Y OTRA HIJA METODOS SOBRECARGADOS APLICANDO POLIMORFISMO
		//LA CLASE HIJA TENDRA LA POTESTA DE USAR LOS METODOS QUE DESEE, TANTO
		//DE LA CLASE PADRE COMO LOS QUE IMPLEMENTE DE OTRA INTERFAZ
		
	}
	
}
