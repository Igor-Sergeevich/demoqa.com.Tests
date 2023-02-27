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

    @FindBy(css = "label[for=\"tree-node-workspace\"] span.rct-checkbox svg")
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

    public void checkTextResultList(String text) {
        String[] result = text.split(" ");
        for (int i = 0; i < result.length; i++) {
            assertThat(textResult.get(i).getText().equals(result[i]));

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

    public void selectBox(String box) {
        String[] boxes = box.split(" ");
        for (int i = 0; i < boxes.length; i++) {
            switch (boxes[i]) {
                case ("Home"):
                    homeBox.click();
                    break;

                case ("Desktop"):
                    desktopBox.click();
                    break;

                case ("Notes"):
                    notesBox.click();
                    break;

                case ("Commands"):
                    commandsBox.click();
                    break;

                case ("Documents"):
                    desktopBox.click();
                    break;

                case ("WorkSpace"):
                    workspaceBox.click();
                    break;

                case ("React"):
                    reactBox.click();
                    break;

                case ("Angular"):
                    angularBox.click();
                    break;

                case ("Veu"):
                    veuBox.click();
                    break;

                case ("Office"):
                    officeBox.click();
                    break;

                case ("Public"):
                    publicBox.click();
                    break;

                case ("Private"):
                    publicBox.click();
                    break;

                case ("Classified"):
                    classifiedBox.click();
                    break;

                case ("General"):
                    generalBox.click();
                    break;

                case ("Downloads"):
                    downloadsBox.click();
                    break;

                case ("Word"):
                    wordFileBox.click();
                    break;

                case ("Excel"):
                    excelFileBox.click();
                    break;
            }
        }
    }

}
