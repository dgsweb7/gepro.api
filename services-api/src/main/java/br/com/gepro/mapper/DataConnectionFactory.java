package br.com.gepro.mapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataConnectionFactory {

	private static SqlSessionFactory sqlSessionFactory;
	 
    static {
        try {
 
            String resource = "/Users/dcunha1/documents/projects/gepro.api/services-api/services/src/main/resources/ConfigMybatis.xml";
            File file = new File(resource);
            System.out.println(file.exists());
            Reader reader = new FileReader(resource);            
//            
//            String resource = "src/main/resources/ConfigMybatis.xml";
//            Reader reader = Resources.getResourceAsReader(resource);
        	
            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (@SuppressWarnings("hiding") IOException iOException) {
            iOException.printStackTrace();
        }
    }
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
    
}
