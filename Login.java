package SimpleJavaPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class practice {
		public static void main(String[] args)throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\nmadishetti\\\\OneDrive - DXC Production\\\\Desktop\\\\Coding_Java\\\\src\\\\SimpleJavaPrograms\\\\chromedriver-win64\\\\chromedriver.exe");
			WebDriver wb = new ChromeDriver();
			wb.manage().window().maximize();
			
			wb.get("https://www.ajio.com/?gad_source=1&gclid=Cj0KCQiA7aSsBhCiARIsALFvovy9k3WwxZupBml8YAfy-klJWx8atgnEn9g-6-ZawRIPN04vgdpE_HkaAnpBEALw_wcB");
			Thread.sleep(1000);
			
			WebElement we = wb.findElement(By.id("loginAjio"));
			we.click();
			Thread.sleep(1000);
			
			WebElement we1 = wb.findElement(By.className("social-txt"));
			we1.click();
			Thread.sleep(1000);
			
			Set<String> parent = wb.getWindowHandles();
			Iterator iter = parent.iterator();
			while(iter.hasNext())
			{
				String child = (String)iter.next();
				if(!parent.equals(child))
				{
					wb.switchTo().window(child);
				}
			}
			
			
			WebElement we2 = wb.findElement(By.name("email"));
			we2.sendKeys("ezioyt24@gmail.com");
			
			WebElement we3 = wb.findElement(By.name("pass"));
			we3.sendKeys("raghavraghav123");
			
			WebElement we4 = wb.findElement(By.name("login"));
			we4.click();
			wb.close();
		}

	}
