/**
*
* Hola mundo java
* 
* Autor: Cristina
* Fecha: 05/02/2025
* 
*/
import java.util.Scanner;
import java.time.LocalDateTime;
public class Principal {
  public static void main(String[] args) {

    System.out.println("Hola Mundo!!");
    mostrarFechahora();

    Usuario[] usuarios = crearUsuarios();
    System.out.println("\n Usuarios introducidos: ");
    for (int i = 0; i < usuarios.length; i++) {
      System.out.println(usuarios[i].nombre + " " + usuarios[i].apellidos + " - " + usuarios[i].email);
    }

  }

  public static void mostrarFechahora() {
    System.out.println("Fecha y hora actual: " + LocalDateTime.now());
  }

  public static Usuario[] crearUsuarios() {
    Scanner kb = new Scanner(System.in);

    System.out.print("Introduzca el número de usuarios: ");
    int num = kb.nextInt();
    kb.nextLine();

    Usuarios[] usuarios = new Usuario[num];

    for (int i = 0; i < num; i++) {
      System.out.println("Datos del usuario " + (i + 1) + ":");
      System.out.print("Nombre: ");
      usuarios[i].nombre = kb.nextLine();
      System.out.print("Apellidos: ");
      usuarios[i].apellidos = kb.nextLine();
      System.out.print("Email: ");
      usuarios[i].email = kb.nextLine();
    }
    kb.close();
    return usuarios;

  }

}