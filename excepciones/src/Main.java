import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Throwable;

public class Main {
    public static void main(String[] args) {

        try{
            calcular();
        }catch(IOException ex)
        {

        }

        while(true){
            try{
                calcular();
                break;
            } catch(ArithmeticException ex){
                System.out.println("vea cabezon, no divida sobre 0");
            } catch(ArrayIndexOutOfBoundsException ex){
                ex.printStackTrace();
            } catch(InputMismatchException ex){
                System.out.println("ingresa numeros!!! digitos");
            } catch(Exception ex){
                System.out.println("algo salio mal");
            }
        }

        try{
         Scanner scanner = new Scanner(System.in);
            System.out.println("di cuantos creditos quieres matricuar");
            int creditos = scanner.nextInt();
            if(creditos < MinCreditosException.MINIMO_CREDITOS){
                throw new MatriculaUnivalleException("Cabezon, no podes matricular " + creditos + ", debes matricular mas");
            }
        }catch(InputMismatchException ex){
            System.out.println("Ingresa un digito");
        } catch(MatriculaUnivalleException ex){
            ex.printStackTrace();
        }

        System.out.println("Hello world!");
    }

    public static void calcular() throws ArithmeticException, InputMismatchException, ArrayIndexOutOfBoundsException, NullPointerException,
            IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int valor = scanner.nextInt();
        int resultado = valor/2;
        int lista [] = {1,2,3};
        System.out.println(lista[resultado]);
    }

}