package com.exercice.e2eTests.authentification.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.exercice.e2eTests.authentification.pageObjects.AuthentificationPage;
import com.exercice.e2eTests.utils.CommonMethods;
import com.exercice.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition extends CommonMethods {
	
	public WebDriver driver;
	public AuthentificationPage authentificationPage = new AuthentificationPage();
	public CommonMethods commonMethods= new CommonMethods();
	
	public AuthentificationStepDefinition() {
		driver=Setup.driver;
		PageFactory.initElements(driver, AuthentificationPage.class);
		
	}
	
	@Given("^j'ouvre l'application todolist$")
	public void jOuvreLApplicationTodolist() throws Throwable {
		commonMethods.openApplication();  
	}

	@When("^Je saisie le mail \"([^\"]*)\"$")
	public void jeSaisieLeMail(String name) throws Throwable {
		authentificationPage.fillEmail(name);
	
	}

	@When("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String psw) throws Throwable {
		authentificationPage.fillPassword(psw);
	  
	  
	}

	@When("^Je clique sur le bouton Envoyer$")
	public void jeCliqueSurLeBoutonEnvoyer() throws Throwable {
		authentificationPage.clickOnBtnSubmit();
	   
	}
	
	 @Then("^Redirection vers la page tasks \"([^\"]*)\"$")
	 public void redirectionVersLaPageTasks(String url) throws Throwable {
		 Assert.assertTrue(driver.getCurrentUrl().contains(url));
	 }

	@When("^Je ne saisie pas le mail$")
	public void jeNeSaisiePasLeMail() throws Throwable {
	   
	}

	@When("^Je ne saisie pas le mot de passe$")
	public void jeNeSaisiePasLeMotDePasse() throws Throwable {
	   
	}

	@Then("^verifier que le bouton Envoyer n'est pas activé$")
	public void verifierQueLeBoutonEnvoyerNEstPasActivé() throws Throwable {
	   Assert.assertFalse(authentificationPage.verifyButtonIsEnabled());
	}

}
