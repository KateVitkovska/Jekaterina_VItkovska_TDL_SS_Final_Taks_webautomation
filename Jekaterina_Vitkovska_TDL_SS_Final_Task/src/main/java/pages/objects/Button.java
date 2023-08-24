package pages.objects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class Button {

    public class Button extends BasePageObject {
        public Button(String name, String locator, String value) {
            super(name, locator, value);
        }

        public void click() {
            WebElement button = getWebElement(getLocator());
            button.sendKeys(Keys.DOWN);
            button.click();
            System.out.println("Button " + getName() + " was clicked");
        }
    }

}
