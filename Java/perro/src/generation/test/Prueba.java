package generation.test;

import generation.model.Perro;

public class Prueba {
    public static void main(String[] args) {
        Perro pelusa = new Perro("Pelusa", "French","Chico", "Blanco", 4);
        Perro solovino = new Perro("Solovino", "Mestizo", "Mediano", "Café", 2);


        System.out.println(pelusa);
        System.out.println(solovino);
        pelusa.comer();

        //System.out.println(pelusa.nombre);





    }

}
