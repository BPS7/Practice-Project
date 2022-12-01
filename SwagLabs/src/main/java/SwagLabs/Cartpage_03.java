package SwagLabs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cartpage_03 {
	public Cartpage_03(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	WebElement inventory;
	@FindBy(id="checkout")
	WebElement checkout;
	
	public void inventoryItem() {
	String cart = inventory.getText();
	Assert.assertTrue(true, cart);	
}
	public void checkOut() {
		checkout.click();
	}
}