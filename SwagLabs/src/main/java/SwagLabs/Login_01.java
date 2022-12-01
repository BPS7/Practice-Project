package SwagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_01 {
	WebDriver driver;
	public  Login_01(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginButton;
	
     public void baseurl(String baseurl) {
    	 driver.get(baseurl);
    	 
     }
    public void username(String uName) {
    	username.sendKeys(uName);
    	
    }
 public void passw(String pass) {
	 password.sendKeys(pass);
    	
    }
 public void submit() {
 	loginButton.click();
 }
}
