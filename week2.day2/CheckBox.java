package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the "Basic Checkbox.
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//span[text()='Ajax']']")).click();
		
	}

}
