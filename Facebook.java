package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	private static final String Duration = null;

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://en-gb.facebook.com/");
		chrome.manage().window().maximize();
		chrome.manage().deleteAllCookies();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        chrome.findElement(By.xpath("//a[text()='Create New Account']")).click();
		chrome.findElement(By.xpath("//input[@name='firstname']")).sendKeys("yasanth");
		chrome.findElement(By.xpath("//input[@name='lastname']")).sendKeys("reddy");
		chrome.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9000261059");
		chrome.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ykr64@gmail.com");
		WebElement day = chrome.findElement(By.id("day"));
		Select select=new Select(day);
		select.selectByValue("10");
		WebElement month =chrome.findElement(By.xpath("//select[@id='month']"));
		Select selectMonth=new Select(month);
		selectMonth.selectByValue("5");
		WebElement year =chrome.findElement(By.xpath("//select[@id='year']"));
		Select selectYear=new Select(year);
		selectYear.selectByValue("1990");
		chrome.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
