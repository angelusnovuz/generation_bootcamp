import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner1 = new Scanner(System.in);
        System.out.println("Escribe tu estatura en m -->");
        Scanner escaner2 = new Scanner(System.in);
        System.out.println("Escribe tu peso en kg -->");
        float estatura = escaner1.nextFloat();
        float peso = escaner2.nextFloat();

        float imc = peso / (estatura * estatura);
        System.out.println(imc);

        if (imc > 18.25 && imc < 25){
            System.out.println("Your weigh ratio is good");
        } else {
            System.out.println("Your health is not good" );
        }

    }
}
