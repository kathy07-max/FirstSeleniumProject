import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class OpenChromeBrowser {
    WebDriver wd;
    //init (run browser, open site, login)
    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.navigate().to("https://www.google.com/");
    }
    @Test
    public void searchTest(){
       //sout
        System.out.println("Google");
        wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).clear();
        wd.findElement(By.name("q")).sendKeys("Selenium WebDriver"+ Keys.ENTER);
    }
  //  @Test
    public void openMail(){

    }
    public void changeLanguage(){

    }

    @AfterClass(enabled = false)
    public void tearDown(){
        wd.quit();

    }
}
