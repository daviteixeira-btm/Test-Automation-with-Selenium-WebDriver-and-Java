package dev.davi.automation.practice.selenium.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	//Locators
	private By userLocator = By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input");
	private By passwordLocator = By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input");
	private By submitBtnLocator = By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button");
	private By notSaveLoginInfo = By.xpath("//*[@id=\"mount_0_0_Xj\"]/div/div/div[2]/div/div/div/div[1]/div[1]/div[2]/section/main/div/div/div/div/div");
	private By notActivateNotifications = By.xpath("//*[@id=\"mount_0_0_fw\"]/div/div/div[3]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/button[2]");
	private By tagMyAccountLocator = By.tagName("a");
	
	public void signin() {
		if(super.isDisplayed(userLocator)) {
			super.type("daviteixeira.dev", userLocator);
			super.type("alguma-coisa-kkk", passwordLocator);
			super.click(submitBtnLocator);
			super.click(notSaveLoginInfo);
			super.click(notActivateNotifications);
		} else {
			System.out.println("user textbox was not present");
		}
	}
	
	public String getMyAccountMessage() {
		return super.getText(tagMyAccountLocator);
	}
}
