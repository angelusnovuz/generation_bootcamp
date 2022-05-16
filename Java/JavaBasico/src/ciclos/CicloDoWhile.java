package ciclos;

import javax.swing.*;

public class CicloDoWhile {

    public static void main(String[] args) {

        // VERIFICAR CONTRSEÑA
        String clave, comparacion;
        clave = "Pedro";
        comparacion = "";

        do {
            comparacion = JOptionPane.showInputDialog("Introduece la contraseña");

            if (clave.equals(comparacion) == false) {
                System.out.println("La contrseña es incorrecta");
            }
        } while (clave.equals(comparacion) == false);

        System.out.println("La contraseña es correcta");
    }
}
