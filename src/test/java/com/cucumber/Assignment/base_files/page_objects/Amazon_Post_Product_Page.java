package com.cucumber.Assignment.base_files.page_objects;

import com.cucumber.Assignment.base_files.framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by shirkandea on 12/06/2017.
 */
public class Amazon_Post_Product_Page extends ParentPage {

    By confirmation_message = By.xpath("//div[@id='huc-v2-order-row-confirm-text']");

    public Amazon_Post_Product_Page(WebDriver driver){
        super(driver);
    }

    public void verify_item_added_to_basket_message(){

        verify_Element_displayed(confirmation_message);

        String strExpected = "Added to Basket";

        String strActual = get_Element_Text(confirmation_message);

        Assert.assertEquals(strExpected, strActual, "Item added to basket confirmation message not displayed correctly");
    }
}
