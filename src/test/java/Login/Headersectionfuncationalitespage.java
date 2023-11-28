package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headersectionfuncationalitespage {
    public WebDriver driver;

    @FindBy(xpath="//input[@id='usernameInput']")
    public WebElement username_input;

    @FindBy(xpath="//input[@id='passwordInput']")
    public WebElement password_input;

    @FindBy(xpath="//button[@class='login-button']")
    public WebElement Login;

    @FindBy(xpath="//ul[@class='nav-menu-list']/li/a[contains(text(),'Popular')]")
    public WebElement Popular;

    @FindBy(xpath="//button[@class='avatar-button']/img")
    public WebElement Account;
    public Headersectionfuncationalitespage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void inputusername(){
        username_input.sendKeys("rahul");
    }
    public void inputpassword(){
        password_input.sendKeys("rahul@2021");
    }
    public void login(){
        Login.click();
    }
    public void popular(){
        Popular.click();
    }
    public void account(){
        Account.click();
    }

}
