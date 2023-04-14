package Intoduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleTest {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("WebDriver.chrome.driver","C:\\Users\\prakumar\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
			WebDriver Driver =new ChromeDriver();
			Driver.get("https://ekwm-dev1.login.us6.oraclecloud.com/");
			Driver.manage().window().maximize();
			//LoginPage
			Driver.findElement(By.id("userid")).sendKeys("mjaime");
			Driver.findElement(By.name("password")).sendKeys("Welcome123");
			Thread.sleep(1000);
			Driver.findElement(By.id("btnActive")).click();
			Thread.sleep(1000);
			Driver.findElement(By.className("svg-outline")).click();
			Thread.sleep(2000);
			//Payments
			Driver.findElement(By.xpath("//a[@id='pt1:_UISnvr:0:nvcl1']")).click();
			Thread.sleep(2000);
			Driver.findElement(By.id("pt1:_UISnvr:0:nv_itemNode_payables_payables_payments::icon")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//img[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTsdi__PaymentLanding_itemNode__FndTasksList::icon']")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//a[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl4']")).click();
			Thread.sleep(2000);
			//CreatePayments
			Driver.findElement(By.xpath("//a[@title='Search: Business Unit']")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//span[text()='IT Convergence USA']")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//a[@title='Search: Disbursement Bank Account']")).click();
			Thread.sleep(3000);
			Driver.findElement(By.xpath("//span[text()='Action Capital # ZAITC-90']")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//a[@title='Search: Supplier or Party']")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:payeeNameId::_afrLovInternalQueryId:value00::content']")).sendKeys("ABDS CONSULTORIA EM INFORMATICA LTDA");
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//button[text()='Search']")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//span[text()='ABDS CONSULTORIA EM INFORMATICA LTDA']")).click();
			Driver.findElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:payeeNameId::lovDialogId::ok']")).click();
			Thread.sleep(2000);
			Driver.findElement(By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:AP1:paymentMethodNameUiId::cntnrSpan")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//span[text()='Wire']")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//a[@title='Search: Payment Process Profile']")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//span[text()='ISO20022 CGI PAIN.001.001.03']")).click();
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
