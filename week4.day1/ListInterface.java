package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> list = new ArrayList<Integer>();
		for (WebElement all : allPrices)
				{
			String text = all.getText();
			String replaceAll = text.replaceAll(",","");
			int mp = Integer.parseInt(replaceAll);
			list.add(mp);
			
				}
		Collections.sort(list);
		System.out.println(list);
		
		int size = allPrices.size();
		System.out.println("Total:"+size);
	}

}
