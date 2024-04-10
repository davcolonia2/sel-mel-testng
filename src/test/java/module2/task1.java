package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Go to website number 1 of your choice using get() method
//        Maximize the window
//        Go to website number 2 of your choice using get() method
//        Go to website number 3 of your choice using get() method
//        Go to website number 4 of your choice using navigate() method
//        Print 4th website title on your console using getTitle() method
//        Go back using back() method and Print 3rd website title
//        Go back using back() method and Print 2nd website URL
//        Go back using back() method and Print 1st website title
//        Close window
public class task1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.bestbuy.com/");
        driver.get("https://www.google.com/");
        driver.get("https://www.bing.com/");
        driver.navigate().to("https://www.youtube.com/");

        System.out.println("4th website title: " + driver.getTitle());

        driver.navigate().back();
        System.out.println("3rd website title: " + driver.getTitle());
Thread.sleep(1000);
        driver.navigate().back();
        System.out.println("2nd website URL: " + driver.getCurrentUrl());
        Thread.sleep(1000);

        driver.navigate().back();
        System.out.println("1st website tite: "+ driver.getTitle());

        driver.quit();
    }
}
