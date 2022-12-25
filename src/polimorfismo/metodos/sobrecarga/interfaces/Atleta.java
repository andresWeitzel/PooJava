package polimorfismo.metodos.sobrecarga.interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Atleta implements I_Accion{
	
	String nombre;
	String apellido;
	int edad;
	String tipoDoc;
	String nroDoc;


	@Override
	public String entrenar() {
		return "El Atleta realiza el entrenamiento";
		
	}

	@Override
	public String entrenar(int horas) {
		return "El atleta realiza el entrenamiento por dia "+horas+" horas";
		
	}

	@Override
	public String entrenar(int horas, int dias) {
		return "El atleta realiza el entrenamiento "+horas+" horas los "+dias
				+" de la Semana";
		
		
	}

	@Override
	public String entrenar(int horas, int dias, String tipoEntren) {
		return "El atleta realiza el entrenamiento "+horas+" horas los "+dias
				+" de la Semana y el Tipo de Entrenamiento es "+tipoEntren;
		
	}

	@Override
	public String entrenar(int horas, int dias, String tipoEntren, String competencias) {
		return "El atleta realiza el entrenamiento "+horas+" horas los "+dias
			    +" de la Semana, el Tipo de Entrenamiento es "+tipoEntren
			    +" compitiendo "+competencias;
		
	}




	

}
