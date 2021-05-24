package com.exercice.e2eTests.add_todo.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddTodoPage {

	final static String NAME_TASK_XPATH = "//label[text()='Nom de la tâche']//following::input";
	final static String DESCRIPTION_XPATH = "//label[text()='Description de la tâche en une ligne']//following::input";
	final static String BUTTON_ADD_XPATH = "//button[text()='Ajouter la tâche']";
	//final static String TODO_XPATH = "//ul[@class='list-group']";
	final static String TODO_XPATH = "//ul[@class='list-group']/li[last()]";

	/* @FindBy */
	@FindBy(how = How.XPATH, using = NAME_TASK_XPATH)
	public static WebElement nameTask;
	@FindBy(how = How.XPATH, using = DESCRIPTION_XPATH)
	public static WebElement description;
	@FindBy(how = How.XPATH, using = BUTTON_ADD_XPATH)
	public static WebElement btnAdd;

	@FindBy(how = How.XPATH, using = TODO_XPATH)
	public static List<WebElement> todo;

	public void fillNameTask(String name) {
		nameTask.sendKeys(name);
	}

	public void fillDescription(String descrip) {
		description.sendKeys(descrip);
	}

	public void clickOnBtnAdd() {
		btnAdd.click();
	}
	
	public boolean verifyButtonIsEnabled() {
		 return	btnAdd.isEnabled();
		 }
	
	

}
