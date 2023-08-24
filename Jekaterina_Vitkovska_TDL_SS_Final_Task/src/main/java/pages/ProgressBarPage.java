package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgressBarPage {
    public class ProgressBarPage {
        public ProgressBarPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }
    }

    @FindBy(xpath = "//ul/li[last()][@id='Random Progress Bar']")
    private WebElement randomProgressBarButton;

    public boolean isInitialized() { return this.randomProgressBarButton.isDisplayed();
    }
    public void clickOnRandomProgressBarButton() {
        randomProgressButton.click();
    }

}

