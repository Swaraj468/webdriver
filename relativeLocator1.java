package exampractice;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;



public class relativeLocator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://practice.expandtesting.com/inputs");
	    driver.findElement(RelativeLocator.with(RelativeBy.name("input-number")).above(By.name("input-text"))).sendKeys("10");
	    driver.findElement(RelativeLocator.with(RelativeBy.name("input-text")).above(By.name("input-password"))).sendKeys("Hello");
	    driver.findElement(RelativeLocator.with(RelativeBy.name("input-password")).above(By.name("input-date"))).sendKeys("swaraj1234");
	    driver.findElement(RelativeLocator.with(RelativeBy.name("input-date")).below(By.name("input-password"))).sendKeys("29-05-2002");
	   driver.findElement(By.xpath("//*[@id=\"btn-display-inputs\"]")).click();
	   

	}

}
