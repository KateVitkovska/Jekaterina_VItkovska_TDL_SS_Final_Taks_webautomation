package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RandomProgressBarTab {

    public class RandomProgressBarTab {
        public RandomProgressBarTab(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }
    }
    @FindBy(xpath = "//button[contains(@id,'color button')]")
    private WebElement randomColorButton;


    public void clickOnRandomProgressBarButton() {
        randomColorButton.click();
    }
    @FindBy(xpath = "//button[contains(@id,'numButton')]")
    private WebElement randomValueDeterminantButton;

    public boolean isInitialized() { return this.randomValueDeterminantButton.isDisplayed();
    }
    public void clickOnRandomValueDeterminantButton() {
        randomValueDeterminantButton.click();
    }
}
