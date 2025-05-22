public class Persona <g,f> {
    String nombre;
    g numeroCedula;
    f altura;

    public Persona(String nombre, g numeroCedula, f altura) {
        this.nombre = nombre;
        this.numeroCedula = numeroCedula;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public g getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(g numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public f getAltura() {
        return altura;
    }

    public void setAltura(f altura) {
        this.altura = altura;
    }

}
