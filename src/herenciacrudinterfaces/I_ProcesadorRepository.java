package herenciacrudinterfaces;

import java.util.ArrayList;

public interface I_ProcesadorRepository{
	
	//Por lo general se implementan metodos abstractos en interfaces
	//Un metodo abstracto se declara pero no se implementa en la interfaz y no se
	//declara con llaves
	
	//Vamos a Declarar los metodos CRUD  para 
	//realizar las operaciones necesarias.
	
	
	//Listar los Procesadores usando ArrayList de Tipo Procesador
	public abstract ArrayList<Procesador> listarProcesadores();
	
	
	//Metodos void sin devolucion de valores 
	//Notar que la definicion de los parametros de los metodos cambian en relacion
	//a que se quiera realizar, si se borra un elemento no vamos a pasarle el 
	//objeto completo, sino el id del mismo.
	//LAS DEFINICIONES DE LOS PARAMETROS SE REALIZAN EN LAS INTERFACES
	
	public abstract void agregarProcesador(Procesador procesador);
	
	public abstract  void editarProcesador(int id,String nombre, String fabricante
			, String codigo, String frecuencia, double consumo,int nro_nucleos
			, String tipo_cache);
	
	public abstract void borrarProcesador(Procesador procesador);



	
	
	
	

}
