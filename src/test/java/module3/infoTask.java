package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class infoTask {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://haltersweb.github.io/Accessibility/submit-disabling.html");
        Thread.sleep(1000);

        WebElement button = driver.findElement(By.xpath("//button[@class='btn']"));

        System.out.println(button.getAttribute("aria-disabled"));
        System.out.println(button.getCssValue("color"));


        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        firstName.sendKeys("test");
        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        //*[@id="a11yForm"]/form/button
        lastName.sendKeys(("test2"));
        Thread.sleep(1000);

        WebElement staleElement = driver.findElement(By.xpath("//label[@for='firstName']"));
        staleElement.click();
        Thread.sleep(1000);

        System.out.println(button.getAttribute("aria-disabled"));
        System.out.println(button.getCssValue("color"));



driver.quit();
    }
public static WebDriver getDriver(String browserType){
        switch (browserType){
            case "Chrome":
            return new ChromeDriver();
            case "Firefox":
            return new FirefoxDriver();
            case "Safari":
            return new SafariDriver();
            default:
                return new ChromeDriver();
    }

}



}
