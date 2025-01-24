package UtilityLayer;

import java.io.FileInputStream;
import java.util.Properties;

import BaseLayer.BaseClass;

public class PropertiesClass extends BaseClass {

	public static String getProperty(String keyname) {

		Properties prop=new Properties();
		
		String path=System.getProperty("user.dir")+ "/src/main/resources/ConfigurationLayer/Configure.properties";
		
		try {
			FileInputStream fis =new FileInputStream(path);
			prop.load(fis);
			return prop.getProperty(keyname);

		}
		catch (Exception e) {
					e.printStackTrace();
		}
		return null;
		
		
	}
}
