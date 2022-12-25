package herencia.interfaces.crud.metodos.java8;

import java.util.List;

public interface I_EmpleadoRepository {

	
	public abstract List<Empleado> listEmpleados();
	
	
	public abstract void addEmpleado(Empleado empleado);
	
	
	public abstract void updateEmpleado(Empleado empleado);
	
	
	public abstract void deleteEmpleado(Empleado empleado);
	
	
	
}
