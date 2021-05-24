package com.exercice.e2eTests.navbar.stepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.exercice.e2eTests.navbar.pageObject.NavbarPage;
import com.exercice.e2eTests.utils.CommonMethods;
import com.exercice.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;

public class NavbarStepDef {
	public WebDriver driver;
	public NavbarPage navbarPage = new NavbarPage();
	public CommonMethods commonMethods= new CommonMethods();
	
	public NavbarStepDef() {
		driver=Setup.driver;
		PageFactory.initElements(driver, NavbarPage.class);
		
	}
	
	@Then("^les liens Tâches et Déconnexion sont bien affiches$")
    public void lesLiensTchesEtDconnexionSontBienAffiches() throws Throwable {
		boolean tache = commonMethods.isElementDisplayed(NavbarPage.taches);
		Assert.assertTrue(tache);
		boolean decnx = commonMethods.isElementDisplayed(NavbarPage.deconnexion);
		Assert.assertTrue(decnx);
    }
	
	@Then("^les liens Tâches et Déconnexion ne sont pas affiches$")
    public void lesLiensTchesEtDconnexionNeSontPasAffiches() throws Throwable {
		boolean tache = commonMethods.isElementDisplayed(NavbarPage.taches);
		Assert.assertFalse(tache);
		boolean decnx = commonMethods.isElementDisplayed(NavbarPage.deconnexion);
		Assert.assertFalse(decnx);
    }


}
