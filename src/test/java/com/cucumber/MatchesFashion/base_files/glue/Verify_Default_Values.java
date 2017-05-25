package com.cucumber.MatchesFashion.base_files.glue;

import com.cucumber.MatchesFashion.base_files.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

/**
 * Created by shirkandea on 29/03/2017.
 */
public class Verify_Default_Values extends ParentScenario {

    @Then("I should be able to see headline with city name as \"(.*)\"")
    public void Verify_Headline(String strCity){
       obj_Home_Page.Verify_Headline(strCity);
    }

    @Then("I should be able to see five dates starting from current date")
    public void Verify_Dates(){
       obj_Home_Page.Verify_Dates();
    }

    @And("Each date should be mapped with correct day")
    public void Verify_Day(){
       obj_Home_Page.Verify_Days();
    }

    @And("All values should be rounded down")
    public void Verify_All_Values_Rounded_Down(){

    }
}
