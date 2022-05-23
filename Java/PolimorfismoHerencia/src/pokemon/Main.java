package pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon chikorita = new Pokemon(152, 1, 20, "Chikorita", false);

        //
        chikorita.comer();
        chikorita.atacar();
        chikorita.dormir();

        TipoPlanta chikorita2 = new TipoPlanta(152, 1, 20, "Chikorita2", false, 20);
        chikorita2.comer();
        chikorita2.atacar();
        chikorita2.dormir();
        chikorita2.paralizar();
        chikorita2.envenenar();
    }
}
