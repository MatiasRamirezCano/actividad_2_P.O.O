package ejerciciop23;

import java.util.Scanner;

public class EjercicioP23 {
    
    public static void main(String[] args){
        // AX^2 + BX + C = 0 
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese parametro A: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese parametro B: ");
        double b = entrada.nextDouble();
        System.out.print("Ingrese parametro C: ");
        double c = entrada.nextDouble();
        
        double discriminante = Math.pow(b, 2) - (4 * a * c);
        
        if (discriminante > 0){
            double solucion1 = ((-1) * b + Math.sqrt(discriminante)) / (2 * a);
            double solucion2 = ((-1) * b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Solucion 1: " + solucion1);
            System.out.println("Solucion 2: " + solucion2);
        }
        else if (discriminante == 0){
            double solucion = ((-1) * b) / (2 * a);
            System.out.println("Solucion: " + solucion);
        }
        else{
            System.out.println("No hay soluciones reales");
        }
    }
}