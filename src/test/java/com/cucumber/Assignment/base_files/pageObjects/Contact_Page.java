package com.cucumber.Assignment.base_files.pageObjects;

import com.cucumber.Assignment.base_files.framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Created by shirkandea on 06/06/2017.
 */
public class Contact_Page extends ParentPage {

    WebDriver driver;

    By contact_city = By.xpath("//ul[@class='contactcities']/li");

    public Contact_Page(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verify_list_of_offices_displayed(){

        boolean result = false;

        List<WebElement> list_contact_city = get_Element_List(contact_city);

        System.out.println("Total number of offices are "+ list_contact_city.size());

        if (list_contact_city.size() > 0){
            result = true;
        }

        Assert.assertEquals(true, result, "None of offices displayed on contact page");
    }
}
