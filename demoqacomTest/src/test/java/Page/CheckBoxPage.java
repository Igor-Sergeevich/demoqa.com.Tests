package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='main-header']")
    WebElement header;

    @FindBy(xpath = "//button[@aria-label=\"Expand all\"]")
    WebElement buttonPlus;

    @FindBy(xpath = "//button[@aria-label=\"Collapse all\"]")
    WebElement buttonMinus;

    @FindBy(css = "label[for=\"tree-node-home\"] span.rct-checkbox svg")
    WebElement homeBox;

    @FindBy(css = "label[for=\"tree-node-desktop\"] span.rct-checkbox svg")
    WebElement desktopBox;

    @FindBy(css = "label[for=\"tree-node-notes\"] span.rct-checkbox svg")
    WebElement notesBox;

    @FindBy(css = "label[for=\"tree-node-commands\"] span.rct-checkbox svg")
    WebElement commandsBox;

    @FindBy(css = "label[for=\"tree-node-documents\"] span.rct-checkbox svg")
    WebElement documentsBox;

    @FindBy(css = "label[for=\"ttree-node-workspace\"] span.rct-checkbox svg")
    WebElement workspaceBox;

    @FindBy(css = "label[for=\"tree-node-react\"] span.rct-checkbox svg")
    WebElement reactBox;

    @FindBy(css = "label[for=\"tree-node-angular\"] span.rct-checkbox svg")
    WebElement angularBox;

    @FindBy(css = "label[for=\"tree-node-veu\"] span.rct-checkbox svg")
    WebElement veuBox;

    @FindBy(css = "label[for=\"tree-node-office\"] span.rct-checkbox svg")
    WebElement officeBox;

    @FindBy(css = "label[for=\"tree-node-public\"] span.rct-checkbox svg")
    WebElement publicBox;

    @FindBy(css = "label[for=\"tree-node-private\"] span.rct-checkbox svg")
    WebElement privateBox;

    @FindBy(css = "label[for=\"tree-node-classified\"] span.rct-checkbox svg")
    WebElement classifiedBox;

    @FindBy(css = "label[for=\"tree-node-general\"] span.rct-checkbox svg")
    WebElement generalBox;

    @FindBy(css = "label[for=\"tree-node-downloads\"] span.rct-checkbox svg")
    WebElement downloadsBox;

    @FindBy(css = "label[for=\"tree-node-wordFile\"] span.rct-checkbox svg")
    WebElement wordFileBox;

    @FindBy(css = "label[for=\"tree-node-excelFile\"] span.rct-checkbox svg")
    WebElement excelFileBox;

    @FindBy(css = "span.text-success")
    List<WebElement> textResult;

    public void checkTextResult(String text) {
        assertThat(textResult.get(0).getText().equals(text));
    }

    public void checkTextResultList(String[] text) {
        for (int i = 0; i < text.length - 1; i++) {
            assertThat(textResult.get(i).getText().equals(text[i]));

        }
    }

    public void checkAuthorizationPage() {

        assertThat(header.getText()).contains("Check Box");
    }

    public void pushPlus() {
        buttonPlus.click();
    }

    public void selectHome() {
        homeBox.click();

    }

    public void checkCommands() {
        commandsBox.click();
    }

}
