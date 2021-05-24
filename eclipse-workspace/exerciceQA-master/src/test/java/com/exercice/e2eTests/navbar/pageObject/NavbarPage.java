package com.exercice.e2eTests.navbar.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NavbarPage {
	/* Locators */
	final static String TACHES_XPATH = "//a[contains(text(),'Tâches')]";
	final static String DECONNEXION_XPATH = "//a[contains(text(),'Déconnexion')]";
	
	/* @FindBy */
	@FindBy(how = How.XPATH, using = TACHES_XPATH)
	public static WebElement taches;
	@FindBy(how = How.XPATH, using = DECONNEXION_XPATH)
	public static WebElement deconnexion;
	
	

}
