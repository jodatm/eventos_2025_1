public class Empleado <g,f> extends Persona<g,f>{
    String nombre;
    String cargo;
    int sueldo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, String cargo, int sueldo,
                    g numeroCedula, f altura) {
        super(nombre,numeroCedula,altura);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int dameElSueldo(){
        return sueldo;
    }

    public int dameElSueldo(int diasFaltas){
        return sueldo - (diasFaltas*100000);
    }

    public int dameElSueldo(int diasFaltas, boolean marcha){
        if (marcha){
            return sueldo - (diasFaltas*100000)-(500000);
        }
        return sueldo - (diasFaltas*100000);
    }
}
