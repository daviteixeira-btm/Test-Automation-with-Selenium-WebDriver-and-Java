package dev.davi.automation.practice.selenium.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	//Locators
	private By userLocator = By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input");
	private By passwordLocator = By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input");
	private By submitBtnLocator = By.xpath("//*[@id=\"loginForm\"]/div/div[3]");
	private By tagMyAccountLocator = By.tagName("a");
	
	public void signin() {
		if(super.isDisplayed(userLocator)) {
			super.type("daviteixeira.dev", userLocator);
			super.type("alguma-coisa-kkk", passwordLocator);
			super.click(submitBtnLocator);
		} else {
			System.out.println("user textbox was not present");
		}
	}
	
	public String getMyAccountMessage() {
		return super.getText(tagMyAccountLocator);
	}
}
