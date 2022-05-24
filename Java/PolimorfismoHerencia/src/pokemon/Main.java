package pokemon;

public class Main {
    public static void main(String[] args) {
        /*Pokemon chikorita = new Pokemon(152, 1, 20, "Chikorita", false);

        //
        chikorita.comer();
        chikorita.atacar();
        chikorita.dormir();*/

        TipoPlanta chikorita2 = new TipoPlanta(152, 1, 20, "Chikorita2", false, 20);
        chikorita2.comer();
        chikorita2.atacar();
        chikorita2.dormir();
        chikorita2.paralizar();
        chikorita2.envenenar();

        Chikorita chikorita3 = new Chikorita(152, 1, 20, "Chikorita3", false, 20, 3);
        chikorita3.comer();
        chikorita3.atacar();
        chikorita3.dormir();
        chikorita3.paralizar();
        chikorita3.envenenar();
        chikorita3.latigo();

        Charmander charmander = new Charmander(4,3, 50, "Charmander", false );
        charmander.comer();
        charmander.atacar();
        charmander.dormir();
        charmander.volar();
        charmander.lanzallamas();

    }
}
