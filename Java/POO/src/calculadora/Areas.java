package calculadora;

public class Areas {

    public void mensaje(){
        System.out.println("Voy a calcular un area");
    }

    public int areaCuadrado(int lado){
        return lado*lado;
    }

    public double areaTriangulo(double base, double altura){
        return (base*altura) / 2;
    }



}
