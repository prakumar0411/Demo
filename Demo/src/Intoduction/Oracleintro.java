package Intoduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oracleintro {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\prakumar\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://ekwm-dev1.login.us6.oraclecloud.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.findElement(By.id("userid")).sendKeys("mjaime");
		Driver.findElement(By.name("password")).sendKeys("Welcome123");
		Driver.findElement(By.id("btnActive")).click();
		Driver.findElement(By.xpath("//a[@title='Navigator']")).click();
		Driver.findElement(By.xpath("//a[.='Show More']")).click();
		Driver.findElement(By.xpath("//a[@title='Payments']")).click();
		Driver.findElement(By.xpath("//img[@title='Tasks']")).click();
		Driver.findElement(By.xpath("//a[.='Create Payment']")).click();
		Driver.findElement(By.xpath("//a[@title='Search: Business Unit']")).click();
		Driver.findElement(By.xpath("//span[.='IT Convergence USA']")).click();
		Driver.findElement(By.xpath("//a[@title='Search: Supplier or Party']")).click();
		Driver.findElement(By.xpath("//input[@aria-label=' Party Name']")).sendKeys("ABDS CONSULTORIA EM INFORMATICA LTDA");
		Driver.findElement(By.xpath("//button[.='Search']")).click();
		Driver.findElement(By.xpath("//span[text()='ABDS CONSULTORIA EM INFORMATICA LTDA']")).click();
		Driver.findElement(By.xpath("//button[@_afrpdo='ok']")).click();
		Driver.findElement(By.xpath("//a[@title='Search: Disbursement Bank Account']")).click();
		Driver.findElement(By.xpath("//span[.='Action Capital # ZAITC-90']")).click();
		Driver.findElement(By.xpath("//a[@title='Search: Payment Method']")).click();
		Driver.findElement(By.xpath("//textarea[@aria-live='off']")).sendKeys("All supply is given");
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//a[@title='Search: Payment Process Profile']")).click();
		Driver.findElement(By.xpath("//span[text()='ISO20022 CGI PAIN.001.001.03']")).click();
		
	}

	
	}

//File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(src,new File("C:\\Users\\prverma\\ScreenShot\\screenshot.png"));
