package exampractice;

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

	}

}
