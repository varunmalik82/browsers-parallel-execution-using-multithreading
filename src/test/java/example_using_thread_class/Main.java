package example_using_thread_class;

public class Main {
    public static void main(String[] args) {
        ChromeTest chromeTest = new ChromeTest();
        SafariTest safariTest = new SafariTest();
        chromeTest.start();
        safariTest.start();
    }
}
