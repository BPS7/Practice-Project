package bankingguru99;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewCm {
	WebDriver driver;
	 public NewCm(WebDriver driver){
		    this.driver=driver;
		PageFactory.initElements(driver, this);	}
	 
		@FindBy(xpath="//input[@name='name']")
		WebElement name;
		@FindBy(xpath="(//input[@name='rad1'])[2]")
		WebElement gender;
		@FindBy(xpath="//input[@id='dob']")
		WebElement dob;
		@FindBy(xpath="//tr/td/textarea")
		WebElement addres;
		@FindBy(xpath="//input[@name='city']")
		WebElement city;
		@FindBy(xpath="//input[@name='state']")
		WebElement state;
		@FindBy(xpath="//input[@name='pinno']")
		WebElement pin;
		@FindBy(xpath="//input[@name='telephoneno']")
		WebElement telephoneno;
		@FindBy(xpath="//input[@name='emailid']")
		WebElement email;
		@FindBy(xpath="//input[@name='password']")
		WebElement password;
		@FindBy(xpath="//input[@name='sub']")
		WebElement submitButton;
		
	@Parameters({"name"})
    @Test(groups= {"newcustomer"})
	 public void Name(String cname) {
		 name.sendKeys(cname);
	 }
    @Test(groups= {"newcustomer"})
	 public void Gender() {
		 gender.click();
	 }
	@Parameters({"dob"})
    @Test(groups= {"newcustomer"})
	 public void Dob(String DOB) {
		 dob.sendKeys(DOB);
	 }
	@Parameters({"Adddres"})
    @Test(groups= {"newcustomer"})
	 public void Addres(String Addr) {
		 addres.sendKeys(Addr);
	 }
	@Parameters({"City"})
    @Test(groups= {"newcustomer"})
	 public void City(String ccity) {
		 city.sendKeys(ccity);
	 }
	@Parameters({"State"})
    @Test(groups= {"newcustomer"})
	 public void State(String cstate) {
		 state.sendKeys(cstate);
	 }
	@Parameters({"Pincode"})
    @Test(groups= {"newcustomer"})
	 public void Pin(String pincode) {
		 pin.sendKeys(pincode);
	 }
	@Parameters({"Mobile number"})
    @Test(groups= {"newcustomer"})
	 public void Telephoneno(String num) {
		 telephoneno.sendKeys(num);
	 }
	@Parameters({"Email"})
    @Test(groups= {"newcustomer"})
	 public void Email(String cemail) {
		 email.sendKeys(cemail);
	 }
	@Parameters({"password"})
    @Test(groups= {"newcustomer"})
	 public void Password(String passw) {
		 password.sendKeys(passw);
	 }
	
    @Test(groups= {"newcustomer"})
	 public void submitButton() {
		 submitButton.click();
	 }
	 
	 
}
