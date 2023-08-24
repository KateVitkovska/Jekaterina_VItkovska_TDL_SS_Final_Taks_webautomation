package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogBoxesPage {
    public DialogBoxesPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Create new user')]")
    private WebElement createNewUserButton;
    @FindBy(xpath = "//button[contains(text(),'Progress Bar')]")
    private WebElement progressBarPageButton;

    @FindBy(xpath = "")
    private WebElement messageBoxTab;

    @FindBy(xpath = "")
    private WebElement FormTab;

    public boolean isInitialized() { return this.createNewUserButton.isDisplayed();
    }
    public void clickOnCreateNewUserButton() {
        createNewUserButton.click();
    }
    public boolean isInitialized() { return this.progressBarButton.isDisplayed();
    }
    public void clickOnprogressBarButton() {
        progressBarButton.click();
    }
    public boolean isInitialized() { return this.messageBoxTab.isDisplayed();
    }
    public void clickOnMessageBoxTab() {
        messageBoxTab.click();
    }
    public boolean isInitialized() { return this.FormTab.isDisplayed();
    }
    public void clickOnFormTab() {
        FormTab.click();
    }
}
}