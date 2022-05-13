public class OperadoresAritmeticos {
    public static void main(String[] args) {

        // SUMA
        int suma = 25 + 2000;
        // RESTA
        int resta = 2000 - 50;
        //MULTIPLICACION
        int mult = 50 * 50;
        //DIVISIÓN
        float div = 10/3f; //debemos especificar f para que el resultado se decimal
        //MODULO
        int modulo = 4%2;



        int numero = 10;

        //INCREMENTO
        numero++;
        ++numero;
        numero += 2;

        //DECREMENTO
        numero --;
        --numero;
        numero -= 2;

        numero *= 5;

        numero = (int) ((float) numero / 5f);


        System.out.println(suma);
        System.out.println(resta);
        System.out.println(mult);
        System.out.println(div);


    }
}
