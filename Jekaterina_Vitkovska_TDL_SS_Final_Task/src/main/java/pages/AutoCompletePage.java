package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class AutoCompletePage {
        public AutoCompletePage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "")
        private WebElement SearchField;
        public boolean isInitialized() {
            return this.SearchField.isDisplayed();
        }
    }