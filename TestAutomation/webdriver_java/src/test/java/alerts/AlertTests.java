package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaSCriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert",
                "Result test incorrect!");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaSCriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm",
                "Alert test incorrect!");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickJavaSCriptAlerts();
        alertsPage.triggerPrompt();

        String text = "Testing Input";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text,
                "Results test incorrect!");
    }
}
