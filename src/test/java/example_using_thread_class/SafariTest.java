package example_using_thread_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest extends Thread{
    public void run() {
        WebDriver driver = new SafariDriver();
        driver.navigate().to("https://google.com");
        driver.close();
    }
}
