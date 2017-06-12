package com.cucumber.Assignment.base_files.glue;

import com.cucumber.Assignment.base_files.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

/**
 * Created by shirkandea on 10/06/2017.
 */
public class Amazon_Search_Result_Page extends ParentScenario {


    @And("I sort list based on \"(.*)\"")
    public void sort_result_list(String strCriterion){
        objAmazon_Result_Page.sort_result_list(strCriterion);
    }

    @Then("list should be sorted based on \"(.*)\"")
    public void verify_sorting_of_list(String strCriterion){
        objAmazon_Result_Page.verify_sorting_of_result_list(strCriterion);
    }
}
