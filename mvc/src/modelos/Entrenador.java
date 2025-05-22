package modelos;

import java.util.ArrayList;
import java.util.Random;

public class Entrenador {

    String nombre;
    ArrayList<Pokemon> pokemones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    public Entrenador(String nombre) {
        this.nombre = nombre;
        pokemones = new ArrayList<Pokemon>();
    }

    public void asignarEquipoAleatorio(){
        for(int i = 0; i < 3; i++){
            short vidaAleatoria = (short) (Math.random()*500+1);
            short ataqueAleatorio = (short) (Math.random()*100+50);
            Tipo tipoAleatorio = Tipo.values()
                    [(int)(Math.random()*Tipo.values().length-1)];
            Pokemon pokemon = new Pokemon(vidaAleatoria,
                    ataqueAleatorio, tipoAleatorio);
            pokemones.add(pokemon);
        }
    }
}
