package herencia;

public class UnidadAritmeticaLogicaALU extends UnidadCentralProcesamientoCPU{
	


	//Si heredamos las funcionalidaddes de una clase Padre, podremos utilizar
	//sus metodos que declaremos en esta clase 


	long id;
	int cantidadRegistros;
	int cantidadOperaciones;
	int cantidadCompuertasLogicas;
	
	
	
	public UnidadAritmeticaLogicaALU(long id, String codigo, String modelo, String fabricante, String frecuencia,
			String consumo, int nroNucleosFisicos, String tipoMemoria, long id2, int cantidadRegistros,
			int cantidadOperaciones, int cantidadCompuertasLogicas) {
		super(id, codigo, modelo, fabricante, frecuencia, consumo, nroNucleosFisicos, tipoMemoria);
		id = id2;
		
		this.id = id2;
		this.cantidadRegistros = cantidadRegistros;
		this.cantidadOperaciones = cantidadOperaciones;
		this.cantidadCompuertasLogicas = cantidadCompuertasLogicas;
	}
	
	
	
	

	public UnidadAritmeticaLogicaALU(long id, String codigo, String modelo, String fabricante, String frecuencia,
			String consumo, int nroNucleosFisicos, String tipoMemoria, int cantidadRegistros, int cantidadOperaciones,
			int cantidadCompuertasLogicas) {
		super(id, codigo, modelo, fabricante, frecuencia, consumo, nroNucleosFisicos, tipoMemoria);
		this.cantidadRegistros = cantidadRegistros;
		this.cantidadOperaciones = cantidadOperaciones;
		this.cantidadCompuertasLogicas = cantidadCompuertasLogicas;
	}
	
	

	public UnidadAritmeticaLogicaALU(long id, String codigo, String modelo, String fabricante, String frecuencia,
			String consumo, int nroNucleosFisicos, String tipoMemoria) {
		
		
		super(id, codigo, modelo, fabricante, frecuencia, consumo, nroNucleosFisicos, tipoMemoria);
	}





	public long getId() {
		return id;
	}





	public void setId(long id) {
		this.id = id;
	}





	public int getCantidadRegistros() {
		return cantidadRegistros;
	}





	public void setCantidadRegistros(int cantidadRegistros) {
		this.cantidadRegistros = cantidadRegistros;
	}





	public int getCantidadOperaciones() {
		return cantidadOperaciones;
	}





	public void setCantidadOperaciones(int cantidadOperaciones) {
		this.cantidadOperaciones = cantidadOperaciones;
	}





	public int getCantidadCompuertasLogicas() {
		return cantidadCompuertasLogicas;
	}





	public void setCantidadCompuertasLogicas(int cantidadCompuertasLogicas) {
		this.cantidadCompuertasLogicas = cantidadCompuertasLogicas;
	}





	@Override
	public String toString() {
		return "UnidadAritmeticaLogicaALU [id=" + id + ", cantidadRegistros=" + cantidadRegistros
				+ ", cantidadOperaciones=" + cantidadOperaciones + ", cantidadCompuertasLogicas="
				+ cantidadCompuertasLogicas + "]";
	}

	



	
	


	

	}

