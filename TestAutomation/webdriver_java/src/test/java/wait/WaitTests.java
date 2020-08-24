package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        System.out.println("Started");
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        System.out.println("Clicked Example");
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!",
                "Loaded text incorrect!");

    }
}
