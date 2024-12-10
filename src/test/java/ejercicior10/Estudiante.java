package ejercicior10;

public class Estudiante {
    
    int numero_inscripcion;
    String nombre;
    double patrimonio;
    int estrato;
    double pago_matricula;
    
    public Estudiante(int numero_inscripcion, String nombre, double patrimonio, int estrato){
        
        this.numero_inscripcion = numero_inscripcion;
        this.nombre = nombre;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
        pago_matricula = 50000;
        
    }
    
    public void calcular_pago_matricula(double patrimonio, int estrato){
        if (patrimonio>2000000 && estrato>3){
            pago_matricula = pago_matricula + (0.03 * pago_matricula);
        }
    }
    
}