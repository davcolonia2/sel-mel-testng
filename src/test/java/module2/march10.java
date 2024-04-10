package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class march10 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://youtube.com/");
        Thread.sleep(1000);

        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        boolean isSearchEnabled = search.isEnabled();
        System.out.println("Is search enabled "+ isSearchEnabled);


        
        driver.quit();
    }
}
