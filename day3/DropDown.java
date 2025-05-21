package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.telerik.com/contact");
		driver.manage().window().maximize();
		
		WebElement dd = driver.findElement(By.id("Dropdown-1"));
		Select opt = new Select(dd);
		opt.selectByIndex(5);
		Thread.sleep(3000);
		WebElement dd1 = driver.findElement(By.id("Dropdown-2"));
		Select opt1 = new Select(dd1);
		opt1.selectByVisibleText("UI for React");
		
		

	}

}
