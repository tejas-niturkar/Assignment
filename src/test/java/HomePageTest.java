import Base.TestBase;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{
    HomePage homePage ;
    public HomePageTest (){
     super();
     }

    @BeforeMethod
    public void setup(){
        initialization();
        homePage = new HomePage();
    }

    @Test
    public void validateHomePageLinks(){
        Assert.assertTrue(homePage.getHomePageLogo());
        Assert.assertEquals(homePage.getOurStoryLink(), "Our Story");
        Assert.assertEquals(homePage.getOurSolutionLink(),"Our Solution");
        Assert.assertEquals(homePage.getWhyTendableLink(),"Why Tendable?");
    }

    @Test
    public void validateRequestADemoButton() throws InterruptedException {      // Verify if the request a demo button is displayed and enabled

        Thread.sleep(5000);
        Assert.assertTrue(homePage.isRequestADemoButtonDisplayed(), "Request Demo button is not displayed.");
        Assert.assertTrue(homePage.isRequestADemoButtonEnabled(), "Request Demo button is not enabled.");
        System.out.println("Request A Demo button present on the homepage");

        homePage.ourStoryLinkClick();
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        Assert.assertTrue(homePage.isRequestADemoButtonDisplayed(), "Request Demo button is not displayed.");
        Assert.assertTrue(homePage.isRequestADemoButtonEnabled(), "Request Demo button is not enabled.");
        System.out.println("Request A Demo button present on the our story page");

        homePage.ourSolutionLinkClick();
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        Assert.assertTrue(homePage.isRequestADemoButtonDisplayed(), "Request Demo button is not displayed.");
        Assert.assertTrue(homePage.isRequestADemoButtonEnabled(), "Request Demo button is not enabled.");
        System.out.println("Request A Demo button present on the our solution page");

        homePage.whyTendableLinkClick();
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        Assert.assertTrue(homePage.isRequestADemoButtonDisplayed(), "Request Demo button is not displayed.");
        Assert.assertTrue(homePage.isRequestADemoButtonEnabled(), "Request Demo button is not enabled.");
        System.out.println("Request A Demo button present on the why tendable page");
    }

    @Test
    public void validateSubmitContactFormErrorMessage() throws InterruptedException {
        homePage.contactUsForm();

        if (homePage.errorMessage.isDisplayed()) {
            System.out.println("Error message is present on the page, Test case is passed");
        } else {
            System.out.println("Error message is not present on the page, Test case is failed");
            Assert.fail("Error message is not displayed.");
        }
    }

   @AfterMethod
    public void tearDown (){
        driver.quit();
    }
}
