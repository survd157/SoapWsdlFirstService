package cucumber_steps;

import io.cucumber.java.en.*;

public class AdditionSteps {

	@Given("user has two numbers one and two")
	public void user_has_two_numbers_one_and_two() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("1 !!!");
	}

	@Given("number one is {int},number one is {int}")
	public void number_one_is_number_one_is(Integer int1, Integer int2) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("2 !!!");
	}

	@When("user adds number one and number two")
	public void user_adds_number_one_and_number_two() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("3 !!!");
	}

	@Then("the result is {int}")
	public void the_result_is(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("4 !!!");
	}

}
