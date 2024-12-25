package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.ChemisesetBlouses;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlousesetChemisesStepDef {


	@Given("utilsateur est sur la page {string}")
	public void utilsateur_est_sur_la_page(String submenutitle) {
	    
		Config.driver= new ChromeDriver();
		Config.maximizewindow();
		String url="https://mabrouk.tn/categorie-produit/vetements-femmes/chemises-blouses/";
		Config.driver.get(url);
	}

	@When("utilisateur clique sur un produit {string}")
	public void utilisateur_clique_sur_un_produit(String productname) throws Exception {
		ChemisesetBlouses x =new ChemisesetBlouses();
	    x.clickonproductbyname(productname);
	}

	@Then("la page de produit est affiche {string}")
	public void la_page_de_produit_est_affiche(String productname) {
		ChemisesetBlouses x =new ChemisesetBlouses();
		x.verifproduct(productname);
	    
	}

	@Then("le produit {string} ajouté au panier")
	public void le_produit_ajouté_au_panier(String productname) {
		ChemisesetBlouses x =new ChemisesetBlouses();
		x.verifpanier(productname);
	}

}
