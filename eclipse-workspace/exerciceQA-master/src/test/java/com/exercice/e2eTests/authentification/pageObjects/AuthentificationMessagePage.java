package com.exercice.e2eTests.authentification.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationMessagePage {
	/* Locators */
	final static String EMAIL_XPATH = "//input[@type='email']";
	final static String PASSWORD_XPATH = "//input[@type='password']";
	final static String BUTTON_SUBMIT_XPATH = "//input[@type='submit']";
	final static String ALERT_MESSAGE_XPATH = "//div[@class='alert alert-danger']";
	
	/* @FindBy */
	@FindBy(how = How.XPATH, using = EMAIL_XPATH)
	public static WebElement email;
	@FindBy(how = How.XPATH, using = PASSWORD_XPATH)
	public static WebElement password;
	@FindBy(how = How.XPATH, using = BUTTON_SUBMIT_XPATH)
	public static WebElement btnSubmit;
	@FindBy(how = How.XPATH, using = ALERT_MESSAGE_XPATH)
	public static  List<WebElement> alert;
	
	/* Methods */
	public void fillEmail(String name) {
		email.sendKeys(name);
	}

	public void fillPassword(String psw) {
		password.sendKeys(psw);
	}

	public void clickOnBtnSubmit() {
		btnSubmit.click();
	}
	

	

		
}
