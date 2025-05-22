package modelos.pokemon.electrico;

import modelos.pokemon.utils.Ataques;
import modelos.pokemon.utils.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Pikachu {

    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColorCachetes() {
        return colorCachetes;
    }

    public void setColorCachetes(Color colorCachetes) {
        this.colorCachetes = colorCachetes;
    }

    private Color colorCachetes;

    public Pikachu(String nombre, Color colorCachetes) {
        this.nombre = nombre;
        this.colorCachetes = colorCachetes;
        ataques = new ArrayList<Ataques>();
    }

    @Override
    public String toString() {
        return "Pikachu{" +
                "nombre='" + nombre + '\'' +
                ", colorCachetes=" + colorCachetes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pikachu pikachu = (Pikachu) o;
        return Objects.equals(nombre, pikachu.nombre) && colorCachetes == pikachu.colorCachetes;
    }

    public ArrayList<Ataques> getAtaques() {
        return ataques;
    }

    public void setAtaques() {
        System.out.println("ingresa los ataques");
        ArrayList <Ataques> listaAtaques = new ArrayList <Ataques>();
        for(Ataques ataque: Ataques.values()){
            listaAtaques.add(ataque);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresa el ataque");
            for(Ataques ataque : listaAtaques){
                if(ataque!=null){
                    System.out.println("Ataque:"+ataque);
                }
            }
            Scanner scanner = new Scanner(System.in);
            String ataqueS = scanner.next();
            Ataques ataquen = Ataques.valueOf(ataqueS);
            ataques.add(ataquen);
            listaAtaques.remove(ataquen);
        }
    }

    private ArrayList<Ataques> ataques;

}
