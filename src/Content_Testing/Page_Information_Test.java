package Content_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Information_Test {

    public static void main(String[] args) {

        ChromeDriver dr = new ChromeDriver();

        dr.get("https://owasp.org/projects/juice-shop");

        String projectInfo = dr.findElement(
            By.xpath("//*[contains(text(),'Flagship')]")
        ).getText();

        System.out.println("Project Information : " + projectInfo);

        if(projectInfo.contains("Flagship")) {
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Fail");
        }

        dr.quit();
    }
}