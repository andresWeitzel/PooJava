package generics.metodos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
	
	long id;
	String nombre;
	String apellido;
	int edad;
	String tipoDoc;
	String nroDoc;
	

}
