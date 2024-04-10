package module2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class muiltipleElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.bestbuy.com/");

        WebElement input = driver.findElement(By.id("gh-search-input"));
        WebElement search = driver.findElement(By.className("header-search-button"));

        input.sendKeys("iPhone 15");
        Thread.sleep(5000);

        search.click();
        Thread.sleep(5000);



        List<WebElement> products = driver.findElements(By.className("sku-title"));
        System.out.println("items found "+products.size());

        for(WebElement product: products){
            String text = product.getText();
            System.out.println("title "+ text);
        if(text.toLowerCase().contains("iphone 15 pro")){
            System.out.println("item relevant");
        }else {
            System.out.println("item irrelevent");
        }
        }


        driver.quit();

    }

}
