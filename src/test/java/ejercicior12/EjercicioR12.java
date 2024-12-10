package ejercicior12;

import java.util.Scanner;

public class EjercicioR12 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombre del trabajador: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el numero de horas trabajadas semanales: ");
        double horas_trabajadas = entrada.nextDouble();
        System.out.print("Ingrese el pago por hora de trabajo: ");
        double pago_hora = entrada.nextDouble();
        double salario;
        
        if (horas_trabajadas > 40){
            double horas_extras = horas_trabajadas - 40;
            if (horas_extras > 8){
                double horas_triples = horas_extras - 8;
                salario = (40 * pago_hora) + (16 * pago_hora) + (3 * horas_triples * pago_hora);
            }
            else {
                salario = (40 * pago_hora) + (2 * horas_extras * pago_hora);
            }
        }
        else {
            salario = horas_trabajadas * pago_hora;
        }
        
        System.out.print("El trabajador " + nombre + " debe recibir un salario semanal de " + salario);
    }
    
}