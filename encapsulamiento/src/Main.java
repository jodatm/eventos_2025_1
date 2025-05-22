import modelos.pokemon.electrico.Pikachu;
import modelos.pokemon.utils.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pikachu pika1 = new Pikachu("bryan", Color.ROJO);
        Pikachu pika2 = new Pikachu("bryan", Color.AZUL);
        Pikachu pika3 = new Pikachu("bryan", Color.AZUL);
        Pikachu pika4 = null;
        char letra = 'a';
        //System.out.println(pika1);
        System.out.println(pika1.equals(pika2));
        //System.out.println(pika1.equals(pika3));
        System.out.println(pika1.equals(letra));
        pika1.setAtaques();
        //System.out.println(Arrays.toString(pika1.getAtaques().toArray()));
        System.out.println(pika1.getAtaques());
        ArrayList <Pikachu> lista = new ArrayList<Pikachu>();
        lista.add(pika1);
        lista.add(pika2);
        lista.add(pika3);
        lista.add(pika4);
        System.out.println(lista);


    }
}