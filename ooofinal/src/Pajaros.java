public abstract class Pajaros {

    private String colorAlas;
    private boolean tienePico;

    public String getColorAlas() {
        return colorAlas;
    }

    public void setColorAlas(String colorAlas) {
        this.colorAlas = colorAlas;
    }

    public boolean isTienePico() {
        return tienePico;
    }

    public void setTienePico(boolean tienePico) {
        this.tienePico = tienePico;
    }

    public Pajaros(String colorAlas, boolean tienePico) {
        this.colorAlas = colorAlas;
        this.tienePico = tienePico;
    }

    public abstract void comoCanta();
}
