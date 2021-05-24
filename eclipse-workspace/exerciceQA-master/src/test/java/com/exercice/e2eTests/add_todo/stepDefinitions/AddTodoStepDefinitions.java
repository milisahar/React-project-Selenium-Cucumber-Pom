package com.exercice.e2eTests.add_todo.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.exercice.e2eTests.add_todo.pageObjects.AddTodoPage;
import com.exercice.e2eTests.utils.CommonMethods;
import com.exercice.e2eTests.utils.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTodoStepDefinitions extends CommonMethods {

	public WebDriver driver;
	public AddTodoPage addTodoPage = new AddTodoPage();
	public CommonMethods commonMethods = new CommonMethods();

	public AddTodoStepDefinitions() {

		driver = Setup.driver;
		PageFactory.initElements(driver, AddTodoPage.class);

	}

	@When("^Je saisie le nom de la tâche \"([^\"]*)\"$")
	public void jeSaisieLeNomDeLaTche(String tache) throws Throwable {
		addTodoPage.fillNameTask(tache);
		//System.out.println("size1"+todoPage.todo.getSize());

	}

	@And("^Je saisie la description de la tâche en une ligne \"([^\"]*)\"$")
	public void jeSaisieLaDescriptionDeLaTcheEnUneLigne(String description) throws Throwable {
		addTodoPage.fillDescription(description);
		 //System.out.println("html"+todoPage.btnAdd.getAttribute("outerHTML"));

	}


	@Then("^une tache doit etre ajouter dans la liste des taches$")
	public void uneTacheDoitEtreAjouterDansLaListeDesTaches() throws Throwable {
		//Thread.sleep(4000);
	    //System.out.println("size2"+todoPage.todo.getSize());
        //Assert.assertTrue(commonMethods.isElementPresent("//ul[@class='list-group']/li[last()]"));
		Assert.assertTrue(commonMethods.isElementPresent(addTodoPage.todo));
	}

	@Then("^verifier que le bouton ajouter n'est pas activé$")
	public void verifierQueLeBoutonAjouterNestPasActiv() throws Throwable {
		   Assert.assertFalse(addTodoPage.verifyButtonIsEnabled());
		  
	}

	@And("^Je clique sur le bouton Ajouter la tâche$")
	public void jeCliqueSurLeBoutonAjouterLaTche() throws Throwable {
		addTodoPage.clickOnBtnAdd();

	}

	@And("^Je ne saisie pas la description de la tâche en une ligne$")
	public void jeNeSaisiePasLaDescriptionDeLaTcheEnUneLigne() throws Throwable {

	}
	@When("^Je ne remplis aucun champ$")
	public void jeNeRemplisAucunChamp() throws Throwable {

	}

	@When("^Je ne saisie pas le nom de la tache$")
	public void jeNeSaisiePasLeNomDeLaTache() throws Throwable {

	}

}
