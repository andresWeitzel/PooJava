package testing.junit.intro.crud;

import java.util.ArrayList;
import java.util.List;

public class ProcesadorRepository implements I_ProcesadorRepository{
	
	
	private ArrayList<Procesador> listaProcesadores = new ArrayList<Procesador>();
	
	
	
	
	@Override
	public ArrayList<Procesador> listaProcesadores() {
		
		try {
		
			return listaProcesadores;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
		
	}
		
		@Override
		public ArrayList<Procesador> listaProcesadores(String fecha) {
			
			try {
			
				final String FECHA = "04/05/22";
				
				if(fecha == FECHA) {return listaProcesadores;}
				
				return null;

				
			} catch (Exception e) {
				
				e.printStackTrace();
				
				return null;
				
			}
				
			}
			
			@Override
			public ArrayList<Procesador> listaProcesadores(String fecha, String hora) {
				
				try {
				
					
					final String FECHA = "12/11/20";
					final String HORA = "09:00";
					
					if(fecha == FECHA && hora == HORA) {return listaProcesadores;}
					
					return null;

					
				} catch (Exception e) {
					
					e.printStackTrace();
					
					return null;
					
				}
			
		

		
		
		
		
	}
	

		


	@Override
	public void agregarProcesador(Procesador procesador) {
		
		
		try {
			
			if(procesador == null) {
				return;
			}else {
				listaProcesadores.add(procesador);
				
			}
			
		
			
		} catch (Exception e) {
			
			e.printStackTrace();

		}
		
		
		
	}

	@Override
	public void editarProcesador(Procesador procesador) {
		try {
			
			for(Procesador procesadorLista : listaProcesadores ) {
				
				if(procesador.getId() <= 0) {
					return;
				}else {
					
					if(procesador.getId() == procesadorLista.id) {
						procesadorLista.setModelo(procesador.getModelo());
						procesadorLista.setFabricante(procesador.getFabricante());
						procesadorLista.setCodigo(procesador.getCodigo());
						procesadorLista.setFrecuencia(procesador.getFrecuencia());
						procesadorLista.setConsumo(procesador.getConsumo());
						procesadorLista.setNro_nucleos(procesador.getNro_nucleos());
						procesadorLista.setTipo_cache(procesador.getTipo_cache());
						
					 System.out.println("== Se ha actualizado el Objeto==");
					}else {
						System.out.println("\n==No se ha actualizado el objeto en la lista==");
					}
				
				}
				
				
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();

		}
		
		
	}

	@Override
	public void eliminarProcesador(Procesador procesador) {
		
		try {
			
			if(procesador == null) {
				return;
			}
			
			if (procesador != null) {
				listaProcesadores.remove(procesador);
				 System.out.println("== Se ha eliminado el Objeto==");
			}else {
				System.out.println("\n==No se ha eliminado  el objeto en la lista==");
			}
			

			
		} catch (Exception e) {
			
			e.printStackTrace();

		}
		
	}
	

}
