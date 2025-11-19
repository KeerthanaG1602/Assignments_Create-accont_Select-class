package week2.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {

		
		//Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maxime the browser
		driver.manage().window().maximize();
		
		//Enter username
		driver.findElement(By.id("username")).sendKeys("democsr");
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login button
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Click on the "CRM/SFA" link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click on the "Accounts" tab.
				driver.findElement(By.linkText("Accounts")).click();
				
				//Click on the "Create Account" button
				driver.findElement(By.linkText("Create Account")).click();
				
				//Enter an account name
				driver.findElement(By.name("accountName")).sendKeys("Keerthana");
				
				//Enter a description as "Selenium Automation Tester." 
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				
				//Select "ComputerSoftware" as the industry
				//driver.findElement(By.name("industryEnumId")).click();
				
				     //To use select class
				     // 1.1 Identify the element & confirm with <select>
				     // 1.2 Instantiate the select class by passing the webelement as argument to the constuctor
				
				//Select value from dropdown to find the element
				WebElement sourceDropdown =driver.findElement(By.name("industryEnumId"));
				
				Select dropdownOptions= new Select (sourceDropdown);
				
				dropdownOptions.selectByIndex(2);
				
				//Select "S-Corporation" as ownership using SelectByVisibleText. 
				
				WebElement sourceDropdown1 =driver.findElement(By.name("ownershipEnumId"));
				Select dropdownOptions1= new Select (sourceDropdown1);
				
				dropdownOptions1.selectByVisibleText("S-Corporation");
				
				//Select "Employee" as the source using SelectByValue. 
				
				WebElement sourceDropdown2 =driver.findElement(By.id("dataSourceId"));
				Select dropdownOptions2= new Select (sourceDropdown2);
				dropdownOptions2.selectByValue("LEAD_EMPLOYEE");
				
				//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex. 
				
				WebElement sourceDropdown3 =driver.findElement(By.id("marketingCampaignId"));
				Select dropdownOptions3 = new Select (sourceDropdown3);
				dropdownOptions3.selectByIndex(6);
				
				//Select "Texas" as the state/province using SelectByValue.
				
				WebElement sourceDropdown4 =driver.findElement(By.id("generalStateProvinceGeoId"));
				Select dropdownOptions4 = new Select (sourceDropdown4);
				dropdownOptions3.selectByValue("TX");
				
				//Click the "Create Account" button. 
				driver.findElement(By.className("smallSubmit")).click();
				
		
	}

}
