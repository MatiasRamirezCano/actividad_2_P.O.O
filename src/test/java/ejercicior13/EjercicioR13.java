package ejercicior13;

import java.util.Scanner;

public class EjercicioR13 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese valor de la compra: ");
        double valor_compra = entrada.nextDouble();
        System.out.print("Ingrese color de la bolita (BLANCO, VERDE, AMARILO, AZUL, ROJO): ");
        String color = entrada.next();
        double porcentaje_descuento;
        double total_pago;
        
        if (color.equals("BLANCO")){
            porcentaje_descuento = 0;
        }
        else if (color.equals("VERDE")){
            porcentaje_descuento = 10;
        }
        else if (color.equals("AMARILLO")){
            porcentaje_descuento = 25;
        }
        else if (color.equals("AZUL")){
            porcentaje_descuento = 50;           
        }
        else {
            porcentaje_descuento = 100;
        }
        
        total_pago = valor_compra - (valor_compra / 100 * porcentaje_descuento);
        
        System.out.print("El cliente debe pagar: " + total_pago);
        
    }
    
}