package LoginpageTest;

import BrowserConfuguration.Browser;
import Login.Headersectionfuncationalitespage;
import Login.Pouplarpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PopularPageTest extends Browser {
   Pouplarpage pouplarpage;
   @Test(priority = 1)
    public void Popular_pageUi(){
       driver.get("https://qamoviesapp.ccbp.tech");
       driver.manage().window().maximize();
       pouplarpage=new Pouplarpage(driver);
       pouplarpage.Input_username();
       pouplarpage.Input_password();
       pouplarpage.Login();
       pouplarpage.popular();
       boolean d= pouplarpage.verify_popularmovies();
       Assert.assertTrue(d,"popular movies image is not displayed");
   }
}
