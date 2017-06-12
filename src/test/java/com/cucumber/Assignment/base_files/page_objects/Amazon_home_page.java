package com.cucumber.Assignment.base_files.page_objects;

import com.cucumber.Assignment.base_files.framework.ParentPage;
import com.cucumber.Assignment.base_files.framework.ParentScenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by shirkandea on 10/06/2017.
 */
public class Amazon_home_page extends ParentPage {

    WebDriver driver;

    By search_box = By.xpath("//input[@id='twotabsearchtextbox']");
    By search_button = By.xpath("//input[@class='nav-input' and @value = 'Go']");

    public Amazon_home_page(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    public void search_product(String strProduct){
        wait_explicit_till_element_Displayed(search_box);
        enterText(search_box, strProduct);
    }


}
