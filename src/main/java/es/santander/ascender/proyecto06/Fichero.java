package es.santander.ascender.proyecto06;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Fichero implements Closeable {
    
    public byte[] leer(String nombreFichero) throws IOException{
        //int valor;

        //valor = 1;

        // int a, b, c

        FileInputStream fis = new FileInputStream(nombreFichero);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int valor;
        while((valor = fis.read())!= -1){

            baos.write(valor);

        }
        
        return baos.toByteArray();
    }









    public byte[] leerEnBloques(String nombreFichero) throws IOException{
        int cuantos;

        byte[] valores = new byte[4096];

        FileInputStream fis = new FileInputStream(nombreFichero);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while((cuantos = fis.read(valores))!= -1){

            baos.write(valores, 0, cuantos);

        }
        
        return baos.toByteArray();
    }
    
    public void escribir(String nombreFichero, byte[] datos) throws IOException{

        FileOutputStream fos = new FileOutputStream(nombreFichero);

        fos.write(datos);
        
    }









    @Override
    public void close() throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    } 
    
    public abstract void hacerElLunes();

}
