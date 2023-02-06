package tests;

import Page.ButtonPage;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {
    public ButtonsTest(String url) {
        super("https://demoqa.com/buttons");
    }


    @Test
    public void checkOneButtonIsDisplayed(){
        ButtonPage buttonPage = new ButtonPage();
        buttonPage.oneClickButtonIsDisplayed();
    }
     @Test
    public void checkDoubleButtonIsDisplayed(){
        ButtonPage buttonPage = new ButtonPage();
        buttonPage.doubleClickButtonIsDisplayed();
    }
     @Test
    public void checkRightButtonIsDisplayed(){
        ButtonPage buttonPage = new ButtonPage();
        buttonPage.rightClickButtonIsDisplayed();
    }


    @Test
    public void checkDoubleClick(){
        ButtonPage buttonPage = new ButtonPage();
        buttonPage.doubleClick();
    }

    @Test
    public void checkRightClick(){
        ButtonPage buttonPage = new ButtonPage();
        buttonPage.rightClick();
    }

    @Test
    public void checkOneClick(){
        ButtonPage buttonPage = new ButtonPage();
        buttonPage.oneClick();
    }
}
