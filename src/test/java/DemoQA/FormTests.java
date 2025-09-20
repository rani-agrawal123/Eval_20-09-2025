package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTests {

	WebDriver driver = new ChromeDriver();
	
	@BeforeMethod
	void navigation(){
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
	}
	@Test
	void title() {
		driver.findElement(By.partialLinkText("demoqa.com"));
	}
	
	
	@Test
	void form() {
//		driver.findElement(By.xpath("//h5[text()='Forms']")).click();
		driver.get("https://demoqa.com/forms");
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Rani");
		driver.findElement(By.id("lastName")).sendKeys("Agrawal");
		driver.findElement(By.id("userEmail")).sendKeys("john123@gmail.com");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("8569875784");
		driver.findElement(By.xpath("//input[@value=\"20 Sep 2025\"]")).click();
		driver.findElement(By.id("subjectsContainer")).sendKeys("Maths");
		driver.findElement(By.xpath("//label[text()='Music']")).click();
		driver.findElement(By.id("uploadPicture")).click();
		driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]")).sendKeys("Bhopal");
		driver.findElement(By.xpath("//div[text()='Select State']")).click();
		driver.findElement(By.id("city")).click();
		driver.findElement(By.id("submit")).click();
		
	}
	
	@Test
	void register() {
//		driver.findElement(By.xpath("//img[@alt=\"Selenium Online Training\"]")).click();
		driver.get("https://www.toolsqa.com/selenium-training/");
	}
	
	@AfterMethod
	void end() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
