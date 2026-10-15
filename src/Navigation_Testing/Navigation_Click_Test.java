package Navigation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Click_Test {

    public static void main(String[] args) {

        ChromeDriver dr = new ChromeDriver();

        dr.get("https://owasp.org/projects/juice-shop");
        dr.manage().window().maximize();

        // 1. Home
        dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[1]/span")).click();
        dr.get("https://owasp.org/projects/juice-shop");

        // 2. Projects
        dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[2]/span")).click();
        dr.get("https://owasp.org/projects/juice-shop");

        // 3. Chapters
        dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[3]/span")).click();
        dr.get("https://owasp.org/projects/juice-shop");

        // 4. Events
        dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[4]/span")).click();
        dr.get("https://owasp.org/projects/juice-shop");

        // 5. Meetings
        dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[5]")).click();
        dr.get("https://owasp.org/projects/juice-shop");

        // 6. News
        dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[6]")).click();
        dr.get("https://owasp.org/projects/juice-shop");

        // 7. About
        dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[7]")).click();

        System.out.println("All clicked successfully!");

        dr.quit();
    }
}