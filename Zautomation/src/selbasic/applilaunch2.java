package selbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class applilaunch2 extends applilaunch {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	ChromeOptions opt=new ChromeOptions();
	//	opt.addArguments("--remote-allow-origins=*");
      applilaunch2 a1=new applilaunch2();
      a1.meth2();
   //   meth1();
	}
	public  void meth2() throws InterruptedException {
	for (int i = 0; i <1; i++) {
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();

	      driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.get("https://www.amazon.com/");
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
