package LoginpageTest;

import BrowserConfuguration.Browser;
import Login.Accountpage;
import org.testng.annotations.Test;

public class AccountpageTest extends Browser {
    Accountpage accountpage;
    @Test(priority=1)
    public void Accountpage(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        accountpage=new Accountpage(driver);
    }
    @Test(priority = 2)
    public void UI_element_webpage(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        accountpage=new Accountpage(driver);
        accountpage.Input_username();
        accountpage.Input_password();
        accountpage.login_button();
        accountpage.List_of_movies();
        accountpage.Account_page();
        accountpage.heading();
        String str1="https://qamoviesapp.ccbp.tech/account";
        String str2= driver.getCurrentUrl();
        if(str1.equals(str2)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test case is not passed");
        }
        String str3= driver.getTitle();
        System.out.println(str3);
        String str4= driver.getPageSource();
        System.out.println(str4);
        accountpage.Tags();
    }
}
