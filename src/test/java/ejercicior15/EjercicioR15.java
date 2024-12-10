package ejercicior15;

import java.util.Scanner;

public class EjercicioR15 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese peso de la esfera A: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese peso de la esfera B: ");
        double b = entrada.nextDouble();
        System.out.print("Ingrese peso de la esfera C: ");
        double c = entrada.nextDouble();
        System.out.print("Ingrese peso de la esfera D: ");
        double d = entrada.nextDouble();
        
        if (a==b && a==c){
            if (d>a){
                System.out.print("D es la diferente y pesa mas");
            }
            else{
                System.out.print("D es la diferente y pesa menos");
            }
        }
        else if (a==b && a==d){
            if (c>a){
                System.out.print("C es la diferente y pesa mas");
            }
            else{
                System.out.print("C es la diferente y pesa menos");
            }
        }
        else if (a==c && a==d){
            if (b>a){
                System.out.print("B es la diferente y pesa mas");
            }
            else{
                System.out.print("B es la diferente y pesa menos");
            }
        }
        else{
            if (a>b){
                System.out.print("A es la diferente y pesa mas");
            }
            else{
                System.out.print("A es la diferente y pesa menos");
            }
        }
    }
    
}