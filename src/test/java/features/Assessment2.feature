Feature: Assesment2

Scenario Outline: Assesment2

Given Click toggle menu button from the left cornera
And Click View All and trigger App Launchera 
And Click on Service 
And Click on Reports
And Click on New Report SalesForce Classic 
And Click on Leads
And Download the Lead Report Image on the Right side
And Click on Create
And Select Range as <range>
#And Select From date as todays date 
And Select To as plus <todate> days From Today
And Verify Whether the Preview is in Tabular Format
And Get the List of Billing State or Province
And Get the Grand Total of Records Available
And Click on Save1 
And Enter Report name as <reportName>
And Enter Report Unique name as <reportUnqName>
And Enter Report Discussion as Report Updated by <reportUpdatedBy>
And Select Report Folder as Unfiled Public Reports
When Click on Save2 
Then Verify Report has been created successfully with <reportName>
When Click on Run Report
Then Get the total Number of Records
When Click on Edit 
And Get the text of Report Name 
Then Click on Close 
And Verify the Report Name as <reportName>
Then Get the Date and Time When the Report is Created On for <reportName>

Examples:
|range|todate|reportName|reportUnqName|reportUpdatedBy|
|All Time|5|Vishnu_LeadReport|Vishnu_LeadReport_|Report last updated by Vishnu.S|
