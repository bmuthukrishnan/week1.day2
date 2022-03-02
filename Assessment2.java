package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment2 {
	public static void main(String[] args) throws InterruptedException  {
		
		//to setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
//	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement((By.xpath ("//button[@class='btn btn-primary']"))).click();
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).getText();
		System.out.println(" -->"+driver.findElement(By.xpath("//a[@class='navbar-brand']")).getText());
		driver.findElement(By.linkText("Log Out")).click();

		driver.close();
	}
}