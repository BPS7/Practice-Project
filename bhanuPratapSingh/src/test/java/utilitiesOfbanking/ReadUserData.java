package utilitiesOfbanking;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadUserData {
	Properties pro;
	public ReadUserData() {
		File src = new File("D:\\selenium\\bhanuPratapSingh\\DataProvider\\userdata.properties");
		try {
			FileInputStream file = new FileInputStream(src);
			pro=new Properties();
			pro.load(file);
		}
		catch(Exception ex) {
			System.out.println("Exception is : "+ex.getMessage());
			
		}
	}
	public String name() {
		 String name = pro.getProperty("name");
		 return name;
	}
	public String dob() {
		 String dob = pro.getProperty("dob");
		 return dob;
	}
	public String city() {
		 String city = pro.getProperty("city");
		 return city;
	}
	public String pincode() {
		 String pincode = pro.getProperty("pincode");
		 return pincode;
	}
	public String state() {
		 String state = pro.getProperty("state");
		 return state;
	}
	public String telephoneno() {
		 String telephoneno = pro.getProperty("telephoneno");
		 return telephoneno;
	}
	public String address() {
		 String address = pro.getProperty("address");
		 return address;
	}
	public String email() {
		 String email = pro.getProperty("email");
		 return email;
	}
	public String password() {
		 String password = pro.getProperty("password");
		 return password;
	}
	public String changepin() {
		 String changepin = pro.getProperty("changepin");
		 return changepin;
	}
	public String changenumber() {
		 String changenumber = pro.getProperty("changemobile");
		 return changenumber;
	}

}
