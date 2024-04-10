package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

//driver.get();

        WebElement dropDown = driver.findElement(By.id("Skills"));

        Select dropdown = new Select(dropDown);

        dropdown.selectByIndex(0);
        Thread.sleep(3000);

        dropdown.selectByValue("C++");
        Thread.sleep(1000);

        dropdown.selectByVisibleText("Java");
        Thread.sleep(1000);


        List<WebElement> allOptions = dropdown.getOptions();
        System.out.println("All skills");
        for(WebElement option: allOptions){
            System.out.println(option.getText());
        }

        driver.quit();
    }
}
