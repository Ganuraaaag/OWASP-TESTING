package Content_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Heading_Test {

	public static void main(String[] args) {

		ChromeDriver dr = new ChromeDriver();

		dr.get("https://owasp.org/projects/juice-shop");

		String heading = dr.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/h1")).getText();

		System.out.println("Page Heading : " + heading);

		if(heading.equals("OWASP Juice Shop")) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}

		dr.quit();
	}
}