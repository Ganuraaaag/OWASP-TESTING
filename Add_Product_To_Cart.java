package UI_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Product_To_Cart {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        // Open actual Juice Shop application
        driver.get("https://demo.owasp-juice.shop/");

        Thread.sleep(5000);

        // Click Add to Basket
        driver.findElement(
            By.xpath("//button[contains(@aria-label,'Add to Basket')]")
        ).click();

        System.out.println("Product added to cart successfully");

        Thread.sleep(3000);

        driver.quit();
    }
}