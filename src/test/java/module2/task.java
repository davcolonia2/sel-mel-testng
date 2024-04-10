package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("http://dev-hrm.yoll.io/");
        Thread.sleep(3000);

       String userName = "yoll-student";
       String pw = "Bootcamp5#";

        WebElement un = driver.findElement(By.id("txtUsername"));
        un.sendKeys(userName);
      //  Thread.sleep(3000);
        WebElement pW = driver.findElement(By.id("txtPassword"));
        pW.sendKeys(pw);
       // Thread.sleep(3000);
        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();
        Thread.sleep(3000);

        String title = driver.getTitle();
        System.out.println("Page title ="+title);

        String expectedHeader ="Dashboard";
        WebElement header = driver.findElement(By.cssSelector(".head>h1"));
        String actualHeader = header.getText();

        if(expectedHeader.equals(actualHeader)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }


driver.quit();



    }




}
