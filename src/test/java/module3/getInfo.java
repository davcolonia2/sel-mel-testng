package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getInfo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bestbuy.com");
        Thread.sleep(1000);

        WebElement searchInput = driver.findElement(By.id("gh-search-input"));

        String expected = "What can we help you find today?";

        String name = searchInput.getAttribute("placeholder");

        System.out.println("Expected ph: "+ expected);
        System.out.println("Actual ph: "+name);

        if(expected.equals(name)){
            System.out.println("Pass");
        } else{
            System.out.println("Fail");
        }


        System.out.println("value attribute before typing: " +searchInput.getAttribute("value"));
        searchInput.sendKeys("test");
        Thread.sleep(1000);
        System.out.println("value attribute after typing: " +searchInput.getAttribute("value"));

        System.out.println("value boolean check: " +searchInput.getAttribute("disabled"));



        driver.quit();



    }


}
