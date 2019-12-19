package framework.webpages;

import org.openqa.selenium.By;

public class MessangerPage extends ElementUtil {

    // variables
    //locators
    //constructor
    //methods

    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By signUpButton = By.id("loginbutton");
    private By errorMessage = By.xpath("//div[contains(text(),'Incorrect Email')]");
    private By messengerLink = By.linkText("Messenger");

    public void enterMail(String email) {
        setValue(emailField, email);
    }

    public void enterPassword(String password) {
        setValue(passwordField, password);
    }

    public void clickOnSignupButton() {
        clickOn(signUpButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    public void clickOnMessengerLink() {
        clickOn(messengerLink);
    }

}
