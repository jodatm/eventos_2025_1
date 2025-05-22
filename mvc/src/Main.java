import controladores.ControladorPokemon;
import vistas.VistaPokemonGUI;
import vistas.VistaPokemonTerminal;

public class Main {
    public static void main(String[] args) {
        VistaPokemonTerminal vista = new VistaPokemonTerminal();
        VistaPokemonGUI vista2 = new VistaPokemonGUI();
        ControladorPokemon controlador = new ControladorPokemon(vista2);
        controlador.inicializar();
    }
}