import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.StringTokenizer;

public class ManejadorArchivos {

    String ruta = "src/diccionario.txt";

    public String traduccion(String palabraEspañol, String idioma){
        String palabraIngles = "No existe traduccion";
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta,"r");
            String lineaActual = archivo.readLine();
            while(lineaActual!=null){
                StringTokenizer tokens = new StringTokenizer(lineaActual,",");
                if(palabraEspañol.equals(tokens.nextToken())){
                    if(idioma.equals("ingles")){
                        palabraIngles = tokens.nextToken();
                    }
                    else if(idioma.equals("frances")){
                        tokens.nextToken();
                        palabraIngles = tokens.nextToken();
                    }

                }
                lineaActual = archivo.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return palabraIngles;
    }

    public String contenidoDiccionario(){
        String contenido = "";
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta,"r");
            String lineaActual = archivo.readLine();
            while(lineaActual!=null){
                contenido += lineaActual + "\n";
                lineaActual = archivo.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contenido;
    }

    public void guardarDiccionario(String diccionario){
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta,"rw");
            archivo.seek(archivo.length());
            archivo.writeBytes("\n"+diccionario);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Object [][] retornarTabla(){
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta,"r");
            String lineaActual = archivo.readLine();
            int contador = 0;
            while(lineaActual!=null){
                StringTokenizer tokens = new StringTokenizer(lineaActual,",");
                lineaActual = archivo.readLine();
                contador++;
            }
            Object [][]resultado = new Object [contador][3];
            archivo = new RandomAccessFile(ruta,"r");
            lineaActual = archivo.readLine();

            int contadorFila = 0;
            while(lineaActual!=null){
                StringTokenizer tokens = new StringTokenizer(lineaActual,",");
                Object [] fila = new Object [3];
                fila[0] = tokens.nextToken();
                fila[1] = tokens.nextToken();
                fila[2] = tokens.nextToken();
                resultado[contadorFila] = fila;
                contadorFila++;
                lineaActual = archivo.readLine();
            }
            return resultado;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
