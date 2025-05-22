package vistas;

import controladores.ControladorPokemon;
import modelos.Entrenador;

public interface VistaPokemon {
    public void iniciar(ControladorPokemon controlador);

    public String asignarNombreT1();
    public String asignarNombreT2();
    public void mostrarEquipos(Entrenador t1, Entrenador t2);
    public void mostrarEntrenadores(String nombre1, String nombre2);
}
