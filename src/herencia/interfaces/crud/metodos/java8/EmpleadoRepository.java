package herencia.interfaces.crud.metodos.java8;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepository implements I_EmpleadoRepository {

	private List<Empleado> listaEmpleados = new ArrayList<>();

	@Override
	public List<Empleado> listEmpleados() {

		try {
			// Comprobamos solo el tamaño ya que inicializamos al principio la lista..
			boolean sizeListEmpl = (listaEmpleados.size() == 0) ? false : true;

			List<Empleado> listEmplCheck = (sizeListEmpl) ? listaEmpleados : null;

			// Si la lista esta vacia la devolvemos tambien, la logica se aplica
			// a las comprobaciones segun lo deseado, no aplica de igual forma al resto
			// de los metodos del crud
			return listEmplCheck;

		} catch (Exception e) {

			System.out.println("Se ha generado un error al Listar los Empleados." + " Causado por " + e.getMessage());

			return null;
		}

	}

	@Override
	public void addEmpleado(Empleado empleado) {

		try {

			boolean emplNulo = (empleado == null) ? true : false;

			if (emplNulo) {
				return;
			} else {
				listaEmpleados.add(empleado);
			}

		} catch (Exception e) {
			System.out.println("Se ha generado un error al Agregar el Empleado." + " Causado por " + e.getMessage());

		}

	}

	@Override
	public void updateEmpleado(Empleado empleado) {

		try {
			
			
			boolean emplNulo = (empleado == null) ? true : false;
			
			//Indice No Permitido
			boolean emplError = (empleado.getId() <= 0) ? true : false;
			
			//Objeto que se encuentre en la lista
			boolean emplValidado = (listaEmpleados.get((int) empleado.getId())!= null) 
					? true : false;
			
			
			if(emplNulo) {return;}
			else {
				if(emplError == false && emplValidado) {
					//Las Listas comienzan desde  el indice 0, restamos uno
					listaEmpleados.set((int)empleado.getId()-1, empleado);
				}else {return;}
			}
			
			
			

		} catch (Exception e) {
			System.out.println("Se ha generado un error al Agregar el Empleado." + " Causado por " + e.getMessage());

		}

	}

	@Override
	public void deleteEmpleado(Empleado empleado) {

		try {
			
			
			boolean emplNulo = (empleado == null) ? true : false;
			
			//Indice No Permitido
			boolean emplError = (empleado.getId() <= 0) ? true : false;
			
			//Objeto que se encuentre en la lista
			boolean emplValidado = (listaEmpleados.get((int) empleado.getId())!= null) 
					? true : false;
			
			
			if(emplNulo) {return;}
			else {
				if(emplError == false && emplValidado) {
					//Las Listas comienzan desde  el indice 0, restamos uno
					listaEmpleados.remove((int)empleado.getId()-1);
				}else {return;}
			}
			
			
			

		} catch (Exception e) {
			System.out.println("Se ha generado un error al Eliminar el Empleado." + " Causado por " + e.getMessage());

		}

	}
	
	
	

}
