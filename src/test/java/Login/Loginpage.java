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

public class Loginpage {
    public WebDriver driver;

    @FindBy(xpath = "//div[@class='login-website-logo-container']/img")
    public WebElement image_displayed;

    @FindBy(xpath = "//h1[@class='sign-in-heading']")
    public WebElement Main_heading;

    @FindBy(xpath = "//div[@class='input-container']/label[@for='usernameInput']")
    public WebElement username;

    @FindBy(xpath = "//div[@class='input-container']/label[@for='passwordInput']")
    public WebElement password;
    @FindBy(xpath = "//button[@class='login-button']")
    public WebElement login;

    @FindBy(xpath = "//p[@class='error-message']")
    public WebElement Error_Message;

    @FindBy(xpath = "//input[@id='passwordInput']")
    public WebElement passwordinput;

    @FindBy(xpath = "//input[@id='usernameInput']")
    public WebElement usernameinput;

    @FindBy(xpath = "//p[@class='error-message']")
    public WebElement userandpasswordnotmatchedmessage;

    @FindBy(xpath = "//h1[@class='movies-list-heading']")
    public List<WebElement> heading_list;

    @FindBy(xpath="//div[@class='react-slick-item']/img")
    public List<WebElement> List_of_movies;
    @FindBy(xpath="//button[@class='home-movie-play-button']")
    public WebElement Play_button;

    @FindBy(xpath="//div[@class='footer-container']/p")
    public WebElement Contactus;
    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean Logo_displayed() {
        return image_displayed.isDisplayed();
    }

    public String Heading() {
        return Main_heading.getText();
    }

    public String verify_username() {
        return username.getText();
    }

    public String verify_password() {
        return password.getText();
    }

    public void verify_login() {
        login.click();
    }

    public String verify_message() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error-message']")));
        return Error_Message.getText();
    }

    public void Input_password() {
        passwordinput.sendKeys("rahul@2021");
    }

    public boolean Verify_error_message_displayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error-message']")));
        return Error_Message.isDisplayed();
    }

    public void inputpassword() {
        usernameinput.sendKeys("rahul");
    }

    public void Invalid_Credential() {
        usernameinput.sendKeys("rahul");
        passwordinput.sendKeys("rahul@2022");
        login.click();
    }

    public String didnotmatched() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error-message']")));
        return userandpasswordnotmatchedmessage.getText();
    }

    public void Valid_Credential() {
        usernameinput.sendKeys("rahul");
        passwordinput.sendKeys("rahul@2021");
        login.click();
    }
     public void Heading_Text() {
        for (WebElement s : heading_list) {
         System.out.println(s.getText());
     }
    }
    public boolean Play_button(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='home-movie-play-button']")));
        return Play_button.isDisplayed();
    }
    public boolean Listofmovies(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='react-slick-item']/img")));
        for(WebElement S1:List_of_movies){
            S1.isDisplayed();
        }
        return true;
    }
   public String CONTACT(){
        return Contactus.getText();
   }
}