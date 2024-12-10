package ejerciciop24;

import java.util.Scanner;

public class EjercicioP24 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese peso de la esfera A: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese peso de la esfera B: ");
        double b = entrada.nextDouble();
        System.out.print("Ingrese peso de la esfera C: ");
        double c = entrada.nextDouble();
        
        if (a>b && a>c){
            System.out.print("A es la mas pesada");
        }
        else if (b>a && b>c){
            System.out.print("B es la mas pesada");
        }
        else{
            System.out.print("C es la mas pesada");
        }
    }
}