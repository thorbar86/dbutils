
package cat.teknos.m06.dbutils;

import cat.teknos.m06.dbutils.exception.DbUtilsException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SchemaLoaderImplTest {
    
    private static final String path = "src/test/Resources/DbUtilsResources/DbUtils.sql";
    
    public SchemaLoaderImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

  //Shan d'implementar total 6 texts total
    @Test
    public void PathISNull() throws DbUtilsException {
          var fileUtils = new FileUtilsImpl();
        
        assertFalse(fileUtils.load(path));
    }
  
    
}
