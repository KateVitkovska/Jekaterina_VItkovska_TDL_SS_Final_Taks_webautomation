package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.objects.Button;
import pages.objects.TextField;

public class CreateNewUserPage {
    public CreateNewUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Create an account')]")
    private WebElement createAnAccountButton;

    public TextField name = new TextField("Name", "name=username", "name");
    public TextField email = new TextField("Email", "name=email", "email");
    public TextField password = new TextField("Password", "name=password", "password");
    public Button createAnAccounButton = new Button("Create an account", "name=createaccount");

    public void signInPage() {
        this.name.clearField();
        this.name.setValue();
        this.password.clearField();
        this.password.setValue();
        this.email.clearField();
        this.email.setValue();
        this.createAnAccounButton.click();
    }
}
