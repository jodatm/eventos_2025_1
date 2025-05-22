package vistas;

import controladores.ControladorPokemon;
import modelos.Entrenador;

import java.util.Scanner;

public class VistaPokemonTerminal implements VistaPokemon{
    String nombreT1, nombreT2;
    @Override
    public void iniciar(ControladorPokemon controlador) {
        System.out.println("Bienvenidos a pokemon!");
        System.out.println("Dame el nombre de T1");
        Scanner scanner = new Scanner(System.in);
        nombreT1 = scanner.next();
        System.out.println("Dame el nombre de T2");
        nombreT2 = scanner.next();
        System.out.println("Quieres asignar pokemones aleatorios?");
        String opcion = scanner.next();
        if(opcion.equals("si")){
            controlador.actionPerformed(null);
        }
    }

    @Override
    public String asignarNombreT1() {
        return nombreT1;
    }

    @Override
    public String asignarNombreT2() {
        return nombreT2;
    }

    @Override
    public void mostrarEquipos(Entrenador t1, Entrenador t2) {
        System.out.println("Entrenador 1");
         t1.getPokemones().forEach( i -> {
             System.out.println(i.toString());
         });
        System.out.println("Entrenador 2");
        t2.getPokemones().forEach( i -> {
            System.out.println(i.toString());
        });
    }

    @Override
    public void mostrarEntrenadores(String nombre1, String nombre2) {

    }
}
