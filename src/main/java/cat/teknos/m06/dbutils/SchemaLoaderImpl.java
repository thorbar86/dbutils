/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.teknos.m06.dbutils;

import cat.teknos.m06.dbutils.exception.DbUtilsException;
import cat.teknos.m06.dbutils.exception.InvalidSourceException;

/**
 *
 * @author uvic
 */
public class SchemaLoaderImpl implements SchemaLoader{
    
        /***
     * Loads a db schema from a porovided sql file
     * 
     * @param path to an sql file
     * @throws InvalidSourceException if the file doesn't exist
     *         or is a folder 
     * @throws DbUtilsException if path is null or empty 
     *         or file name doesn't end with .sql
     * make 6 test into the implTest
     */
    

    @Override
    public void load(String path) throws InvalidSourceException, DbUtilsException {
        if (path.isEmpty() || path == null){
            
        }
        
        
        
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
