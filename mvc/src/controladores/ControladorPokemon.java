package controladores;

import modelos.Entrenador;
import vistas.VistaPokemon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPokemon implements ActionListener{
    Entrenador entrenador1;
    Entrenador entrenador2;
    VistaPokemon vista;

    public ControladorPokemon(VistaPokemon vista) {
        this.vista = vista;
    }

    public Entrenador getEntrenador1() {
        return entrenador1;
    }

    public void setEntrenador1(Entrenador entrenador1) {
        this.entrenador1 = entrenador1;
    }

    public Entrenador getEntrenador2() {
        return entrenador2;
    }

    public void setEntrenador2(Entrenador entrenador2) {
        this.entrenador2 = entrenador2;
    }

    public VistaPokemon getVista() {
        return vista;
    }

    public void setVista(VistaPokemon vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Asignar pokemon aleatorio")){
            String nombre1 = vista.asignarNombreT1();
            String nombre2 = vista.asignarNombreT2();
            entrenador1 = new Entrenador(nombre1);
            entrenador2 = new Entrenador(nombre2);
            entrenador1.asignarEquipoAleatorio();
            entrenador2.asignarEquipoAleatorio();
            vista.mostrarEquipos(entrenador1,entrenador2);
        }
        else if(e.getActionCommand().equals("Mostrar rivales")) {
            String nombre1 = vista.asignarNombreT1();
            String nombre2 = vista.asignarNombreT2();
            vista.mostrarEntrenadores(nombre1, nombre2);
        }
    }

    public void inicializar(){
        vista.iniciar(this);
    }
}
