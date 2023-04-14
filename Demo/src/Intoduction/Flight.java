package Intoduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flight {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.chrome.driver","C:\\Users\\prakumar\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://www.spicejet.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.findElement(By.xpath("//input[@value='Delhi (DEL)']")).click();
		Driver.findElement(By.xpath("//div[contains(text(),'Vishakhapatnam')]")).click();
		Driver.findElement(By.xpath(" //div[@data-testid='to-testID-destination'] //div[text()='BOM']")).click();
		Driver.findElement(By.xpath("//div[@data-testid='undefined-month-April-2023'] //div[@data-testid='undefined-calendar-day-13']")).click();
		Driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		for(int i=1;i<5;i++)
		{
		Driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		Driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		
		Driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
		Driver.findElement(By.xpath("//div[contains(text(),'Currency')]")).click();
		Driver.findElement(By.xpath("//div[contains(text(),'USD')]")).click();
		Driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Driver.findElement(By.xpath("//*[name()='rect' and contains(@width,'100%')]")).click();
	
		
		}

}
