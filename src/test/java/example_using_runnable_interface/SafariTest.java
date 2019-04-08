package example_using_runnable_interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest implements Runnable {
    @Override
    public void run() {
        WebDriver driver = new SafariDriver();
        System.out.println("Staring Thread - "+Thread.currentThread().getName());
        driver.navigate().to("https://google.com");
        driver.close();
    }
}
