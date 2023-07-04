package selbasic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class prac {

	public static void main(String[] args) {
	
		WebDriver driver =new ChromeDriver(	);
		//driver.manage().window().maximize();
		
		
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement signin=driver.findElement(By.xpath("//div[contains(@class,'accountInner')]"));
		Actions a=new Actions(driver);
		a.moveToElement(signin).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.id("username")).sendKeys("9188492345");
		driver.findElement(By.id("close-pop")).click();
	}
	}


