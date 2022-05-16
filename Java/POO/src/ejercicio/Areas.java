package ejercicio;

public class Areas {

    public double areaTriangulo(double base, double altura){
        return (base*altura) / 2;
    }

    public double areaCuadrado(double lado){
        return lado*lado;
    }

    public double areaCirculo(double radio){
        return Math.PI * (radio*radio);
    }

}
