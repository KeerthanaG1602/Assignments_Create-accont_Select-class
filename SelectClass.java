package week2.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		
		//Initialize browser
		ChromeDriver driver= new ChromeDriver();
		
		//Load url
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize browser
		
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	

		//Click on the Create new account button.
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter first name
		driver.findElement(By.name("firstname")).sendKeys("Keerthana");
		
		//Enter surname
		driver.findElement(By.name("lastname")).sendKeys("G");
		
		 //Enter the Mobile number or email address. 
		driver.findElement(By.name("reg_email__")).sendKeys("8778792180");
		
		//Enter the New password.
		driver.findElement(By.name("reg_passwd__")).sendKeys("keerthana1234");
		
		//Handle all three dropdowns in Date of birth
		WebElement sourceDropdown = driver.findElement(By.id("day"));
		
		Select dropdownOptions=new Select(sourceDropdown);
		
		dropdownOptions.selectByValue("1");
		
		//Month
		WebElement sourceDropdown1 = driver.findElement(By.id("month"));
		
		Select dropdownOptions1=new Select(sourceDropdown1);
		
		dropdownOptions1.selectByValue("6");
		
		//year
		WebElement sourceDropdown2 = driver.findElement(By.id("year"));
		Select dropdownOptions2 =new Select(sourceDropdown2);
		dropdownOptions2.selectByValue("2002");
		
		//# Use CSS selector to find a radio button by its value

		WebElement button=driver.findElement(By.cssSelector("input[type='radio'][value='1']"));
		button.click();
		
		//submit
		//driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
	}

}
