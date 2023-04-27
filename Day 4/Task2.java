package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task2 {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","c://Drivers//chromedriver.exe" );
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement fname=driver.findElement(By.id("input-firstname"));
        fname.sendKeys("Beno");
        WebElement lname=driver.findElement(By.id("input-lastname"));
        lname.sendKeys("Solomon");
        WebElement email=driver.findElement(By.id("input-email"));
        email.sendKeys("beno@gmail.com");
        WebElement passkey=driver.findElement(By.id("input-password"));
        passkey.sendKeys("beno123");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,850)", "");
        WebElement subscribe =driver.findElement(By.id("input-newsletter-yes"));
        subscribe.click();
	}

}
