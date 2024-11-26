package exampractice;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class linktextandpartiallink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("google");
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
		driver.findElement(By.linkText("quantum computing")).click();
		driver.findElement(By.partialLinkText("quantum")).click();
		driver.manage().window().maximize();
	}

}
