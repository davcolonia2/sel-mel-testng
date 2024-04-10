package module2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class table {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);

        //xpath *[@id = 'productTable']/tbody/tr[1]/td[1]"


 //       WebElement table2ndCell = driver.findElement(By.xpath("table[@id = 'productTable']/tbody/tr[1]/td[1]"));
        //extract return a string

   //     String cellText = table2ndCell.getText();
       // System.out.println("data in 2nd row 2nd cell ="+cellText);



        List<WebElement> authors = driver.findElements(By.xpath("*//table[@name='BookTable']/tbody/tr/td[2]"));

        for(WebElement element: authors){
            String author = element.getText();
System.out.println(author);
        }


        driver.quit();


    }



    public static void getDataColumn(WebDriver driver, String columnNumber){
        String xPath = "//*[id='productTable']/tbody/tr/td["+columnNumber+"]";
        List <WebElement> columnData = driver.findElements(By.xpath(xPath));
        for(WebElement each :columnData){
            String eachCell = each.getText();
            System.out.println(eachCell);
        }

    }
    public static void printData(WebDriver driver, int row, int column){
        String xpath = "table[@id = 'productTable']/tbody/tr["+row+"]/td["+column+"]";
        WebElement tableCell = driver.findElement(By.xpath(xpath));
        String cellText = tableCell.getText();
        System.out.println("data from table cell is: "+ cellText);
    }

}
