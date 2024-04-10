package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        String UN = "testautoman@email.com";
        String PW = "qwerty123!";

        driver.get(" https://magento.softwaretestingboard.com/");

        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));

        button.click();
        Thread.sleep(3000);

       WebElement LoginButton = driver.findElement(By.xpath("//*[@id='email']"));
        LoginButton.sendKeys(UN);
        WebElement PwButton = driver.findElement(By.xpath("//*[@id='pass']"));
        PwButton.sendKeys(PW);
        WebElement SignIn = driver.findElement(By.xpath("//*[@id='send2']/span"));
        SignIn.click();
        Thread.sleep(2000);


        System.out.println(driver.getTitle());

        WebElement welcome = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span"));
        String welcomeString = welcome.getText();
        System.out.println(welcomeString);

        if (welcomeString.startsWith("Welcome")){
            System.out.println("TEST: PASSED\n");
        } else {
            System.out.println("TEST: FAILED\n");
        }

        driver.quit();

    }

}
