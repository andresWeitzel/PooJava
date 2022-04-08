package polimorfismo.clases.generics;

public class Animal {
	

	String reino;
	String grupo;
	
	public Animal(String reino, String grupo) {
		super();
		this.reino = reino;
		this.grupo = grupo;
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Animal [reino=" + reino + ", grupo=" + grupo + "]";
	}
	
	
	

}
