import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");
        File archivo = new File("src/demo.txt");
        FileReader lector = new FileReader(archivo);
        BufferedReader buffer = new BufferedReader(lector);
        String resultado = buffer.readLine();
        System.out.println(resultado);
    }
}