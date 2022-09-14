package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @Given("user is on home page")
    public void user_is_on_home_page() {
       System.out.println("user is on home page");

    }

    @When("user searches for specific lesson ex : {string}")
    public void user_searches_for_specific_lesson_ex(String string) {
        System.out.println("user searches for specific lesson ex : {any lesson name}");

    }

    @And("user clicks on search button")
    public void user_clicks_on_search_button() {
        System.out.println("user clicks on search button");

    }

    @And("user chooses the 2nd lesson")
    public void user_chooses_the_2nd_lesson() {
        System.out.println("user chooses the 2nd lesson");

    }

    @And("user clicks on worksheet section")
    public void user_clicks_on_worksheet_section() {
        System.out.println("user clicks on worksheet section");

    }
    @Then("user is navigated to the worksheet page with number of questions")
    public void user_is_navigated_to_the_worksheet_page_with_number_of_questions() {
        System.out.println("user is navigated to the worksheet page with number of questions");
    }
}
