package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sofwtwaretester {
//In this class we optimized the code by using the regular expression 
//([a-zA-Z]{1,})- in this way we can pass this to the argument of the method
//[a-zA-Z]{1,}-this regular expression will take any character and at least of size 1.
// (.*) accept anything
//[^\"]* accept number and character
	@Given("^I am a ([a-zA-Z]{1,}) software tester$")
	public void I_am_a_good_software_tester(String testertype) {
		System.out.println(">>Given--I am a "+testertype+" software tester");
	}
    @When("^I go to work$")
    public void I_go_to_work() {
    	System.out.println(">>When--I go to work");
		
	}
    @And("^I ([a-zA-Z]{1,}) with it$")
    public void I_involve_with_it(String worktype) {
    	System.out.println(">>And--I "+worktype+" with it");
		
	}
    @Then("^My boss ([a-zA-Z]{1,}) me$")
    public void My_boss_loves_me(String bossreaction) {
    	System.out.println(">>Then--My boss "+bossreaction+" me");
		
	}
    
}
