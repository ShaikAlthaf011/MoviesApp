package LoginpageTest;

import BrowserConfuguration.Browser;
import Login.SearchmoviePage;
import org.testng.annotations.Test;

public class SearchmoviepageTest extends Browser {
    SearchmoviePage searchmoviePage;
    @Test(priority = 1)
    public void searchin_movies(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        searchmoviePage=new SearchmoviePage(driver);
        searchmoviePage.Username();
        searchmoviePage.Password();
        searchmoviePage.login();
        searchmoviePage.Serach_icon();
        searchmoviePage.search_input();
        searchmoviePage.Verify_search_icon();
        searchmoviePage.Verify_count_movies();
    }
}
