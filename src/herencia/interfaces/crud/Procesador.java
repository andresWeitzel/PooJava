package herencia.interfaces.crud;

public class Procesador {
	
//https://www.pccomponentes.com/procesador-cpu-que-es-caracteristicas-tipos
	int id;
	String modelo;//Intel Celeron 550 j
	String fabricante;//Intel,amd,etc
	String codigo;//hj56yyyt7
	String frecuencia;//Mhz Ghz
	double consumo;//W
	int nro_nucleos;
	String tipo_cache;//L1,L2,L3
	
	
	
	public Procesador(int id,String modelo, String fabricante, String codigo, String frecuencia, double consumo,
			int nro_nucleos, String tipo_cache) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.codigo = codigo;
		this.frecuencia = frecuencia;
		this.consumo = consumo;
		this.nro_nucleos = nro_nucleos;
		this.tipo_cache = tipo_cache;
	}



	public Procesador(String modelo, String fabricante, String codigo, String frecuencia, double consumo,
			int nro_nucleos, String tipo_cache) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.codigo = codigo;
		this.frecuencia = frecuencia;
		this.consumo = consumo;
		this.nro_nucleos = nro_nucleos;
		this.tipo_cache = tipo_cache;
	}



	public Procesador() {
		super();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getFrecuencia() {
		return frecuencia;
	}



	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}



	public double getConsumo() {
		return consumo;
	}



	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}



	public int getNro_nucleos() {
		return nro_nucleos;
	}



	public void setNro_nucleos(int nro_nucleos) {
		this.nro_nucleos = nro_nucleos;
	}



	public String getTipo_cache() {
		return tipo_cache;
	}



	public void setTipo_cache(String tipo_cache) {
		this.tipo_cache = tipo_cache;
	}



	@Override
	public String toString() {
		return "Procesador [id=" + id + ", modelo=" + modelo + ", fabricante=" + fabricante + ", codigo=" + codigo
				+ ", frecuencia=" + frecuencia + ", consumo=" + consumo + ", nro_nucleos=" + nro_nucleos
				+ ", tipo_cache=" + tipo_cache + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
