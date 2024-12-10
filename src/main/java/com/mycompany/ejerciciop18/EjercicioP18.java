package com.mycompany.ejerciciop18;

public class EjercicioP18 {

    public static void main(String[] args) {
        
        int codigo_empleado = 12345;
        String nombre_empleado = "Juanito de la cruz";
        double horas_trabajadas_mes = 160;
        double valor_hora_trabajada = 20000;
        double porcentaje_retencion_fuente = 0.2;
        
        double salario_bruto = horas_trabajadas_mes * valor_hora_trabajada;
        double salario_neto = salario_bruto - (salario_bruto * porcentaje_retencion_fuente);
        
        System.out.println("Codigo: " + codigo_empleado);
        System.out.println("Nombre: " + nombre_empleado);
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("Salario neto: " + salario_neto);

    }
}