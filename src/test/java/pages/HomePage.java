package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private static WebDriver driver;

    private String stories_text;

    public HomePage(){
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void setDriver(WebDriver newDriver){
        this.driver = newDriver;
    }

    public String getStories_text(){
        return stories_text;
    }

    public void setStories_text(String text){
        this.stories_text = text;
    }

    public By COOKIES_ACCEPT_ALL_BUTTON = By.xpath("//button[contains(text(),\"Accept all\")]");
    WebElement cookies_accept_all_button;

    public By HOME_NAV_ITEM = By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]");
    WebElement home_nav_item;

    public By UK_NAV_ITEM = By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]");
    public By WORLD_NAV_ITEM = By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]");
    public By ISRAEL_HAMAS_WAR = By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]");
    public By POLITICS_NAV_ITEM = By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[5]/a[1]");
    public By US_NAV_ITEM = By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[6]/a[1]");
    public By CLIMATE_NAV_ITEM = By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[7]/a[1]");
    public By SCIENCE_TECH_NAV_ITEM = By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[8]/a[1]");
    public By BUSINESS_NAV_ITEM = By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[9]/a[1]");
    public By ENTS_ARTS_NAV_ITEM = By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[10]/a[1]");
//    public By TRAVEL_NAV_ITEM = By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[11]/a[1]");
    public By TRAVEL_NAV_ITEM = By.xpath("//ul[@id='more-nav']/li/*[contains(text(), \"Travel\")]");
    public By OFFBEAT_NAV_ITEM = By.xpath("//ul[@id='more-nav']/li/*[contains(text(), \"Offbeat\")]");
    public By ANALYSIS_NAV_ITEM = By.xpath("//ul[@id='more-nav']/li/*[contains(text(), \"Analysis\")]");
    public By DATA_FORENSICS_NAV_ITEM = By.xpath("//ul[@id='more-nav']/li/*[contains(text(), \"Data\")]");
    public By VIDEOS_NAV_ITEM = By.xpath("//ul[@id='more-nav']/li/*[contains(text(), \"Videos\")]");
    public By WEATHER_NAV_ITEM = By.xpath("//ul[@id='more-nav']/li/*[contains(text(), \"Weather\")]");

    public By MORE_NAV_BUTTON = By.xpath("//header/div[1]/nav[1]/div[2]/button[1]");
    public By CLIMATE_LABEL_CLIMATE = By.xpath("//h1/div[@class=\"sdc-site-component-header__body\"]/span[contains(text(),\"Climate\")]");

    public By HEADLINES_STORIES_HOME_PAGE = By.xpath("//span[@class=\"sdc-site-tile__headline-text\"]");

    public By STORIES_LINK = By.xpath("//div/h3[@class='sdc-site-tile__headline']/a");

    public By TOP_STORIES_LABEL_HOME = By.xpath("//h1/div[@class=\"sdc-site-component-header__body\"]/span[contains(text(),\"Top Stories\")]");

    public By FEEDBACK_DIALOG = By.xpath("//*[@class='QSIWebResponsiveDialog-Layout1-SI_6QlET0rgCVESOtU_content QSIWebResponsiveDialog-Layout1-SI_6QlET0rgCVESOtU_content-medium QSIWebResponsiveDialog-Layout1-SI_6QlET0rgCVESOtU_border-radius-slightly-rounded QSIWebResponsiveDialog-Layout1-SI_6QlET0rgCVESOtU_drop-shadow-light']");
    public By NO_THANKS = By.xpath("//*[@class='QSIWebResponsiveDialog-Layout1-SI_6QlET0rgCVESOtU_content QSIWebResponsiveDialog-Layout1-SI_6QlET0rgCVESOtU_content-medium QSIWebResponsiveDialog-Layout1-SI_6QlET0rgCVESOtU_border-radius-slightly-rounded QSIWebResponsiveDialog-Layout1-SI_6QlET0rgCVESOtU_drop-shadow-light']/div/button[contains(text(),\"No Thanks\")]");
    public void selectNav_Item(String tabName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        switch (tabName) {
            case "UK":
                try{
                    driver.findElement(UK_NAV_ITEM).click();
                }catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(UK_NAV_ITEM).click();
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "World":
                try{
                    driver.findElement(WORLD_NAV_ITEM).click();
                }catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(WORLD_NAV_ITEM).click();
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "Israel-Hamas War":
                try{
                    driver.findElement(ISRAEL_HAMAS_WAR).click();
                }catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(ISRAEL_HAMAS_WAR).click();
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "Politics":
                try{
                    driver.findElement(POLITICS_NAV_ITEM).click();
                }catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(POLITICS_NAV_ITEM).click();
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "US":
                try{
                    driver.findElement(US_NAV_ITEM).click();
                }catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(US_NAV_ITEM).click();
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "Climate":
                try{
                    driver.findElement(CLIMATE_NAV_ITEM).click();
                }catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(CLIMATE_NAV_ITEM).click();
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "Science & Tech":
                try{
                    driver.findElement(SCIENCE_TECH_NAV_ITEM).click();
                }catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(SCIENCE_TECH_NAV_ITEM).click();
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "Business":
                try{
                    driver.findElement(BUSINESS_NAV_ITEM).click();
                }catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(BUSINESS_NAV_ITEM).click();
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "Ents & Arts":
                try{
                    driver.findElement(ENTS_ARTS_NAV_ITEM).click();
                }catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(ENTS_ARTS_NAV_ITEM).click();
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "Travel":
                try {
                    driver.findElement(MORE_NAV_BUTTON).click();
                    WebElement travel_tab = wait.until(ExpectedConditions.visibilityOf(driver.findElement(TRAVEL_NAV_ITEM)));
                    travel_tab.click();
                } catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(MORE_NAV_BUTTON).click();
                    WebElement travel_tab = wait.until(ExpectedConditions.visibilityOf(driver.findElement(TRAVEL_NAV_ITEM)));
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "Offbeat":
                try {
                    driver.findElement(MORE_NAV_BUTTON).click();
                    WebElement offbeat = wait.until(ExpectedConditions.visibilityOf(driver.findElement(OFFBEAT_NAV_ITEM)));
                    offbeat.click();
                } catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(MORE_NAV_BUTTON).click();
                    WebElement offbeat = wait.until(ExpectedConditions.visibilityOf(driver.findElement(OFFBEAT_NAV_ITEM)));
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "Analysis":
                try {
                    driver.findElement(MORE_NAV_BUTTON).click();
                    WebElement analysis = wait.until(ExpectedConditions.visibilityOf(driver.findElement(ANALYSIS_NAV_ITEM)));
                    analysis.click();
                } catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(MORE_NAV_BUTTON).click();
                    WebElement analysis = wait.until(ExpectedConditions.visibilityOf(driver.findElement(ANALYSIS_NAV_ITEM)));
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "Data & Forensics":
                try {
                    driver.findElement(MORE_NAV_BUTTON).click();
                    WebElement dataForensics = wait.until(ExpectedConditions.visibilityOf(driver.findElement(DATA_FORENSICS_NAV_ITEM)));
                    dataForensics.click();
                } catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(MORE_NAV_BUTTON).click();
                    WebElement dataForensics = wait.until(ExpectedConditions.visibilityOf(driver.findElement(DATA_FORENSICS_NAV_ITEM)));
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "Videos":
                try {
                    driver.findElement(MORE_NAV_BUTTON).click();
                    WebElement videos = wait.until(ExpectedConditions.visibilityOf(driver.findElement(VIDEOS_NAV_ITEM)));
                    videos.click();
                } catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(MORE_NAV_BUTTON).click();
                    WebElement videos = wait.until(ExpectedConditions.visibilityOf(driver.findElement(VIDEOS_NAV_ITEM)));
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "Weather":
                try {
                    driver.findElement(MORE_NAV_BUTTON).click();
                    WebElement weather = wait.until(ExpectedConditions.visibilityOf(driver.findElement(WEATHER_NAV_ITEM)));
                    weather.click();
                } catch (ElementClickInterceptedException e){
                    driver.findElement(NO_THANKS).click();
                    driver.findElement(MORE_NAV_BUTTON).click();
                    WebElement weather = wait.until(ExpectedConditions.visibilityOf(driver.findElement(WEATHER_NAV_ITEM)));
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
        }
    }


}
