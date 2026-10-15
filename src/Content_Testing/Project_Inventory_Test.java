package Content_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Inventory_Test {

    public static void main(String[] args) {

        ChromeDriver dr = new ChromeDriver();

        dr.get("https://owasp.org/");

      
        dr.findElement(By.xpath("/html/body/header/div/div/div[1]/nav/a[2]")).click();

        String inventory = dr.findElement(
            By.xpath("//*[contains(text(),'OWASP Project Inventory')]")
        ).getText();

        System.out.println("Project Inventory : " + inventory);

        if(inventory.contains("OWASP Project Inventory")) {
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Fail");
        }

        dr.quit();
    }
}