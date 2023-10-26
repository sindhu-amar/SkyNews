package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utils.CommonUtil;
import utils.ScreenRecorderUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.List;


public class Steps {

    static HomePage homePage = new HomePage();
    CommonUtil util = new CommonUtil();

    public static WebDriver newDriver;
    String homeUrl = "https://news.sky.com";
    public int i = 3;

    private static final Logger logger = LogManager.getLogger(Steps.class);


    @Given("I navigate to Sky News Website home page")
    public void loadHomePage() throws Exception {
        try{
            homePage.setDriver(util.launch());
        }catch (InvocationTargetException e){
            logger.warn(e.getCause().getMessage());
        }catch (Exception e){
            logger.warn(e.getMessage());
        }
        try{
            newDriver = homePage.getDriver();
        }catch (Exception e){
            e.printStackTrace();
        }
        ScreenRecorderUtil.startRecord("UrlLaunch");
        newDriver.get(homeUrl);
        newDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        logger.info("SkyNews Displayed.............");
        util.takeSnapShot(newDriver, "Screenshots/01_homePageDisplayed.png");
        newDriver.switchTo().frame("sp_message_iframe_802595").findElement(homePage.COOKIES_ACCEPT_ALL_BUTTON).click();
        ScreenRecorderUtil.stopRecord();
    }
    @Then("I should see the descriptive title {string} displayed in browser tab")
    public void verifyHomePageTitle(String title) throws Exception {
        Assert.assertTrue(newDriver.getTitle().contains(title));
        logger.info("Title "+ title + " displayed");
        newDriver.quit();
    }

    @When("I click the {string} tab")
    public void selectTab(String tabName) {
            homePage.selectNav_Item(tabName);
        }

    @Then("I should see the appropriate title {string} displayed")
    public void verifyPageTitle(String title) throws IOException {
        Assert.assertTrue(newDriver.getTitle().contains(title));
        util.takeSnapShot(newDriver, "Screenshots/02_"+title+"PageDisplayed.png");
        logger.info("***********Tab Title displayed*************");
        newDriver.quit();
    }

    @Then("I should see the Climate title {string} displayed")
    public void verifyClimatePageTitle(String title) {
        Assert.assertTrue(newDriver.getTitle().contains(title));
        logger.info("***********Tab Title displayed*************");
    }

    @Then("Sky News website must default to the Home category")
    public void verifyDefaultPage() throws IOException {
        Assert.assertTrue(newDriver.findElement(homePage.TOP_STORIES_LABEL_HOME).isDisplayed());
        util.takeSnapShot(newDriver, "Screenshots/03_HomePageDisplayed.png");
        logger.info("***********HomePage is displayed by default*************");
        newDriver.quit();
    }

    @Then("Climate tab becomes the focus")
    public void verifyClimatePage() throws IOException {
        Assert.assertTrue(newDriver.findElement(homePage.CLIMATE_LABEL_CLIMATE).getText().equalsIgnoreCase("Climate"));
        util.takeSnapShot(newDriver, "Screenshots/04_ClimatePageDisplayed.png");
        logger.info("***********Climate is the focus*************");
        newDriver.quit();
    }

    @When("I select one story from the home page")
    public void selectStory() {
        List<WebElement> storiesText = newDriver.findElements(homePage.HEADLINES_STORIES_HOME_PAGE);
        List<WebElement> storiesLink = newDriver.findElements(homePage.STORIES_LINK);
        homePage.setStories_text(storiesText.get(1).getText());
        storiesLink.get(0).click();
    }

    @Then("The title of the resulting page contains the words from the title of the story selected")
    public void verifyStoryTitle() throws IOException {
        String title = newDriver.getTitle().substring(0,5);
        Assert.assertTrue(homePage.getStories_text().contains(title));
        util.takeSnapShot(newDriver, "Screenshots/05_SelectedStoryDisplayed.png");
        logger.info("**********Story Text Displayed**************");
        newDriver.quit();
    }


}
