package herencia;

public class UnidadAritmeticaLogicaALU extends UnidadCentralProcesamientoCPU {

	// Si Heredamos las funcionalidades de una clase, podremos utilizar sus metodos
	// ademas de los metodos que declaremos en esta clase

	// APARTE DEL TEMA..QUE ES UNA ALU DE FORMA TANGIBLE??..VARIOS CIRCUITOS
	// ELECTRONICOS(TRANSISTORES)....
	// http://clrueda.docentes.upbbga.edu.co/web_digitales/Tema_3/datasheets_3/SN74LS181.pdf

	// Para que entiendas un poco de arquitectura de computadoras te recomiendo..
	// http://homepage.cem.itesm.mx/garcia.andres/PDF201411/Arquitectura%20Computacional.pdf

	int id;
	int cantidadRegistros;// Es como una tabla donde se guardan bits
	int cantidadBanderas;// Es como otra tabla donde se guardan estados en forma de bits

	
	//IMPORTANTE, AL CREAR EL CONSTRUCTOR DE ESTA CLASE NOTAR QUE REDEFINIMOS
	//EL CONSTRUCTOR DE LA CLASE PADRE, LOS CONSTRUCTORES NO SE HEREDAN.

	public UnidadAritmeticaLogicaALU(int id, String modelo, String fabricante, String codigo, String frecuencia,
			double consumo, int nro_nucleos, String tipo_cache, int id2, int cantidadRegistros, int cantidadBanderas)
	{
		
		super(id, modelo, fabricante, codigo, frecuencia, consumo, nro_nucleos, tipo_cache);
		id = id2;
		
		this.cantidadRegistros = cantidadRegistros;
		this.cantidadBanderas = cantidadBanderas;
		
		
	}

	//Contructor sin id de la clase pero si el id de la clase padre
	public UnidadAritmeticaLogicaALU(int id, String modelo, String fabricante, String codigo, String frecuencia,
			double consumo, int nro_nucleos, String tipo_cache, int cantidadRegistros, int cantidadBanderas) 
	{
		
		super(id, modelo, fabricante, codigo, frecuencia, consumo, nro_nucleos, tipo_cache);
		
		this.cantidadRegistros = cantidadRegistros;
		this.cantidadBanderas = cantidadBanderas;
	}


	
	//Fijate que aplicando constructor vacio de esta clase, tendremos que indicarle
	//los valores de los campos del constructor PADRE
	public UnidadAritmeticaLogicaALU(int id, String modelo, String fabricante, String codigo, String frecuencia,
			double consumo, int nro_nucleos, String tipo_cache) {
		
		super(id, modelo, fabricante, codigo, frecuencia, consumo, nro_nucleos, tipo_cache);
	}

	
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadRegistros() {
		return cantidadRegistros;
	}

	public void setCantidadRegistros(int cantidadRegistros) {
		this.cantidadRegistros = cantidadRegistros;
	}

	public int getCantidadBanderas() {
		return cantidadBanderas;
	}

	public void setCantidadBanderas(int cantidadBanderas) {
		this.cantidadBanderas = cantidadBanderas;
	}

	
	
	
	
	@Override
	public String toString() {
		return super.toString()+" | "+"UnidadAritmeticaLogicaALU [id=" + id + ", cantidadRegistros=" + cantidadRegistros
				+ ", cantidadBanderas=" + cantidadBanderas + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

	}

