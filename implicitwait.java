package exampractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"colorChange\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"visibleAfter\"]")).click();

	}

}
