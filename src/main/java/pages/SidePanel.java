package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.alertsFrameWindows.AlertsPage;
import pages.alertsFrameWindows.WindowsPage;
import pages.bookstore.LoginPage;
import pages.interactions.DroppablePage;
import pages.widgets.SelectMenuPage;

public class SidePanel extends BasePage {
    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Login']")
    WebElement login;
    public LoginPage selectLogin() {
        clickWithJSExecutor(login,0,600);
        return new LoginPage(driver);
    }
    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
        click(alerts);
        return new AlertsPage(driver);
    }
    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;
    public WindowsPage selectBrowserWimdows() {
        clickWithJSExecutor(browserWindows,0,300);
        return new WindowsPage (driver);
    }
    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;
    public SelectMenuPage selectSelectMenu() {
        clickWithJSExecutor(selectMenu,0,600);
        return new SelectMenuPage(driver);
    }
    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;
    public DroppablePage selectDroppable() {
        clickWithJSExecutor(droppable,0,600);
        return new DroppablePage(driver);
    }
}
