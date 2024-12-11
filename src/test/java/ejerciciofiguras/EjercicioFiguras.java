package ejerciciofiguras;

public class EjercicioFiguras {
    
    public static void main(String[] args){
        
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        
        System.out.println("El area del circulo es = " + figura1.calcular_area());
        System.out.println("El perimetro del circulo es = " + figura1.calcular_perimetro());
        System.out.println("El area del rectangulo es = " + figura2.calcular_area());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcular_perimetro());
        System.out.println("El area del cuadrado es = " + figura3.calcular_area());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcular_perimetro());
        System.out.println("El area del triangulo es = " + figura4.calcular_area());
        System.out.println("El perimetro del triangulo es = " + figura4.calcular_perimetro());
        figura4.determinar_tipo();
      
    }
}