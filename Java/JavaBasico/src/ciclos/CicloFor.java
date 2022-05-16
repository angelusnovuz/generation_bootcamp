package ciclos;

public class CicloFor {
    public static void main(String[] args) {

        // FOR CON AUMENTO
        for (int  i=0; i<5; i++){
            System.out.println("Hola "+ i);
        }

        // FOR CON DECREMENTO
        for (int  i=5; i>5; i--){
            System.out.println("Hola "+ i);
        }

        for (int i=0; i<20; i+=2){
            System.out.println("Hola "+ i);
        }

        // CONTINUE & BREAK
        for (int  i=0; i<10; i++){
            if(i % 2 == 1){
                continue; //Salar la iteracion
//                break; // Detiene la el ciclo
            }
            System.out.println(i);
        }

    }
}
