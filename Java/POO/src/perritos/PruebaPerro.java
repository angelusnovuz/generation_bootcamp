package perritos;

public class PruebaPerro {
    public static void main(String[] args) {

        //METODO ESTATICO
        Perro.mensaje();


        //INSTANCIAR
        Perro perro1 = new Perro("Patitas", 5);

        perro1.raza = "Husky";
        perro1.tamanio = "Mediano";

        perro1.ladrar();
        int edadPerro1 = perro1.edadPerruna();
        System.out.println(edadPerro1);

        //INSTANCIAR
        Perro perro2 = new Perro("Cookies", 2);
        perro2.raza = "Dalmata";
        perro2.tamanio = "Grande";

        perro2.ladrar();
        int edadPerro2 = perro1.edadPerruna();
        System.out.println(edadPerro2);



    }
}
