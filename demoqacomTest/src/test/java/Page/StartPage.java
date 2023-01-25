package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class StartPage extends BasePage {
    public StartPage() {
        super();
    }
    @FindBy (id = "searchBox")
    private WebElement searchBox;

    public void checkStartPage(String text){
        assertThat(driver.getTitle().contains(text));

    }



}
