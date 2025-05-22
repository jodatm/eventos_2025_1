public class Caballo implements Transporte{

    static Caballo unico = new Caballo("GranChan","negro",10,10);

    public static int contadorCaballos = 0;
    String raza;
    String color;
    int edad;

    private Caballo(String raza, String color, int edad, int energia) {
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.energia = energia;
        contadorCaballos++;
    }

    int energia = 100;

    @Override
    public Combustible getCombustible() {
        return Combustible.COMIDA;
    }

    @Override
    public void recargarCombustible(Recargar recargar, TipoUnidades tipoUnidades, int cantidad) {
        if(recargar.equals(Recargar.DAR_COMIDA)){
            energia +=cantidad;
        }
    }

    @Override
    public int getCantidadPasajeros() {
        return 2;
    }

    @Override
    public String formaAcelerar() {
        return "patadas de amor";
    }

    @Override
    public String formaDesacelerar() {
        return "jalandole el... jajaja";
    }

    @Override
    public String formaIniciar() {
        return "toque suave";
    }

    @Override
    public String formaGirar() {
        return "jalo para el lado que quiere girar";
    }

    @Override
    public String formaFrenar() {
        return "jalar hacia el jinete";
    }

    @Override
    public String formaReversa() {
        return "no tiene";
    }
}
