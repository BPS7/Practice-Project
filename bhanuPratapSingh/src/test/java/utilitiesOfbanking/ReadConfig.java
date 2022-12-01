package utilitiesOfbanking;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		File src = new File("D:\\selenium\\bhanuPratapSingh\\configure\\config.properties");
		try {
			FileInputStream file = new FileInputStream(src);
			pro=new Properties();
			pro.load(file);
		}
		catch(Exception ex) {
			System.out.println("Exception is : "+ex.getMessage());
			
		}
	}
	public String getApp_Url() {
		 String url = pro.getProperty("baseUrl");
		 return url;
	}

	public String get_usrid() {
		 String id = pro.getProperty("userID");
		 return id;
	}
	public String get_password() {
		 String pass = pro.getProperty("password");
		 return pass;
	}
	

}
