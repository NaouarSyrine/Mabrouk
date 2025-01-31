package Pages;



import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {

	@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li/a/span")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li[3]/div/ul/li/a/span")
	List<WebElement> submenus;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/h1")
	WebElement verifpage;
	
	public HomePage () {
		
		PageFactory.initElements(Config.driver, this)
		;
	}
	
	public void mousehoveronmenu (String menutitle) throws Exception {
		try {
			
		for (WebElement menu:menus) {
			if(menu.getText().contains(menutitle))
			{
				Config.actions=new Actions(Config.driver);
			
			Config.actions.moveToElement(menu).perform();
			Thread.sleep(6000);
			}	
		}
	}catch (Exception e) {
		// TODO: handle exception
	}
}
	public void clickonsubmenu (String submenutitle) {
		try {
		for(WebElement submenu:submenus) {
			System.out.println(submenu.getText());
			if(submenu.getText().contains(submenutitle))
			{
				
			submenu.click();
		
			Config.attente(10);
			}
		}
	}catch (Exception e) {
		// TODO: handle exception
	}
}
	public void verifsubmenu (String subtitle) {
		Config.attente(10);
		Assert.assertEquals(verifpage.getText(), subtitle);
	}
}
