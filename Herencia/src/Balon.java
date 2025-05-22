public class Balon {
    private String color;
    private short peso;
    static int numeroBalones = 0;
    static final String FORMA = "REDONDO";

    public Balon(String color, short peso) {
        this.color = color;
        this.peso = peso;
        numeroBalones++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
        @return peso: el peso del objeto
     */
    public short getPeso() {
        return peso;
    }

    public void setPeso(short peso) {
        this.peso = peso;
    }

    /**
     * @param estallido: esta es la forma en que estalla...
     * @deprecated esto no funciona desde enero 2024
     */
    public static void comoEstalla(String estallido){
        System.out.println("PUM"+estallido);
    }
}
