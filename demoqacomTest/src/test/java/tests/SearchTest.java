package tests;

import Page.StartPage;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void checkPage(){
        StartPage sp = new StartPage();
        sp.checkStartPage("ToolsQa");
    }


}
