package bankingguru99;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginPage {
    
	 WebDriver driver;
	 public loginPage(WebDriver driver){
		    this.driver=driver;
		PageFactory.initElements(driver, this);		
	 } 
	 @FindBy(xpath="//input[@name='uid']")
	 WebElement userName;
	 @FindBy(xpath="//input[@name='password']")
	 WebElement passwrd;
	 @FindBy(xpath="//input[@name='btnLogin']")
	 WebElement submit;
	
	 
	 @Test(groups={"login"},dataProvider="getData")
	 public void setuserName(String uName) {
		 userName.sendKeys(uName);
	 }
		 public void setPassword(String pwd) {
		 passwrd.sendKeys(pwd);
		 
	 }
	 
	 @Test(groups={"login"})
	 public void submitButton(){
		 submit.click();
		 }
	 @DataProvider
	 public Object[][] getData()
		{
			
			Object[][] data= new Object[1][2];
			//1st set 
			data[0][0]="mngr443901";
			data[0][1]="vEhYduq";
	        return data;
		}
}
