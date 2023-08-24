package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadCompleteTab {

        public DownloadCompleteTab(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

    @FindBy(xpath = "")
    private WebElement OkButton;

    public boolean isInitialized() {
        return this.OkButton.isDisplayed();
    }

    public void clickOnOKButton() {
        OkButton.click();
    }
}
