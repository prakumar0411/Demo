package Intoduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actiondemo {

	public static void main(String[] args) {
//		System.setProperty("WebDriver.chrome.driver","C:\\Users\\prakumar\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://www.amazon.in/");
		Driver.manage().window().maximize();
		WebElement move= Driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a =new Actions(Driver);
		a.moveToElement(move).build().perform();
		
	}

}
