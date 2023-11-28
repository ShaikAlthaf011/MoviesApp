package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Headersectionpage {
    public WebDriver driver;

    @FindBy(xpath="//div[@class='login-website-logo-container']/img")
    public WebElement logo_displayed;

    @FindBy(xpath="//div[@class='input-container']/input[@id='usernameInput']")
    public WebElement Username_input;

    @FindBy(xpath="//div[@class='input-container']/input[@id='passwordInput']")
    public WebElement Password_input;

    @FindBy(xpath = "//button[@class='login-button']")
    public WebElement Login;

    @FindBy(xpath = "//ul[@class='nav-menu-list']/li")
    public List<WebElement> Nav_items;
    public Headersectionpage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public boolean displayed_log(){
        return logo_displayed.isDisplayed();
    }
    public void usernameinput(){
        Username_input.sendKeys("rahul");
    }
    public void passwordinput(){
        Password_input.sendKeys("rahul@2021");
    }
    public void login(){
        Login.click();
    }
   public void  List_nav(){
        for(WebElement S:Nav_items){
            S.isDisplayed();
        }
   }

}
