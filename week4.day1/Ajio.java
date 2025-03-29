package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		//wait
		Thread.sleep(2000);
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		List<String> list = new ArrayList<String>();
		for (WebElement all : brands)
				{
				String text = all.getText();
				list.add(text);
			
				}
		int total = list.size();
		System.out.println("Total brands:"+total);
		System.out.println("Brands:"+list);
		//Print the count of the items found.
		WebElement count = driver.findElement(By.xpath("//div[@class='length']/strong"));
		String text1 = count.getText();
		String replaceAll = text1.replaceAll("[^0-9]","");
		System.out.println("Total searched:"+replaceAll);
		//Get the list of names of the bags and print it
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> list1 = new ArrayList<String>();
		for (WebElement all1 : names)
				{
				String text2 = all1.getText();
				list1.add(text2);
			
				}
		System.out.println("Name of bags:"+list1);
	}

}
