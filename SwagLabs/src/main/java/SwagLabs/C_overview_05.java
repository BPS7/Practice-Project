package SwagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class C_overview_05 {
	public C_overview_05(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	WebElement text;
	@FindBy(id = "finish")
	WebElement buttonfinish;
	
	public void overview() {
	String overview = text.getText();
	Assert.assertTrue(true, overview);}
	
	public void finish() {
	buttonfinish.click();

}
}
