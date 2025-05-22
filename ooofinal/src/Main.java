import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Avestruz avestruz1 = new Avestruz("negro",true);
        Avestruz avestruz2 = new Avestruz("rojo",true);

        Loro loro1 = new Loro("verdes", false, "español");
        Loro loro2 = new Loro("marillas", false, "chino");

        Perro perro1 = new Perro();
        Perro perro2 = new Perro();

        Pinguino pingui1 = new Pinguino("negras",true,"pinguina");
        Pinguino pingui2 = new Pinguino("blancas",false,"otra pinguina");

        Pajaros pajaro = new Pinguino("rojo",true,"?");
        Comida comidita = new Perro();
        Mascota mascota1 = new Loro("amarillo",true,"ingles");
        //Pinguino pinguinoNuevo = new Pajaros("azul",false);
        ArrayList<Mascota> listaMascotas = new ArrayList <Mascota>();
        listaMascotas.add(loro1);
        listaMascotas.add(perro1);
        //listaMascotas.add(avestruz2);
        for(Mascota mascota: listaMascotas){
            mascota.getNombre();
            mascota.getDueño();
            mascota.getNumeroVacunas();
            if(mascota.getClass().equals(Loro.class)){
                ((Loro) mascota).comoCanta();
            }
            //mascota.getClass().equals(Loro.class) ? ((Loro) mascota).comoCanta():"a" ;

        }
    }
}