package LoginpageTest;

import BrowserConfuguration.Browser;
import Login.Headersectionfuncationalitespage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HeadersectionfuncationalitespageTest extends Browser {
    Headersectionfuncationalitespage headersectionfuncationalitespage;
    @Test(priority=1)
    public void HeaderSectionfuncationalities(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        headersectionfuncationalitespage=new Headersectionfuncationalitespage(driver);
        headersectionfuncationalitespage.inputusername();
        headersectionfuncationalitespage.inputpassword();
        headersectionfuncationalitespage.login();
    }
    @Test(priority = 2)
    public void navbar_element(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        headersectionfuncationalitespage=new Headersectionfuncationalitespage(driver);
        headersectionfuncationalitespage.inputusername();
        headersectionfuncationalitespage.inputpassword();
        headersectionfuncationalitespage.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String str1="https://qamoviesapp.ccbp.tech/";
        String str2=driver.getCurrentUrl();
        if(str1.equals(str2)){
            System.out.println("Home url is Matched");
        }else{
            System.out.println("Home url is not matched");
        }
        headersectionfuncationalitespage.popular();
        String str3="https://qamoviesapp.ccbp.tech/popular";
        String str4= driver.getCurrentUrl();
        if(str3.equals(str4)){
            System.out.println("Verify Popular Url is passed");
        }else{
            System.out.println("Verify Popular Url is not passed");
        }
    }
    @Test(priority = 3)
    public void Testthenavigationtoaccountpagethroughelementsinheadersection(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        headersectionfuncationalitespage=new Headersectionfuncationalitespage(driver);
        headersectionfuncationalitespage.inputusername();
        headersectionfuncationalitespage.inputpassword();
        headersectionfuncationalitespage.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String str1="https://qamoviesapp.ccbp.tech/";
        String str2=driver.getCurrentUrl();
        if(str1.equals(str2)){
            System.out.println("Home url is Matched");
        }else{
            System.out.println("Home url is not matched");
        }
        headersectionfuncationalitespage.popular();
        String str3="https://qamoviesapp.ccbp.tech/popular";
        String str4= driver.getCurrentUrl();
        if(str3.equals(str4)){
            System.out.println("Verify Popular Url is passed");
        }else{
            System.out.println("Verify Popular Url is not passed");
        }
        headersectionfuncationalitespage.account();
        String str5="https://qamoviesapp.ccbp.tech/account";
        String str6= driver.getCurrentUrl();
        Assert.assertEquals(str5,str6,"Account Url is not verified");
    }
}
