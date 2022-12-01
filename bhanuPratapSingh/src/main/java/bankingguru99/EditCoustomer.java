package bankingguru99;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EditCoustomer extends Confirmation {
	WebDriver driver;
	public static String id1;
	 public EditCoustomer(WebDriver driver){
		 super(driver);
		    this.driver=driver;
		PageFactory.initElements(driver, this);	
		}
	 @FindBy(xpath="//input[@name='cusid']")
	 WebElement ID;
	 @FindBy(xpath="//input[@name='AccSubmit']")
	 WebElement submitButt;
	 @FindBy(xpath="//input[@name='pinno']")
	 WebElement pincd;
	 @FindBy(xpath="//input[@name='telephoneno']")
	 WebElement mobileno;
	 @FindBy(xpath="//input[@name='sub']")
	 WebElement subAfteredit;
	 @FindBy(xpath="//a[text()='Edit Customer']")
	 WebElement editbutton;
	
	 @Test(dependsOnGroups = {"id"})
	 public void editButton() {
		 editbutton.click();
	 }
	 @Test(groups= {"editcustomer"})
	 public void ID() {
		id1 = super.USERid;
		 ID.sendKeys(id1);
		 
	 }
	 @Test(groups= {"editcustomer"})
	 public void button() {
		 submitButt.click();
		}
	 @Parameters({"editpin"})
	 @Test(groups= {"editcustomer"})
	 public void changepin(String pin) {
		 pincd.sendKeys(pin);
	 }
	 @Parameters({"editmobile"})
	 @Test(groups= {"editcustomer"})
	 public void changemobileno(String mobilen) {
		 mobileno.sendKeys(mobilen);
	 }
	 
	 @Test(groups= {"editcustomer"})
	 public void submitAfter() {
		 subAfteredit.click();
		 
	 }
	 @Test(groups= {"editcustomer"})
	 public  void alert() {
	 	driver.switchTo().alert().accept();	 
}
}