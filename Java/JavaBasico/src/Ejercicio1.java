import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu califiación --> ");
        int calificacion = sc.nextInt();

        switch (calificacion) {
            case 1, 2:
                System.out.println("Failed");
                break;
            case 3, 4, 5:
                System.out.println("Insufficient");
                break;
            case 6, 7, 8, 9:
                System.out.println("Good!");
                break;
            case 10:
                System.out.println("Excellent!");
                break;
            default:
                System.out.println("Grade outside range supported!");
        }
    }
}
