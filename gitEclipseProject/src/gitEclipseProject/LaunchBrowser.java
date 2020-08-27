package gitEclipseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		System.out.println("Title of the browser is " +driver.getTitle());
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Itelearn");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
			String txt="This is a project to integrate Jenkins with Eclipse and Github";
			System.out.println(txt);
			System.out.println("Length of above text is "+txt.length());

	}

}
