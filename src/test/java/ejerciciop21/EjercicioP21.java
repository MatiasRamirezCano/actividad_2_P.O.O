package ejerciciop21;

import java.util.Scanner;

public class EjercicioP21 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese lado a del triangulo: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese lado b del triangulo: ");
        double b = entrada.nextDouble();
        System.out.print("Ingrese lado c del triangulo: ");
        double c = entrada.nextDouble();
        
        double perimetro = Triangulo.calcular_perimetro(a, b, c);
        double semiperimetro = Triangulo.calcular_semiperimetro(a, b, c);
        double area = Triangulo.calcular_area(a, b, c);
        
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Semiperimetro: " + semiperimetro);
        System.out.println("Area: " + area);
    }
    
}