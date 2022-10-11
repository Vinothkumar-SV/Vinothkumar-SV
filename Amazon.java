package wek3day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://amazon.in");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
//print all the brand of phone
List<WebElement> brandlst = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
for (int i = 0; i <brandlst.size() ; i++) {
    System.out.println(brandlst.get(i).getText());
}
}
	]
			