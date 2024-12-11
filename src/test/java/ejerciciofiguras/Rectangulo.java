package ejerciciofiguras;

public class Rectangulo {
    
    int base;
    int altura;
    
    Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    double calcular_area(){
        return base * altura;
    }
    
    double calcular_perimetro(){
        return 2 * base + 2 * altura; 
    }
}