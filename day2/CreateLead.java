package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathiri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Saravanan");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		
		String title = driver.getTitle();		
		System.out.println(title);
		
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();		
		System.out.println(title1);
		
		if (title1.equals("View Lead | opentaps CRM")) {
			System.out.println("The title matched");
			
		}else {
			System.out.println("Tityle not Matched");
			
		}
		
		driver.quit();
	}

}

