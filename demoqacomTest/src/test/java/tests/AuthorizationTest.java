package tests;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AuthorizationTest extends BaseTest {

    @Test
    public void openDemoqaComBookTest(){
        assertThat(driver.getTitle().contains("ToolsQa"));

    }
}