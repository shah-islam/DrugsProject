package tt.drugs.stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.drugs.pageAction.DrugsAndConditionActions;

public class ConditionAndDiseasesSteps {
	DrugsAndConditionActions drugsAction = new DrugsAndConditionActions();
	
	@Given("User navigate the url")
	public void user_navigate_the_url() {
		drugsAction.homePage();
	}
	
	
	@When("Click on click desease nad condition from carosel")
	public void click_on_click_desease_nad_condition_from_carosel() {
		drugsAction.deseaseAndCondition();
	}

	@When("Input fever in search textbox")
	public void input_fever_in_search_textbox() {
		drugsAction.searchText();
	}

	@Then("User can see description of fever")
	public void user_can_see_description_of_fever() {
		drugsAction.feverMsg();
	}

	}




