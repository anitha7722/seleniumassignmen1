package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();

			// Launch the chrome browser
			ChromeDriver driver = new ChromeDriver();

			//  URL load
			driver.get("http://leaftaps.com/opentaps");

			//  Maximize
			driver.manage().window().maximize();

			//  Find the username and type the value
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

			// Find the password and type the value
			driver.findElement(By.id("password")).sendKeys("crmsfa");

			// Find the login button and click
			driver.findElement(By.className("decorativeSubmit")).click();

			// Verify that you logged in
			String text = driver.findElement(By.tagName("h2")).getText();
			System.out.println(text);

			// Click CRM/SFA Link
			driver.findElement(By.linkText("CRM/SFA")).click();

			// Click Create Lead Link
			driver.findElement(By.linkText("Create Lead")).click();

			// Enter the Company Name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Atina");

			// Enter the first name
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anitha");

			// Enter last name
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NANNU");

			//  Choose the source as Partner
			WebElement eleDropdown1 = driver.findElement(By.id("createLeadform_dataSourceId"));
			Select dd1 = new Select (eleDropdown1);
			dd1.selectByVisibleText("Partner");
			

			//  Choose the Marketing campaign as Automobile
			WebElement eleDropdown2 = driver.findElement(By.name("dataSourceId"));
			Select dd2 = new Select (eleDropdown2);
			dd2.selectByVisibleText("Automobile");
		
			// choose the First Name(Local)
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anitha");
			
			// choose the Last Name (Local)
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
			
			//  choose Salutation
			driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("atina");
			
			// choose Birthdate
			driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/07/97");
			
			// enter the Title
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
			
			// enter the Department
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SelLearn");
			// enter Annual Revenue
			driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("150000");
			//choose preferred currency
			WebElement eleDropdown3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
			Select dd3 = new Select(eleDropdown3);
			dd3.selectByVisibleText("INR-Indian Rupee");
			
		//choose a industry
			WebElement eleDropdown4 = driver.findElement(By.name("industryEnumId"));
			Select dd4 = new Select(eleDropdown4);
			dd4.selectByVisibleText("Manufacturing");
			//enter no. of employees
			driver.findElement(By.name("numberEmployees")).sendKeys("77");
			//choose ownership as partnership
			WebElement eleDropdown5 = driver.findElement(By.name("ownershipEnumId"));
			Select dd5 = new Select(eleDropdown5);
			dd5.selectByVisibleText("Partnership");
			//enter sic no.
			driver.findElement(By.name("sicCode")).sendKeys("777777");
			//enter ticker sym
			driver.findElement(By.name("tickerSymbol")).sendKeys("abu");
			// write something in Description
			driver.findElement(By.id("createLeadForm_description")).sendKeys(" selenium learning class automation");
			//  write a Important Note
			driver.findElement(By.name("importantNote")).sendKeys("It is difficult but learn if its easy");
			//  enter Countrycode
			driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
			//enter  Area code
			driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("2");
			//enter  Extension
			driver.findElement(By.name("primaryPhoneExtension")).sendKeys("3456");
			// Email address
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abuthab@gmail.com");
			//enter  Phone number
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("888888888");
			// type Person to ask for
			driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("kumaran");
			//enter  Web Url
			driver.findElement(By.name("primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps");
			// generalToName
			driver.findElement(By.name("generalToName")).sendKeys("appu");

			//generalAttnName
			driver.findElement(By.name("generalAttnName")).sendKeys("chennan");

			// generalAddress1
			driver.findElement(By.name("generalAddress1")).sendKeys("pondicherry");

			// generalAddress 2
			driver.findElement(By.name("generalAddress2")).sendKeys("postbox6000001");

			// generalCity
			driver.findElement(By.name("generalCity")).sendKeys(" pondicherry");
			// State/Province 
			WebElement eleDropdown6 = driver.findElement(By.name("generalStateProvinceGeoId"));
			Select dd6 = new Select(eleDropdown6);
			dd6.selectByVisibleText("Indiana");

			// Zip/Postalcode 
			driver.findElement(By.name("generalPostalCode")).sendKeys("678910");

			// Country 
			WebElement eleDropdown7 = driver.findElement(By.name("generalCountryGeoId"));
			Select dd7 = new Select(eleDropdown7);
			dd7.selectByVisibleText("India");
			// Zip/Postal Code Extension

			driver.findElement(By.name("generalPostalCodeExt")).sendKeys("206");

			System.out.println("Form created");

			driver.findElement(By.className("smallSubmit")).click();

			driver.findElement(By.linkText("Duplicate Lead")).click();

			driver.findElement(By.id("createLeadForm_companyName")).clear();

			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("atina22");

			driver.findElement(By.className("smallSubmit")).click();


			String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();

			if(text2.contains("atina22"))
			{
			System.out.println(text2 +"is the Updated company name ");
			System.out.println("Company name checked is correct ");
			}
			else
			{
				System.out.println("Company name checked is wrong ");
			}
			
			
	}
	
	

}
