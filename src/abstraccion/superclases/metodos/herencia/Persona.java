package abstraccion.superclases.metodos.herencia;

public class Persona extends Cosa{

	//Si heredamos de una class abstract implementamos sus abstractos
	//IMPORTANTE--> EL METODO SOBREESCRITO AHORA YA NO ES ABSTRACTO, SINO CONVENCIONAL...
	//GRACIAS A ESTA CONVERSION AUTOMATICA ES QUE MODELAMOS UN PSEUDO COMPARTAMIENTO
	//POLIMORFICO....SI QUEREMOS TRABAJAR AHORA ESTA FUNCION COMO ABSTRACT LA CLASE
	//PASARA A SERLA TAMBIEN
	@Override
	public void accion(String accion, int cantidad) {
		System.out.println("Esta Cosa Ahora es una Persona, la acción que realiza es "
				+accion+" un número de "+cantidad+" veces!");
		
	}

}
