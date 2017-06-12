package com.cucumber.Assignment.base_files.page_objects;

import com.cucumber.Assignment.base_files.framework.ParentPage;
import org.openqa.selenium.WebDriver;

import java.math.BigDecimal;
import java.util.Comparator;

/**
 * Created by shirkandea on 10/06/2017.
 */
public class Search_Result_List_Item extends ParentPage {

    WebDriver driver;

    String product_title;
    BigDecimal product_price;

    public Search_Result_List_Item(WebDriver driver, String product_title,String product_price){
        super(driver);
        this.driver = driver;
        this.product_title = product_title;
        this.product_price = new BigDecimal(product_price);
    }

    public String get_product_title(){
        return product_title;
    }

    public void set_product_title(String strTitle){
        product_title = strTitle;
    }

    public BigDecimal get_product_price(){
        return product_price;
    }

    public void set_Product_price(String strPrice){
        product_price = new BigDecimal(strPrice);
    }


    public static Comparator<Search_Result_List_Item> proPrice_Ascending= new Comparator<Search_Result_List_Item>() {
        @Override
        public int compare(Search_Result_List_Item o1, Search_Result_List_Item o2) {

            BigDecimal price_one = o1.get_product_price();
            BigDecimal price_two = o2.get_product_price();

            return price_one.compareTo(price_two);
        }
    };

    public static Comparator<Search_Result_List_Item> proPrice_Descending= new Comparator<Search_Result_List_Item>() {
        @Override
        public int compare(Search_Result_List_Item o1, Search_Result_List_Item o2) {

            BigDecimal price_one = o1.get_product_price();
            BigDecimal price_two = o2.get_product_price();

            return price_two.compareTo(price_one);
        }
    };
}
