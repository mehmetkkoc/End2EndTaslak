package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage {

    public MedunnaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="account-menu")
    public WebElement accountLinki;

    @FindBy(xpath="//*[@id='account-menu']/div/a[2]/span")
    public WebElement registerLink;

    @FindBy(xpath="//*[@id='ssn']")
    public WebElement ssnTextbox;
}
