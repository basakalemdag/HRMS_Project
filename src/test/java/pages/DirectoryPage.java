package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DirectoryPage extends CommonMethods {
    @FindBy(xpath = "//li[starts-with(text(),'1-50 of')]")
    public WebElement noOfEmployees;

    public DirectoryPage () {
        PageFactory.initElements(driver,this);
    }
}
