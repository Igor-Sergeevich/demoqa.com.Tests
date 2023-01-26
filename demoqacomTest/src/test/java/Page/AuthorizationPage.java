package Page;

import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;

public class AuthorizationPage extends BasePage {

    public AuthorizationPage() {
        super();

    }

    @FindBy(xpath = "//input[@placeholder='UserName']")
    WebElement userNameBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordBox;

    @FindBy(xpath = "//button[@id='login']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='main-header']")
    WebElement header;

    @FindBy(id = "userName-value")
    WebElement authorizationLogin;

    @FindBy(id = "submit")
    WebElement logOutButton;

    @AfterMethod
    public void logOut() {
        if (logOutButton.isDisplayed()) {
            logOutButton.click();
        }
    }

    public void checkAuthorizationPage() {
        assertThat(header.getText()).contains("Login");
    }

    public void checkAuthorization(String name, String password) {
        userNameBox.sendKeys(name);
        passwordBox.sendKeys(password);
        loginButton.click();
        assertThat(authorizationLogin.getText()).as("login does not match").isEqualTo(name);
    }

}
