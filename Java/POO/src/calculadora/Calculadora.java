package calculadora;

public class Calculadora {

    //Metodo que no regresa nada --> VOID
    public void sumarMensaje(){
        System.out.println("Voy a sumar");
    }

    //Metodo que no regresa nada --> VOID
    public String mensaje(){
        String mensaje = "Voya a realizar una operacion de suma";
        return mensaje;
    }

    public double prueba(){
        return 2.5;
    }

    public void sumaVoid(int a, int b){
        System.out.println("El resultado de la suma es :" + (a+b));
    }

    // OPERACIONES

    // Suma
    public int sumar(int a, int b){
        return a + b;
    }

    // Restar
    public int restar(int a, int b){
        return a - b;
    }

    // Multiplicacion
    public long multiplicar(int a, int b){
        return a * b;
    }

    // Division
    public double dividir(double a, double b){
        if (b != 0){
            return a / b;
        } else {
            return -1;
        }

    }

}
