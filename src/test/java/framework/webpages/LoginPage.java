package framework.webpages;
import org.openqa.selenium.By;

public class LoginPage extends ElementUtil {

    private  By emailTextField= By.id("email");
    private  By passwordField= By.id("pass");
    private By loginButton= By.id("loginbutton");

    public void enterEmail(String enterEmail){
        setValue(emailTextField,enterEmail);
    }
    public void enterPassword(String enterPassword){
        setValue(passwordField,enterPassword);
    }
    public void clickOnLoginButton(){
        clickOn(loginButton);
    }
}