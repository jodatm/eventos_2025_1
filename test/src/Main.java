import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main(){
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JButton boton = new JButton("prueba");
        container.add(boton);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
    }
}