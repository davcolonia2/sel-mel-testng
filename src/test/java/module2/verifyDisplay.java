package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyDisplay {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        driver.get("http://dev-hrm.yoll.io/index.php/auth/login");
        Thread.sleep(1000);

        String username = "yoll-student";
        String pw = "Bootcamp5#";

        WebElement un = driver.findElement(By.cssSelector("#txtUsername"));
        WebElement pW = driver.findElement(By.cssSelector("[name=txtPassword]"));
        WebElement btn = driver.findElement(By.cssSelector("#btnLogin"));


        Thread.sleep(1000);

        un.sendKeys(username);
        pW.sendKeys(pw);
        btn.click();
        Thread.sleep(1000);

        WebElement welcome = driver.findElement(By.cssSelector("#welcome"));

        boolean isDisplayedW = welcome.isDisplayed();

        System.out.println("Is there welcome: "+ isDisplayedW);

        boolean isEnabledW = welcome.isEnabled();

        System.out.println("Is there welcome enabled: "+ isEnabledW);





    }



}
