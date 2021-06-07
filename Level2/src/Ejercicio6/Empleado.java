package Ejercicio6;

public class Empleado {


    private final String nombreApellido;
    private final String dni;
    private final int horasTrabajadas;
    private final double valorHora;

    Empleado(String nombap, String dni, int horasTrabajadas,double valorHora){

        this.nombreApellido = nombap;
        this.dni = dni;
        this.horasTrabajadas= horasTrabajadas;
        this.valorHora=valorHora;




    }


    public void info(){

        System.out.println(this.nombreApellido + " - DNI : "+ this.dni + " - Horas Trabajadas : "+this.horasTrabajadas + " - Valor Hora : " + this.valorHora);

    }

    public double getTotalPagar(){

        return this.horasTrabajadas*this.valorHora;

    }

    public String getDni(){

        return this.dni;
    }

}