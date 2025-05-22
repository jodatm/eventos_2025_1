import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caballo caballo1 = new Caballo("GranChan","negro",10,10);
        Caballo caballo2 = new Caballo("Fino","blanco",3,1);
        Caballo caballo3 = new Caballo("Soso","negro",20,7);

        Moto moto1 = new Moto(Combustible.EXTRA,TipoUnidades.GALON, 5,"ABC-123","KRIPTON","1600");
        Moto moto2 = new Moto(Combustible.ACPM,TipoUnidades.GALON, 0,"POB-666","patito","100");
        Moto moto3 = new Moto(Combustible.EXTRA,TipoUnidades.GALON, 6,"ZZZ-999","patito","800");

        ArrayList <Transporte> lista = new ArrayList<Transporte>();
        lista.add(caballo1);
        lista.add(caballo2);
        lista.add(caballo3);

        lista.add(moto1);
        lista.add(moto2);
        lista.add(moto3);

        int sumaEdades = 0;
        int cantidadACPM = 0;

        for(Transporte transporte : lista){
            if(transporte.getClass().equals(Caballo.class)){
                sumaEdades += ((Caballo) transporte).edad;
            }
            if(transporte.getClass().equals(Moto.class)){
                if(((Moto) transporte).getCombustible().equals(Combustible.ACPM)){
                    cantidadACPM++;
                }
            }
        }
        System.out.println("La edad promedio de los caballos es " + (sumaEdades/Caballo.contadorCaballos));
        System.out.println("Cantidad de motos con ACPM" + cantidadACPM);
    }
}