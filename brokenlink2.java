package exampractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class brokenlink2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			
			System.out.println(link.getText()+" "+link.getAttribute("href"));
			
		}
		System.out.println("total no. of links: " + links.size());
	}

}
