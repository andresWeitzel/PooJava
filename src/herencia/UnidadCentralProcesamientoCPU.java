package herencia;

public class UnidadCentralProcesamientoCPU {



	//Para que entiendas un poco de arquitectura de computadoras te recomiendo..
	//http://homepage.cem.itesm.mx/garcia.andres/PDF201411/Arquitectura%20Computacional.pdf
	
	
	
	// https://www.pccomponentes.com/procesador-cpu-que-es-caracteristicas-tipos

	long id;
	String codigo;//KILOU8-1112
	String modelo;//Intel® Pentium® G4560
	String fabricante;//Intel, AMD, etc
	String frecuencia;//3.50 Mhz
	String consumo;//54 W
	int nroNucleosFisicos;//2
	String tipoMemoria;//DDR4-2133/2400, DDR3L-1333/1600 @ 1.35V
	
	
	
	public UnidadCentralProcesamientoCPU(long id, String codigo, String modelo, String fabricante, String frecuencia,
			String consumo, int nroNucleosFisicos, String tipoMemoria) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.frecuencia = frecuencia;
		this.consumo = consumo;
		this.nroNucleosFisicos = nroNucleosFisicos;
		this.tipoMemoria = tipoMemoria;
	}
	
	
	

	public UnidadCentralProcesamientoCPU() {
		super();
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getCodigo() {
		return codigo;
	}




	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public String getFabricante() {
		return fabricante;
	}




	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}




	public String getFrecuencia() {
		return frecuencia;
	}




	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}




	public String getConsumo() {
		return consumo;
	}




	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}




	public int getNroNucleosFisicos() {
		return nroNucleosFisicos;
	}




	public void setNroNucleosFisicos(int nroNucleosFisicos) {
		this.nroNucleosFisicos = nroNucleosFisicos;
	}




	public String getTipoMemoria() {
		return tipoMemoria;
	}




	public void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}




	@Override
	public String toString() {
		return "UnidadCentralProcesamientoCPU [id=" + id + ", codigo=" + codigo + ", modelo=" + modelo + ", fabricante="
				+ fabricante + ", frecuencia=" + frecuencia + ", consumo=" + consumo + ", nroNucleosFisicos="
				+ nroNucleosFisicos + ", tipoMemoria=" + tipoMemoria + "]";
	}


	
	
	
	
	
	
	
	

}
