package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StartPage extends BasePage {

    public StartPage() {
        super();
    }

    List<WebElement> bookList;

    @FindBy(id = "searchBox")
    private WebElement searchBox;

    @FindBy(id = "login")
    private WebElement buttonLogin;

    @FindBy(id = "userName-value")
    WebElement authorizationLogin;

    public void checkStartPage(String text) {
        assertThat(driver.getTitle()).contains(text);

    }

    public void sendSearchBox(String text) {
        searchBox.sendKeys(text);
        searchBox.sendKeys(Keys.RETURN);
    }

    public void checkListByBooksTitle(String text) {
        bookList = driver.findElements(By.xpath("//*[@class='rt-tbody']//a[@href]"));

        for (int i = 0; i < bookList.size(); i++) {

            assertThat(bookList.get(i).getText()).contains(text);
        }
    }

    public void checkListByAuthorName(String text) {
        List<WebElement> authorList = driver.findElements(By.xpath("//div[@class='rt-td'][contains(@style, '130')]"));
        for (int i = 0; i < authorList.size(); i++) {
            if (authorList.get(i).getText().equals("...")) {
                assertThat(authorList.get(i).getText()).contains(text);
            }
        }
    }

}
