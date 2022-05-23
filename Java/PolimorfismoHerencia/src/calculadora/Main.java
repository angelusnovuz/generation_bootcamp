package calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora(5, 8);
        cal.sumar(5, 8);

        Calculadora cal2 = new Calculadora(5,5,10);
        cal2.sumar(5, 5, 10);
    }
}
