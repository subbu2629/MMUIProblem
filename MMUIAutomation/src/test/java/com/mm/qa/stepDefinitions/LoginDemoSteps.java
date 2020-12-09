package com.mm.qa.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mm.qa.Util.TestBase;
import com.mm.qa.pages.loginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class LoginDemoSteps extends TestBase{
	
	loginPage lp= new loginPage();
	
	@Given("^User logs into the portal$")
	public void user_logs_into_the_portal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   TestBase.initialization();
	}

	@When("^user verifies all the details$")
	public void user_verifies_all_the_details() throws Throwable {
	    System.out.println("user is trying to verify all the values");
	    	}

	@Then("^the value count should be (\\d+)$")
	public void the_value_count_should_be(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this method is to check count");
	    assertSame(lp.valueCount(), arg1);

	  }

	@Then("^all the values on the screen should be greater than zero$")
	public void all_the_values_on_the_screen_should_be_greater_than_zero() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is greater than zero test");
		assertTrue(lp.valueGreaterThanZero());  
	}

	@Then("^values should be formatted as currencies$")
	public void values_should_be_formatted_as_currencies() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is currency formatted test");
		assertTrue(lp.currencyFormat());
	   
	}

	@Then("^the total balance should be correct based on the listed values$")
	public void the_total_balance_should_be_correct_based_on_the_listed_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("This is total balance test");
        assertTrue(lp.totalBalanceVerify());

	  
	}

}
