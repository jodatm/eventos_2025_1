import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Traductor extends JFrame implements ActionListener {

    Container contenedor;
    JButton botonIngles, botonFrances, botonGuardar, botonSeleccion;
    JTextField campoEspañol, campoIngles;
    JTextArea contenidoDiciconario;
    JTextArea contenidoNuevo;
    ManejadorArchivos manejador = new ManejadorArchivos();

    public Traductor(){
         contenedor = getContentPane();
         contenedor.setLayout(new FlowLayout());
         campoEspañol = new JTextField(10);
         contenedor.add(campoEspañol);

        campoIngles = new JTextField(10);
        contenedor.add(campoIngles);

        botonIngles = new JButton("Traducir a ingles");
        botonIngles.addActionListener(this);
        contenedor.add(botonIngles);

        botonSeleccion = new JButton("Seleccione el archivo");
        botonSeleccion.addActionListener(this);
        contenedor.add(botonSeleccion);

        botonFrances = new JButton("Traducir a frances");
        botonFrances.addActionListener(this);
        contenedor.add(botonFrances);

        contenidoDiciconario = new JTextArea(10,10);
        contenidoDiciconario.setText(manejador.contenidoDiccionario());
        contenidoDiciconario.setEditable(false);
        contenedor.add(contenidoDiciconario);

        contenidoNuevo = new JTextArea(10,10);
        contenedor.add(contenidoNuevo);

        botonGuardar = new JButton("Guardar en diccionario");
        botonGuardar.addActionListener(this);
        contenedor.add(botonGuardar);


        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Traductor traductor = new Traductor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botonSeleccion) {
            JFileChooser selector = new JFileChooser();
            selector.showOpenDialog(contenedor);
            manejador.ruta = selector.getSelectedFile().getAbsolutePath();
            contenidoDiciconario.setText(manejador.contenidoDiccionario());
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Español");
            modelo.addColumn("Ingles");
            modelo.addColumn("Frances");


            Object resultado [][] = manejador.retornarTabla();
            for(int i=0; i < resultado.length;i++){
                modelo.addRow(resultado[i]);
            }
            JTable tabla = new JTable();
            JScrollPane scroll = new JScrollPane(tabla);
            tabla.setModel(modelo);
            JOptionPane.showMessageDialog(contenedor,scroll);
        }
        if(e.getSource()==botonGuardar) {
            String contenido = contenidoNuevo.getText();
            manejador.guardarDiccionario(contenido);
            contenidoDiciconario.setText(manejador.contenidoDiccionario());
            return;
        }
        String idioma = "";
        if(e.getSource()==botonIngles) {
            idioma = "ingles";
        }
        else if(e.getSource()==botonFrances) {
            idioma = "frances";
        }
            String palabraEspañol = campoEspañol.getText();

            String palabraIngles = manejador.traduccion(palabraEspañol, idioma);
            campoIngles.setText(palabraIngles);
    }
}
