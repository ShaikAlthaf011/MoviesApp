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

public class MovieDetailpage {
    public WebDriver driver;

    @FindBy(xpath="//input[@id='usernameInput']")
    public WebElement username_input;

    @FindBy(xpath="//input[@id='passwordInput']")
    public WebElement password_input;

    @FindBy(xpath="//button[@class='login-button']")
    public WebElement login;

    @FindBy(xpath="//div[@class='react-slick-item']/img")
    public List<WebElement> Homemovies;

    @FindBy(xpath="//ul[@class='nav-menu-list']/li/a[contains(text(),'Popular')]")
    public WebElement Popular;

    @FindBy(xpath = "//div[@class='search-movies-container']/li")
    public List<WebElement> list;
    public MovieDetailpage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void Input_username(){
        username_input.sendKeys("rahul");
    }
    public void Input_password(){
        password_input.sendKeys("rahul@2021");
    }
    public void Login(){
        login.click();
    }
    public void Verify_home(){
        for(WebElement S3:Homemovies){
            S3.isDisplayed();
        }
    }
    public void POPULAR(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav-menu-list']/li/a[contains(text(),'Popular')]")));
        Popular.click();
    }
    public void total_no_popular_movies(){
        for(WebElement s4:list){
            s4.isDisplayed();
        }
    }
}
