package pokemon;

public class Chikorita extends TipoPlanta{

    int numeroCuernos;

    public Chikorita(int id, int edad, int nivel, String nombre, boolean evolucion, int numeroHojas, int numeroCuernos){
        super(id, edad, nivel, nombre, evolucion, numeroHojas);
        this.numeroCuernos = numeroCuernos;
    }


    public void latigo(){
        System.out.println(getNombre() + " uso latigo");
    }

    @Override
    public String toString() {
        return "Chikorita{" +
                "numeroCuernos=" + numeroCuernos +
                '}';
    }
}
