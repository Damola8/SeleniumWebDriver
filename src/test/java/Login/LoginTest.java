package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.firefox.driver", "resources/geckodriver.exe");
        driver = new FirefoxDriver();
        //fetch the url to automate
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(5000);
        //maximize the window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        //click on the page
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[21]/a")).click();
        //click on the username box and enter text
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith");
        //click on the password box and enter text
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");
        //click on the login button
        driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();

        Thread.sleep(5000);

        //driver.quit();
    }

    public static void main(String[] args) throws InterruptedException{
        LoginTest test = new LoginTest();
        test.setUp();

    }
}
