package exampractice;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		 try {
		driver.get("https://testpages.eviltester.com/styled/reference/input.html");
		driver.findElement(By.xpath("//*[@id=\"button-input\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox-input\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox-input\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio-input-2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text-input\"]")).sendKeys("Swaraj");
		driver.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id=\"password-input\"]")).sendKeys("swaraj1234");
		driver.findElement(By.xpath("//*[@id=\"email-input\"]")).sendKeys("swarajbandhi0000@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"url-input\"]")).sendKeys("https://testpages.eviltester.com/styled/reference/input.html");
		driver.findElement(By.xpath("//*[@id=\"tel-input\"]")).sendKeys("+918235107591");
		driver.findElement(By.xpath("//*[@id=\"number-input\"]")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\"color-input\"]")).sendKeys("#ff0000");
		driver.findElement(By.xpath("/html/body/div/form/div[4]/input[2]")).sendKeys("29-05-2002");
		driver.findElement(By.xpath("//*[@id=\"datetime-local-input\"]")).sendKeys("2024-11-26T04:04");
		driver.findElement(By.xpath("//html/body/div/form/div[4]/input[5]")).sendKeys("July, 2002");
		driver.findElement(By.xpath("//*[@id=\"time-input\"]")).sendKeys("02:38");
		driver.findElement(By.xpath("//*[@id=\"submit-input\"]")).submit();
		System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Title: " + driver.getTitle());
		 }catch  (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }

	}

	}
