package interfacesmetodosabstractos;

public class Monitor implements I_Monitor {

	@Override
	public String encender() {
		// TODO Auto-generated method stub
		return "Encendiendo Monitor";
	}

	@Override
	public String apagar() {
		// TODO Auto-generated method stub
		return "Apagando Monitor";
	}

	@Override
	public String bajarVolumen() {
		// TODO Auto-generated method stub
		return "Bajando Volumen";
	}


	@Override
	public String bajarVolumen(String mensaje) {
		// TODO Auto-generated method stub
		return mensaje;
	}

	
	
	@Override
	public String aumentarVolumen() {
		// TODO Auto-generated method stub
		return "Aumentando Volumen";
	}

	@Override
	public String aumentarVolumen(String mensaje) {
		// TODO Auto-generated method stub
		return mensaje;
	}

	@Override
	public String aumentarVolumen(boolean pulsacion) {
		// TODO Auto-generated method stub
		return "Aumentando Volumen : "+pulsacion;
	}

}
