import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Demo extends JFrame{

    Container contenedor;
    JLabel etiqueta1;
    JButton boton, boton2, negrilla;
    Manejador manejador;
    JComboBox<String> combo;
    JTextArea area;
    String colores [] = {"amarillo","azul","rojo"};
    public Demo(){
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        etiqueta1 = new JLabel("Hola");
        add(etiqueta1);
        boton = new JButton("Aceptar");
        manejador = new Manejador();
        boton.addActionListener(manejador);
        add(boton);
        boton2 = new JButton("Cancelar");
        boton2.addActionListener(manejador);
        add(boton2);

        negrilla = new JButton("Negrilla");
        negrilla.addActionListener(manejador);
        add(negrilla);

        combo = new JComboBox<String>(colores);
        combo.addItemListener(manejador);
        add(combo);

        JTextField texto = new JTextField(15);
        add(texto);

        area = new JTextArea(10,10);
        JScrollPane scroll2 = new JScrollPane(area);
        add(scroll2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
    }

    private class Manejador implements ActionListener, ItemListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==boton){
                JOptionPane.showMessageDialog(contenedor,boton);
            }else if(e.getSource()==negrilla){
                area.setFont(new Font("arial", Font.BOLD,50));
            }else{
                //JFileChooser selector = new JFileChooser();
                //selector.showOpenDialog(contenedor);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("pokemon");
                modelo.addColumn("ataque favorito");
                Object pikachu [] = {"pikachu","trueno"};
                modelo.addRow(pikachu);
                Object mewtwo [] = {"mewtwo","psiquico"};
                modelo.addRow(mewtwo);
                JTable tabla = new JTable(modelo);
                JScrollPane scroll = new JScrollPane(tabla);
                JOptionPane.showMessageDialog(contenedor,scroll);
            }

        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange()==ItemEvent.DESELECTED){
                JOptionPane.showMessageDialog(contenedor,  colores[combo.getSelectedIndex()]);

            }

        }
    }
}

