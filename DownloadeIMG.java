package SimpleJavaPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class mid1 {

		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadishetti\\OneDrive - DXC Production\\Desktop\\Coding_Java\\src\\SimpleJavaPrograms\\chromedriver-win64\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			WebDriver wb = new ChromeDriver();
			wb.manage().window().maximize();
			wb.get("https://www.google.com/");
			
			WebElement we = wb.findElement(By.name("q"));
			we.sendKeys("cmrit hyderabad");
			we.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
			WebElement we1 = wb.findElement(By.xpath("//a[normalize-space() = 'Images']"));
			we1.click();
			Thread.sleep(1000);
			
			WebElement we2 = wb.findElement(By.xpath("//img[@alt = 'CMR Institute of Technology | Top Engineering College in Hyderabad']"));
			Thread.sleep(1000);
			
			Actions action = new Actions(wb); 
			action.contextClick(we2).build().perform();
			Thread.sleep(1000);
			
			Robot robot = new Robot();
			for (int i=0; i<7; i++)
			{
				robot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
			}
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			robot.keyPress(KeyEvent.VK_ENTER);

			wb.close();
		}
	}
