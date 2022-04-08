package herencia.interfaces.crud;

import java.util.ArrayList;

public class ProcesadorRepository implements I_ProcesadorRepository{
	

	//Creamos una lista para almacenar los objetos creados
	//private para que solo se pueda acceder desde esta clase a la lista
	private ArrayList<Procesador> listaProcesadores = new ArrayList();
	
	
	
	@Override
	public ArrayList<Procesador> listarProcesadores() {
		
		return listaProcesadores;
			
	}



	@Override
	public void agregarProcesador(Procesador procesadorInput) {
		try{listaProcesadores.add(procesadorInput);}
		catch(Exception e) {System.out.println(e);}
		
		
	}



	@Override
	public void editarProcesador(int id,String modelo, String fabricante
			, String codigo, String frecuencia, double consumo,int nro_nucleos
			, String tipo_cache)
	{
		
		
		//Manejo de excepciones
		try {
			
			//Recorremos la lista de procesadores y verificamos el id
			for (Procesador procesador:listaProcesadores) {
				//Comprobamos que el id existe en la lista, sino salimos
				if(id != procesador.getId()) {
					return;
				}
				else {
					procesador.setModelo(modelo);
					procesador.setFabricante(fabricante);
					procesador.setCodigo(codigo);
					procesador.setFrecuencia(frecuencia);
					procesador.setConsumo(consumo);
					procesador.setNro_nucleos(nro_nucleos);
					procesador.setTipo_cache(tipo_cache);

				}
			}
			
			
		}catch(Exception e) {System.out.println(e);}
		

	}



	@Override
	public void borrarProcesador(Procesador procesador) {
		
		try {listaProcesadores.remove(procesador);}
		catch(Exception e) {System.out.println(e);}
		
	}



}
