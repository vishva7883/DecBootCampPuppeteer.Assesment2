package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import pages.Hooks;

@CucumberOptions(features = "src/test/java/features/", 
					glue = "pages",
					plugin = { "pretty", "html:target/htmlreports"} )

public class RunAssesment2Test extends AbstractTestNGCucumberTests { 
	
}

//****************************
//OUTPUT
//****************************
//
//[RemoteTestNG] detected TestNG version 7.3.0
//[TestNGContentHandler] [WARN] It is strongly recommended to add "<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >" at the top of your file, otherwise TestNG may fail or not work as expected.
//207 [main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using chromedriver 88.0.4324.96 (resolved driver for Chrome 88)
//239 [main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.chrome.driver as C:\Users\VISHNU S\.cache\selenium\chromedriver\win32\88.0.4324.96\chromedriver.exe
//Starting ChromeDriver 88.0.4324.96 (68dba2d8a0b149a1d3afac56fa74648032bcf46b-refs/branch-heads/4324@{#1784}) on port 5659
//Only local connections are allowed.
//Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
//ChromeDriver was started successfully.
//Feb 17, 2021 11:25:58 AM org.openqa.selenium.remote.ProtocolHandshake createSession
//INFO: Detected dialect: W3C
//Chrome is intialized and launched successfully
//The field, 'Toggle menu' located by (xpath) : 'xpath' has been found successfully
//The field, 'Toggle menu'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //div[@class='appLauncher slds-context-bar__icon-action']]' clicked successfully by '.click' method
//The field, 'View All link' located by (xpath) : 'xpath' has been found successfully
//The field, 'View All link'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //button[contains(text(),'View All')]/parent::lightning-button]' clicked successfully by '.click' method
//The field, 'Service App Launch' located by (xpath) : 'xpath' has been found successfully
//The field, 'Service App Launch'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //p[text()='Service']]' clicked successfully by '.click' method
//The field, 'Reports tab' located by (xpath) : 'xpath' has been found successfully
//The field, 'New Report (Salesforce Classic)' located by (xpath) : 'xpath' has been found successfully
//The field, 'New Report (Salesforce Classic)'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //a[@title='New Report (Salesforce Classic)']]' clicked successfully by '.click' method
//The field, 'Edit iframe' located by (xpath) : 'xpath' has been found successfully
//The field, 'Reports > Lead' located by (xpath) : 'xpath' has been found successfully
//The field, 'Reports > Lead'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //span[text()='Leads']]' clicked successfully by '.click' method
//The field, 'Lead Report' located by (xpath) : 'xpath' has been found successfully
//The field, 'Create' located by (xpath) : 'xpath' has been found successfully
//The field, 'Create'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //input[@value='Create']]' clicked successfully by '.click' method
//The field, 'Range' located by (xpath) : 'xpath' has been found successfully
//The field, 'Range'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //input[@name='duration']]' clicked successfully by '.click' method
//Range value from Feature file : All Time
//The field, 'Range List of Values' located by (xpath) : 'xpath' has been found successfully
//The field, 'Range List of Values'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //div[text()='All Time']]' clicked successfully by '.click' method
//The field, 'To Date > Calender' located by (xpath) : 'xpath' has been found successfully
//The field, 'To Date > Calender'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //input[@name='endDate']/following-sibling::img[@class='x-form-trigger x-form-date-trigger']]' clicked successfully by '.click' method
//Derived Date : 22
//The field, 'To Date Pick' located by (xpath) : 'xpath' has been found successfully
//The field, 'To Date Pick'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //a[@class='x-date-date']/em/span[text()='22']]' clicked successfully by '.click' method
//The field, 'Preview Lead Report' located by (xpath) : 'xpath' has been found successfully
//Total number of columns in the Preview table : 9
//The field, 'Preview Lead Report' located by (xpath) : 'xpath' has been found successfully
//Total number of rows in the Preview table : 51
//The field, 'Preview Lead Report Disp Format' located by (xpath) : 'xpath' has been found successfully
//Lead preview is in Tabular Format. Matrix is :: Rows :  9 ; Columns : 51
//The field, 'Lead Source' located by (xpath) : 'xpath' has been found successfully
//List of Lead Source : [-, Partner Referral, Phone Inquiry, Purchased List, Web]
//The field, 'Grand total of Preview records' located by (xpath) : 'xpath' has been found successfully
//Grand Totals 50 records
//Total no of records in the Preview Table : 50
//The field, 'Unsaved Report > Save' located by (xpath) : 'xpath' has been found successfully
//The field, 'Unsaved Report > Save'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //table[@id='saveReportBtn']//button[text()='Save']]' clicked successfully by '.click' method
//The field, 'Report Name' located by (id) : 'id' has been found successfully
//The prefilled text in the field, 'Report Name'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> id: saveReportDlg_reportNameField]' cleared successfully
//The value Vishnu_LeadReport is entered successfully in the field 'Report Name, Locator '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> id: saveReportDlg_reportNameField]'
//The field, 'Report Unique Name' located by (id) : 'id' has been found successfully
//The prefilled text in the field, 'Report Unique Name'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> id: saveReportDlg_DeveloperName]' cleared successfully
//The value Vishnu_LeadReport_2021Feb17112701 is entered successfully in the field 'Report Unique Name, Locator '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> id: saveReportDlg_DeveloperName]'
//The field, 'Report Description' located by (name) : 'name' has been found successfully
//The prefilled text in the field, 'Report Description'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> name: reportDescription]' cleared successfully
//The value Report last updated by Vishnu.S is entered successfully in the field 'Report Description, Locator '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> name: reportDescription]'
//The field, 'Report Folder' located by (xpath) : 'xpath' has been found successfully
//The field, 'Report Folder'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //input[@id='saveReportDlg_folderFinder']/following-sibling::img]' clicked successfully by '.click' method
//The field, 'Report Folder LoV' located by (xpath) : 'xpath' has been found successfully
//The field, 'Report Folder LoV'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //div[@class='x-combo-list-inner']/div[text()='Unfiled Public Reports']]' clicked successfully by '.click' method
//The field, 'Save Report' located by (id) : 'id' has been found successfully
//The field, 'Save Report'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> id: dlgSaveReport]' clicked successfully by '.click' method
//The field, 'Vishnu Report iframe' located by (xpath) : 'xpath' has been found successfully
//The field, 'Page Desc > Reports Name' located by (xpath) : 'xpath' has been found successfully
//The text from the field : Page Desc > Reports Name; element :[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //title[text()='Vishnu_LeadReport ~ Salesforce - Developer Edition']/following::div//h2] has been extracted
//Vishnu_LeadReport
//Report has been created successfully with Report Name : Vishnu_LeadReport
//The field, 'Page Desc > Reports Name'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //title[text()='Vishnu_LeadReport ~ Salesforce - Developer Edition']/following::div//h2]' clicked successfully by '.click' method
//The field, 'Run Report' located by (xpath) : 'xpath' has been found successfully
//The field, 'Run Report'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //title[text()='Vishnu_LeadReport ~ Salesforce - Developer Edition']//following::table[@id='runReportBtn']/tbody]' clicked successfully by '.click' method
//The field, 'View iframe' located by (xpath) : 'xpath' has been found successfully
//The field, 'Total Records' located by (xpath) : 'xpath' has been found successfully
//The text from the field : Total Records; element :[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //div[@class='metricsElement metricsValue']] has been extracted
//Total number of records listed after Run Report : 328
//The field, 'Edit Report' located by (xpath) : 'xpath' has been found successfully
//The field, 'Edit Report'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //button[text()='Edit']]' clicked successfully by '.click' method
//The field, 'Edit iframe' located by (xpath) : 'xpath' has been found successfully
//The field, 'Report Name' located by (xpath) : 'xpath' has been found successfully
//The text from the field : Report Name; element :[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //div[@class='dash-title']/div/h1] has been extracted
//Report name displayed in the UI : Vishnu_LeadReport
//The field, 'Edit iframe' located by (xpath) : 'xpath' has been found successfully
//The field, 'Close Report' located by (xpath) : 'xpath' has been found successfully
//The field, 'Close Report'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //button[text()='Close']]' clicked successfully by '.click' method
//The field, 'Close Report'; element '[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //button[text()='Close']]' clicked successfully by '.click' method
//The field, 'Reports tab' located by (xpath) : 'xpath' has been found successfully
//The field, 'Reports tab' located by (xpath) : 'xpath' has been found successfully
//The field, 'Recent > Reports Name' located by (xpath) : 'xpath' has been found successfully
//The text from the field : Recent > Reports Name; element :[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //th[@data-label='Report Name']//a] has been extracted
//Report Name value retrieved from UI'Vishnu_LeadReport'
//Report has been created successfully with Report Name : Vishnu_LeadReport
//The field, 'Recent > Created On' located by (xpath) : 'xpath' has been found successfully
//The field, 'Recent > Created On' located by (xpath) : 'xpath' has been found successfully
//The text from the field : Recent > Created On; element :[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //th[@data-label='Report Name']//a] has been extracted
//The text from the field : Recent > Created On; element :[[ChromeDriver: chrome on WINDOWS (1f311334934feaf415b7a1762dd24099)] -> xpath: //td[@data-label='Created On']//div] has been extracted
//Reported created on : 2/16/2021, 9:57 PM
//Feature: Assesment2
//
//  Scenario Outline: Assesment2 [90m# src/test/java/features/Assessment2.feature:3[0m
//    [36mGiven Click toggle menu button from the left cornera[0m
//    [36mAnd Click View All and trigger App Launchera[0m
//    [36mAnd Click on Service[0m
//    [36mAnd Click on Reports[0m
//    [36mAnd Click on New Report SalesForce Classic[0m
//    [36mAnd Click on Leads[0m
//    [36mAnd Download the Lead Report Image on the Right side[0m
//    [36mAnd Click on Create[0m
//    [36mAnd Select Range as <range>[0m
//    [36mAnd Select To as plus <todate> days From Today[0m
//    [36mAnd Verify Whether the Preview is in Tabular Format[0m
//    [36mAnd Get the List of Billing State or Province[0m
//    [36mAnd Get the Grand Total of Records Available[0m
//    [36mAnd Click on Save1[0m
//    [36mAnd Enter Report name as <reportName>[0m
//    [36mAnd Enter Report Unique name as <reportUnqName>[0m
//    [36mAnd Enter Report Discussion as Report Updated by <reportUpdatedBy>[0m
//    [36mAnd Select Report Folder as Unfiled Public Reports[0m
//    [36mWhen Click on Save2[0m
//    [36mThen Verify Report has been created successfully with <reportName>[0m
//    [36mWhen Click on Run Report[0m
//    [36mThen Get the total Number of Records[0m
//    [36mWhen Click on Edit[0m
//    [36mAnd Get the text of Report Name[0m
//    [36mThen Click on Close[0m
//    [36mAnd Verify the Report Name as <reportName>[0m
//    [36mThen Get the Date and Time When the Report is Created On for <reportName>[0m
//
//    Examples: 
//
//  Scenario Outline: Assesment2                                                       [90m# src/test/java/features/Assessment2.feature:36[0m
//    [32mGiven [0m[32mClick toggle menu button from the left cornera[0m                             [90m# PageMenus.clickToggle()[0m
//    [32mAnd [0m[32mClick View All and trigger App Launchera[0m                                     [90m# PageMenus.viewAll()[0m
//    [32mAnd [0m[32mClick on Service[0m                                                             [90m# PageMenus.appLauncher_Service_Click()[0m
//    [32mAnd [0m[32mClick on Reports[0m                                                             [90m# PageMenus.reports_Click()[0m
//    [32mAnd [0m[32mClick on New Report SalesForce Classic[0m                                       [90m# ReportsPage.reports_NewClassic_Click()[0m
//    [32mAnd [0m[32mClick on Leads[0m                                                               [90m# ReportsPage.reports_newClassic_Leads_Click()[0m
//    [32mAnd [0m[32mDownload the Lead Report Image on the Right side[0m                             [90m# ReportsPage.reports_LeadReport_Download()[0m
//    [32mAnd [0m[32mClick on Create[0m                                                              [90m# ReportsPage.reports_CreateLeadReport_Click()[0m
//    [32mAnd [0m[32mSelect Range as [0m[32m[1mAll Time[0m                                                     [90m# ReportsPage.reports_Lead_Range_Select(String)[0m
//    [32mAnd [0m[32mSelect To as plus [0m[32m[1m5[0m[32m days From Today[0m                                          [90m# ReportsPage.reports_Lead_ToDate_Select(int)[0m
//    [32mAnd [0m[32mVerify Whether the Preview is in Tabular Format[0m                              [90m# ReportsPage.Verify_Whether_the_Preview_is_in_Tabular_Format()[0m
//    [32mAnd [0m[32mGet the List of Billing State or Province[0m                                    [90m# ReportsPage.Get_the_List_of_Billing_State_Province()[0m
//    [32mAnd [0m[32mGet the Grand Total of Records Available[0m                                     [90m# ReportsPage.Get_the_Grand_Total_of_Records_Available()[0m
//    [32mAnd [0m[32mClick on Save1[0m                                                               [90m# ReportsPage.Click_on_Save1()[0m
//    [32mAnd [0m[32mEnter Report name as [0m[32m[1mVishnu_LeadReport[0m                                       [90m# ReportsPage.Enter_Report_name_as(String)[0m
//    [32mAnd [0m[32mEnter Report Unique name as [0m[32m[1mVishnu_LeadReport_[0m                               [90m# ReportsPage.Enter_Report_Unique_name_as(String)[0m
//    [32mAnd [0m[32mEnter Report Discussion as Report Updated by [0m[32m[1mReport last updated by Vishnu.S[0m [90m# ReportsPage.Enter_Report_Discussion_as_Report_Updated_by(String)[0m
//    [32mAnd [0m[32mSelect Report Folder as Unfiled Public Reports[0m                               [90m# ReportsPage.Select_Report_Folder_as_Unfiled_Public_Reports()[0m
//    [32mWhen [0m[32mClick on Save2[0m                                                              [90m# ReportsPage.Click_on_Save2()[0m
//    [32mThen [0m[32mVerify Report has been created successfully with [0m[32m[1mVishnu_LeadReport[0m          [90m# ReportsPage.Verify_Report_has_been_created_successfully(String)[0m
//    [32mWhen [0m[32mClick on Run Report[0m                                                         [90m# ReportsPage.Click_on_Run_Report()[0m
//    [32mThen [0m[32mGet the total Number of Records[0m                                             [90m# ReportsPage.Get_the_total_Number_of_Records()[0m
//    [32mWhen [0m[32mClick on Edit[0m                                                               [90m# ReportsPage.Click_on_Edit()[0m
//    [32mAnd [0m[32mGet the text of Report Name[0m                                                  [90m# ReportsPage.Get_the_text_of_Report_Name()[0m
//    [32mThen [0m[32mClick on Close[0m                                                              [90m# ReportsPage.Click_on_Close()[0m
//    [32mAnd [0m[32mVerify the Report Name as [0m[32m[1mVishnu_LeadReport[0m                                  [90m# ReportsPage.Verify_the_Report_Name(String)[0m
//    [32mThen [0m[32mGet the Date and Time When the Report is Created On for [0m[32m[1mVishnu_LeadReport[0m   [90m# ReportsPage.Get_the_Date_and_Time_When_the_Report_is_Created_On(String)[0m
//
//1 Scenarios ([32m1 passed[0m)
//27 Steps ([32m27 passed[0m)
//1m27.596s
//
//PASSED: runScenario("Assesment2", "Assesment2")
//        Runs Cucumber Scenarios
//
//===============================================
//    Default test
//    Tests run: 1, Failures: 0, Skips: 0
//===============================================
//
//
//===============================================
//Default suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================
//
//Picked up _JAVA_OPTIONS: -Djava.net.preferIPv4Stack=true
//
