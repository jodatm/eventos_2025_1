public interface Transporte {
    public Combustible getCombustible();
    public void recargarCombustible(Recargar recargar, TipoUnidades tipoUnidades, int cantidad);
    public int getCantidadPasajeros();
    public String formaAcelerar();
    public String formaDesacelerar();
    public String formaIniciar();
    public String formaGirar();
    public String formaFrenar();
    public String formaReversa();
}
