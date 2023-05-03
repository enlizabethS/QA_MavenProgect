package tests.alertFrameWindows;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SidePanel;
import pages.alertsFrameWindows.WindowsPage;
import tests.TestBase;

public class WindowsTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectBrowserWimdows();
    }
    @Test
    public void newTabTest(){
        new WindowsPage(driver).switchToNewTab(1).assertNewTabByMessage("This is a sample page");
    }
}
