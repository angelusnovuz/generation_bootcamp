package generation.excepciones;

public class Excepciones {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        float division;


        // TRY-CATCH-FINALLY
        try{
            // COdigo que vamos a probar
            division = num1 / num2;
        }catch (ArithmeticException ex){ // la excepcion a probar
            // lo que vamos a realizar cuando se detecte el error
            division = 0.0f;
            System.out.println("Error: " + ex.getMessage());
        } catch (NullPointerException ex){
            division = 0.0f;
            System.out.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("Finalizo el try-catch");
        }
    }
}
