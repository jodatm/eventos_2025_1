import java.util.ArrayList;

/**
 * @author joshua.triana
 * @version 0.0.0.1
 * @since 20 de marzo de 2025
 */
public class Main {
    static int edad=0;
    public static void main(String[] args) {
        //Balon balon1 = new Balon("azul",(short)45);
        //Balon balon2 = new Balon("rojo",(short)65);
        //System.out.println(balon1.numeroBalones);
        //System.out.println(balon2.numeroBalones);
        System.out.println(Balon.numeroBalones);
        Balon.comoEstalla("KABOOM");
        System.out.println(edad);
        ArrayList <String> lista = new ArrayList<String>();
        Persona <Double,Character> p1 = new Persona<>("arturo",
                5.4,'1');
        Persona <String,Float> p2 = new Persona<>("arturo",
                "1234",5.4f);
        Persona <Short,Integer> p3 = new Persona<>("arturo",
                (short)1234,(int)5.4);
        //System.out.println(p1.getAltura());
        System.out.println(p2.getAltura()+"a");
        System.out.println(p2.getAltura()+1);

        Empleado <String,Double> e1 = new Empleado("jaime","senior",15000000,
                "4567",1.71);
        Empleado <Balon,Double> e3 = new Empleado("jaime","senior",15000000,
                new Balon("amarillo",(short)4),1.71);
        System.out.println(e1.dameElSueldo());
        System.out.println(e1.dameElSueldo(5));
        System.out.println(e1.dameElSueldo(5,true));
        Profesor <Integer,Float> prof1 = new Profesor("josh","secsdasdas",30000000,
                "secon","eventos",345, 1.71f);

        System.out.println(prof1.dameElSueldo());

    }
}