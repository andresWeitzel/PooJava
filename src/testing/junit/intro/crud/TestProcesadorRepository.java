package testing.junit.intro.crud;

public class TestProcesadorRepository {
	
	public static void main(String[] args) {
		
		
		// ==================METODOS ABSTRACTOS ==============================

		
		
		//https://www.intel.es/content/www/es/es/products/sku/123613/intel-core-i97900x-xseries-processor-13-75m-cache-up-to-4-30-ghz/specifications.html
		//https://www.amd.com/es/products/cpu/amd-ryzen-7-2700
		
		Procesador procesador01 = new Procesador(1,"Intel Celeron N3050","Intel"
				,"ERT-92383-11","1.60 Ghz", 0.11 , 2 , "2 MB L2");
		
		Procesador procesador02 = new Procesador(2,"Intel Core i9-9900k","Intel"
				,"P3WLI-72J8","5.00 Ghz", 0.09 , 8 , "15 MB L3 Cache");
		
		Procesador procesador03 = new Procesador(3,"AMD Rizen 7 2700","AMD"
				,"IOSOS-98S-SII","4.01 Ghz", 0.04 , 8 , "16 MB L3 Cache");
		
		
		
		
		//=== CREAMOS UN OBJETO DEL REPOSITORY ==
		ProcesadorRepository procesadorRepository = new ProcesadorRepository();
		
		
		
		//========================== INSERT AND SELECT =========================
		//Agregamos los procesadores
		
		procesadorRepository.agregarProcesador(procesador01);
		procesadorRepository.agregarProcesador(procesador02);
		procesadorRepository.agregarProcesador(procesador03);
		
		System.out.println("\n===== LISTA DE PROCESADORES ===========");
		//System.out.println(procesadorRepository.listaProcesadores());
		procesadorRepository.listaProcesadores().stream().forEach(System.out::println);
		
		//========================= UPDATE =================================
		
		procesadorRepository.editarProcesador(new Procesador(3,"AMD Rizen 7 2800","AMD"
				,"KSJUU-8SUJ-AA0","5.01 Ghz", 0.04 , 8 , "16 MB L3 Cache"));
	
		
		
		System.out.println("\n===== LISTA DE PROCESADORES ===========");
		procesadorRepository.listaProcesadores().stream().forEach(System.out::println);
		
		
		//========================= DELETE =================================
		
				procesadorRepository.eliminarProcesador(procesador03);
			
				
				
				System.out.println("\n===== LISTA DE PROCESADORES ===========");
				procesadorRepository.listaProcesadores().stream().forEach(System.out::println);
				
				
				// ==================METODOS DEFAULTS ==============================

				
				System.out.println(procesadorRepository.listaProcesadores("04/05/22"));
				
				System.out.println(procesadorRepository.listaProcesadores("12/11/20","09:00"));
	
		
	}


}
