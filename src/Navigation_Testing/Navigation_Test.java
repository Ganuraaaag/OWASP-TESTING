package Navigation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Test {

	public static void main(String[] args) {

	    ChromeDriver dr = new ChromeDriver();

	    dr.get("https://owasp.org/projects/juice-shop");
	    dr.manage().window().maximize();

	

        String home = dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[1]/span")).getText();
        String projects = dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[2]/span")).getText();
        String chapters = dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[3]/span")).getText();
        String events = dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[4]/span")).getText();
        String meetings = dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[5]")).getText();
        String news = dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[6]")).getText();
        String about = dr.findElement(By.xpath("/html/body/div[2]/header/div/div/div[1]/nav/a[7]")).getText();

        System.out.println(home);
        System.out.println(projects);
        System.out.println(chapters);
        System.out.println(events);
        System.out.println(meetings);
        System.out.println(news);
        System.out.println(about);

        if(home.contains("Home") &&
           projects.contains("Projects") &&
           chapters.contains("Chapters") &&
           events.contains("Events") &&
           meetings.contains("Meetings") &&
           news.contains("News") &&
           about.contains("About")) {

            System.out.println("Test Pass");

        }else {
            System.out.println("Test Fail");
        }

        dr.quit();
    }
}