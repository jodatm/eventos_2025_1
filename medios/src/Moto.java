public class Moto implements Transporte{

    public Moto(Combustible combustible){
        this.combustible = combustible;
    }
    Combustible combustible;
    TipoUnidades tipoUnidad;
    int cantidad;
    String placa;
    String marca;
    String cc;

    public Moto(Combustible combustible, TipoUnidades tipoUnidad, int cantidad, String placa, String marca, String cc) {
        this.combustible = combustible;
        this.tipoUnidad = tipoUnidad;
        this.cantidad = cantidad;
        this.placa = placa;
        this.marca = marca;
        this.cc = cc;
    }

    @Override
    public Combustible getCombustible() {
        return combustible;
    }

    @Override
    public void recargarCombustible(Recargar recargar, TipoUnidades tipoUnidades, int cantidad) {
        if(recargar.equals(Recargar.TANQUEAR)){
            this.tipoUnidad = tipoUnidades;
            this.cantidad += cantidad;
        }
    }

    @Override
    public int getCantidadPasajeros() {
        return 4;
    }

    @Override
    public String formaAcelerar() {
        return "acelerador";
    }

    @Override
    public String formaDesacelerar() {
        return "mete primera";
    }

    @Override
    public String formaIniciar() {
        return "le da start";
    }

    @Override
    public String formaGirar() {
        return "girando el volante";
    }

    @Override
    public String formaFrenar() {
        return "con el freno :v";
    }

    @Override
    public String formaReversa() {
        return "con los pies";
    }
}
