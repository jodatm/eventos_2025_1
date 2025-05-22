package vistas;

import controladores.ControladorPokemon;
import modelos.Entrenador;
import modelos.Pokemon;

import javax.swing.*;
import java.awt.*;

public class VistaPokemonGUI extends JFrame implements VistaPokemon{

    Container contenedor;
    JLabel etiqueta1, etiqueta2;
    JTextField campo1, campo2;
    JButton boton, boton2;
    public VistaPokemonGUI(){
        contenedor = new Container();
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        etiqueta1 = new JLabel("Nombre T1");
        contenedor.add(etiqueta1);
        campo1 = new JTextField(15);
        contenedor.add(campo1);

        etiqueta2 = new JLabel("Nombre T2");
        contenedor.add(etiqueta2);
        campo2 = new JTextField(15);
        contenedor.add(campo2);

        boton = new JButton("Asignar pokemon aleatorio");
        contenedor.add(boton);

        boton2 = new JButton("Mostrar rivales");
        contenedor.add(boton2);


        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void iniciar(ControladorPokemon controlador) {
        boton.addActionListener(controlador);
        boton2.addActionListener(controlador);
        setVisible(true);
    }

    @Override
    public String asignarNombreT1() {
        return campo1.getText();
    }

    @Override
    public String asignarNombreT2() {
        return campo2.getText();
    }

    @Override
    public void mostrarEquipos(Entrenador t1, Entrenador t2) {
        String mensaje1 = "Nombre T1" + t1.getNombre() + "\n";
        for(int i=0; i< t1.getPokemones().size();i++){
            mensaje1 += t1.getPokemones().get(i).toString()+"\n";
        }
        JOptionPane.showMessageDialog(contenedor,mensaje1);
        String mensaje2 = "Nombre T2" + t2.getNombre() + "\n";
        for(int i=0; i< t2.getPokemones().size();i++){
            mensaje2 += t2.getPokemones().get(i).toString()+"\n";
        }
        JOptionPane.showMessageDialog(contenedor,mensaje2);
    }

    @Override
    public void mostrarEntrenadores(String nombre1, String nombre2) {
        JOptionPane.showMessageDialog(contenedor,nombre1 + " vs " + nombre2);
    }
}
