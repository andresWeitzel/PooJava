package herencia;

public class TestProcesadores{

	
	public static void main(String[] args) {
		
		UnidadCentralProcesamientoCPU cpu = new UnidadCentralProcesamientoCPU(
				1, "KILOU8-1112", "i9-7900x serie x","Intel","4.00 Mhz","54 W"
				,4,"DDR4L 2.35V" 
				);
		
		UnidadAritmeticaLogicaALU alu = new UnidadAritmeticaLogicaALU(
				2, "KASDJHAJ-22", "i3-12100T Processor","Intel","3.70 Mhz"
				,"64 W",2,"DDR3L-1333/1600 @ 1.35V", 1 ,1000, 20000, 2000
				);
		
		
		
		
		
		
		System.out.println(cpu);
		System.out.println(alu);
		
	}

	

}
