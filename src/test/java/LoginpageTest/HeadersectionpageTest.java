package LoginpageTest;

import BrowserConfuguration.Browser;
import Login.Headersectionpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeadersectionpageTest extends Browser {
    Headersectionpage headersectionpage;
    @Test(priority = 1)
    public void Open_browser(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        headersectionpage=new Headersectionpage(driver);
        boolean a=headersectionpage.displayed_log();
        Assert.assertTrue(a,"Logo is not displayed");
    }
    @Test(priority = 2)
    public void Test_navbar_element(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        headersectionpage=new Headersectionpage(driver);
        headersectionpage.usernameinput();
        headersectionpage.passwordinput();
        headersectionpage.login();
        headersectionpage.Popular();
        String str1="https://qamoviesapp.ccbp.tech/popular";
        String str2= driver.getCurrentUrl();
        Assert.assertEquals(str1,str2,"Popular Url is not matched");
        headersectionpage.Home();
        String str3="https://qamoviesapp.ccbp.tech/";
        String str4= driver.getCurrentUrl();
        Assert.assertEquals(str3,str4,"Home Url is not matched");
    }
}
