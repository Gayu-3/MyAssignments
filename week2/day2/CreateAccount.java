package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Janani");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("20");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1 = driver.getTitle();		
		System.out.println(title1);
		
		if (title1.equals("Create Account | opentaps CRM")) {
			System.out.println("the title matched");
			
		}else {
			System.out.println("the title not matched");
		}
		driver.quit();
	}

}
