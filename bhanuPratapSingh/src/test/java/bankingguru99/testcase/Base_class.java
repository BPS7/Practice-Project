package bankingguru99.testcase;
import utilitiesOfbanking.ReadUserData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import utilitiesOfbanking.ReadConfig;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import net.bytebuddy.utility.RandomString;

public class Base_class {
public static WebDriver driver;

ReadConfig ReadConfig = new ReadConfig();    
    	public String baseUrl=ReadConfig.getApp_Url();
    	public String userID =ReadConfig.get_usrid();
    	public String password =ReadConfig.get_password();
    	
    	ReadUserData ReadUserData = new ReadUserData();
           public String name=ReadUserData.name();
           public String dob=ReadUserData.dob();
           public String city=ReadUserData.city();
           public String addres=ReadUserData.address();
           public String email=ReadUserData.email();
           public String telephoneno=ReadUserData.telephoneno();
           public String state=ReadUserData.state();
           public String passwd=ReadUserData.password();
           public String pincode=ReadUserData.pincode();
           public String changepin =ReadUserData.changepin();
           public String changepnum =ReadUserData.changenumber();
           
        @Parameters("browser")
    	@BeforeClass
    	public  void intiallize_Browser(String browsern) throws IOException{
    		Properties prop = new Properties();
    		FileInputStream file = new FileInputStream("D:\\selenium\\bhanuPratapSingh\\src\\main\\java\\resource\\Global.properties");
    	          prop.load(file);  
    	         String browserName= prop.getProperty("browser");
    	          if(browserName.equalsIgnoreCase("Chrome")) { 
    	        	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
    		 driver = new ChromeDriver();
    		
    		driver.manage().window().maximize();
    		 }
    		
    			 
    			
    		          else if (browsern.equalsIgnoreCase("edge")){
    				System.setProperty("webdriver.edge.driver","C:\\Users\\bhanupratap\\edgedriver\\msedgedriver.exe");
    		          driver = new EdgeDriver();
    		           
    			}
    		         
    		          else {
    		        	  throw new IllegalArgumentException("The Browser Type is Undefined");
    		          }
    	          
    			  driver.manage().window().maximize();
		          driver.get("https://demo.guru99.com/V4/");  
    		}   
    	         
   	@AfterClass
    	public void tearDown() {
  		driver.quit();}

    	public void failed() {
    			
    			 File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    			   String demo = RandomString.make(3);
    			   File dest=new File("C:\\Users\\hp\\Documents\\screenshot\\edge"+demo+".jpg");
    	         try {
    				FileHandler.copy(src, dest);
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			}
    		
    	}

