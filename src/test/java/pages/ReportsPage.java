//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >

package pages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.imageio.ImageIO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReportsPage extends ProjectReusableMethods {

//Campaign List view
	
			@And("Click on New Report SalesForce Classic") 
			public ReportsPage reports_NewClassic_Click() {
				String ui_FieldName = "New Report (Salesforce Classic)";	
				
				WebElement eleNewClassicReport = findElementBy("xpath", "//a[@title='New Report (Salesforce Classic)']", ui_FieldName);
				click(eleNewClassicReport, ui_FieldName);
				return this;
		    }

		
//Reports New (Classic)
			@And("Click on Leads")
			public ReportsPage reports_newClassic_Leads_Click() {
				
				WebElement eleiFrame = findElementBy("xpath","//iframe[@class = 'isEdit reportsReportBuilder']","Edit iframe");
				switchToIFrame(eleiFrame);
				
				String ui_FieldName = "Reports > Lead";	
				
				WebElement eleReportLead = findElementBy("xpath","//span[text()='Leads']",ui_FieldName);
				click(eleReportLead, ui_FieldName);
				return this;
			}
			
			@And("Download the Lead Report Image on the Right side")
			public ReportsPage reports_LeadReport_Download() throws IOException {
				String ui_FieldName = "Lead Report";	
				
				WebElement imgElement = findElementBy("xpath","//img[@id='thePage:dummyForm:report_img']",ui_FieldName);
				String src = imgElement.getAttribute("src");
				BufferedImage bufferedImage = ImageIO.read(new URL(src));
				File outputfile = new File("saved.png");
				ImageIO.write(bufferedImage, "png", outputfile);
				return this;
			}

			@And("Click on Create")
			public ReportsPage reports_CreateLeadReport_Click() throws IOException {
				String ui_FieldName = "Create";	
				
				WebElement eleCreateLeadReport = findElementBy("xpath","//input[@value='Create']",ui_FieldName);
				click(eleCreateLeadReport,ui_FieldName);
				
				return this;
			}
			
			
			
//Lead Reports 
			
			@And("Select Range as (.*)")
			public ReportsPage reports_Lead_Range_Select(String range) throws IOException {
				String ui_FieldName = "Range";	
				
				WebElement eleRange = findElementBy("xpath","//input[@name='duration']",ui_FieldName);
				click(eleRange,ui_FieldName);
				
				ui_FieldName = "Range List of Values";	
				System.out.println("Range value from Feature file : "+range);
				
				WebElement eleRangeLOV = findElementBy("xpath","//div[text()='All Time']",ui_FieldName);
				click(eleRangeLOV,ui_FieldName);
				return this;
			}	
			
			@And("Select To as plus (.*) days From Today")
			public ReportsPage reports_Lead_ToDate_Select(int num) throws IOException {
				String ui_FieldName = "To Date > Calender";	
				WebElement eleToCalender = findElementBy("xpath","//input[@name='endDate']/following-sibling::img[@class='x-form-trigger x-form-date-trigger']",ui_FieldName);
				click(eleToCalender,ui_FieldName);
							
				ui_FieldName = "To Date Pick";
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

				Date currentDate = new Date();
			    Calendar c = Calendar.getInstance();
			    c.setTime(currentDate);

			    // manipulate date
			    c.add(Calendar.DAY_OF_MONTH,num);

			    // convert calendar to date
			    Date currentDatePlusOne = c.getTime();
			    String stringDate = dateFormat.format(currentDatePlusOne);
			    String[] spltDate = stringDate.split("/");
			    
			    System.out.println("Derived Date : "+spltDate[2]);
			    String datxpath="//a[@class='x-date-date']/em/span[text()='"+spltDate[2]+"']";
				
				WebElement eleToDate = findElementBy("xpath",datxpath,ui_FieldName);
				click(eleToDate,ui_FieldName);
				
				return this;
			}


			@And("Verify Whether the Preview is in Tabular Format")
			public ReportsPage Verify_Whether_the_Preview_is_in_Tabular_Format() throws InterruptedException
			{
				String ui_FieldName = "Preview Lead Report";
				sleep(4);
				List<WebElement> elePreviewTableColums = findElementsBy("xpath","//div[@id='gridViewpreviewPanelGrid']//table[2]/thead/tr/td",ui_FieldName);
				System.out.println("Total number of columns in the Preview table : "+elePreviewTableColums.size());
				
				List<WebElement> elePreviewTableRows = findElementsBy("xpath","//div[@id='gridViewScrollpreviewPanelGrid']//table//td[1]/div",ui_FieldName); 
				System.out.println("Total number of rows in the Preview table : "+elePreviewTableRows.size());
				
				ui_FieldName = "Preview Lead Report Disp Format";
				WebElement eleRepDispForm = findElementBy("xpath","//table[@id='reportFormatMink']//button",ui_FieldName);
				
				if (eleRepDispForm.getText().contentEquals("Tabular Format"))
					System.out.println("Lead preview is in Tabular Format. Matrix is :: Rows :  "+elePreviewTableColums.size()+" ; Columns : "+elePreviewTableRows.size());
				else
					System.out.println("Lead preview is NOT in Tabular Format");
				
				return this;
			}
			
			@And("Get the List of Billing State or Province")
			public ReportsPage Get_the_List_of_Billing_State_Province()
			{
				try {sleep(2);} catch (InterruptedException e) {}
				String ui_FieldName = "Lead Source";
				List<WebElement> eleLeadSources = findElementsBy("xpath","//div[@id='gridViewScrollpreviewPanelGrid']//table//td[6]/div",ui_FieldName); 
				
				Set<String> leadSource = new TreeSet<String>();
				
				for (WebElement els : eleLeadSources)
				{
					String extLeadSource = els.getText();
					leadSource.add(extLeadSource);
				}
				
				System.out.println("List of Lead Source : "+leadSource.toString());
				
				return this;
			}
			

			@And("Get the Grand Total of Records Available")
			public ReportsPage Get_the_Grand_Total_of_Records_Available()
			{
				
				String ui_FieldName = "Grand total of Preview records";
				
				List<WebElement> elePreviewTableRows = findElementsBy("xpath","//div[@id='gridViewScrollpreviewPanelGrid']//table//td[1]/div",ui_FieldName); 
				
				String rawCount = elePreviewTableRows.get(elePreviewTableRows.size()-1).getText();
				rawCount = rawCount.replaceAll("[()]", "");
				System.out.println(rawCount);
				String[] splitRawcount = rawCount.split(" ");
				System.out.println("Total no of records in the Preview Table : "+splitRawcount[2]);
				
				return this;
			}
			
			@And("Click on Save1")
			public ReportsPage Click_on_Save1()
			{
				String ui_FieldName = "Unsaved Report > Save";
				WebElement eleURSave = findElementBy("xpath","//table[@id='saveReportBtn']//button[text()='Save']",ui_FieldName);
				click(eleURSave,ui_FieldName);
				return this;
			}
			
			
			@And("Enter Report name as (.*)")
			public ReportsPage Enter_Report_name_as(String reportName)
			{
				String ui_FieldName = "Report Name";
				WebElement eleRepName = findElementBy("id","saveReportDlg_reportNameField",ui_FieldName);
				type(eleRepName,reportName,ui_FieldName);
				
				return this;
			}
			
			@And("Enter Report Unique name as (.*)")
			public ReportsPage Enter_Report_Unique_name_as(String reportUnqName) throws InterruptedException
			{
				String ui_FieldName = "Report Unique Name";
				WebElement eleRepUnqName = findElementBy("id","saveReportDlg_DeveloperName",ui_FieldName);
				sleep(1);
		
				eleRepUnqName.sendKeys(Keys.CONTROL, Keys.chord("a"));
				eleRepUnqName.sendKeys(Keys.BACK_SPACE);

				Date retrieveDate = new Date(new Date().getTime());
				String formDate = retrieveDate.toString();
				String[] d=formDate.split(" ", 6);
				formDate = formDate.replaceAll("[-+:IST ]*","");
				reportUnqName = reportUnqName+d[5]+d[1]+d[2]+d[3].replaceAll("[:]*","");;
				
				type(eleRepUnqName,reportUnqName,ui_FieldName);
				return this;
			}
			
			@And("Enter Report Discussion as Report Updated by (.*)")
			public ReportsPage Enter_Report_Discussion_as_Report_Updated_by (String reportUpdatedBy)
			{
				String ui_FieldName = "Report Description";
				WebElement eleRepDesc = findElementBy("name","reportDescription",ui_FieldName);
				type(eleRepDesc,reportUpdatedBy,ui_FieldName);
				return this;
			}
			
			@And("Select Report Folder as Unfiled Public Reports")
			public ReportsPage Select_Report_Folder_as_Unfiled_Public_Reports()
			{
				String ui_FieldName = "Report Folder";
				WebElement eleRepFolder = findElementBy("xpath","//input[@id='saveReportDlg_folderFinder']/following-sibling::img",ui_FieldName);
				click(eleRepFolder,ui_FieldName);
				
				ui_FieldName = "Report Folder LoV";
				WebElement eleRepFolderLov = findElementBy("xpath","//div[@class='x-combo-list-inner']/div[text()='Unfiled Public Reports']",ui_FieldName);
				click(eleRepFolderLov,ui_FieldName);
				
				return this;
			}
			
			@When("Click on Save2")
			public ReportsPage Click_on_Save2()
			{
				String ui_FieldName = "Save Report";
				WebElement eleSaveRep = findElementBy("id","dlgSaveReport",ui_FieldName);
				click(eleSaveRep,ui_FieldName);
				
				return this;
			}
			
			@Then("Verify Report has been created successfully with (.*)")
			public ReportsPage Verify_Report_has_been_created_successfully(String reportName)
			{
				switchOutCurrentIFrame();
				
				WebElement eleiFrame = findElementBy("xpath","//iframe[starts-with(@title,'Vishnu_LeadReport')]","Vishnu Report iframe");
				switchToIFrame(eleiFrame);
				
				String ui_FieldName = "Page Desc > Reports Name";
				
				String xpathDesc = "//title[text()='Vishnu_LeadReport ~ Salesforce - Developer Edition']/following::div//h2";
				List<WebElement> tabReportName = findElementsBy("xpath",xpathDesc,ui_FieldName);

				int hit = 0;
				
				for (WebElement trn : tabReportName) {
					String rpn = getText(trn, ui_FieldName);	
					System.out.println(rpn);
					if (rpn.contentEquals(reportName))
					{
						System.out.println("Report has been created successfully with Report Name : "+reportName);
						hit = 1;
						click(trn,ui_FieldName);
						break;
					}
				}
				if (hit == 0)
					System.out.println("Report has NOT been created with Report Name : "+reportName);	
				return this;
			}
			    
			
			@When("Click on Run Report")
			public ReportsPage Click_on_Run_Report()
			{
				String ui_FieldName = "Run Report";
				
				String xpathDesc = "//title[text()='Vishnu_LeadReport ~ Salesforce - Developer Edition']//following::table[@id='runReportBtn']/tbody";
				WebElement eleRunRep = findElementBy("xpath",xpathDesc,ui_FieldName);
				click(eleRunRep,ui_FieldName);
				
				return this;
			}
			
			@Then("Get the total Number of Records")
			public ReportsPage Get_the_total_Number_of_Records() throws InterruptedException
			{
				sleep(3);
				switchOutCurrentIFrame();	
				WebElement eleiFrame = findElementBy("xpath","//div[@class='windowViewMode-normal oneContent active lafPageHost']//iframe[@class = 'isView reportsReportBuilder']","View iframe");
				switchToIFrame(eleiFrame);
				
				String ui_FieldName = "Total Records";
				
				WebElement eleTotRecords = findElementBy("xpath","//div[@class='metricsElement metricsValue']",ui_FieldName);
				String totrec = getText(eleTotRecords, ui_FieldName);		
				
				System.out.println("Total number of records listed after Run Report : "+totrec);
				
				return this;
			}
			
			@When("Click on Edit")
			public ReportsPage Click_on_Edit()
			{
				String ui_FieldName = "Edit Report";
				WebElement eleEditRunRep = findElementBy("xpath","//button[text()='Edit']",ui_FieldName);
				click(eleEditRunRep,ui_FieldName);
				return this;
			}
			
			@And("Get the text of Report Name")
			public ReportsPage Get_the_text_of_Report_Name()
			{
				switchOutCurrentIFrame();
				WebElement eleiFrame = findElementBy("xpath","//iframe[@class = 'isEdit reportsReportBuilder'][@title='Report Builder']","Edit iframe");
				switchToIFrame(eleiFrame);
				
				String ui_FieldName = "Report Name";
				WebElement eleReportName = findElementBy("xpath","//div[@class='dash-title']/div/h1",ui_FieldName);
				String reportName = getText(eleReportName, ui_FieldName);		
				
				System.out.println("Report name displayed in the UI : "+reportName);
				
				return this;
			}
			
			@And("Click on Close")
			public ReportsPage Click_on_Close()
			{
				switchOutCurrentIFrame();
				WebElement eleiFrame = findElementBy("xpath","//iframe[@class = 'isEdit reportsReportBuilder'][@title='Report Builder']","Edit iframe");
				switchToIFrame(eleiFrame);
				
				
				String ui_FieldName = "Close Report";
				WebElement eleCloseRunRep = findElementBy("xpath","//button[text()='Close']",ui_FieldName);
				click(eleCloseRunRep,ui_FieldName);
				click(eleCloseRunRep,ui_FieldName);
				

				return this;
			}
			

			
			@And("Verify the Report Name as (.*)")
			public ReportsPage Verify_the_Report_Name(String reportName) throws InterruptedException
			{
				
				switchOutCurrentIFrame();

				WebElement eleReportsTab = findElementBy("xpath", "//a[@title='Reports']", "Reports tab");
				executor.executeScript("arguments[0].click();", eleReportsTab);
				sleep(2);
				WebElement eleReportsRecent = findElementBy("xpath", "//a[@title='Recent']", "Reports tab");
				executor.executeScript("arguments[0].click();", eleReportsRecent);
				sleep(2);
				
				String ui_FieldName = "Recent > Reports Name";
				List<WebElement> tabReportName = findElementsBy("xpath","//th[@data-label='Report Name']//a",ui_FieldName);

				
				int hit = 0;
				
				for (WebElement trn : tabReportName) {
					String rpn = getText(trn, ui_FieldName);	
					System.out.println("Report Name value retrieved from UI'"+rpn+"'");
					if (rpn.contentEquals(reportName))
					{
						System.out.println("Report has been created successfully with Report Name : "+reportName);
						hit = 1;
						break;
					}
				}
				if (hit == 0)
					System.out.println("Report has NOT been created with Report Name : "+reportName);	
				return this;
			}
			
			@And("Get the Date and Time When the Report is Created On for (.*)")
			public ReportsPage Get_the_Date_and_Time_When_the_Report_is_Created_On(String reportName)
			{
				
				String ui_FieldName = "Recent > Created On";
				List<WebElement> tabReportName = findElementsBy("xpath","//th[@data-label='Report Name']//a",ui_FieldName);
				List<WebElement> tabCreatedOn = findElementsBy("xpath","//td[@data-label='Created On']//div",ui_FieldName);

				int hit = 0;
				int i=-1;
				for (WebElement trn : tabReportName) {
					i++;
					String rpn = getText(trn, ui_FieldName);	
					if (rpn.contentEquals(reportName))
					{
						String rco = getText(tabCreatedOn.get(i), ui_FieldName);	
						System.out.println("Reported created on : "+rco);
						hit = 1;
						break;
					}
				}
				if (hit == 0)
					System.out.println("Report has NOT been created with Report Name : "+reportName);	
				return this;
				
				
			}
			
	
}
			

	
	

	

	

