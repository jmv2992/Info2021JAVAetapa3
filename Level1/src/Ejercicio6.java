

import java.util.Scanner;

/*
6.	Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).
*/

public class Ejercicio6 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int potencia = 1;


        System.out.println("Ingresar primer número entero : ");

        int a = scan.nextInt();

        System.out.println("Ingresar segundo número entero : ");
        int b = scan.nextInt();



        for (int i = 0; i < b ; i++) {
            potencia= potencia*a;
        }
        System.out.println("Potencia : " + potencia );
        scan.close();

    }
}