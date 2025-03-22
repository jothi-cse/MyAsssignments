package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Priya");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Select "ComputerSoftware" as the industry
		WebElement industry= driver.findElement(By.name("industryEnumId"));
		Select indus = new Select(industry);
		indus.selectByIndex(2);
		//Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement ownership= driver.findElement(By.name("ownershipEnumId"));
		Select owner = new Select(ownership);
		owner.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source using SelectByValue
		WebElement source= driver.findElement(By.id("dataSourceId"));
		Select src = new Select(source);
		src.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement campaign= driver.findElement(By.id("marketingCampaignId"));
		Select camp = new Select(campaign);
		camp.selectByIndex(5);
		//Select "Texas" as the state/province using SelectByValue
		WebElement state= driver.findElement(By.id("generalStateProvinceGeoId"));
		Select st = new Select(state);
		st.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
