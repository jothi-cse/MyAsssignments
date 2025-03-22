package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		 //input username
		driver.findElement(By.id("username")).sendKeys("democsr");
		 //input and store password
		 WebElement pwrd = driver.findElement(By.id("password"));
		 pwrd.sendKeys("crmsfa");
		 
		 //click on login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //click on CRM/SFA
		 driver.findElement(By.partialLinkText("CRM")).click();
		 //click on leads
		 driver.findElement(By.linkText("Leads")).click();
		 //click on createlead
		 driver.findElement(By.partialLinkText("Create")).click();
		 //enter company name
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 //enter the firstName
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jothi");
		 //enter the lastName
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
		 
		 //Select Employee in the source dropdown 
		 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select sel=new Select(source);//shortcut for import the class is ctrl+shift+o
		 sel.selectByIndex(4);
		//Select Automobile in the Marketing Campaign (using visibleText)
		 WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select sel1=new Select(marketing);//shortcut for import the class is ctrl+shift+o
		 sel1.selectByVisibleText("Automobile");
		 //Select Corporation in Ownership (using value)
		 WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select sel2=new Select(ownership);
		 sel2.selectByValue("OWN_CCORP");
		 //Click on the Create Lead button
		 driver.findElement(By.name("submitButton")).click();
		 //Verify the title of the current web page
		 String title = driver.getTitle(); 
		 System.out.println(title);
		 driver.close();
		 

	}
}
