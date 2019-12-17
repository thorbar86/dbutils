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

//con este metodo haremos q si devuelve algo < 10 q no siga leyendo, para que no devulevua los ultimos 10 caracteres del codigo
public class DbUtilsFileInputStream extends InputStream{
    private final InputStream inputStream;
    
    public DbUtilsFileInputStream (InputStream inputStream){
        this.inputStream = inputStream;    
    }

    @Override
    //comprobamos si es menor o igual 10, si es asi no lee mas i sale
    public int read() throws IOException {        
        
        if (inputStream.available() <= 10)
            return -1;
                            
        return inputStream.read();
    }
    
}
