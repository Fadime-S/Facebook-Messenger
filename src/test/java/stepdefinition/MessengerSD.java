package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webpages.MessangerPage;
import org.testng.Assert;

public class MessengerSD {

    private MessangerPage  messangerPage = new MessangerPage();

    @Given("^I am on messenger page$")
    public void setMessengerPage() {
        messangerPage.clickOnMessengerLink();
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://www.messenger.com/");
    }

    @When("^I enter (.+) into (username|password) field on the messenger page$")
    public void enterDataIntoTextFields(String value, String textField){

        switch (textField){
            case "username":
                messangerPage.enterMail(value);
                break;
            case "password":
                messangerPage.enterPassword(value);
        }

    }
    @And ("I enter (.+) into (password) field on messenger page")
    public void enterPasswordIntoTextFields(String value, String textField){

    }
    @And("^I click on sign in button on messenger page$")
    public void clickOnLoginButton(){
        messangerPage.clickOnSignupButton();
    }

    @Then("^I verify invalid login message on sign in page$")
    public void verifySignInErrorMessage() {
        Assert.assertEquals(messangerPage.getErrorMessage(), "Incorrect Email");
    }



}
