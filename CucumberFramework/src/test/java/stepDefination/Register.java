package stepDefination;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Register {
	
	WebDriver driver = null;
	
	@Given("^User navigates to Registration page$")
	public void user_navigates_to_Registration_page(){
	   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		
	}

	@When("^User provies the following details into the input fields$")
	public void user_provies_the_following_details_into_the_input_fields(DataTable dataTable) {
	   
		Map<String,String> map = dataTable.asMap(String.class,String.class);
		
		driver.findElement(By.id("input-firstname")).sendKeys(map.get("firstName"));
		driver.findElement(By.id("input-lastname")).sendKeys(map.get("lastName"));
		driver.findElement(By.id("input-email")).sendKeys(map.get("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(map.get("phone"));
		driver.findElement(By.id("input-password")).sendKeys(map.get("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(map.get("password"));
		
		
	}

	@And("^Selects the privacy policy option$")
	public void selects_the_privacy_policy_option() {
	    
		driver.findElement(By.name("agree")).click();
		
	}

	@And("^Clicks on Continue button$")
	public void clicks_on_Continue_button(){
	 
		driver.findElement(By.cssSelector("input[type='submit'][value='Continue']")).click();
		
	}

	@Then("^User should get successfully registered$")
	public void user_should_get_successfully_registered() {
		
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://tutorialsninja.com/demo/index.php?route=account/success")) {
			
			
			
		}else {
			
			System.out.println("User has not registered");
			
			Assert.fail("User has not registered");
			
		}
		driver.quit();
	   
	}

}
