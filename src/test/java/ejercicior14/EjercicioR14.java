package ejercicior14;

import java.util.Scanner;

public class EjercicioR14 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese ventas del departamento 1: ");
        double ventas_d1 = entrada.nextDouble();
        System.out.print("Ingrese ventas del departamento 2: ");
        double ventas_d2 = entrada.nextDouble();
        System.out.print("Ingrese ventas del departamento 3: ");
        double ventas_d3 = entrada.nextDouble();
        System.out.print("Ingrese el salario de las tres nominas: ");
        double salario_general = entrada.nextDouble();
        double salario_d1 = salario_general;
        double salario_d2 = salario_general;
        double salario_d3 = salario_general;
        
        double total_ventas = ventas_d1 + ventas_d2 + ventas_d3;
        double porcentaje_objetivo = total_ventas / 100 * 33;
        
        if (ventas_d1 > porcentaje_objetivo){
            salario_d1 = salario_general + (0.2 * salario_general);
        }
        if (ventas_d2 > porcentaje_objetivo){
            salario_d2 = salario_general + (0.2 * salario_general);
        }
        if (ventas_d3 > porcentaje_objetivo){
            salario_d3 = salario_general + (0.2 * salario_general);
        }
        
        System.out.println("Salario departamento 1: " + salario_d1);
        System.out.println("Salario departamento 2: " + salario_d2);
        System.out.println("Salario departamento 3: " + salario_d3);
        
    }
    
}