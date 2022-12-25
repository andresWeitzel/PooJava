package testing.junit.intro;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




/*Para el uso de Junit en java Ant que Maven es mas engorroso la config.
 * 
 * 
 * ==== CONFIG JUNIT ===
 * 1)NO ES NECESARIO DESCARGAR NINGUN JAR MANUALMENTE PARA EL USO DE JUNIT EN ECLIPSE
 * 
 * === CREACION CLASE TEST ===
 * 1)Nueva Clase de Prueba
 * -->Click Der sobre el proyecto
 * -->New, JUnit Test Case
 * -->Seleccionamos NEW JUnit 4 TEST
 * -->Escribimos un nombre a nuestra clase Test (TestPersona)
 * -->Finish
 * -->Nos preguntara si deseamos declarar junit4 en el classpath, eclipse configura todo
 * -->Visualizar el paquete JUnit 4 con su clase importado en el proyecto
 * 
 * 
 * === ACLARACIONES IMPORTANTES ===
 * -Puede parecer engorroso el uso de testing al principio, pero en cuanto tengamos
 * mas cantidad de codigo uno se va dando cuenta de la importancia del mismo, ademas
 * ponerse a pensar que una clase "POJO TEST" tiene limitaciones en cuanto a escalabilidad
 * y veces que se puede "testear" dichos objetos....acordate los CRUDS...si creamos o 
 * eliminamos mismos objetos surgirá un error... y si en un futuro se cambian funciones
 * y campos de una clase??ya no sirve dicho POJO. JUNIT ES CLAVE
 * 
 * Ahora las clases "POJO TEST" que usabamos se pasaran a llamar "MOCK" con testing y las
 * vamos a trabajar de una forma similar
 * 
 * 
 * 
 * 
 *   */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
	
	long id;
	String nombre;
	String apellido;
	int edad;
	LocalDate fechaIngreso;
	
	
	//VAMOS A TESTEAR LOS GETTERS Y SETTERS
	
}
