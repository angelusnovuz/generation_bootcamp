package pokemon;
// Charmander esta implementando los metdos de ambas interfaces
public class Charmander extends Pokemon implements TipoFuego, TipoVolador{

    public Charmander(int id, int edad, int nivel, String nombre, boolean evolucion){
        super(id, edad, nivel, nombre, evolucion);
    }

    // Aqui realizar el override de los metdos de las interfaces
    public void lanzallamas(){
        System.out.println("Lanzallamas");
    }

    public void araniar(){
        System.out.println("Arañar");
    }

    public void volar(){
        System.out.println("Volar");
    }


}
