package pages.interactions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DroppablePage extends BasePage {

    public DroppablePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="draggable")
    WebElement dragMe;
    @FindBy(id="droppable")
    WebElement dropHere;
    public DroppablePage actionDragMe() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe,dropHere).perform();

        String textTo = dropHere.getText();
        if(textTo.equals("Dropped!")){
            System.out.println("PASS: Source is dropped to target as expected!");
        } else{
            System.out.println("FAILS");
        }
        return this;
    }
}
