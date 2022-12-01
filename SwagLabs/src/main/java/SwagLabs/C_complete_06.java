package SwagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class C_complete_06 {
	public C_complete_06(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")
	WebElement confirmText;
	public void orderstatus() {
		String orderstatus = confirmText.getText();
		System.out.println(orderstatus);
		Assert.assertEquals("THANK YOU FOR YOUR ORDER",orderstatus);
	}
}
	


