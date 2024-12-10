package ejerciciop22;

import java.util.Scanner;

public class EjercicioP22 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombre del empleado: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese salario por hora: ");
        double pago_hora = entrada.nextDouble();
        System.out.print("Ingrese numero de horas trabajadas al mes: ");
        double horas_trabajadas = entrada.nextDouble();
        
        double salario_mensual = pago_hora * horas_trabajadas;
        
        if (salario_mensual > 450000){
            System.out.println("Nombre: " + nombre);
            System.out.println("Salario: " + salario_mensual);
        }
        else{
            System.out.println("Nombre: " + nombre);
        }

    }
}