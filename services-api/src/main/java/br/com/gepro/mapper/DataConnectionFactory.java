package br.com.gepro.mapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import br.com.gepro.common.GenericCommon;

public class DataConnectionFactory {

	private static SqlSessionFactory sqlSessionFactory;
	 
    static {
        try {
 
            Reader reader = Resources.getResourceAsReader("mybatis/ConfigMybatis.xml");
        	
            if (sqlSessionFactory == null) {
            	
            	Properties props = new Properties();
            	props.setProperty("database.driver", GenericCommon.getPropertyValue("database.driver"));
            	props.setProperty("database.url", GenericCommon.getPropertyValue("database.url"));
            	props.setProperty("database.username", GenericCommon.getPropertyValue("database.username"));
            	props.setProperty("database.password", GenericCommon.getPropertyValue("database.password"));
            	
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader, props);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
    
}
