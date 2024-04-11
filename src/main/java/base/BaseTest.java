package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public String driverPath;
    public String url;
    public WebDriver driver;


    @BeforeMethod
    public void preCond() {
        url = "https://www.facebook.com/r.php?locale=pt_BR&display=page";
        driver = new ChromeDriver();
        driver.get( url );
        driver.manage().window().maximize();
    }
    protected WebDriver getDriver(){
        return driver;
    }
}
