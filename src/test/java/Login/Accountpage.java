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

public class Accountpage {
    public WebDriver driver;

    @FindBy(xpath="//input[@id='usernameInput']")
    public WebElement username_input;

    @FindBy(xpath="//input[@id='passwordInput']")
    public WebElement password_input;

    @FindBy(xpath="//button[@class='login-button']")
    public WebElement Login;

    @FindBy(xpath="//div[@class='react-slick-item']/img")
    public List<WebElement> movies;

    @FindBy(xpath="//button[@class='avatar-button']")
    public WebElement Account_icon;

    @FindBy(xpath="//h1[@class='account-heading']")
    public WebElement Heading_account;

    @FindBy(xpath="//a")
    public List<WebElement>verify_anchor;
    public Accountpage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void Input_username(){
        username_input.sendKeys("rahul");
    }
    public void Input_password(){
        password_input.sendKeys("rahul@2021");
    }
    public void login_button(){
        Login.click();
    }
    public void List_of_movies(){
        for(WebElement s5:movies){
            s5.isDisplayed();
        }
    }
    public void Account_page(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='avatar-button']")));
        Account_icon.click();
    }
    public String heading(){
        return Heading_account.getText();
    }
    public void Tags(){
        for(WebElement S:verify_anchor){
         System.out.println(S.getText());
        }

    }
}
