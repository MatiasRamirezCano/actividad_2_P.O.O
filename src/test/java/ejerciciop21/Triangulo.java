package ejerciciop21;

public class Triangulo {
    
    public static double calcular_perimetro(double a, double b, double c){
        double perimetro = a+b+c;
        return perimetro;
    }
    
    public static double calcular_semiperimetro(double a, double b, double c){
        double semiperimetro = (a+b+c)/2;
        return semiperimetro;
    }
    
    public static double calcular_area(double a, double b, double c){
        //fórmula de Herón
        double s = calcular_semiperimetro(a,b,c);
        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        return area;
    }
    
}