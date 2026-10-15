package Content_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class About_Section_Test {

	public static void main(String[] args) {

		ChromeDriver dr = new ChromeDriver();

		dr.get("https://owasp.org/projects/juice-shop");

		String about = dr.findElement(By.xpath("/html/body/header/div/div/div[1]/nav/a[7]")).getText();

		System.out.println("About Section : " + about);

		if(about.contains("About OWASP Juice Shop")) {

			System.out.println("Test Pass");

		}else {

			System.out.println("Test Fail");

		}

		dr.quit();

	}

}