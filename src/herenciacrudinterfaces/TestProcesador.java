package herenciacrudinterfaces;

public class TestProcesador {
	
	public static void main(String[] args) {
		
		//https://www.intel.es/content/www/es/es/products/sku/123613/intel-core-i97900x-xseries-processor-13-75m-cache-up-to-4-30-ghz/specifications.html
		//https://www.amd.com/es/products/cpu/amd-ryzen-7-2700
		
		
		Procesador procesador01 = new Procesador(1, "Intel Celeron N3050"
				, "Intel", "N34KLOP", "1.60 GHz", 0.11, 2, "2 MB L2");
		Procesador procesador02 = new Procesador(2, "Procesador Intel® Core™ i9-9900K"
				, "Intel", "Q35RT6", "5.00 GHz", 0.09, 8, "13.75 MB L3 Cache");
		Procesador procesador03 = new Procesador(3, "AMD Ryzen™ 7 2700"
				, "AMD", "YD2700BBM88AF", "4.01 GHz", 0.04, 8, "16 MB L3 Cache");
		
		
		
		
		//------------------- TEST MÉTODOS CRUD ---------------------------
		
		//Creamos un objeto del repository para hacer uso de los metodos
		ProcesadorRepository procesadorRepository = new ProcesadorRepository();
		
		
		// ========================= INSERT AND SELECT ==============================
		//AGREGAMOS LOS PROCESADORES
		procesadorRepository.agregarProcesador(procesador01);
		procesadorRepository.agregarProcesador(procesador02);
		procesadorRepository.agregarProcesador(procesador03);
		
		System.out.println("\n============ LISTA DE PROCESADORES ===============");
		//LISTAMOS LOS PROCESADORES
		//System.out.println(procesadorRepository.listarProcesadores());
		procesadorRepository.listarProcesadores().stream().forEach(System.out::println);
		
		
		
		//========================= UPDATE ==============================
		
		//EDITAMOS UN PROCESADORES
		procesadorRepository.editarProcesador(1, "Intel Celeron N3050", "Intel"
				, "N34KLOP", "1.60 GHz", 0.16, 2, "2 MB L2");
	
		
		System.out.println("\n============ LISTA DE PROCESADORES ===============");
		procesadorRepository.listarProcesadores().stream().forEach(System.out::println);
		
		
		//========================= DELETE ==============================
		
		//BORRAMOS UN PROCESADOR
		procesadorRepository.borrarProcesador(procesador01);
		
		
		System.out.println("\n============ LISTA DE PROCESADORES ===============");
		procesadorRepository.listarProcesadores().stream().forEach(System.out::println);
		
	
	}

}
