package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com");
	String parent = driver.getWindowHandle();
	WebElement srchTF = driver.findElement(By.name("q"));
	srchTF.sendKeys("iphone");
	srchTF.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']")).click();
	Set<String> ids = driver.getWindowHandles();
	for (String id : ids) {
		if(!parent.equals(id))
		{
			driver.switchTo().window(id);
			System.out.println("switched to == "+driver.getTitle());
			try {
			driver.findElement(By.xpath("//*[local-name()='svg']//*[name()='g' and @clip-path='url(#AddToCart_a)']")).click();
			}catch (Exception e) {
				driver.findElement(By.xpath("//*[local-name()='svg']//*[name()='g' and @clip-path='url(#AddToCart_a)']")).click();
			}
		}
	}
	System.out.println("done");
}
}
