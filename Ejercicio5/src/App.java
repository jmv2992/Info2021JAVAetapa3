import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class App {
    private static final List<Empleado> empleados = new ArrayList<>();
    public static void main(String[] args) {
        /*Registro .txt a objetos.*/
        RegistrarEmpleados();

        /*Empleados que comienzan con una letra en especifico.*/
        char buscar = 'A';
        System.out.println("Los empleados cuyo apellido comienza con " + buscar + " son: " + BuscarApellido(buscar));

        /*Empleados más joven*/
        System.out.println("Empleado/s más jovenes : " + getMenorEdadEmpleados("14-06-2021"));

        /*Empleados más viejo*/
        System.out.println("Empleado/s más viejos : " + getMayorEdadEmpleados("14-06-2021"));

        /*Empleados que más gana*/
        System.out.println("Empleado/s que más ganan : " + getMayorSalarioEmpleados());

        /*Empleados que menos gana*/
        System.out.println("Empleado/s que menos ganan : " + getMenorSalarioEmpleados());

        /*Imprimir en orden alfabetico*/
        SetOrdenarApellido();
        SetOrdenarNombre();


    }

    public static void SetOrdenarApellido(){
        empleados.sort(Comparator.comparing(Empleado::getApellido));
        System.out.println(empleados);
    }

    public static void SetOrdenarNombre(){
        empleados.sort(Comparator.comparing(Empleado::getNombre));
        System.out.println(empleados);
    }

    public static void RegistrarEmpleados(){
        String path = "/Users/Vera/IdeaProjects/Ejercicio5/src/Empleados.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line =  br.readLine();
            while ( line != null ){
                InstanciarEmpleado(line);
                line = br.readLine();
            }
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }

    public static void InstanciarEmpleado(String linea){
        if (linea != null){
            linea = linea.toUpperCase();
            String[] datos = linea.split(",");
            Empleado e = new Empleado(datos[0], datos[1], datos[2], datos[3]);
            empleados.add(e);
        }
    }

    public static List<Empleado> BuscarApellido(char inicial){
        List<Empleado> encontrados = new ArrayList<>();
        for (Empleado e: empleados){
            if (e.getApellido().charAt(0) == Character.toUpperCase(inicial)){
                encontrados.add(e);
            }
        }
        return encontrados;
    }

    public static double getMayorSueldo(){
        double mayor_sueldo = empleados.get(0).getSueldo();
        for (Empleado e: empleados){
            if (e.getSueldo() > mayor_sueldo){
                mayor_sueldo = e.getSueldo();
            }
        }
        return mayor_sueldo;
    }

    public static double getMenorSueldo(){
        double menor_sueldo = empleados.get(0).getSueldo();
        for (Empleado e: empleados){
            if (e.getSueldo() < menor_sueldo){
                menor_sueldo = e.getSueldo();
            }
        }
        return menor_sueldo;
    }

    public static int getMayorEdad(String fecha){
        int mayor_edad = empleados.get(0).getEdad(fecha);
        for (Empleado e: empleados){
            if (e.getEdad(fecha) > mayor_edad){
                mayor_edad = e.getEdad(fecha);
            }
        }
        return mayor_edad;
    }

    public static int getMenorEdad(String fecha){
        int menor_edad = empleados.get(0).getEdad(fecha);
        for (Empleado e: empleados){
            if (e.getEdad(fecha) < menor_edad){
                menor_edad = e.getEdad(fecha);
            }
        }
        return menor_edad;
    }

    public static List<Empleado> getMenorSalarioEmpleados(){
        List<Empleado> seleccion = new ArrayList<>();
        double menor_salario = getMenorSueldo();
        for (Empleado e: empleados){
            if (e.getSueldo() == menor_salario){
                seleccion.add(e);
            }
        }
        return seleccion;
    }

    public static List<Empleado> getMayorSalarioEmpleados(){
        List<Empleado> seleccion = new ArrayList<>();
        double mayor_salario = getMayorSueldo();
        for (Empleado e: empleados){
            if (e.getSueldo() == mayor_salario){
                seleccion.add(e);
            }
        }
        return seleccion;
    }

    public static List<Empleado> getMenorEdadEmpleados(String Fecha){
        List<Empleado> seleccion = new ArrayList<>();
        double menor_edad = getMenorEdad(Fecha);
        for (Empleado e: empleados){
            if (e.getEdad(Fecha) == menor_edad){
                seleccion.add(e);
            }
        }
        return seleccion;
    }

    public static List<Empleado> getMayorEdadEmpleados(String fecha){
        List<Empleado> empleados_mayor_edad = new ArrayList<>();
        double mayor_edad = getMayorEdad(fecha);
        for (Empleado e: empleados){
            if (e.getEdad(fecha) == mayor_edad){
                empleados_mayor_edad.add(e);
            }
        }
        return empleados_mayor_edad;
    }
}