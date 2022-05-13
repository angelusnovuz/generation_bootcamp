import java.util.Arrays;

public class CoversionDatos {
    public static void main(String[] args) {

        byte numeroByte = 100;
        short numeroShort = numeroByte;
        int numeroInt = numeroShort;
        long numeroLong = numeroInt;

        // CASTEO
        // Cuando el valor no cabe se desborda y muestra el numero mayor posible
        int otroInt = (int) numeroLong;
        short otroShort = (short) otroInt; //
        byte otroByte = (byte) otroShort;

        System.out.println(otroByte);

    }
}
