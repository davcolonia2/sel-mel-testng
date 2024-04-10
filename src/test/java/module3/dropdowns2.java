package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

driver.get("https://demo.automationtesting.in/Register.html");

        WebElement dobDropdownElement = driver.findElement(By.id("yearbox"));
        Select dobDropdown = new Select(dobDropdownElement);
        dobDropdown.selectByIndex(1);

    }
}
