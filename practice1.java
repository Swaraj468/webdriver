package exampractice;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://practice.expandtesting.com/login");
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("practice");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).submit();
		driver.findElement(By.xpath("/html/body/main/div[3]/div/a/i")).click();
		System.out.println("Site has been succesfully Tested");

	}

}
