package pages.bookstore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="userName")
    WebElement userNameFild;

    @FindBy(id="password")
    WebElement passwordFild;

    @FindBy(id="login")
    WebElement loginButton;

    public ProfilePage login (String uName, String pwd){
        type(userNameFild,uName);
        type(passwordFild,pwd);
        click(loginButton);
        return new ProfilePage(driver);
    }
    public LoginPage negativeLogin (String uName, String pwd){
        type(userNameFild,uName);
        type(passwordFild,pwd);
        click(loginButton);
        return this;
    }


}
