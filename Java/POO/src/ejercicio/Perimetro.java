package ejercicio;

public class Perimetro {
    public double perimetroCuadrado(double lado){
        return lado*4;
    }

    public double perimetroTriangulo(double l1, double l2, double l3){
        return l1+l2+l3;
    }

    public double perimetroCirculo(double perimetro){
        return Math.PI * perimetro;
    }

}
