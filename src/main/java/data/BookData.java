package data;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BookData extends BasePage {
        public static final String BOOK_TITLE = "Git";

    public BookData(WebDriver driver) {
        super(driver);
    }
}

