package com.cucumber.Assignment.base_files.glue;

import com.cucumber.Assignment.base_files.framework.ParentScenario;
import cucumber.api.java.en.And;

/**
 * Created by shirkandea on 12/06/2017.
 */
public class Amazon_Product_Page extends ParentScenario {

    @And("Item should be added to basket properly")
    public void verify_product_added_to_basket(){
      obj_Amazon_Post_Product_Page.verify_item_added_to_basket_message();
    }

    @And("I add cheapest item in basket")
    public void add_cheapest_item_to_basket(){
        String strCriterion = "Price: Low to High";
        objAmazon_Result_Page.sort_result_list(strCriterion);
        objAmazon_Result_Page.select_product(1);
        objAmazon_Product_Page.add_product_to_basket();
    }
}
