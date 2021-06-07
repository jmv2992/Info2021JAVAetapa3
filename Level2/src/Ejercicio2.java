import java.util.ArrayList;
import java.util.List;

/*
    Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
    entero al principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista
    y el tamaño de la misma (antes y después de agregar a en la primera y última posición).
 */

public class Ejercicio2 {

    public static void main(String[] args) {

        List<String> numeros = new ArrayList<>();


        numeros.add("2");
        numeros.add("3");
        numeros.add("3");
        numeros.add("6");
        numeros.add("8");

        System.out.println(" El tamaño que tiene la lista es:  " + numeros.size());

        for (int i = 0; i < numeros.size(); ++i) {

            System.out.println(numeros.get(i));

        }


        numeros.set(0,"5");
        numeros.set(4,"7");

        System.out.println(" El tamaño que tiene la lista es: " + numeros.size());

        for (int i = 0; i < numeros.size(); ++i) {

            System.out.println(numeros.get(i));

        }

    }


}