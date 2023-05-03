package pages.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class BrokenLinksImages extends BasePage {
    public BrokenLinksImages(WebDriver driver) {
        super(driver);
    }
@FindBy(tagName = "a")
    List<WebElement> allLinks;
    public BrokenLinksImages checkBrokenLinks() {
        for (int i = 0; i < allLinks.size(); i++) {
            WebElement element = allLinks.get(i);
            String url = element.getAttribute("href");
            verifyLinks(url);
        }
    return this;
    }
    @FindBy(tagName = "img")
    List<WebElement> imges;
    public BrokenLinksImages checkBrokenImages() {
        System.out.println("We have "+ imges.size() + " images");
        for (int i = 0; i < imges.size(); i++) {
            WebElement element = imges.get(i);
            String imgURL = element.getAttribute("src");
            System.out.println("URL of image " + (i + 1) + "is : " + imgURL);
            verifyLinks(imgURL);

        try {
            boolean imageDisplayed = (Boolean)((JavascriptExecutor)driver)
                    .executeScript("return(typeof arguments[0].naturalWidth!=undefined && arguments[0].naturalWidth>0);",element);
            if(imageDisplayed){
                System.out.println("DISPLAY --> Ok");
                System.out.println("*******************");
            } else {
                System.out.println("DISPLAY --> Broken");
                System.out.println("*******************");
            }
        } catch (Exception e){
            System.out.println("ERROR  occurred");
        }
        }

        return  this;
    }

}
