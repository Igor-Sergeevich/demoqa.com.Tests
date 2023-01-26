package tests;

import Page.StartPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {


    public SearchTest(String url) {
        super("https://demoqa.com/books");
    }

    @Test
    public void checkPage(){
        StartPage sp = new StartPage();
        sp.checkStartPage("ToolsQA");
    }

    @Test (dataProvider = "searchNameBookList")
    public void checkSearchByBookTitleResults(String name){
        StartPage startPage = new StartPage();
        startPage.sendSearchBox(name);
        startPage.checkListByBooksTitle(name);
    }

    @Test (dataProvider = "searchAuthorBookList")
    public void checkSearchByAuthorName(String name){
        StartPage startPage = new StartPage();
        startPage.sendSearchBox(name);
        startPage.checkListByAuthorName(name);
    }


}
