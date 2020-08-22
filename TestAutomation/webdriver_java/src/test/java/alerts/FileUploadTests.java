package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("E://Tutorials//Selenium Testing//sampleTestFile.txt");
        assertEquals(uploadPage.getUploadedFiles(), "sampleTestFile.txt", "Upload error!");
    }
}
