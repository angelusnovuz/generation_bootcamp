package calculadora;

public class Calculadora {

    //ATRIBUTOS
    private int a, b, c, resultado;

    //CONSTRUCTOR
    public Calculadora(int a, int b){
        this.a = a;
        this.b = b;
    }

    // OVERLOADING
    public Calculadora(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //METODOS
    public void sumar(int a, int b){
        resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public void sumar(int a, int b, int c){
        resultado = a + b + c;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
