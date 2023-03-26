package day02;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

    public class Program03 {
    static WebDriver driver;
	public static void main(String[] args) throws IOException {
	
    driver = new EdgeDriver();
	
    driver.get("https://demo.automationtesting.in/Register.html");
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Test");
	screenShot("firstName");
	File srcFn = driver.findElement(By.xpath("//input[@placeholder='First Name']")).getScreenshotAs(OutputType.FILE);
	File desFn = new File("./Screenshot/+firstNameElement.png");
	FileUtils.copyFile(srcFn, desFn);
	
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Java");
	screenShot("lastName");
	driver.findElement(By.xpath("//input[@value='Male']")).click();
	screenShot("gender");
		
	
	
	
	
	
	}
	public static void screenShot(String fileName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./Screenshot/"+fileName+".png");
		FileUtils.copyFile(src, des);
	}

}
