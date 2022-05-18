package perritos;

public class Perro {

    //ATRIBUTOS
    String nombre, raza, tamanio;
    int edad;

    //CONSTRUCTOR
    public Perro(String nombre, int edad){
        this.nombre  = nombre;
        this.edad = edad;
    }

    //METODOS
    public void ladrar(){
        System.out.println(nombre + " hace Guauf");
    }
    public int edadPerruna(){
        return edad * 7;
    }

    //METODOS ESTATICOS
    // --> static; permite utilizar el metodo sin instanciar
    public static void mensaje(){
        System.out.println("Esta clase es una clase Perro");
    }





}
