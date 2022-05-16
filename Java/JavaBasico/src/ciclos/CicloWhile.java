package ciclos;

import javax.swing.*;

public class CicloWhile {
    public static void main(String[] args) {
        //WHILE
//        int condicion = 0;
//        while(condicion < 5) {
//            System.out.println("Hola");
//            condicion++;
//        }

        // VERIFICAR CONTRASEÑA
        String clave, comparacion;
        clave = "Pedro";
        comparacion = "";
        // equals compara dos strings
        while (clave.equals(comparacion) == false){
            comparacion = JOptionPane.showInputDialog("Introduece la contraseña");

            if (clave.equals(comparacion) == false){
                System.out.println("La contrseña es incorrecta");
            }
        }
        System.out.println("La contraseña es correcta");
    }
}
