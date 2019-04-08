package example_using_runnable_interface;

public class Main {

    public static void main(String[] args) {
        Thread safariThread = new Thread(new SafariTest());
        Thread chromeThread = new Thread(new ChromeTest());
        safariThread.setName("SafariBrowser");
        chromeThread.setName("ChromeBrowser");
        safariThread.start();
        chromeThread.start();
    }
}
