import java.util.Scanner;

/* 
 9.	Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
*/


public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String fra = scan.nextLine();

        System.out.println("Ingrese una letra: ");
        String letra = scan.nextLine();

        scan.close();

        int contador = 0;

        for (int i = 0; i < fra.length(); ++i){

            if ( letra.charAt(0) == fra.charAt(i)) {

                contador += 1;

            }


        }

        System.out.println(contador);
    }
}