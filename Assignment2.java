package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("salesmanager");
        driver.findElement(By.id("password")).sendKeys("qwerty");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("yaswanth");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ykr");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("yaswanth");
        driver.findElement(By.name("departmentName")).sendKeys("CSE");
        driver.findElement(By.name("description")).sendKeys("My First Selenium Assignment");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ykr64@gmail.com");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.linkText("Duplicate Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).clear();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ACS");
        driver.findElement(By.id("createLeadForm_firstName")).clear();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("yaswanth");
        driver.findElement(By.name("submitButton")).click();
        String title1 = driver.getTitle();
        System.out.println(title1);

	}

}