package tests;

import Page.CheckBoxPage;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CheckBoxTests extends BaseTest{

    public CheckBoxTests(String url) {
        super("https://demoqa.com/checkbox");
    }

    @Test
    public void checkBoxCommandsTest(){
        CheckBoxPage cb = new CheckBoxPage();
        cb.pushPlus();
        cb.checkCommands();
        cb.checkTextResult("commands");

    }
    @Test
    public void checkPage(){
        CheckBoxPage cb = new CheckBoxPage();
        cb.checkAuthorizationPage();
    }

    @Test
    public void checkBoxHomeTest(){
        CheckBoxPage cb = new CheckBoxPage();
        cb.pushPlus();
        cb.selectHome();
        String text = "home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile";
        String[] result = text.split(" ");
        cb.checkTextResultList(result);
    }

}
