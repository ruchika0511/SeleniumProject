package day02;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Program02 {

	public static void main(String[] args) {
	WebDriver driver;
	driver = new EdgeDriver();
	 driver.get("https://demo.automationtesting.in/Register.html");
     driver.navigate().to("https://demo.automationtesting.in/Register.html");
     driver.manage().window().maximize();
     driver.manage().window().minimize();
     driver.manage().window().fullscreen();
     driver.navigate().refresh();
     driver.navigate().back();
     driver.navigate().forward();
     driver.close();
     driver.quit();
     driver.navigate().to("");
    
     
     
	}

}
