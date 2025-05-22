public class Pinguino extends Pajaros implements Mascota{
    String pareja;
    public Pinguino(String colorAlas, boolean tienePico, String pareja) {
        super(colorAlas, tienePico);
        this.pareja = pareja;
    }

    @Override
    public void getNombre() {
        System.out.println("paolin");
    }

    @Override
    public void getDueño() {
        System.out.println("traquetos");
    }

    @Override
    public void getNumeroVacunas() {
        System.out.println("3");
    }

    @Override
    public void comoCanta() {
        System.out.println("pio pio");
    }
}
