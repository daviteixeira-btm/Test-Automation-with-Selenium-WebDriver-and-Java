package dev.davi.automation.practice.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	
	private WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	}

	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	void test() {
		
		WebElement userElement = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		userElement.sendKeys("daviteixeira.dev");
		
		WebElement passwordElement = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		passwordElement.sendKeys("alguma-coisa-kkk");
		
		WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
		submitBtnElement.click();
		
		WebElement tagMyAccount = driver.findElement(By.tagName("a"));
		String textTagA = tagMyAccount.getText();
		
		Assertions.assertTrue(textTagA.equals("daviteixeira.dev"));
	}

}
