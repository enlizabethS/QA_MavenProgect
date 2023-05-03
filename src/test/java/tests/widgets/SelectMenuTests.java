package tests.widgets;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SidePanel;
import pages.widgets.SelectMenuPage;
import tests.TestBase;

public class SelectMenuTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).selectSelectMenu();
    }
    @Test
    public void selectOldStyleTest(){
       new SelectMenuPage(driver).selectOldStyle("Blue");
    }

    @Test
    public void multiSelectTest(){
        new SelectMenuPage(driver).multiSelect("Blue");
    }

    @Test
    public void multiSelectTest2(){
        new SelectMenuPage(driver).multiSelect2(new String[]{"Black","White","Red"});
    }
    @Test
    public void standartMultiSelectTest(){
        new SelectMenuPage(driver).standartMultiselect(1);
    }
}
