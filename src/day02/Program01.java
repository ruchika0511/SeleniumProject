package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program01 {

	public static void main(String[] args) {
		WebDriver driver;
		driver= new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Select dropdownSkill = new Select(driver.findElement(By.xpath("//select[@id='Skill']")));
        dropdownSkill.selectByIndex(4);
        Select dropdownYear = new Select(driver.findElement(By.xpath("//select[@placeholder='Year']")));
        dropdownYear.selectByValue("1919");
        Select dropdownMonth = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
        dropdownMonth.selectByVisibleText("May");
        
	}

	
	}


