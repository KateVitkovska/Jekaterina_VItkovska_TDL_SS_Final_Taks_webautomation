package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.DemoSitePage;

public class DemoSitePage {

    public DemoSitePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='post-2715']/div[2]/div/div/div[2]/div[1]/ul/li[6]/a)")
    private WebElement dialogBoxButton;

    public boolean isInitialized() {
        return this.dialogBoxButton.isDisplayed();
    }

    public void clickOnDialogBoxButton() {
        dialogBoxButton.click();
    }

    @FindBy(xpath = "//li[1][@class=\"\"]")
    private WebElement TabsButton;

    public boolean isInitialized() {
        return this.TabsButton.isDisplayed();
    }

    public void clickOnTabsButton() {
        TabsButton.click();

    }
}