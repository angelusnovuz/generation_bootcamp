import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de la operacion a realizar: ");
        System.out.println("------------------------------------------------------------");
        System.out.println("| 1) Suma | 2) Resta | 3) Multiplicacion | 4) Division |");

        int operacion = sc.nextInt();

        System.out.print("Dame un numero -->");
        float a = sc.nextFloat();
        System.out.print("Dame otro numero -->");
        float b = sc.nextFloat();
        sc.close();

        switch (operacion) {
            case 1:
                System.out.println("Elegiste una suma");
                System.out.println("y la suma es --> " + (a+b));
                break;
            case 2:
                System.out.println("Elegiste una resta");
                System.out.println("y la resta es --> " + (a-b));
                break;
            case 3:
                System.out.println("Elegiste una multiplicacion");
                System.out.println("y la multiplicacion es --> " + (a*b));
                break;
            case 4:
                if (b != 0){
                    System.out.println("Elegiste una division");
                    System.out.println("y la division es --> " + (a/b));
                }else {
                    System.out.println("Divisor no valido");
                }

                break;
            default:
                System.out.println("Operacion no valida");
        }
    }
}
