package bankingguru99;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddnewCoustomer {
	 WebDriver driver;
	 public AddnewCoustomer(WebDriver driver){
		    this.driver=driver;
		PageFactory.initElements(driver, this);		
	 } 
	 @FindBy(xpath="//li/a[text()='New Customer']")
	 WebElement NewCustomer;
      
	 @Test(dependsOnMethods = {"iframeH"})
	 public void newCoustome() {
		 
		 NewCustomer.click();
		 //driver.findElement(By.xpath("//li/a[text()='New Customer']")).click();
		
	 }
}
