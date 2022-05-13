import java.util.Scanner;

public class ControlDeFlujo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Indica tu edad --> ");
        int edad = sc.nextInt();

        if (edad >= 18){
            if (edad >= 50) {
                System.out.println("Eres un anciano");
            }else {
                System.out.println("Aun eres joven");
            }
        } else {
            System.out.println("Eres menor de edad");
        }
        // OPERADOR TERNARIO
        String mensaje = (edad >= 18 ) ? ("Eres mayor de edad") : ("Eres menor de edad");
        System.out.println(mensaje);

        System.out.print("Que dia es --> ");
        sc.nextLine();
        String dia = sc.nextLine();
        sc.close();

        // SWITCH CASE

        switch (dia.toLowerCase()){
            case "lunes":
                System.out.println("5 minutos más");
                break;
            case "martes":
                System.out.println("No te cases ni te embarques");
                break;
            case "miercoles":
                System.out.println("Ombligo de semana");
                break;
            case "jueves":
                System.out.println("Viernes chiquito");
                break;
            case "viernes":
                System.out.println("Chelas");
                break;
            default:
                System.out.println("Dia no es valido");
                break;
        }

    }



}
