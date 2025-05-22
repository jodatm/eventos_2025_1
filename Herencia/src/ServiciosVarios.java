public class ServiciosVarios <g,f> extends Empleado{
    String areaServicio;
    public ServiciosVarios(String nombre, String cargo, int sueldo,
                           String areaServicio, g numeroDocumento,
                           f altura) {
        super(nombre, cargo, sueldo, numeroDocumento, altura);
        this.areaServicio = areaServicio;
    }
}
