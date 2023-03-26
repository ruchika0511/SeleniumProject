package day01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program01 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver= new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();

	}

}
