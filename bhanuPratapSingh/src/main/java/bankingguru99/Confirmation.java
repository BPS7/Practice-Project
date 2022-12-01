package bankingguru99;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Confirmation {
	WebDriver driver;
	public static String USERid;
	 public Confirmation(WebDriver driver){
		    this.driver=driver;
		PageFactory.initElements(driver, this);	
		}
	 @FindBy(className = "heading3")
		WebElement heading;
		@FindBy(xpath = "//table[@id='customer']/tbody/tr[4]/td[2]")
		WebElement id;
		@Test(dependsOnMethods = {"submitButton"})
		public void heading()  {
	 		 String confirmation=heading.getText();
		 System.out.println(confirmation);
		 }
		@Test(dependsOnMethods = {"submitButton"})	
		 public String id() {
		     USERid= id.getText();
	 	     System.out.println(USERid);
	 	     return USERid;
	}

}
