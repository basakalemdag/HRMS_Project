package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.PageInitializer;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitializer {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(){
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getPropertyValue("browser")){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
        intializePageObjects();

        DOMConfigurator.configure("log4j.xml");
    }

    public static void closeBrowser(){driver.quit();}

    //we use this method instead of send keys method throughout the framework
    public static void sendText(WebElement element, String textToSend){
        element.clear();
        element.sendKeys(textToSend);


    }

    //to get webdriver wait
    public static WebDriverWait getWait(){
        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
        return wait;
    }

    //this method will wait for the element to be clickable
    public static void waitForClickability(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    //this method will perform click operation but before perform click, it will wait
    //for the element to be clickable
    public static void click(WebElement element){
        waitForClickability(element);
        element.click();
    }


    //selecting the dropdown using text
    public static void selectDropdown(WebElement element, String text){
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }

    //for taking the screenshot
    public static byte[] takeScreenshot(String fileName){
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
        File sourceFile =  ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile,
                    new File(Constants.SCREENSHOT_FILEPATH + fileName + " " +
                            getTimeStamp("yyyy-MM-dd-HH-mm-ss")+".png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return picBytes;
    }

    public static String getTimeStamp(String pattern){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }


    //for calendar selection
    public static void staticCalanderSelection(WebElement monthWebElement, String selectMonthText, WebElement yearWebElement, String selectYearText, List<WebElement> dayList, String selectDayText

    ){
        selectDropdown(monthWebElement,selectMonthText);
        selectDropdown(yearWebElement, selectYearText);

        List<WebElement> days = dayList;
        for(int i = 0; i<days.size(); i++) {
            WebElement dayElements = days.get(i);
            String dayText = dayElements.getText();
            if (dayText.equalsIgnoreCase(selectDayText)) {
                dayElements.click();
                break;
            }
        }
    }

    //for confirmation from the table
    public static void tableConfirmation(List<WebElement> tableElement, String id) {
        List <WebElement> table = tableElement;
        for (int i = 0; i < table.size(); i++) {
            WebElement idPerson = table.get(i);
            String idText = idPerson.getText();
            if (idText.equals(id)){
                System.out.println("Information is displayed");
                System.out.println(idText);
                break;
            }
        }
    }


    public static void isDisplayed(WebElement element, String fieldName){
        waitForClickability(element);
        System.out.println(fieldName +" " + element.isDisplayed());
    }



    public static void selectByIDFromTable(List<WebElement> tableElement, String id) {
        List <WebElement> table = tableElement;
        for (int i = 0; i < table.size(); i++) {
            WebElement idPerson = table.get(i);
            String idText = idPerson.getText();
            if (idText.equals(id)){
                click(idPerson);
                break;
            }
        }
    }


    public static void clickSearchedEmployee (List<WebElement> list, String name) {

        for (int j = 0; j < list.size(); j++) {
            WebElement list1 = list.get(j);
            String text = list1.getText();
            System.out.println(text);

            if (text.equalsIgnoreCase(name)) {
                WebElement newList = driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr/td[" + j + "]"));
                click(newList);
                break;
            }
        }
    }

}



