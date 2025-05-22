public class MinCreditosException extends Exception{
    public static final int MINIMO_CREDITOS = 8;
    public MinCreditosException(String mensaje){
        super(mensaje);
    }

}
