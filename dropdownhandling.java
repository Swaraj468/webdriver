package exampractice;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[1]/input")).sendKeys("Kunwar");
		driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[2]/input")).sendKeys("Aditya");
		driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[2]/div/label[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[3]/div/label[2]/input")).click();
		
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[4]/select")));
		dropdown.selectByIndex(1);
		Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[1]/select")));
		dropdown1.selectByIndex(1);
		Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[2]/select")));
		dropdown2.selectByIndex(1);
		Select dropdown3 = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[3]/select")));
	    dropdown3.selectByIndex(1);
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[6]/input")).sendKeys("8235107591");
	    driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[7]/input")).sendKeys("swaraj09");
	    driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[8]/input")).sendKeys("swarajbandhi0000@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[10]/textarea")).sendKeys("Hello My name is swaraj");
	    driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[11]/input")).sendKeys("swaraj1234");
	    driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[12]/input")).sendKeys("swaraj1234");
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[13]/input")).submit();
		

	}

}
