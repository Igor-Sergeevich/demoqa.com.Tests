package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class ButtonPage extends BasePage{

    public ButtonPage(){
        super();
    }

    @FindBy(xpath = "//*[text() =\"Double Click Me\"]")
    WebElement doubleClickButton;

     @FindBy(xpath = "//*[text() =\"Right Click Me\"]")
    WebElement rightClickButton;

     @FindBy(xpath = "//*[text() =\"Click Me\"]")
    WebElement oneClickButton;

     @FindBy(id = "doubleClickMessage")
     WebElement doubleClickMessage;

     @FindBy(id = "rightClickMessage")
     WebElement rightClickMessage;

     @FindBy (id = "dynamicClickMessage")
     WebElement oneClickMessage;

     public void oneClickButtonIsDisplayed (){
         assertThat(doubleClickButton.isDisplayed());
     }

     public void rightClickButtonIsDisplayed (){
         assertThat(rightClickButton.isDisplayed());
     }

     public void doubleClickButtonIsDisplayed (){
         assertThat(oneClickButton.isDisplayed());
     }

     public void doubleClick(){
         Actions actions = new Actions(driver);
         actions.doubleClick(doubleClickButton).perform();
         assertThat(doubleClickMessage.getText().contains("You have done a double click"));
     }
     public void rightClick(){
         Actions actions = new Actions(driver);
         actions.contextClick(rightClickButton).perform();
         assertThat(rightClickMessage.getText().contains("You have done a right click"));

     }
    public void oneClick(){

         oneClickButton.click();
         assertThat(oneClickMessage.getText().contains("You have done a dynamic click"));

     }

}
