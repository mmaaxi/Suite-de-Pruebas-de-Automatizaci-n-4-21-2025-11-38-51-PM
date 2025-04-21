package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("the user navigates to the Google Sheets URL")
    public void user_navigates_to_google_sheets_url() {
        page.navigateToGoogleSheets();
    }

    @When("the connection is established successfully")
    public void connection_established() {
        page.verifyConnection();
    }

    @Then("the data from the document is read correctly")
    public void data_read_correctly() {
        page.readDataFromSheet();
    }
}