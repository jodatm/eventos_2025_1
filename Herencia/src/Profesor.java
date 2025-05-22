public class Profesor <g,f> extends Empleado{

    String categoria;
    String materiaFavorita;

    public Profesor(String nombre, String cargo, int sueldo,
                    String categoria, String materiaFavorita,
                    g numeroDocumento, f altura){
        super(nombre, cargo,sueldo, numeroDocumento,altura);
        this.categoria = categoria;
        this.materiaFavorita = materiaFavorita;
    }

    @Override
    public int dameElSueldo(){
        switch(categoria){
            case "prin": return super.dameElSueldo();
            case "secon": return super.dameElSueldo()*2;
            case "ter": return super.dameElSueldo()*3;
            default: return super.dameElSueldo();
        }
    }
}
