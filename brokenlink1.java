package exampractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class brokenlink1 {

public static void main(String[] args) {
// TODO Auto-generated method stub
EdgeDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.wikipedia.org/");
/* List<WebElement> links = driver.findElements(By.tagName("a"));

System.out.println("Total no. of links: " + links.size());

for(WebElement link: links) {
System.out.println("------------------------------");
System.out.println(link.getText()+ " " + link.getAttribute("href"));
} */

List<WebElement> language =driver.findElements(By.tagName("option"));
System.out.println("total no. of languages: " + language.size());

for(int i=0; i<language.size(); i++) {
System.out.println(language.get(i).getText()+ " " + language.get(i).getAttribute("lang"));
}
}

}