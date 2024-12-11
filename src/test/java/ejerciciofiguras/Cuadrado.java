package ejerciciofiguras;

public class Cuadrado {
     
    int lado;
    
    Cuadrado(int lado){
        this.lado = lado;
    }
    
    double calcular_area(){
        return lado * lado;
    }
    
    double calcular_perimetro(){
        return 4 * lado;
    }
}