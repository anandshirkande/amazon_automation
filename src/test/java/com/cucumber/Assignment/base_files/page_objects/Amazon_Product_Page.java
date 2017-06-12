package com.cucumber.Assignment.base_files.page_objects;

import com.cucumber.Assignment.base_files.framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by shirkandea on 12/06/2017.
 */
public class Amazon_Product_Page extends ParentPage {


    By add_to_basket = By.xpath("//input[@id='add-to-cart-button']");


    public Amazon_Product_Page(WebDriver driver){
        super(driver);
    }


    public void add_product_to_basket(){
        wait_explicit_till_element_Displayed(add_to_basket);
        click(add_to_basket);
    }

}
