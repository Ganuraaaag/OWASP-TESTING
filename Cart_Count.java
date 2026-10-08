package UI_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart_Count {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demo.owasp-juice.shop/");

        // Add product
        driver.findElement(By.xpath("//button[contains(@aria-label,'Add to Basket')]")).click();

        // Get cart count
        String count = driver.findElement(By.id("basket-item-count")).getText();

        System.out.println("Cart Count = " + count);

        driver.quit();
    }
}
