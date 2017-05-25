package com.cucumber.Assignment.base_files.page_objects;

import com.cucumber.Assignment.base_files.framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by shirkandea on 25/05/2017.
 */
public class Amazon_Result_Page extends ParentPage {

    WebDriver driver;

    By li_Result_Item = By.xpath("//ul[contains(@class, 's-result-list')]//li[contains(@class, 's-result-item')]");

    public Amazon_Result_Page(WebDriver driver){
        super(driver);
        this.driver = driver;
    }



    public void Fetch_Required_Product_Details(String strCriterion, Integer maxValue){

        List<WebElement> list_Result = get_Element_List(li_Result_Item);
        String strName = "";

        for (int i =0; i< list_Result.size(); i++){

            switch (strCriterion.toLowerCase()){

                case "price":

                    String strTempValue = list_Result.get(i).findElement(By.xpath("//span[contains(@class, 's-price')]")).getText();
                    strTempValue = strTempValue.replace("£", "");
                    Integer intValue = Integer.valueOf(strTempValue);

                    if (intValue <= maxValue){

                        strName = list_Result.get(i).findElement(By.xpath("//div[@class='a-row']//h2[contains(@class, 's-inline')]")).getText();

                        System.out.println("Name of Product is "+strName);

                        System.out.println("Price of Product is "+ strTempValue);
                    }

            }
        }

    }

}
