package ConfigData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class FetchConfigData {

	public static void main(String[] args) throws IOException {
		
		//get location of properties path
		
		FileInputStream file=new FileInputStream("D:\\Debabrata Rout\\Eclipse Workplace\\seleniumwebdriver\\testData\\config.properties");
		
		//set and load location of properties data
		Properties propertiesObj=new Properties();
		propertiesObj.load(file);
		
		//read data from properties
	    String url=propertiesObj.getProperty("appURL");
		String username1=propertiesObj.getProperty("userName");
		String password1=propertiesObj.getProperty("password");
		//get all data
		System.out.println(url);
		System.out.println(username1);
		System.out.println(password1);
		
		//get all keys
		Set<String> keys = propertiesObj.stringPropertyNames();
		System.out.println(keys);
		//Set<Object> keys = propertiesObj.keySet();
		//System.out.println(keys);
		
		//get values from properties file
		Collection<Object> data = propertiesObj.values();
		System.out.println(data);
		

	}

}
