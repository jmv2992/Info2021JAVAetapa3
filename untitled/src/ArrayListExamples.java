import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {

        //Inicializar ArrayLists (Ejemplo de Constructores)
        List<Integer> dnis = new ArrayList<Integer>(); //versión tradicional
        List<String> nombres = new ArrayList<>(); //versión abreviada

        // Operaciones de Inserción
        dnis.add(123456789);
        dnis.add(987654321);

        nombres.add("Sr. Calamardo");
        nombres.add("Bob Esponja");
        nombres.add("Patricio");

        System.out.println("Elementos en la Lista dnis: " + dnis.size());
        System.out.println("Elementos en la Lista nombres: " + nombres.size());
        System.out.println(dnis.size() == nombres.size());  //Preguntamos si ambas listas tienen la misma cantidad de elementos

        //Operaciones de Acceso
        System.out.println("Elemento " + 1 + " de la Lista dni: " + dnis.get(1));
        System.out.println("Elemento " + (nombres.size() -1)
                + " de la Lista nombres: " + nombres.get(nombres.size() -1)); //acceder al último elemento

        //Operaciones de Eliminar
        nombres.remove("Patricio");
        System.out.println("Elementos en la Lista: " + nombres.size()); //Comparar el tamaño luego de remover
    }}
