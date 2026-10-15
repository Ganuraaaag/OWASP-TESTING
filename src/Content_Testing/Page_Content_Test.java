package Content_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Content_Test {

	public static void main(String[] args) {

		ChromeDriver dr = new ChromeDriver();

		dr.get("https://owasp.org/projects/juice-shop");

		String content = dr.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/div[1]/p")).getText();

		System.out.println("Page Content : " + content);

		if(content.contains("insecure web application")) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}

		dr.quit();
	}
}




