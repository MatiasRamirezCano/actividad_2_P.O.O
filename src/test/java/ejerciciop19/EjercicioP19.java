package ejerciciop19;
  
import java.util.Scanner;

public class EjercicioP19 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese lado del triangulo equilatero: ");
        double lado = entrada.nextDouble();
        
        double perimetro = 3 * lado;
        double altura = lado * Math.sqrt(3) / 2;
        double area = Math.pow(lado, 2) * Math.sqrt(3) / 4;
        
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area);
      
    }
}