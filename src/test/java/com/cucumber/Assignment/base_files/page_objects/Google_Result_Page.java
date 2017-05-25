package com.cucumber.Assignment.base_files.page_objects;

import com.cucumber.Assignment.base_files.framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Created by shirkandea on 25/05/2017.
 */
public class Google_Result_Page extends ParentPage {


    WebDriver driver;

    By result_List_Item = By.xpath("//div[@id='rso']//div[@class='g']//cite[@class='_Rm']");
   // By result_List_Item_Url = By.xpath("//cite[@class='_Rm']");

    public Google_Result_Page(WebDriver driver){
        super(driver);
        this.driver = driver;
    }




    public void Select_Result_Item(String strSubUrl){

        String temp ="";
        boolean searchResult = false;

        List<WebElement> list_Result = get_Element_List(result_List_Item);

        for (int i =0; i< list_Result.size(); i++){

            temp = list_Result.get(i).getText();

            System.out.println(temp);

            if (temp.toLowerCase().contains(strSubUrl.toLowerCase())){
                searchResult = true;
                driver.get(temp);
                break;
            }
        }

        Assert.assertEquals(searchResult, true, "Result item not found with provided sub url");



    }
}
