package com.cucumber.Assignment.base_files.glue;

import com.cucumber.Assignment.base_files.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by shirkandea on 06/06/2017.
 */
public class Valtech_Home_Page_Steps extends ParentScenario {


    @Given("I am on Valtech website")
    public void navigate_To_Base_Site(){
        String url = "https://www.valtech.co.uk";
        launch_URL(url);
    }

    @And("I can see Latest News section")
    public void verify_Latest_News_Section(){
      obj_home_Page.verify_latest_news_Section();
    }


    @When("I navigate to \"(.*)\" page via top navigation menu")
    public void navigate_To_Module_Page(String strModulePage){
        obj_home_Page.navigate_through_top_navigateion(strModulePage);
    }

    @Then("I should be able to see \"(.*)\" page")
    public void verify_Displayed_Page(String strModulePage){
         obj_home_Page.verify_H1_tag(strModulePage);
    }

    @When("I navigate to contacts page")
    public void navigate_to_contact_page(){
         obj_home_Page.navigate_to_contacts_page();
    }

    @Then("I should see all offices over the world")
    public void verify_all_offices_displayed(){
        obj_contact_page.verify_list_of_offices_displayed();
    }
}
