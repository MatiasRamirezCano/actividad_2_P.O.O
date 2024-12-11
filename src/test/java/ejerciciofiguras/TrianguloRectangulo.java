package ejerciciofiguras;

public class TrianguloRectangulo {
    
    int base;
    int altura;
    
    TrianguloRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    double calcular_area(){
        return base * altura / 2;
    }
    
    double calcular_hipotenusa(){
        return Math.pow(base * base + altura * altura, 0.5);
    }
    
    double calcular_perimetro(){
        return base + altura + calcular_hipotenusa();
    }
    
    void determinar_tipo(){
        if (base==altura && base==calcular_hipotenusa() && altura==calcular_hipotenusa()){
            System.out.println("Es un triangulo equilatero");
        }
        else if (base!=altura && base!=calcular_hipotenusa() && altura!=calcular_hipotenusa()){
            System.out.println("Es un triangulo escaleno");
        }
        else{
            System.out.println("Es un triangulo isoceles");
        }
    }
}