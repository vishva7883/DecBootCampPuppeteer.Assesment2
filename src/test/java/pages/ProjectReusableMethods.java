package pages;

import java.awt.Robot;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;

public class ProjectReusableMethods {	

	public static RemoteWebDriver driver;  //WebDriver is Interface. RemoteWebDriver is super most class
	//public static WebDriver driver;  //WebDriver is Interface. RemoteWebDriver is super most class
	public static WebDriverWait wait;
	public static JavascriptExecutor executor;
	public static Actions action;
	public static Robot robot;
	public static ConfigFileReader configFileReader;
	
	public static WebElement findElementBy(String locator, String locValue, String fieldDesc) {

		
		try {
			switch (locator.toUpperCase()) {
			case "ID":
				System.out.println("The field, '"+fieldDesc+"' located by (id) : '" + locator + "' has been found successfully");
				//return driver.findElement(By.id(locValue));
				return driver.findElementById(locValue);

			case "XPATH":
				System.out.println("The field, '"+fieldDesc+"' located by (xpath) : '" + locator + "' has been found successfully");
				//return driver.findElement(By.xpath(locValue));
				return driver.findElementByXPath(locValue);

			case "CLASS":
				System.out.println("The field, '"+fieldDesc+"' located by (class) : '" + locator + "' has been found successfully");
				//return driver.findElement(By.className(locValue));
				return driver.findElementByClassName(locValue);
				
			case "LINK":
				System.out.println("The field, '"+fieldDesc+"' located by (link) : '" + locator + "' has been found successfully");
				//return driver.findElement(By.linkText(locValue));
				return driver.findElementByLinkText(locValue);

			case "NAME":
				System.out.println("The field, '"+fieldDesc+"' located by (name) : '" + locator + "' has been found successfully");
				//return driver.findElement(By.name(locValue));
				return driver.findElementByName(locValue);

			case "TAGNAME":
				System.out.println("The field, '"+fieldDesc+"' located by (list) : " + locator + "has been found successfully");
				//return driver.findElement(By.TagName(locValue));
				return driver.findElementByTagName(locValue);

			case "PARTIALLINK":
				System.out.println("The field, '"+fieldDesc+"' located by (list) : " + locator + "has been found successfully");
				//return driver.findElement(By.TagName(locValue));
				return driver.findElementByPartialLinkText(locValue);

			default:
				break;
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element Not Found!! Field : '"+fieldDesc+"'Locator : '" + locator + "', Value : '" + locValue+ "'. Exception Details : " + e);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid Argument passed!! Field : '"+fieldDesc+"' Locator : '" + locator + "', Value : '" + locValue+ "'. Exception Details : " + e);
		}
		return null;
	}


	
	public static List<WebElement> findElementsBy(String locator, String locValue, String fieldDesc) {
		
		try {
			switch (locator.toUpperCase()) {
			case "ID":
				System.out.println("The field, '"+fieldDesc+"' located by (id) : '" + locator + "' has been found successfully");
				return driver.findElements(By.id(locValue));

			case "XPATH":
				System.out.println("The field, '"+fieldDesc+"' located by (xpath) : '" + locator + "' has been found successfully");
				return driver.findElements(By.xpath(locValue));

			default:
				break;
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element Not Found!! Field : '"+fieldDesc+"'Locator : '" + locator + "', Value : '" + locValue+ "'. Exception Details : " + e);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid Argument passed!! Field : '"+fieldDesc+"' Locator : '" + locator + "', Value : '" + locValue+ "'. Exception Details : " + e);
		}
		return null;
	}



	
	
