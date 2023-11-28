package LoginpageTest;

import BrowserConfuguration.Browser;
import Login.MovieDetailpage;
import org.testng.annotations.Test;

public class MovieDetailpageTest extends Browser {
    MovieDetailpage movieDetailpage;
    @Test(priority=1)
    public void HomePage(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        movieDetailpage=new MovieDetailpage(driver);
        movieDetailpage.Input_username();
        movieDetailpage.Input_password();
        movieDetailpage.Login();
        movieDetailpage.Verify_home();
    }
    @Test(priority = 2)
    public void popular_page(){
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        movieDetailpage=new MovieDetailpage(driver);
        movieDetailpage.Input_username();
        movieDetailpage.Input_password();
        movieDetailpage.Login();
        movieDetailpage.Verify_home();
        movieDetailpage.POPULAR();
        movieDetailpage.total_no_popular_movies();
    }
}
