package com.exercice.e2eTests.todo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TodoPage {

	final static String BUTTON_STATUS_XPATH = "//div[@class='badge badge-danger']";
	final static String BUTTON_DELETE_XPATH = "//*[contains(text(),'Supprimer')]";

	/* @FindBy */
	@FindBy(how = How.XPATH, using = BUTTON_STATUS_XPATH)
	public static WebElement btnStatus;
	@FindBy(how = How.XPATH, using = BUTTON_DELETE_XPATH)
	public static WebElement btnDelete;

	public void clickOnBtnStatus() {
		btnStatus.click();
	}
	
	public void clickOnBtnDelete() {
		btnDelete.click();
	}
	
}
