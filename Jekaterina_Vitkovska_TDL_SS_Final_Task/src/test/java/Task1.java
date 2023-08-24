import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import common.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Task1 extends TestBase

{
    private WebDriver driver;
    static ExtentReports report;

    @BeforeClass
    public static void startTest() throws IOException
    {
        String reportPath =
                "src" + File.separator +
                        "main" + File.separator +
                        "resources" + File.separator +
                        "reports" + File.separator +
                        "TestReport.html";
        String configPath =
                "src" + File.separator +
                        "main" + File.separator +
                        "resources" + File.separator +
                        "configs" + File.separator +
                        "extentreports" + File.separator +
                        "spark-config.xml";
        report = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.loadXMLConfig(configPath);
        sparkReporter.config().setReportName("Sample Extent Report");
        report.setSystemInfo("Project", "TDL Summer School");
        report.setSystemInfo("Author", "Jekaterina Vitkovska");
        report.attachReporter(sparkReporter);
    }

    @Test(description = "Test1")
    public void firstTest() {
        //Initializing DemoSitePage
        DemoSitePage demoSitePage = new DemoSitePage(driver);
        Assert.assertTrue(demoSitePage.isInitialized());

        //Clicking on "DialogBox" button
        demoSitePage.clickOnDialogBoxButton();

        //Initialize DialogBoxesPage
        DialogBoxesPage dialogBoxesPage = new DialogBoxesPage(driver);
        Assert.assertTrue(dialogBoxesPage.isInitialized());

        //Clicking on "Create new user" button
        dialogBoxesPage.clickOnCreateNewUserButton();

        //Initializing CreateNewUserPage
        CreateNewUserPage createNewUserPage = new CreateNewUserPage(driver);
        Assert.assertTrue(createNewUserPage.isInitialized());

        //Creating new user
        createNewUserPage.createAnAccounButton.click();

        //Validating that new user is created

        Assert.assertEquals(createNewUserPage.getItemID().getText(), "Kate Witkovska");


        @Test(description = "Test3")
        public void thirdTest ()
        {
            //Initializing DemoSitePage
            DemoSitePage demoSitePage = new DemoSitePage(driver);
            Assert.assertTrue(demoSitePage.isInitialized());

            //Clicking on "ProgressBar" button
            demoSitePage.clickOnProgressBarButton();

            //Initializing ProgressBaPage
            DemoSitePage progressBarePage = new ProgressBarPage(driver);
            Assert.assertTrue(progressBarePage.isInitialized());

            //Clicking on "Random Progress Bar Button" button
            demoSitePage.clickOnRandomProgressBarButton();

            //Initializing RandomProgressBaTab
            DemoSitePage RandomprogressBareTab = new RandomProgressBarPage(driver);
            Assert.assertTrue(randomProgressBarPage.isInitialized());

            //Clicking on "Random Color Bar Button" button
            demoSitePage.clickOnRandomColorButton();
        }
        @Test(description = "Test2")
        public void secondTest() {
            //Initializing DemoSitePage
            DemoSitePage demoSitePage = new DemoSitePage(driver);
            Assert.assertTrue(demoSitePage.isInitialized());

            //Clicking on "Tabs" button
            DemoSitePage.clickOnTabsButton();

            //Initializing AccordionAndTabsPage
            DemoSitePage accordionAndTabsPage = new AccordionAndTabsPage(driver);
            Assert.assertTrue(demoSitePage.isInitialized());

            //Clicking on "Tabs" button
            AccordionAndTabsPage.clickOnSection2();
        }
        @Test(description = "Test4")
        public void fourthTest() {
            //Initializing DemoSitePage
            DemoSitePage demoSitePage = new DemoSitePage(driver);
            Assert.assertTrue(demoSitePage.isInitialized());

            //Clicking on "DialogBox" button
            demoSitePage.clickOnDialogBoxButton();

            //Initialize DialogBoxesPage
            DialogBoxesPage dialogBoxesPage = new DialogBoxesPage(driver);
            Assert.assertTrue(dialogBoxesPage.isInitialized());

            //Clicking on "MessageBox" tab
            dialogBoxesPage.clickOnMessageBoxTab();

            //Initialize DownloadCompleteTab
            DownloadCompleteTab downloadCompleteTab = new DownloadCompleteTab(driver);
            Assert.assertTrue(downloadCompleteTab.isInitialized());

            //Clicking on "OK" button
            downloadCompleteTab.clickOnOkButton();

            //Validating "Download Complete" tab is no longer displayed
            Assert.assertFalse(downloadCompleteTab.isInitialized());

            //Click on "Form" tab
            dialogBoxesPage.clickOnFormTab();

            //Clicking on "MessageBox" tab
            dialogBoxesPage.clickOnMessageBoxTab();

            //Validating "Download Complete" tab is no longer displayed
            Assert.assertFalse(downloadCompleteTab.isInitialized());

        }
        @Test(description = "Test5")
        public void fifthTest() {

            //Initializing AutoCompletePage
            DemoSitePage autoCompletePage = new AutoCompletePage(driver);
            Assert.assertTrue(autoCompletePage.isInitialized());

            //Filling in search field
            ArrayList<String> expectedDropDownValues = new ArrayList<>();
            textField.sendKeys(getValue());
            expectedFishNames.add("anders andersson");


        }
    }
    @AfterClass
    public static void endTest()
    {
        report.flush();
    }
}
