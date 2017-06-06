package com.cucumber.Assignment.base_files.glue;

import com.cucumber.Assignment.base_files.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Created by shirkandea on 25/05/2017.
 */
public class Buy_Product extends ParentScenario {

    @Given("I am on google website")
    public void launch_Google(){
        String strUrl = "https://www.google.co.uk/";
        System.out.println("ssss"+ strUrl);
        launch_URL(strUrl);
    }

    @And("I search for product as \"(.*)\"")
    public void search_Product(String strProduct){
        objGoogle_Home_Page.Search_Google(strProduct);
    }

   @When("I select first result from vendor \"(.*)\"")
    public void Select_Search_Result_Item(String strVendor){
       objGoogle_Result_Page.Select_Result_Item(strVendor);
   }

   @And("I should be navigated to vendor's website as \"(.*)\"")
    public void Verify_Vendor_Site(String strVendorSite){

   }

   @And("I should be able to fetch product details with filter criterion as \"(.*)\" and Value as \"(.*)\"")
    public void Fetch_Product_Details(String strCriterion, String strValue){
       float temp = Float.valueOf(strValue);
       obj_Amazon_Result_Page.Fetch_Required_Product_Details(strCriterion, temp);
   }
}
