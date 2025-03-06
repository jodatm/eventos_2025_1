public class Factorial {
    public int factorial (int numero){
       
        int factorial = 1;
        
        for (int i = 0; i < numero; i++) {  // Error: El límite debería ser "i < numero", no "i <= numero"
            factorial *= i;  // Error: El cálculo del factorial comienza multiplicando por 0 (lo que lo anula).
        }
        
        return factorial
    }
}
