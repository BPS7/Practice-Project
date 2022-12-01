package bankingguru99;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class IframeHandle {
	 WebDriver driver;
	 public IframeHandle(WebDriver driver){
		    this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//iframe[@id='ad_iframe']")
		WebElement iframe;
		@FindBy(xpath="//span[text()='Close']")
		WebElement close;
		@FindBy(xpath="//div[@id='dismiss-button']")
		WebElement dismiss;
	
		@Test(dependsOnGroups = {"login"})
public void iframeH() {
	try {  driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
	  Thread.sleep(2000);
	  
	driver.switchTo().frame(iframe);
    close.click();
   // dismiss.click();
   driver.switchTo().defaultContent();
   }
	catch(Exception exe) {
		dismiss.click();
		   driver.switchTo().defaultContent();
		//System.out.println("no frmae found");
		
		
		}
}}