package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	
	@Given("utilisateur est sur la page dacceuil")
	public void utilisateur_est_sur_la_page_dacceuil() {
		Config.driver=new ChromeDriver();
		Config.maximizewindow();
		String url="https://mabrouk.tn/";
		Config.driver.get(url);
	    
	}

	@When("utilisateur survole la souris sur le menu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu(String menu) throws Exception {
		HomePage page = new HomePage () ;
		page.mousehoveronmenu(menu);
	    
	}


@When("utilisateur clique sur le submenu {string}")
public void utilisateur_clique_sur_le_submenu(String submenu) {
	
	HomePage page = new HomePage () ;
	page.clickonsubmenu(submenu);
		
	   
	}

	@Then("utilisateur est derige vers la page produit {string}")
	public void utilisateur_est_derige_vers_la_page_produit(String verifpage) {
		HomePage page= new HomePage ();
		page.verifsubmenu(verifpage);
	}
}
