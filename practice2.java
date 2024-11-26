package exampractice;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://practice.expandtesting.com/inputs");
		driver.findElement(By.xpath("//*[@id=\"input-number\"]")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\"input-text\"]")).sendKeys("Swaraj");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id=\"input-date\"]")).sendKeys("29-05-2002");
		driver.findElement(By.xpath("//*[@id=\"btn-display-inputs\"]")).click();
		
		

	}

}
