import java.util.Scanner;

/*Crear una aplicación que solicite de entrada los datos de una persona en este orden: Nombre y Apellido Edad Dirección
 Ciudad Luego imprimirá el siguiente mensaje: {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nombre y Apellido: ");
        String nomApell = scan.nextLine();

        System.out.println("Edad: ");
        String edad = scan.nextLine();

        System.out.println("Dirección: ");
        String direccion = scan.nextLine();


        System.out.println("Ciudad: ");
        String ciudad = scan.nextLine();


        System.out.print(ciudad + " - " + direccion + " - "+ edad + " - " + nomApell);
        scan.close();


    }
}