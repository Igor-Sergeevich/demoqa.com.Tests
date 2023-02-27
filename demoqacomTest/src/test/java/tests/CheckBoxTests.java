package tests;

import Page.CheckBoxPage;
import org.testng.annotations.Test;


public class CheckBoxTests extends BaseTest {

    public CheckBoxTests(String url) {
        super("https://demoqa.com/checkbox");
    }

    @Test
    public void checkPage() {
        CheckBoxPage cb = new CheckBoxPage();
        cb.checkAuthorizationPage();
    }

    @Test(dataProvider = "checkBoxList")
    public void checkBoxTests(String box, String result) {
        System.out.println(box);
        System.out.println(result);

        CheckBoxPage cb = new CheckBoxPage();
        cb.pushPlus();
        cb.selectBox(box);
        cb.checkTextResultList(result);


    }

}
