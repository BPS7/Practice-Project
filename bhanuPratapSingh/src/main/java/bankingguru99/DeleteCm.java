package bankingguru99;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DeleteCm extends Confirmation {
	WebDriver driver;
	String usID;
	 public DeleteCm(WebDriver driver){
		 super(driver);
		    this.driver=driver;
		PageFactory.initElements(driver, this);	
		}
	 @FindBy(xpath="//li/a[text()='Delete Customer']")
	 WebElement deletecustomer;
	 @FindBy(xpath="//input[@name='cusid']")
	 WebElement enterid;
	 @FindBy(xpath="//input[@name='AccSubmit']")
	 WebElement submit;
	 @FindBy(xpath="//li/a[text()='Log out']")
	 WebElement logout;
	 
	 @Test(dependsOnGroups = {"editcustomer"})
	 public void deleteCustomer() {
		 deletecustomer.click();
	 }
	 @Test(groups= {"deletcoustomer"})
	 public void userID() {
		 usID=super.USERid;
		 enterid.sendKeys(usID);
	 }
	 @Test(groups= {"deletcoustomer"})
	 public void submit() {
		 submit.click();
	 }
	 @Test(groups= {"deletcoustomer"})
	 public void alerts() {
		 driver.switchTo().alert().accept();
		 	driver.switchTo().alert().accept(); 
	 }
	 @Test(groups= {"deletcoustomer"})
	 public void logout() {
		 logout.click();
	 }
	 @Test(groups= {"deletcoustomer"})
	 public void confirmlogout() {
		 System.out.println(driver.switchTo().alert().getText());
		 	driver.switchTo().alert().accept();
		 
	 }
	 	
}
