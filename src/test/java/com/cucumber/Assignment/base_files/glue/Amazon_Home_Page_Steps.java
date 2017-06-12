package com.cucumber.Assignment.base_files.glue;

import com.cucumber.Assignment.base_files.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by shirkandea on 06/06/2017.
 */
public class Amazon_Home_Page_Steps extends ParentScenario {


    @Given("I am on amazon website")
    public void navigate_To_Base_Site(){
        String url = "https://www.amazon.co.uk/";
        launch_URL(url);
    }

    @And("I have searched for iPhone 7")
    public void search_product(){
        String strProduct = "iPhone 7";
        objAmazon_Home_Page.search_product(strProduct);
    }

}
