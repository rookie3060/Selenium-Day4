package test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","c://Drivers//chromedriver.exe" );
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		driver.findElement(By.linkText("Clothing (5)")).click();
		Thread.sleep(5000);
		List<WebElement> l1 = driver.findElements(By.xpath("//h2[@class='product-title']"));
		for(WebElement link : l1)
		{
			System.out.println(link.getText());
		}
	}
}