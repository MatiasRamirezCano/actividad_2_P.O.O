package ejerciciofiguras;

public class Circulo {
    
    int radio;
    
    Circulo(int radio){
        this.radio = radio;
    }
    
    double calcular_area(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    double calcular_perimetro(){
        return 2 * Math.PI * radio;
    }
}