package com.exercice.e2eTests.authentification.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.exercice.e2eTests.authentification.pageObjects.AuthentificationMessagePage;
import com.exercice.e2eTests.utils.CommonMethods;
import com.exercice.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationMessageStepDefinition {
	public WebDriver driver;
	public AuthentificationMessagePage authentificationMessagePage = new AuthentificationMessagePage();
	public CommonMethods commonMethods= new CommonMethods();
	
	public AuthentificationMessageStepDefinition() {
		driver=Setup.driver;
		PageFactory.initElements(driver, AuthentificationMessagePage.class);
		
	}
	
	@Given("^j'ouvre l'application todo$")
	public void jOuvreLApplicationTodo() throws Throwable {
		commonMethods.openApplication();  
	}

	@When("^Je saisie l'addresse email \"([^\"]*)\"$")
	public void jeSaisieLaddresseEmail(String name) throws Throwable {
		authentificationMessagePage.fillEmail(name);
	
	}

	@When("^Je saisie le mtp \"([^\"]*)\"$")
	public void jeSaisieLeMtp(String psw) throws Throwable {
		authentificationMessagePage.fillPassword(psw);
	  
	  
	}

	@When("^Je clique sur Envoyer$")
	public void jeCliqueSurEnvoyer() throws Throwable {
		authentificationMessagePage.clickOnBtnSubmit();
	   
	}
	 @Then("^Je verifie la presence de message d'erreur$")
	    public void jeVerifieLaPresenceDeMessageDerreur() throws Throwable {
		 Assert.assertTrue(commonMethods.isElementPresent(authentificationMessagePage.alert));
		 System.out.println("un message rouge apparait pour les alerter");
	       
	    }

	
}
