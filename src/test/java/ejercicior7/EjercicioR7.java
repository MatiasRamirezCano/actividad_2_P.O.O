package ejercicior7;

import java.util.Scanner;

public class EjercicioR7 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese valor A: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese valor B: ");
        double b = entrada.nextDouble();
        
        if (a>b){
            System.out.println("A es mayor que B");
        }
        else if (a==b){
            System.out.println("A es igual B");
        }
        else {
            System.out.println("A es menor que B");
        }
    }
    
}