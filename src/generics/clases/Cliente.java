package generics.clases;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

	long id;
	long nroCliente;
	int cantidadCompras;
	LocalDate fechaIngreso;
	LocalTime horaIngreso;

	public void accion(String accion) {

		System.out.println("La accion que realiza el cliente es " + accion);
	}
}
