import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocatorsTest {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();
    }

    @Test
    public void testLocators(){
        wd.get("https://www.gov.il/");
       String length = wd.findElement(By.id("SearchInput")).getAttribute("maxlength");
       System.out.println(length);

       String tag = wd.findElement(By.name("query")).getTagName();
        System.out.println(tag);
       wd.findElement(By.className("small-txt-search")).sendKeys("tfdgvkzjf");

       wd.findElement(By.linkText(""));

       wd.findElement(By.cssSelector("")).sendKeys("");
    }

    @AfterClass(enabled = false)
    public void tearDown(){
        wd.quit();
    }
}
