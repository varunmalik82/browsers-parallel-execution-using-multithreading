package example_using_runnable_interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest implements Runnable{
    public void run()  {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
        System.out.println("Staring Thread - "+Thread.currentThread().getName());
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com");
        driver.close();
    }
}
