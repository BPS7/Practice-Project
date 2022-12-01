package SwagLabs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enter_information_04 {
	public Enter_information_04(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first-name")
	WebElement firstName;
	@FindBy(id="last-name")
	WebElement lastName;
	@FindBy(id="postal-code")
	WebElement pincode;
	@FindBy(id="continue")
	WebElement button;
	public void firstname() {
		firstName.sendKeys("BHANU");
			}
public void lastname() {
	lastName.sendKeys("PRATAP");
		
	}
public void postalCode() {
	pincode.sendKeys("462023");	
}
public void continueButton() {
	button.click();
	
}

}
