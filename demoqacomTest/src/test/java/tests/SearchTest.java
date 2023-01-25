package tests;

import Page.StartPage;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void checkPage(){
        StartPage sp = new StartPage();
        sp.checkStartPage("ToolsQA");
    }

    @Test
    public void checkSearchByBookTitleResults(){
        StartPage startPage = new StartPage();
        startPage.sendSearchBox("Java");
        startPage.checkListByBooksTitle("Java");
    }

    @Test
    public void checkSearchByAuthorName(){
        StartPage startPage = new StartPage();
        startPage.sendSearchBox("addy osmani");
        startPage.checkListByAuthorName("Addy Osmani");
    }


}
