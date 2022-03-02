package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {
	public static void main(String[] args) throws InterruptedException  {
		
		//to setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Muthutest");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9843683800");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Krish$001_01");
		Select selday = new Select(driver.findElement(By.id("day")));
		selday.selectByVisibleText("6");
		Select selmonth = new Select(driver.findElement(By.id("month")));
		selmonth.selectByVisibleText("Nov");
		Select selyear = new Select(driver.findElement(By.id("year")));
		selyear.selectByVisibleText("1987");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
	}
}