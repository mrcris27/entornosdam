/**
*
* Hola mundo java
* 
* Autor: Cristina
* Fecha: 05/02/2025
* 
*/
import java.time.LocalDateTime;
public class Principal{
	public static void main(String[] args){
		System.out.println("Hola Mundo!!");
		mostrarFechahora();
	}


	public static void mostrarFechahora() {
        System.out.println("Fecha y hora actual: " + LocalDateTime.now());
    }
}