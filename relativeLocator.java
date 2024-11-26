package exampractice;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class relativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.findElement(RelativeLocator.with(RelativeBy.name("name")).above(By.name("phone"))).sendKeys("Swaraj");
		driver.findElement(RelativeLocator.with(RelativeBy.name("phone")).below(By.name("name"))).sendKeys("8235107591");
		driver.findElement(RelativeLocator.with(RelativeBy.name("email")).above(By.name("country"))).sendKeys("swaraj000@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select/option[6]")).click();
		driver.findElement(RelativeLocator.with(RelativeBy.name("city")).below(By.name("country"))).sendKeys("Delhi");
		driver.findElement(RelativeLocator.with(RelativeBy.name("username")).below(By.name("city"))).sendKeys("swaraj09");
		driver.findElement(RelativeLocator.with(RelativeBy.name("password")).below(By.name("username"))).sendKeys("swaraj1234");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[1]/div[2]/input")).submit();
		
//		driver.findElement(RelativeLocator.with(RelativeBy.linkText("Signin")).toRightOf(By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input"))).click();
		

	}

}
