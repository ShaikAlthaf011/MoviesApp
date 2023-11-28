package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    @FindBy(xpath="//ul[@class='nav-menu-list']/li/a[contains(text(),'Popular')]")
    public WebElement Nav_popular;

    @FindBy(xpath="//ul[@class='nav-menu-list']/li/a[contains(text(),'Home')]")
    public WebElement Nav_Home;
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
    public void Popular(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav-menu-list']/li/a[contains(text(),'Popular')]")));
        Nav_popular.click();;
    }
    public void Home(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav-menu-list']/li/a[contains(text(),'Home')]")));
        Nav_Home.click();
    }

}
