package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class PageMenus extends ProjectReusableMethods {

	@Given("Click toggle menu button from the left cornera")
	public PageMenus clickToggle() {
		WebElement eleAppLauncher = findElementBy("xpath", "//div[@class='appLauncher slds-context-bar__icon-action']", "Toggle menu");
		click(eleAppLauncher, "Toggle menu");
        return this;
    }
	
	@And("Click View All and trigger App Launchera")
	public PageMenus viewAll() {
		WebElement eleViewAll = findElementBy("xpath", "//button[contains(text(),'View All')]/parent::lightning-button", "View All link");
		click(eleViewAll, "View All link");
        return this;
	}
	
	
	@And("Click on Service")
	public PageMenus appLauncher_Service_Click() {
		WebElement eleSales = findElementBy("xpath", "//p[text()='Service']", "Service App Launch");
		click(eleSales, "Service App Launch");
        return this;
    }
	
	
	@And("Click on Reports")
	public ReportsPage reports_Click() {
		WebElement eleReportsTab = findElementBy("xpath", "//a[@title='Reports']", "Reports tab");
		executor.executeScript("arguments[0].click();", eleReportsTab);
        return new ReportsPage();
    }
	
	public PageMenus scroll()
	{
		executor.executeScript("window.scrollBy(0,1000)");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		return this;
	}
    
}

