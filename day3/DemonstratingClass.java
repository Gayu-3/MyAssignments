package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemonstratingClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("Guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gayathiri");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("saravanan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("gaajan.ed@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456789");
		WebElement day = driver.findElement(By.id("day"));
		Select opt1 = new Select(day);
		opt1.selectByValue("11");
		WebElement month = driver.findElement(By.id("month"));
		Select opt2 = new Select(month);
		opt2.selectByVisibleText("Oct");
		WebElement year = driver.findElement(By.id("year"));
		Select opt3 = new Select(year);
		opt3.selectByValue("1997");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		

	}

}

