import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*File archivo = new File("src/diccionario.txt");
        System.out.println(archivo.exists());
        System.out.println(archivo.getAbsoluteFile());
        System.out.println(archivo.length());
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            String lineaActual = buffer.readLine();
            while(lineaActual!=null){
                System.out.println(lineaActual);
                lineaActual = buffer.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        try {
            RandomAccessFile archivo = new RandomAccessFile("src/diccionario.txt","r");
            String lineaActual = archivo.readLine();
            while(lineaActual!=null){
                System.out.println(lineaActual);
                lineaActual = archivo.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}