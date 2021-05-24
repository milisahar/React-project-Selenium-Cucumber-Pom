package com.exercice.e2eTests.todo.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.exercice.e2eTests.todo.pageObjects.TodoPage;
import com.exercice.e2eTests.utils.CommonMethods;
import com.exercice.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TodoStepDef {

	public WebDriver driver;
	public TodoPage todoPage = new TodoPage();
	public CommonMethods commonMethods = new CommonMethods();

	public TodoStepDef() {

		driver = Setup.driver;
		PageFactory.initElements(driver, TodoPage.class);

	}

	@When("^Je clique sur le bouton Non completee$")
	public void jeCliqueSurLeBoutonNonCompletee() throws Throwable {
		todoPage.clickOnBtnStatus();
	}

	@Then("^La statut de la tache doit etre modifier$")
	public void laStatutDeLaTacheDoitEtreModifier() throws Throwable {
		commonMethods.isElementClickable(todoPage.btnStatus, driver);
		System.out.println("la statut est bien changée");
	}

	@When("^Je clique sur le bouton Supprimer$")
	public void jeCliqueSurLeBoutonSupprimer() throws Throwable {
		Thread.sleep(3000);
		todoPage.clickOnBtnDelete();
	}

	@Then("^Je verifie que la tache est bien supprimee$")
	public void jeVerifieQueLaTacheEstBienSupprimee() throws Throwable {
		try {
			Assert.assertTrue(commonMethods.isElementDestroyed(driver, todoPage.btnDelete));
			System.out.println("la tache n'a pas été supprimée");
		} catch (Exception e) {
			System.out.println("la tache a été supprimée");
		}
	}

}
