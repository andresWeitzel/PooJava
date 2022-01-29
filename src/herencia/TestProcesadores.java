package herencia;

public class TestProcesadores{
	



	public static void main(String[] args) {
		
		//NO EXISTE CONSTRUCTOR VACIO YA QUE USAMOS HERENCIA DE LA SUPERCLASE CPU
		//Y ATRIBUTOS DE LA SUBCLASE ALU
		//UnidadAritmeticaLogicaALU alu = new UnidadAritmeticaLogicaALU(); 
		
		//https://ark.intel.com/content/www/es/es/ark/products/123613/intel-core-i97900x-xseries-processor-13-75m-cache-up-to-4-30-ghz.html
		
		//Creamos un Objeto con caracteristicas generales de la cpu
		UnidadCentralProcesamientoCPU procesador01 = 
				new UnidadCentralProcesamientoCPU(
						1,"i9-7900X serie X","Intel","HDJRTY99","3.30 Ghz",4.00
						,10,"13,75 MB L3 Cache");
		

		//https://www.intel.es/content/www/es/es/products/sku/223097/intel-core-i312100t-processor-12m-cache-up-to-4-10-ghz/specifications.html
		
		//Creamos un Objeto con caracteristicas especificas de la cpu, ejemplo la ALU
		//Agregamos los campos cantidad de registros y cantidad de banderas
		//Modificamos el toString de la clase agregando el super.toString(), 
		//traemos los valores de la clase Padre
		UnidadAritmeticaLogicaALU procesador02 = 
				new UnidadAritmeticaLogicaALU(
						2,"i3-12100T Processor","Intel","KJGUIT87","2.20 Ghz",5.00
						,4,"5 MB L2 Cache", 24, 50);
		
		
		
		System.out.println(procesador01);
		System.out.println("\n");
		System.out.println(procesador02);
		
		
		
	}

}
