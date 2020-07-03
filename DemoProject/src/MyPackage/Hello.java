package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to AAUTOMATION world");
		
		System.setProperty("webdriver.chrome.driver", 
	               "C:\\Users\\akhil naidu\\eclipse-workspace\\DemoProject\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.amazon.com");
    driver.manage().window().maximize();
    String title = driver.getTitle();
    
    
   if(title.equalsIgnoreCase("Amazon.in"))
   		System.out.println("Title matches");
   		
   		else 
   			System.out.println(title);
   
   String tagname = "";
   tagname = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).getText();
   System.out.println(tagname);
   
   driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[3]/a")).click();
   Thread.sleep(1000);
   
//   driver.findElement(By.id("//*[@id=\\"twotabsearchtextbox\\"]")).click();
//   WebElement e2 = driver.findElement(By.id("twotabsearchtextbox//"));
//   e2.sendKeys("Mobile phones");
//   
   driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
   Thread.sleep(1000);
  
	}
	

}
