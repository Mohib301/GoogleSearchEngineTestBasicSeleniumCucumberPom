package stepDefinition;



import org.junit.Assert;

import GoogleMainClass.Bases;
import PageObjects.GooglePageObject;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginSteps extends Bases {
	
	GooglePageObject googlepage;
	
	@Given("^User is already on Google page$")
	public void user_is_already_on_Google_page()  {
	    // Write code here that turns the phrase above into concrete actions
         Bases.initializeDriver();
         googlepage = new GooglePageObject();
	  
         String expectedTile = "Google";
         Assert.assertEquals(googlepage.pageTitle(), expectedTile);
	}

	@When("^User input '(.+)' data in google empty box$")
	public void user_input_New_York_data_in_google_empty_box(String Data1){

	    // Write code here that turns the phrase above into concrete actions
		googlepage = new GooglePageObject();
		googlepage.inputDataInBox(Data1);
	}


	@Then("^User is search home page$")
	public void user_is_search_home_page()  {
	    // Write code here that turns the phrase above into concrete actions
	}
}
