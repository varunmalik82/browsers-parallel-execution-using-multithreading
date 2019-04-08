package example_using_thread_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest extends Thread{

    public void run()  {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com");
        driver.close();
    }
}
