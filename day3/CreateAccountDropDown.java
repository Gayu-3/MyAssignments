package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("Guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("HDFC Bank");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select opt1 = new Select(industry);
		opt1.selectByValue("IND_SOFTWARE");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select opt2 = new Select(ownership);
		opt2.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select opt3 = new Select(source);
		opt3.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select opt4 = new Select(marketing);
		opt4.selectByIndex(5);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select opt5 = new Select(state);
		opt5.selectByValue("TX");
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
