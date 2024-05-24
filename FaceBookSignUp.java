package SimpleJavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignUp {

		public static void main(String[] args)throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "path");
			WebDriver wb = new ChromeDriver();
			wb.manage().window().maximize();
			wb.get("https://www.facebook.com/");
			Thread.sleep(1000);
			WebElement we = wb.findElement(By.xpath("//a[text() = \"Create new account\"]"));
			we.click();
			Thread.sleep(1000);
//			firstname
			WebElement we1 = wb.findElement(By.name("firstname"));
			we1.sendKeys("G");
			Thread.sleep(1000);
			
			WebElement we2 = wb.findElement(By.name("lastname"));
			we2.sendKeys("Raghav");
			Thread.sleep(1000);
			
			WebElement we4 = wb.findElement(By.name("reg_email__"));
			we4.sendKeys("ezioyt24@gmail.com");
//			Thread.sleep(2000);
//			reg_email_confirmation__
			
			WebElement we6 = wb.findElement(By.name("reg_email_confirmation__"));
			we6.sendKeys("ezioyt24@gmail.com");
			Thread.sleep(1000);
			
			WebElement we5 = wb.findElement(By.name("reg_passwd__"));
			we5.sendKeys("Raghavraghav123");
			Thread.sleep(1000);
			
			Select s = new Select(wb.findElement(By.name("birthday_day")));
			s.selectByVisibleText("24");
			
			Select s1 = new Select(wb.findElement(By.name("birthday_month")));
			s1.selectByVisibleText("Aug");
			
			Select s2 = new Select(wb.findElement(By.name("birthday_year")));
			s2.selectByVisibleText("2002");
			
			WebElement wb7 = wb.findElement(By.xpath("//label[text() = \"Male\"]"));
			wb7.click();
			Thread.sleep(1000);
			
			WebElement wb8 = wb.findElement(By.name("websubmit"));
			wb8.click();
			wb.close();
		}

	}
