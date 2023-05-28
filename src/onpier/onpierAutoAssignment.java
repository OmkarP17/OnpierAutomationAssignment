package onpier;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class onpierAutoAssignment {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//RemoteWebDriver driver;
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		System.setProperty("webdriver.chrome.driver", "/Newworkspace/AutoAssignment/drivers/chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.get("https://thg-greenair.dev.wgv.onpier.de/onboarding");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[contains(text(),'Sichern')]")).getText();
		
		
		js.executeScript("window.scrollBy(0,100)", "");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Klasse M1')]")).click();
		
		js.executeScript("window.scrollBy(0,100)", "");
		driver.findElement(By.xpath("//mat-card[1]/mat-card-content/div[2]/div/button/span[2]")).click();
		Thread.sleep(5000);
				
		driver.findElement(By.xpath("//p[contains(text(),'Fahrzeugschein Vorderseite')]")).getText();
		
		
		//driver.findElement(By.xpath("//*[text()='Fahrzeugschein Rückseite hochladen']//ancestor::div/img")).click();
		
		WebElement uploadFile = driver.findElement(By.xpath("//*[@id='Fahrzeugschein Vorderseite']"));
		uploadFile.sendKeys("D:\\Newworkspace\\AutoAssignment\\myfiles\\CV - Omkar Pathak .pdf");
		
		js.executeScript("window.scrollBy(0,100)", "");
		WebElement uploadFile2 = driver.findElement(By.xpath("//*[@id='Fahrzeugschein Rückseite']"));
		uploadFile2.sendKeys("D:\\Newworkspace\\AutoAssignment\\myfiles\\CV - Omkar Pathak .pdf");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)", "");
		driver.findElement(By.xpath("//*[@id='cdk-step-content-0-0']/app-step1/app-stepper-buttons/div/div[2]/button[2]/span[2]/div")).click();
		Thread.sleep(5000);
		
		//---Page 2
		WebElement page2 = driver.findElement(By.xpath("//h2[contains(text(),'Persönliche Daten eingeben')]"));
		System.out.println(page2.getText());
		
		
		//Select objSelect = new Select(Anrede);
		driver.findElement(By.id("mat-select-value-1")).click();
		driver.findElement(By.xpath("//*[@id='mat-option-0']/span")).click();
		
		
		//Select objSelect = new Select(driver.findElement(By.id("mat-select-value-1")));
		//objSelect.selectByVisibleText("Herr");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Vorname')]//following::div[1]"));
		
		driver.quit();
	}

}
