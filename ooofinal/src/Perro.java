public class Perro implements Mascota, Comida{
    @Override
    public void comoSePrepara() {
        System.out.println(":(");
    }

    @Override
    public void getNombre() {
        System.out.println("firulais");
    }

    @Override
    public void getDueño() {
        System.out.println("Karen");
    }

    public Perro() {
    }

    @Override
    public void getNumeroVacunas() {
        System.out.println("10");
    }
}
