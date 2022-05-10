package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
			
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
String text =driver.findElement(By.tagName("h2")).getText();
System.out.println(text);
driver.findElement(By.linkText("CRM/SFA")).click();
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mukesh kannan");
driver.findElement(By.name("birthDate")).sendKeys("26-08-2000");
WebElement createLeadForm_dataSourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dd1=new Select(createLeadForm_dataSourceId);
dd1.selectByVisibleText("Employee");
WebElement createLeadForm_industryEnumId= driver.findElement(By.id("createLeadForm_industryEnumId"));
Select dd2=new Select(createLeadForm_industryEnumId);
dd2.selectByIndex(3);
WebElement createLeadForm_ownershipEnumId= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select dd3=new Select(createLeadForm_ownershipEnumId);
dd3.selectByValue("OWN_SCORP");
WebElement createLeadForm_marketingCampaignId= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select dd4=new Select(createLeadForm_marketingCampaignId);
dd4.selectByVisibleText("Automobile");
WebElement createLeadForm_generalCountryGeoId= driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select dd5=new Select(createLeadForm_generalCountryGeoId);
dd5.selectByValue("IND");
WebElement createLeadForm_generalStateProvinceGeoId= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select dd6=new Select(createLeadForm_generalStateProvinceGeoId);
dd6.selectByValue("IN-TN");
driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("1800");
driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("father");


driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("paramasiva periyar");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("mk");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("selenium");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computer science");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3.5lpa");
driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8056687813");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mukeshkannan2016@gmail.com");
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("MK");
driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("anna nagar");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("tenkasi");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("627859");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("hello everyone");
driver.findElement(By.linkText("Create Lead")).click();

	}

	
}
