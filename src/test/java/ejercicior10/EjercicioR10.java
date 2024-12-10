package ejercicior10;

import java.util.Scanner;

public class EjercicioR10 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese numero de inscripcion del estudiante: ");
        int id = entrada.nextInt();
        entrada.nextLine(); //para eliminar la newline
        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese patrimonio del estudiante: ");
        double patrimonio = entrada.nextDouble();
        System.out.print("Ingrese estrato del estudiante: ");
        int estrato = entrada.nextInt();
        
        Estudiante estudiante = new Estudiante(id, nombre, patrimonio, estrato);
        estudiante.calcular_pago_matricula(patrimonio, estrato);
        
        System.out.print("El estudiante " + nombre + " con numero de inscripcion " + id + " debe pagar " + estudiante.pago_matricula);
    }
}