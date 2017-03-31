package com.cucumber.BuildIT.base_files.glue;

import com.cucumber.BuildIT.base_files.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by shirkandea on 30/03/2017.
 */
public class Verify_Weather_Forecast_Report extends ParentScenario {


    @When("I click on day in row number \"(.*)\"")
    public void Select_Day(String strDayNumber) throws InterruptedException{
       obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Click_Day_Report();
      //  Thread.sleep(5000);
    }


    @And("I should be able to see three hourly dividation of day report for row \"(.*)\"")
    public void Verify_Hourly_Report_Displayed(String strDayNumber){
        String hourlyReport = "one";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Get_Hourly_Report_Row_Object(hourlyReport).Verify_All_Elements_Displayed(strDayNumber,hourlyReport);
        hourlyReport = "two";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Get_Hourly_Report_Row_Object(hourlyReport).Verify_All_Elements_Displayed(strDayNumber,hourlyReport);
        hourlyReport = "three";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Get_Hourly_Report_Row_Object(hourlyReport).Verify_All_Elements_Displayed(strDayNumber,hourlyReport);
        hourlyReport = "four";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Get_Hourly_Report_Row_Object(hourlyReport).Verify_All_Elements_Displayed(strDayNumber,hourlyReport);
        hourlyReport = "five";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Get_Hourly_Report_Row_Object(hourlyReport).Verify_All_Elements_Displayed(strDayNumber,hourlyReport);
        hourlyReport = "six";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Get_Hourly_Report_Row_Object(hourlyReport).Verify_All_Elements_Displayed(strDayNumber,hourlyReport);
        hourlyReport = "seven";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Get_Hourly_Report_Row_Object(hourlyReport).Verify_All_Elements_Displayed(strDayNumber,hourlyReport);
        hourlyReport = "eight";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Get_Hourly_Report_Row_Object(hourlyReport).Verify_All_Elements_Displayed(strDayNumber,hourlyReport);
    }

    @Then("I should be able to see all fields for five days")
    public void Verify_All_Fields_Displayed_For_Five_Days(){

        String strDayNumber = "one";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Verify_All_Elements_Displayed(strDayNumber);

        strDayNumber = "two";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Verify_All_Elements_Displayed(strDayNumber);

        strDayNumber = "three";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Verify_All_Elements_Displayed(strDayNumber);

        strDayNumber = "four";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Verify_All_Elements_Displayed(strDayNumber);

        strDayNumber = "five";
        obj_Home_Page.Get_Day_Report_Row_Object(strDayNumber).Verify_All_Elements_Displayed(strDayNumber);
    }
}
