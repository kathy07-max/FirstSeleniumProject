
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestChromeOpen {
    WebDriver wd;

    @BeforeTest
    public void setUp() {
        wd = new ChromeDriver();
        // wd.get("https://www.google.com/");
        wd.navigate().to("https://www.google.com/");
    }

    @Test
    public void testChrom() {

    }
}
