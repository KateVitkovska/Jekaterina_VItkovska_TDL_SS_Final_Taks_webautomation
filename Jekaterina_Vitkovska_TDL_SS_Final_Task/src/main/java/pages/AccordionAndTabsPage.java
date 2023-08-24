package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccordionAndTabsPage {
    public AccordionAndTabsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='post-2715']/div[2]/div/div/div[2]/div[1]/ul/li[6]/a)")
    private WebElement section2;

    public boolean isInitialized() { return this.section2.isDisplayed();
    }
    public void clickOnSection2() {
        section2.click();
    }
}
