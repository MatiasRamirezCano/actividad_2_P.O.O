package ejercicior11;

import java.util.Scanner;

public class EjercicioR11 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese valor A: ");
        int a = entrada.nextInt();
        System.out.print("Ingrese valor B: ");
        int b = entrada.nextInt();
        System.out.print("Ingrese valor C: ");
        int c = entrada.nextInt();
        int mayor;
        
        if (a>b && a>c){
            mayor = a;
        }
        else if (b>c){
            mayor = b;
        }
        else {
            mayor = c;
        }
        
        System.out.print("El mayor valor entre " + a + ", " + b + ", " + c + " es " + mayor);
    }
    
}