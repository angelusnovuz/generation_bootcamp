package generations.arreglos;

import java.util.Arrays;

public class Areglos {
    public static void main(String[] args) {

        //Matrices/ areglos/ arrays
        // Solo permite un tipo de dato
        // Debemos especificar su tamaño

        /*
         * numero - 0
         * string - null
         * booleanos -false
         */

        int [] arrNumeros = new int [5];

        // numeracion basada en 0
        arrNumeros[0] = 561;
        arrNumeros[1] = 589;
        arrNumeros[2] = 18;
        arrNumeros[3] = 556;
        arrNumeros[4] = 15655;

        //Imprimir el Arreglo
        System.out.println(Arrays.toString(arrNumeros));
        System.out.println(arrNumeros[2]);
        //System.out.println(arrNumeros);

        // CICLO FOR
        for (int i=0; i<arrNumeros.length; i++){
            System.out.println(arrNumeros[i]);
        }

        // CICLO FOR EACH
        int conteo = 0;
        for(int elemento : arrNumeros){
            conteo ++;
            System.out.println("Elemnto -->" + elemento);
        }


        Persona persona1 = new Persona("Alex", 33);
        Persona persona2 = new Persona("Raul", 31);

        //    Object arrPersonas[] = new Object[3];
        Persona [] arrPersonas = new Persona[3];

        arrPersonas[0] = persona1;
        arrPersonas[1] = persona2;
        arrPersonas[2] = new Persona("Angel", 24);

        for(Persona elemento: arrPersonas){
            System.out.println(elemento.nombre + " - " + elemento.edad);
        }

        //Arrglo de Strings
//        Strings []arrStrings = {"Hola", "Mi", "Nombre", "Es"};
//        System.out.println(Arrays.toString(arrStrings));

    }



}