	public static void clear(WebElement ele, String fieldDesc) {
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			executor.executeScript("arguments[0].scrollIntoView(true);", ele);
			ele.clear();
			System.out.println("The prefilled text in the field, '"+fieldDesc+"'; element '" + ele + "' cleared successfully");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element Not Found!! The field, '"+fieldDesc+"'; element '" + ele + "'. Exception Details : " + e);
		} catch (NullPointerException e) {
			System.out.println("Invalid/Incorrect argument experienced for the field, '"+fieldDesc+"'; element '" + ele + "'. Exception Details : " + e);
		}
	}
	
	
	@SuppressWarnings("null")
	public static void click(WebElement ele, String fieldDesc) {
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			executor.executeScript("arguments[0].scrollIntoView(true);", ele);
			ele.click();
			System.out.println("The field, '"+fieldDesc+"'; element '" + ele + "' clicked successfully by '.click' method");
		}
		catch (org.openqa.selenium.NoSuchElementException e) {
			
				try {
					System.out.println(".Java Executor");
					executor.executeScript("arguments[0].scrollIntoView(true);", ele);
					executor.executeScript("arguments[0].click();", ele);
					System.out.println("The field, '"+fieldDesc+"'; element '" +ele + "' clicked successfully by 'java executeScript.click' method");
					} 
					catch (ElementClickInterceptedException ex) {
					
							try {
								action.moveToElement(ele).click().perform();
								System.out.println("The field, '"+fieldDesc+"'; element '" +ele + "' clicked successfully by 'action.click' method");
								} 
								catch (org.openqa.selenium.NoSuchElementException exe) {
									System.out.println("Element Not Found!! The field, '"+fieldDesc+"'; element '" + ele + "'. Details : '" + exe +"'"+ "Exception Details : " + e);
								}
					}
		}
		catch (Exception e) {
			System.out.println("Exception occured when handling the field, '"+fieldDesc+"'; element '" + ele + "'. Details : '" + e +"'"+ "Exception Details : " + e);
		}
	}
	
	
	
	
	public static void type(WebElement ele, String data, String fieldDesc) {

		try {
			
			wait.until(ExpectedConditions.visibilityOf(ele));
			executor.executeScript("arguments[0].scrollIntoView(true);", ele);
			clear(ele,fieldDesc);
			ele.sendKeys(data);
			System.out.println("The value " + data + " is entered successfully in the field '"+fieldDesc+", Locator '"+ ele+"'");
		} catch (IllegalStateException e) {
			System.out.println("Element Not in input acceptable state !! Field : "+fieldDesc+"; Locator : " + ele + "; Value : " + data + "Exception Details : " + e);
		} catch (TypeNotPresentException e) {
			System.out.println("Type option not enabled !! Field : "+fieldDesc+"; Locator : " + ele + "; Value : " + data + "Exception Details : " + e);
		} catch (NullPointerException e) {
			System.out.println("Invalid/Incorrect argument!! Field : "+fieldDesc+"; Locator : " + ele + "; Value : " + data + "Exception Details : " + e);
		}
	}
	
	
	

	public static String getText(WebElement ele, String fieldDesc) {

		String txt = "";
		try {
			txt = ele.getText();
			if (txt != "") {
				System.out.println("The text from the field : "+fieldDesc+"; element :" + ele + " has been extracted");
			} else {
				System.out.println("The text from the field : "+fieldDesc+"; element :" + ele + " is BLANK or NULL");
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element Not Found!! Field : "+fieldDesc+"; Webelement : " + ele + "Exception Details : " + e);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid/Incorrect argument Field : "+fieldDesc+"; Webelement : " + ele + "Exception Details : " + e);
		} catch (NullPointerException e) {
			System.out.println("Invalid/Incorrect argument Field : "+fieldDesc+"; Webelement : " + ele + "Exception Details : " + e);
		}

		return txt;

	}
	
	
	public boolean verifyExactTitle(String expectedTitle) {
		
		boolean bReturn = false;

		try {
			String titleofpage = driver.getTitle();
			if (titleofpage.equals(expectedTitle)) {
				System.out.println("The given title <" + expectedTitle + "> is matching with the UI title [" + titleofpage + "]");
				bReturn = true;
			} else {
				System.out.println("The given title <" + expectedTitle + "> is NOT matching with the UI title [" + titleofpage	+ "]");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element Not Found!! Webelement : " + driver.getTitle() + "Exception Details : " + e);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid/Incorrect argument from Webelement : " + driver.getTitle() + "Exception Details : " + e);
		} catch (NullPointerException e) {
			System.out.println("Invalid/Incorrect argument from Webelement : " + driver.getTitle() + "Exception Details : " + e);
		}
		return bReturn;
	}
	
	public void verifyExactText(WebElement ele, String expectedText, String fieldName) {
		
		try {
			String vercompnam = getText(ele, fieldName);

			if (vercompnam.equals(expectedText)) {
				System.out.println("For the field : "+fieldName+"; The UI text [" + vercompnam + "] matching the given text <" + expectedText + ">");
				
			} else {
				System.out.println("For the field : "+fieldName+"; The UI text [" + vercompnam + "] doesnt match with the given text <" + expectedText + ">");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element Not Found!! For the field "+fieldName+";  Webelement : " + ele + " expected text " + expectedText);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid/Incorrect argument For the field : "+fieldName+"; Webelement : " + ele + " expected text " + expectedText);
		} catch (NullPointerException e) {
			System.out.println("Invalid/Incorrect argument For the field : "+fieldName+"; Webelement : " + ele + " expected text " + expectedText);
		}

	}

	public void verifyPartialText(WebElement ele, String expectedText, String fieldName) {
		// TODO Auto-generated method stub

		try {
			String vercompnam = getText(ele, fieldName);

			if (vercompnam.contains(expectedText)) {
				System.out.println("For the field : "+fieldName+"; The UI text [" + vercompnam + "] contains the given text <" + expectedText + ">");
	
			} else {
				System.out.println("For the field : "+fieldName+"; The UI text [" + vercompnam + "] doesnt contain the given text <" + expectedText + ">");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element Not Found!! For the field : "+fieldName+"; Webelement : " + ele + " expected text " + expectedText);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid/Incorrect argument "+fieldName+"; Webelement : " + ele + " expected text " + expectedText);
		} catch (NullPointerException e) {
			System.out.println("Invalid/Incorrect argument "+fieldName+"; Webelement : " + ele + " expected text " + expectedText);
		}

	}

	public static void switchToIFrame(WebElement eleiFrame)
	{
		driver.switchTo().frame(eleiFrame);
	}
	
	public static void switchOutCurrentIFrame()
	{
		driver.switchTo().defaultContent();
	}
	
	public static void sleep(int sec) throws InterruptedException
	{
		if (sec<1)
			sec = 1;
		if (sec>100)
			sec = 1;
		
		Thread.sleep(sec*1000);
	}
	
	public static void browser_closeActiveBrowser() {
		driver.close();
		browser_closeAllBrowsers();
	}

	public static void browser_closeAllBrowsers() {
		driver.quit();
	}
	
}
