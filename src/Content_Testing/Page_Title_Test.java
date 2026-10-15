package Content_Testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Title_Test {

	public static void main(String[] args) {

		ChromeDriver dr = new ChromeDriver();

		dr.get("https://owasp.org/projects/juice-shop");

		String title = dr.getTitle();

		System.out.println("Page Title : " + title);

		if(title.contains("OWASP Juice Shop")) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}

		dr.quit();
	}
}