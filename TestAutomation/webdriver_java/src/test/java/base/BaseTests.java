package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    /*public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "resources/chromeDriver.exe");
        driver = new ChromeDriver();
        //launch web app
        driver.get("https://the-internet.herokuapp.com/");

        //iphoneX view
        //driver.manage().window().setSize(new Dimension(375, 812));

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("No.of elements with the tag 'a': " + links.size());

        //not available
        try {
            WebElement inputsLink = driver.findElement(By.linkText("Angie"));
            inputsLink.click();
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        *//*
            Exercise
             ->the internet -> shifting content -> menu elements -> print no of menu elements
         *//*
        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();
        WebElement menu = driver.findElement(By.className("example"));
        List<WebElement> menuElements = menu.findElements(By.tagName("a"));
        System.out.println("\nNo.of menu options = " + menuElements.size());

        System.out.println(driver.getTitle());

        //driver.close();     //close window
        driver.quit();  //end session
    }*/

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "resources/chromeDriver.exe");
        driver = new ChromeDriver();
        //launch web app
        goHome();

        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    /*public static void main(String[] args){
        BaseTests baseTests = new BaseTests();
        baseTests.setUp();
    }*/
}
