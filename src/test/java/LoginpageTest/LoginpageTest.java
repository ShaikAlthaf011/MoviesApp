package LoginpageTest;

import BrowserConfuguration.Browser;
import Login.Loginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginpageTest extends Browser {
    //    public  WebDriver driver;
    Loginpage loginpage;

    @Test
    public void LoginPageUI() {
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();

        loginpage = new Loginpage(driver);
    }

    @Test(priority = 1)
    public void TestwhethertheWebsitelogoimageisdisplayed() {
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();

        loginpage = new Loginpage(driver);
        boolean a = loginpage.Logo_displayed();
        Assert.assertTrue(a, "Image is not displayed");
    }

    @Test(priority = 2)
    public void TestwhethertheHeadingtextisLogin() {
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();

        loginpage = new Loginpage(driver);
        String str1 = loginpage.Heading();
        String str2 = "Login";
        if (str1.equals(str2)) {
            System.out.println("Text is matched");
        } else {
            System.out.println("Text is not Matched");
        }
    }

    @Test(priority = 3)
    public void TestwhethertheUsernamelabeltextisusrname() {
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();

        loginpage = new Loginpage(driver);
        String str3 = loginpage.verify_username();
        String str4 = "USERNAME";
        Assert.assertEquals(str3, str4, "Text is not matched");
    }

    @Test(priority = 4)
    public void TestwhetherthePasswordlabeltextisPASSWORD() {
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();

        loginpage = new Loginpage(driver);
        String str1 = loginpage.verify_password();
        String str2 = "PASSWORD";
        Assert.assertEquals(str1, str2, "Text is not Matched");
    }

    @Test(priority = 5)
    public void TesttheLoginbutton() {
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        loginpage = new Loginpage(driver);
        loginpage.verify_login();
        String str1 = loginpage.verify_message();
        String str2 = "*Username or password is invalid";
        Assert.assertEquals(str1, str2, "Text is not Matched");
    }

    @Test(priority = 6)
    public void LoginFuncationalityinputEmptyfield() {
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        loginpage = new Loginpage(driver);
        loginpage.verify_login();
    }

    @Test(priority = 7)
    public void LoginFuncationalityEmtyUsername() {
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        loginpage = new Loginpage(driver);
        loginpage.Input_password();
        loginpage.verify_login();
        boolean a = loginpage.Verify_error_message_displayed();
        Assert.assertTrue(a, "Text is displayed");
    }

    @Test(priority = 8)
    public void LoginFuncationalityEmptypassword() {
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        loginpage = new Loginpage(driver);
        loginpage.inputpassword();
        loginpage.verify_login();
        boolean a = loginpage.Verify_error_message_displayed();
        Assert.assertTrue(a, "Text is displayed");
    }

    @Test(priority = 9)
    public void LoginFuncationalityInvalidCredential() {
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        loginpage = new Loginpage(driver);
        loginpage.Invalid_Credential();
        String str1 = loginpage.didnotmatched();
        String str2 = "*username and password didn't match";
        Assert.assertEquals(str1, str2, "Usernamepassword did not is not matched");
    }

    @Test(priority = 10)
    public void Valid_Credential() {
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        loginpage = new Loginpage(driver);
        loginpage.Valid_Credential();
    }

    @Test(priority = 11)
    public void HomePageSection() {
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        loginpage = new Loginpage(driver);
        loginpage.Valid_Credential();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        loginpage.Heading_Text();
    }
    @Test(priority = 12)
    public void displayed_play_button(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        loginpage = new Loginpage(driver);
        loginpage.Valid_Credential();
        boolean B=loginpage.Play_button();
        Assert.assertTrue(B,"Play button image is not displayed");
    }
    @Test(priority = 13)
    public void listofmovie(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        loginpage = new Loginpage(driver);
        loginpage.Valid_Credential();
        Assert.assertTrue(loginpage.Listofmovies(),"Twenty movies are not displayed");
    }
    @Test(priority=14)
    public void contact_us(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        loginpage = new Loginpage(driver);
        loginpage.Valid_Credential();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String str1=loginpage.CONTACT();
        String str2="Contact Us";
        Assert.assertEquals(str1,str2,"Text is not matched");
    }
}

