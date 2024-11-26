package exampractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
//		driver.get("https://accounts.google.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("swarajgupta988@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"password\\\"]/div[1]/div/div[1]/input"))).sendKeys("swaraj823");
		driver.get("https://demoqa.com/dynamic-properties");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"enableAfter\"]"))).click();
	driver.findElement(By.xpath("//*[@id=\"colorChange\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"visibleAfter\"]")).click();

	}

}
