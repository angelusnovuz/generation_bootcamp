package pokemon;

public class TipoPlanta extends Pokemon {

    //CAMPOS
    private int numeroHojas;

    public TipoPlanta(int id, int edad, int nivel, String nombre, boolean evolucion, int numeroHojas) {
        super(id, edad, nivel, nombre, evolucion);
        this.numeroHojas = numeroHojas;
    }

    //METODOS
    public void paralizar(){
        System.out.println(getNombre() + " esta paralizando");
    }

    public void envenenar(){
        System.out.println(getNombre() + " esta envenenando");
    }

    public void atacar(){
        System.out.println(getNombre() + " tipo de planta esta atacando");
    }

    public int getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }
}
