package Intoduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumIntro {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\prakumar\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/locatorspractice");
		System.out.println(Driver.getTitle());

		System.out.println(Driver.getCurrentUrl());
		Driver.findElement(By.id("inputUsername")).sendKeys("prakumar");
		Driver.findElement(By.name("inputPassword")).sendKeys("Hello@123");
		//class Name locator
		Driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(Driver.findElement(By.cssSelector("p.error")).getText());
		//Link Text locator
		Thread.sleep(2000);
		Driver.findElement(By.linkText("Forgot your password?")).click();
		//cssSelector
		Driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("prashant");
		// xpathSelector
		Driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pra@gmail.com");
		Driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9387672822");
		Thread.sleep(2000);
		Driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(Driver.findElement(By.className("infoMsg")).getText());
		Driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(1000);
		Driver.findElement(By.id("inputUsername")).sendKeys("Prashant");
		Driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Driver.findElement(By.id("chkboxOne")).click();
		Driver.findElement(By.id("chkboxTwo")).click();
		Driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(Driver.findElement(By.tagName("p")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
