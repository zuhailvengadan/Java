package selbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract public class applilaunch  {
abstract public void meth2()throws InterruptedException;
	public static void meth1() throws InterruptedException {

for (int i = 0; i <1; i++) {
	
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();

        driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		String a=driver.getCurrentUrl();
		String b=driver.getTitle();
		System.out.println(a);
		System.out.println(b);
		driver.close();
		
	}

	}
}
