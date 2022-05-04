package herencia.interfaces.crud;

import java.util.ArrayList;
import java.util.List;

public interface I_ProcesadorRepository {

	// ==================METODOS ABSTRACTOS ==============================

	// Por lo general se implementan metodos abstractos y default en interfaces
	// Un metodo abstracto se declara pero no se implementa en la interfaz y no se
	// declara con llaves

	// Vamos a Declarar los metodos CRUD para
	// realizar las operaciones necesarias.

	// Listar los procesadores usando un ArrayList de tipo Procesador
	public abstract ArrayList<Procesador> listaProcesadores();

	// Metodos void sin devolucion de valores
	// Notar que la definicion de los parametros de los metodos cambian en relacion
	// a que se quiera realizar, si se borra un elemento no vamos a pasarle el
	// objeto completo, sino el id del mismo.
	// LAS DEFINICIONES DE LOS PARAMETROS SE REALIZAN EN LAS INTERFACES

	public abstract void agregarProcesador(Procesador procesador);

	public abstract void editarProcesador(Procesador procesador);

	// No es una buena practica ya que los atributos pueden cambiar en la clase
	// public abstract void editarProcesador(int id, String modelo, String
	// fabricante....);

	public abstract void eliminarProcesador(Procesador procesador);

	// ==================METODOS DEFAULTS ==============================

	public default List<Procesador> listaProcesadores(String fecha) {

		return new ArrayList<Procesador>();

	};

	public default List<Procesador> listaProcesadores(String fecha, String hora) {

		return new ArrayList<Procesador>();

	};

}
