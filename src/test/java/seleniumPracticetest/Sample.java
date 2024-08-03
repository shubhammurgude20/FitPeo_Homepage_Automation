package seleniumPracticetest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fitpeo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(text(),'Revenue Calculator')]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		 WebElement slider = driver.findElement(By.xpath("//input[@type='range']")); // Example for an input type range
         Actions actions = new Actions(driver);

         int sliderWidth = slider.getSize().width;
         actions.clickAndHold(slider)
                 .moveByOffset(94 , 0) // Adjust the offset as needed
                 .release()
                 .perform();
	Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,100)", "");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/label/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/label/span[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/label")).click();
		js.executeScript("window.scrollBy(0,100)", "");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[8]/label/span[1]")).click();

		// Find the input element and set its value to 820
		// driver.findElement(By.xpath("//input[@id=':r0:']")).click();
		// driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys("820");

		// driver.findElement(By.id(":r0:")).click();
		// driver.findElement(By.id(":r0:")).sendKeys("100");
		// driver.findElement(By.xpath("input[@value='820']")).click();

//		driver.findElement(By.id("pass")).sendKeys("Shu@123");
//		driver.findElement(By.id("u_0_5_Ul")).click();
	}
}
