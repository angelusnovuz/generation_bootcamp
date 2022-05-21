package generation.model;

import java.util.HashMap;
import java.util.Map;

public class Perro {
    //ATRIBUTOS
    // ENCAPSULAMIENTO-- se tuliza PRIVATE paa que otras clases no tenga acceso
    // Aunque los datos seasn privados podemos acceder a ellos si los metodos son publicos
    private String nombre, raza, tamanio, color;
    private int edad, id;
    private static int contador = 0;

    private static Map<Integer, String> humano = new HashMap<Integer, String>();

    // CONSTRUCTOR
    public Perro (String nombre, String raza, String tamanio, String color, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
        this.color = color;
        this.edad = edad;
        this.id = ++Perro.contador;
    }

    //GETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    /*public static void setHumano(String value) {
        Perro.humano.put(this.id, value);
    }
    */
    //METODOS

    public static String buscarHumano(Integer key) {
        return "El nombre de este humano es: " + humano.get(key);
    }

    public void comer(){
        System.out.println(this.nombre + " esta comiendo");
    }

    public void dormir(){
        System.out.println(this.nombre + " esta durmiendo");
    }

    public void sentar(){
        System.out.println(this.nombre + " se sentó");
    }

    public void correr(){
        System.out.println(this.nombre + " está corriendo");
    }

    /* METODO toString --> */

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", id=" + id +
                '}';
    }
}
