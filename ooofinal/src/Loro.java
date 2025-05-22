public class Loro extends Pajaros implements Mascota, Comida{

    private String idioma;

    public Loro(String colorAlas, boolean tienePico, String idioma) {
        super(colorAlas, tienePico);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public void comoCanta() {
        System.out.println("Quiere cacao");
    }

    @Override
    public void getNombre() {
        System.out.println("Coquito");
    }

    @Override
    public void getDueño() {
        System.out.println("Desocupados");
    }

    @Override
    public void getNumeroVacunas() {
        System.out.println("0");
    }

    @Override
    public void comoSePrepara() {
        System.out.println("Lo miras a los ojos y pum, y fuego y salio");
    }
}
