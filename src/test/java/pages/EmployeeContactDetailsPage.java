package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeContactDetailsPage extends CommonMethods {
        @FindBy(xpath = "//a[text()='Contact Details']")
        public WebElement contactDetails;

         @FindBy(xpath="//input[@value='Edit']")
         public WebElement editbtn;
         @FindBy(name="contact[street1]")

         public WebElement empAdSt1;

         @FindBy(name="contact[street2]")
         public WebElement empAdSt2;

          @FindBy(name="contact[city]")

           public WebElement empCity;

           @FindBy(name="contact[province]")
           public WebElement empState;

           @FindBy(id="contact_emp_zipcode")
           public WebElement empZip;


            @FindBy(xpath="//select[@name='contact[country]']")

           public WebElement empCountry;

            @FindBy(id="contact_emp_hm_telephone")
            public WebElement emeHomeTelephone;

            @FindBy(id="contact_emp_mobile")

            public WebElement empTeNumber;

            @FindBy(id="contact_emp_work_telephone")

            public WebElement empWorkTelephone;

            @FindBy(id="contact_emp_work_email")
            public WebElement empWorkEmail;

            @FindBy(name="contact[emp_oth_email]")

            public WebElement empOtherEmail;

            @FindBy(id="btnSave")

            public WebElement btnSave;

            @FindBy( id= "btnAddAttachment")

            public WebElement empaddBtn;

  public EmployeeContactDetailsPage(){
      PageFactory.initElements(driver, this );


  }
}
