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

public class SearchmoviePage {
    public WebDriver driver;

    @FindBy(xpath = "//input[@id='usernameInput']")
    public WebElement username_input;

    @FindBy(xpath = "//button[@class='login-button']")
    public WebElement Login;

    @FindBy(xpath="//input[@id='passwordInput']")
    public WebElement password_input;

    @FindBy(xpath="//button[@data-testid='searchButton']")
    public WebElement search_btn;

    @FindBy(xpath="//input[@id='search']")
    public WebElement Search;

    @FindBy(xpath="//*[@id='root']/div/nav/div[2]/div/button")
    public WebElement Icon;

    @FindBy(xpath = "//ul[@class='search-movies-container']/li")
    public List<WebElement> elements;
    public SearchmoviePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void Username(){
        username_input.sendKeys("rahul");
    }
    public void Password(){
        password_input.sendKeys("rahul@2021");
    }
    public void login(){
        Login.click();
    }
    public void Serach_icon(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='searchButton']")));
        search_btn.click();
    }
    public void search_input(){
        Search.sendKeys("Venom");
    }
    public void Verify_search_icon(){
        Icon.click();
    }
    public void Verify_count_movies(){
        for(WebElement S2:elements){
            if(S2.getSize().equals(2)){
                System.out.println("Venom search Two movies");
            }else{
                System.out.println("Venom search Two is not movies");
            }
        }
    }

}
