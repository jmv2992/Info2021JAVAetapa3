public class Ejercicio1 {
    public static void main(String[] args) {
        String [] ciudades = {"Bariloche", "Córdoba", "Resistencia"};

        for (int i = 1; i < ciudades.length+1; i++ ){
            System.out.println("#"+i+" - "+ciudades[i-1]);
        }
    }
}