package com.cucumber.Assignment.base_files.page_objects;

import com.cucumber.Assignment.base_files.framework.ParentPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by shirkandea on 10/06/2017.
 */
public class Amazon_Search_Result_Page extends ParentPage {

    WebDriver driver;

    Sort_Panel obj_Sort_Panel;
    Search_Result_List obj_Search_Result_List;

    public Amazon_Search_Result_Page(WebDriver driver){
        super(driver);
        this.driver = driver;
        obj_Sort_Panel = new Sort_Panel(driver);
        obj_Search_Result_List = new Search_Result_List(driver);
    }

    public void sort_result_list(String strCriterion){
        obj_Sort_Panel.select_sorting_criterion(strCriterion);
    }

    public void verify_sorting_of_result_list(String strCriterion){
        obj_Search_Result_List.Verify_Sorting_Order(strCriterion);
    }

    public void select_product(Integer intIndex){
      obj_Search_Result_List.select_product_item(intIndex);
    }

    public void verify_price_displayed_for_products(){
        obj_Search_Result_List.verify_price_displayed_for_products();
    }
}
