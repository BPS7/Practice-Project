package SwagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_class_07 {
	public  Logout_class_07(WebDriver driver){
		PageFactory.initElements(driver,this);
}
	@FindBy(id="react-burger-menu-btn")
	WebElement click;
	@FindBy(id="logout_sidebar_link")
	WebElement logout;
		
	public void Logout() throws InterruptedException {
		click.click();
		Thread.sleep(2000);
		logout.click();
	}

}
