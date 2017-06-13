package com.cucumber.Assignment.base_files.page_objects;

import com.cucumber.Assignment.base_files.framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by shirkandea on 10/06/2017.
 */
public class Search_Result_List extends ParentPage {

    WebDriver driver;
    By search_result_product = By.xpath("//ul[@id='s-results-list-atf']/li");
    By product_title_link = By.xpath(".//div[contains(@class, 'a-spacing-none')]/a[contains(@class, 's-access-detail-page')]");
    By product_price = By.xpath(".//div[contains(@class, 'a-column')]//div[1]//a/span[contains(@class, 'a-color-price')]");
  //  By product_link  = By.xpath(".//div[contains(@class, 'a-spacing-mini')]/div[contains(@class, 'a-spacing-none')]/a[contains(@class, 's-access-detail-page')]");

    public Search_Result_List(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    public ArrayList<Search_Result_List_Item> Sort_Product_List(ArrayList<Search_Result_List_Item> list_temp_Product,String strCriterion, String strOrder){

        switch (strCriterion.toLowerCase()){

            case "price":

                if (strOrder.equalsIgnoreCase("ascending")){

                    Collections.sort(list_temp_Product, Search_Result_List_Item.proPrice_Ascending);

                }else if(strOrder.equalsIgnoreCase("descending")){

                    Collections.sort(list_temp_Product, Search_Result_List_Item.proPrice_Descending);
                }
                break;

            default:
        }

        return  list_temp_Product;
    }


    public void Verify_Sorting_Order(String strSortCriterion){

        ArrayList<Search_Result_List_Item> tempDisplayedList = Fetch_Product_List();
        ArrayList<Search_Result_List_Item> expectedList;

        switch (strSortCriterion.toLowerCase()){

            case "Price: High to Low":
                expectedList = Sort_Product_List(tempDisplayedList,"price", "descending");
                break;

            case "Price: Low to High":
                expectedList = Sort_Product_List(tempDisplayedList,"price", "ascending");
                break;

            default:
                expectedList = Sort_Product_List(tempDisplayedList,"price", "ascending");

        }

        compare_ArrayList(tempDisplayedList, expectedList);
    }


    public ArrayList<Search_Result_List_Item> Fetch_Product_List(){

        wait_Specific_Seconds(5000);
        String tempTitle;
        String tempPrice;

        ArrayList<Search_Result_List_Item> list_Product = new ArrayList<Search_Result_List_Item>();

        List<WebElement> list_Search_Result = get_Element_List(search_result_product);

        for (WebElement we:list_Search_Result){
            if(we.getText().contains("Shop by Category")==false) {

                tempTitle = we.findElement(product_title_link).getText();
                tempPrice = we.findElement(product_price).getText();
                tempPrice = tempPrice.replace("£", "");
                list_Product.add(new Search_Result_List_Item(driver, tempTitle, tempPrice));
            }
        }

        return  list_Product;
    }



    public void compare_ArrayList(ArrayList<Search_Result_List_Item> arrActual, ArrayList<Search_Result_List_Item> arrExpected){

        boolean result = true;

        if (arrActual.isEmpty()|| arrExpected.isEmpty() ){

            Assert.assertEquals(true, false, "Both or any one arraylist is empty");
        }

        for (int i=0; i<arrActual.size(); i++ ){

            if (!arrActual.get(i).equals(arrExpected.get(i))){

                result = false;
                break;
            }
        }

        Assert.assertEquals(true, result, "Both array list are matching.");

    }

    public void select_product_item(Integer intIndex){

        Integer i =0;

        wait_Specific_Seconds(5000);

        List<WebElement> list_Search_Result = get_Element_List(search_result_product);

        WebElement objProduct = list_Search_Result.get(intIndex).findElement(product_title_link);

        click(list_Search_Result.get(intIndex).findElement(product_title_link));

    /*    for (WebElement we: list_Search_Result){
            if (i==intIndex){
                click(we.findElement(product_title_link));
               // click(we);
                break;
            }
            i++;
        }*/

    }

    public void verify_price_displayed_for_products(){

        String tempPrice = "";

        List<WebElement> list_Search_Result = get_Element_List(search_result_product);

        for (int i =0; i < 5; i++){

             tempPrice = list_Search_Result.get(i).findElement(product_price).getText();

             Assert.assertEquals(false, tempPrice.isEmpty(), "Price not diaplyed");

        }
    }
}
