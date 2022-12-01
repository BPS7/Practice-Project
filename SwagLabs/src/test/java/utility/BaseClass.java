package utility;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class BaseClass {
	 
	public WebDriver driver;
	
	@Parameters("browser")
 	@BeforeSuite
 	public  void intiallize_Browser(String browsern) throws IOException{
 		
 	          if(browsern.equalsIgnoreCase("Chrome")) { 
 	        	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\git\\swaglab\\SwagLabs\\Driver\\chromedriver.exe");
 		 driver = new ChromeDriver();	
 		driver.manage().window().maximize();
 		
 		 }	
 		          else if (browsern.equalsIgnoreCase("edge")){
 				System.setProperty("webdriver.edge.driver","D:\\selenium\\SwagLabs\\Driver\\msedgedriver.exe");
 		          driver = new EdgeDriver();         
 			}
 		         
 		          else {
 		        	  throw new IllegalArgumentException("The Browser Type is Undefined");
 		          }
 	         
	
}
	
	 @AfterSuite
	 public void teardown() {
		 driver.quit();
	 }
	 
	 

	
	
	 
}
