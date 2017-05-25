package com.cucumber.Assignment.base_files.page_objects;

import com.cucumber.Assignment.base_files.framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by shirkandea on 25/05/2017.
 */
public class Google_Home_Page extends ParentPage {

    WebDriver driver;
    By input_Search = By.xpath("//input[@id='lst-ib']");


    public Google_Home_Page(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void Search_Google(String strProduct){
        enterText(input_Search, strProduct);
    }

}
