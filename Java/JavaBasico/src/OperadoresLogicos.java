import java.util.Objects;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // COMETARIOS

        // *De una sola linea
        /* *Varias lineas */


        // OPERADORES DE ASIGNACIÓN
        int num = 12;
        num = 45;
        num = Integer.parseInt("4");
        System.out.println(num);


        //OPERADORES DE COMPARACIÓN
        int num1, num2;
        num1 = 10;
        num2 = 20;

        System.out.println("num 1: " + num1);
        System.out.println("num 2: " + num2);

        // ==
        System.out.println(num1 == num2);

        // .equals()
        System.out.println(Objects.equals(num1, num2));

        // <, >, <=, >=
        int num3, num4;
        num3 = 15;
        num4 = 20;

        System.out.println(num3 < num4);
        System.out.println(num3 > num4);
        System.out.println(num3 <= num4);
        System.out.println(num3 >= num4);

        if (num3 < num4) {
            System.out.println("Numero 3 es menor");
        } else {
            System.out.println("Numero 3 es mayor");
        }

        // !=
        System.out.println(num3 != num4);
        boolean comparacion = num3 != num4;
        System.out.println(comparacion);

        // OPERADORES LOGICOS (AND, OR, NOT)
        // AND &&
        // OR  ||
        // NOT  !

        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(!true && true);
        System.out.println(!(true && true));





    }
}
