package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}
