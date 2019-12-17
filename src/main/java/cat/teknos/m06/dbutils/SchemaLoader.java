package cat.teknos.m06.dbutils;

import cat.teknos.m06.dbutils.exception.DbUtilsException;
import cat.teknos.m06.dbutils.exception.InvalidSourceException;

//mirar si el path exite, i lanzar excepciones si no esta bien


public interface SchemaLoader {
    /***
     * Loads a db schema from a porovided sql file
     * 
     * @param path to an sql file
     * @throws InvalidSourceException if the file doesn't exist
     *         or is a folder 
     * @throws DbUtilsException if path is null or empty 
     *         or file name doesn't end with .sql
     */
    void load(String path) throws InvalidSourceException, DbUtilsException;
    
}
