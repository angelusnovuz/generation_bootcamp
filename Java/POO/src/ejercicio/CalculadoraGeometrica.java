package ejercicio;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        System.out.println("***************************Calcular perimetros******************************");

        Perimetro perimetro = new Perimetro();
        double triangulo = perimetro.perimetroTriangulo(10,10,5);
        System.out.println("Perimetro triangulo --> " + triangulo);
        double cuadrado = perimetro.perimetroCuadrado(10);
        System.out.println("Perimetro cuadrado --> " +cuadrado);
        double circulo = perimetro.perimetroCirculo(5);
        System.out.println("Perimetro circulo --> " + circulo);

        System.out.println("*************************Calcular areas**************************************");

        Areas area = new Areas();
        double triangulo_ = area.areaTriangulo(10, 5);
        System.out.println("Area triangulo --> " + triangulo_);
        double cuadrado_ = area.areaCuadrado(5);
        System.out.println("Area cuadrado --> " + cuadrado_);
        double circulo_ = area.areaCirculo(5);
        System.out.println("Area circulo --> " + circulo_);

    }
}
