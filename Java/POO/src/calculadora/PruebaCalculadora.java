package calculadora;

public class PruebaCalculadora {
    public static void main(String[] args) {
        System.out.println("Vamos a calcular");

        // Instanciar - Crear un objeto a partir de una clase
        Calculadora prueba = new Calculadora();

        //Metodos
        System.out.println(prueba.mensaje());
        prueba.sumarMensaje();

        prueba.sumaVoid(5, 10);

        int suma = prueba.sumar(5, 6);
        System.out.print(suma);

        //INSTANCIAR
        Areas area = new Areas();

        int cuadrado = area.areaCuadrado(50);
        System.out.println(cuadrado);

        double triangulo = area.areaTriangulo(50, 50);
        System.out.println(triangulo);

    }
}
