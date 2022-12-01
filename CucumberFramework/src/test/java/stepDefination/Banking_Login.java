package stepDefination;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Banking_Login {
	
WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\git\\swaglab\\SwagLabs\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Given(value = "^I navigate to the guru99 website$")
	public void I_navigate_to_the_guru99_website() {  
		driver.get("https://demo.guru99.com/V4/");
		
	}
	@When("^enter Username as \"([^\\\"]*)\" and Password as \"([^\\\"]*)\"")
	public void enter_Username_as_and_Password_as(String uname  , String pass) {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		 
	}
	@And(value = "^I click on Login$")
	public void I_click_on_Login() {
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		 	
	}
	@Then("^User login based on expected \"([^\"]*)\" status$")
	public void User_login_based_on_expected_status(String expectedLoginStatus) {
		
		String expectedStatus=expectedLoginStatus;
		String actualStatus=null;
		try {
			Alert alert = driver.switchTo().alert();
			String actualText = alert.getText();
			if(actualText.equals("User or Password is not valid")) {
				actualStatus="fail";
			}else {
				actualStatus="success";
			}
		}catch(Exception e) {
			actualStatus="success";		
		}
		
		if(actualStatus.equals(expectedStatus)) {
			//Do nothing
		}else {
			Assert.fail("Actual login status is not equal to the expected login status");
		}
		
		
	}
	@After
	public void teardown() {
		driver.quit();
		
	}
	

}
