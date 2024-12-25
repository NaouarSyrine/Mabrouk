package Pages;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Helper.Config;

public class ChemisesetBlouses {
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[4]/div/div[4]/div/ul/li/div/div[2]/h3/a")
	List<WebElement> productlist;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div/div[4]/div/ul/li[2]/div/div[2]/h3/a")
	WebElement verifproduct;
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div[3]/span[1]")
	WebElement btncolor;
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[3]/div[3]/span[2]")
	WebElement btntaille;
	
	@FindBy(xpath="//html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[2]/div[2]")
	WebElement btnpanier;
	
	@FindBy(xpath="/html/body/div[5]/header/div/div[1]/ul[2]/li[3]/div[1]/div[2]/ul/li/div/a")
	WebElement verifpanier;
	
	public   ChemisesetBlouses() {
		PageFactory.initElements(Config.driver, this);
		
	}

	public void clickonproductbyname (String productname) {
		try {
			for(WebElement product:productlist) {
				if(product.getText().contains(productname)) {
					
					product.click();
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}		
			}
				
				public void verifproduct (String productname) {
					Config.attente(10);
					 String actualText=verifproduct.getText().toLowerCase();
			    	  
			    	  Assert.assertTrue(actualText.contains(productname));
			    	  
					
				}
			
		
			public void verifpanier (String panier) {
				
				btncolor.click();
				btntaille.click();
				btnpanier.click();
				Assert.assertEquals(verifpanier.getText(), panier);
				
				}
			}
				
			
			
		
			
		


	


