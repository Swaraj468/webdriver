package exampractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class practiec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.stealmylogin.com/demo.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("swarajbandhi0000@gmail.com");
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("swaraj1234");
		driver.findElement(By.xpath("/html/body/form/input[3]")).submit();
//		String title = driver.getTitle();
//		System.out.println("The title of the link is:" + title);
//		String url = driver.getCurrentUrl();
//		System.out.println("The link is:" + url);
//		
	    String text1 = driver.switchTo().alert().getText();
		System.out.println("The alert message is:" + text1);
		driver.switchTo().alert().accept();
//		System.out.println("The link is " + driver.getCurrentUrl());
//	    System.out.println("The link is working and script has passed");

	}

}
