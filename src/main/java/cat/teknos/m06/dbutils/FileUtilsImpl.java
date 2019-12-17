/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.teknos.m06.dbutils;

import java.io.*;

/**
 *
 * @author uvic
 */
public class FileUtilsImpl implements FileUtils {

    @Override
    //declaramos como es un fichero de entrada(ex iso8856) i  lo hemos de convertir a utf8
    //esto se saca ane el FileRedar, en el constructor tiene un paraetro q es el charset ( conversion usada)
    //FileWriter sera el fichero q lo convierta a utf8
    public void toUtf8(ValidCharset charset, String from, String to) {
        //Stream es un flux de dades, lleer el contenido de un fichero q no esta en memoria
        var fileFrom =  new File(from);

        //TODO tests
        
        //leems el fichhero fileFrom q esta en el charset i el logfile lo cotgemos del class logfile dnde añadimos el log a nuestra lectura
        //con metodos abstractos vamos extendiendo el wrapping q hemos generado abajo
        //como funciona? se lee de iz. a der...la primera lee i llama a la segunda, q esta llama a la 3a i esta genera
        try ( var inputStream = new LogFileInputStream (new BufferedInputStream (new FileInputStream(fileFrom)))) {
            int character;
            while((character = inputStream.read())>0) {
                //TODO: write with utf8 charset
                if (inputStream.available() < 10){
                    
                }
            
        }

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }

}
