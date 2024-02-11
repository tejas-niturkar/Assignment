package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;


public class HomePage extends TestBase {

    @FindBy (xpath = "//img[@alt='Tendable Logo']")
    WebElement homePageLogo ;
    @FindBy (xpath = "//a[contains(text(),'Our Story')]")
    WebElement ourStoryLink ;
    @FindBy (xpath = "//a[contains(text(),'Our Solution')]")
    WebElement ourSolutionLink ;
    @FindBy (xpath = "//a[contains(text(),'Why Tendable?')]")
    WebElement whyTendableLink ;
    @FindBy (xpath = "//a[contains(text(),'Request A Demo')]")
    WebElement requestADemoButton ;
    @FindBy (xpath = "//a[@class=\"body-button bg-aqua-600 mb-6\"]")
    WebElement ContactUsButton ;
    @FindBy (xpath = "//button[@data-target=\".toggle-163701\"]")
    WebElement MarketingContactButton ;
    @FindBy (xpath = "//input[@id=\"form-input-fullName\"][1]")
    WebElement fullNameInput ;
    @FindBy (xpath = "//input[@name=\"organisationName\"][1]")
    WebElement organizationNameInput ;
    @FindBy (xpath = "//input[@id=\"form-input-cellPhone\"][1]")
    WebElement phoneNumberInput ;
    @FindBy (xpath = "//input[@id=\"form-input-email\"][1]")
    WebElement emailInput ;
    @FindBy (xpath = "//select[@id=\"form-input-jobRole\"][1]")
    WebElement jobRoleDropDownList ;
    @FindBy (xpath = "//input[@id=\"form-input-consentAgreed-0\"][1]")
    WebElement consentRadioButton ;
    @FindBy (xpath = "//button[@data-freeform-action=\"submit\"][1]")
    WebElement submitFormButton ;
    @FindBy(xpath = "//p[contains(text(),'Sorry, there was an error submitting the form. Please try again.')]")
    public WebElement errorMessage;



    // Initializing the page objects
    public HomePage (){
        PageFactory.initElements(driver,this);
    }



    public boolean getHomePageLogo () {
        return homePageLogo.isDisplayed();
    }

    public String  getOurStoryLink(){
        return ourStoryLink.getText();
    }

    public String getOurSolutionLink(){
        return ourSolutionLink.getText();
    }

    public String getWhyTendableLink(){
        return whyTendableLink.getText();
    }

    // Method to check if the button is displayed
    public boolean isRequestADemoButtonDisplayed() {
        return requestADemoButton.isDisplayed();
    }

    // Method to check if the button is enabled
    public boolean isRequestADemoButtonEnabled() {
        return requestADemoButton.isEnabled();
    }

    public void ourStoryLinkClick() {
        ourStoryLink.click();
    }
    public void ourSolutionLinkClick(){
        ourSolutionLink.click();
    }
    public void whyTendableLinkClick(){
        whyTendableLink.click();
    }

    public void contactUsForm() throws InterruptedException{
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        ContactUsButton.click();
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        MarketingContactButton.click();
        Thread.sleep(3000);
        fullNameInput.sendKeys("John Wright");
        organizationNameInput.sendKeys("Google");
        phoneNumberInput.sendKeys("+91872323233");
        emailInput.sendKeys("john.w@google.com");

        Select dropDown = new Select(jobRoleDropDownList);
        dropDown.selectByVisibleText("Management");

        consentRadioButton.click();
        submitFormButton.click();
        Thread.sleep(3000);
    }
}
