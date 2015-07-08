package br.com.gepro.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GenericCommon {

	private static Properties properties = null;

	public String getProperty(String key) {
		return getPropertyValue(key);
	}

	public static String getPropertyValue(String value) {
		
		if (properties == null) {
			try {
				properties = new Properties();
				properties.load(new FileInputStream("config/application.properties"));
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		
		return properties.getProperty(value);
	}

}
