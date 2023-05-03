package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JSExecutor extends BasePage{

    JavascriptExecutor js;
    public JSExecutor(WebDriver driver) {
        super(driver);
        js = (JavascriptExecutor) driver;
    }

    public JSExecutor enterDataWithJS(String user, String email) {

        if(user!=null && email !=null){
            js.executeScript("document.getElementById('userName').value='" + user + "';");
            js.executeScript("document.getElementById('userName').style.border='3px solid red';");
            js.executeScript("document.getElementById('userEmail').value='" + email + "';");
        }

        return this;
    }

    public JSExecutor clickOnSubmitWithJS() {
        js.executeScript("document.querySelector('#submit').style.backgroundColor='red';");
        js.executeScript("document.getElementById('submit').click();");
        return this;
    }

    public JSExecutor checkInnerTextWithJS() {
        String innerText = js.executeScript("return document.documentElement.innerText;").toString();
        System.out.println(innerText);
        System.out.println("*********************************");
        return this;
    }

    public JSExecutor refreshWindowJS() {
        js.executeScript("history.go(0);");
    return this;
    }

    public JSExecutor checkURLWithJS() {
        String url = js.executeScript("return document.URL;").toString();
        System.out.println("URL of this page: " + url);
        System.out.println("*********************************");
        return this;
    }

    public JSExecutor checkTitleOfPageWithJS() {
        String title = js.executeScript("return document.title;").toString();
        System.out.println("Title of this page: " + title);
        return this;
    }
}
