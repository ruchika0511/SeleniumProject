package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program05 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Good Day Tester..!");
		driver.switchTo().alert().accept();//ok
		//driver.switchTo().alert().dismiss();//cancel
		
		

	}

}
