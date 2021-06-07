package Ejercicio6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/*Se dispone de una lista de Empleados, de cada empleado se conoce:
 Nombre y Apellido
 DNI
 horasTrabajadas
 valorPorHora
 Todos los empleados están cargados en un Set (HashSet),
 se desea calcular el sueldo (horasTrabajadas x valorPorHora)
 de toda esa lista para luego almacenar en un Map (o Diccionario)
 donde la clave (key) es el dni y el valor (value) es el sueldo calculado.
 */

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<Empleado> listaEmpleados = new HashSet<>();
        Map<String, String> empleadosData = new HashMap<>();

        Empleado emp1 = new Empleado("Juan Vera", "23546842", 47, 400);
        Empleado emp2 = new Empleado("Mirtha Saez","56824318",45,500);
        Empleado emp3 = new Empleado("Martin Vera","76413385",40,450);
        Empleado emp4 = new Empleado("Carla Sanchez","42781538",43,580);

        listaEmpleados.add(emp1);
        listaEmpleados.add(emp2);
        listaEmpleados.add(emp3);
        listaEmpleados.add(emp4);


        empleadosData.put(emp1.getDni(), " $"+emp1.getTotalPagar());
        empleadosData.put(emp2.getDni(), " $"+emp2.getTotalPagar());
        empleadosData.put(emp3.getDni(), " $"+emp3.getTotalPagar());
        empleadosData.put(emp4.getDni(), " $"+emp4.getTotalPagar());
        System.out.println("\n\n***************************************************\n\n");


        System.out.println("Listado de empleados :  ");

        for (Empleado empleado : listaEmpleados) {
            empleado.info();
        }

        System.out.println("\n\n***************************************************\n\n");

        System.out.println("Empleado (DNI) - Sueldo : " + empleadosData);
        System.out.println("\n\n***************************************************\n\n");

        scan.close();


    }









}
