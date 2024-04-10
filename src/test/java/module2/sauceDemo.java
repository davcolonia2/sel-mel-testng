package module2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class sauceDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String url = "https://www.saucedemo.com/";
        String url2 = "https://magento.softwaretestingboard.com/";

        driver.get(url2);

        driver.manage().window().maximize();

                WebElement user = driver.findElement(By.xpath("//input[@data-test='username']"));
                WebElement pw = driver.findElement(By.xpath("//input[@data-test='password']"));
                WebElement submit = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));

                WebElement logo = driver.findElement(By.xpath("a[@class='logo']/img"));
        WebElement input = driver.findElement(By.xpath("//input[@id='search']"));
        WebElement support = null;
        WebElement cart = driver.findElement(By.xpath("//a[@class='action showcart']"));






//
//                user.sendKeys("standard_user\n");
//                pw.sendKeys("secret_sauce");
//                submit.click();
//                Thread.sleep(3000);








                String currentUrl = driver.getCurrentUrl();
                System.out.println("url after log in: " + currentUrl);

                WebElement sauceCartButtonBP = driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']"));
                sauceCartButtonBP.click();

                Thread.sleep(3000);

                WebElement sauceCartButtonShirt = driver.findElement(By.xpath("//button[@name = 'add-to-cart-sauce-labs-bolt-t-shirt']"));
                sauceCartButtonShirt.click();
                Thread.sleep(3000);


WebElement cart2 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
cart.click();


List <WebElement> carItems = driver.findElements(By.xpath("//div[@class='cart_item']"));

int expectedItems = 2;
int actualItems = carItems.size();

if (actualItems==expectedItems){
    System.out.println("pass");
} else {
    System.out.println("fail");
}





        driver.quit();
    }

}
