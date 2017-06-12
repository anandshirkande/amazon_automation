package com.cucumber.Assignment.base_files.page_objects;

import com.cucumber.Assignment.base_files.framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;

import java.util.List;

/**
 * Created by shirkandea on 10/06/2017.
 */
public class Sort_Panel extends ParentPage {

    WebDriver driver;

    By sort_dropdown = By.xpath("//select[@id='sort']");


    public Sort_Panel(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    public void select_sorting_criterion(String strCriterion){

        boolean result = false;

        wait_explicit_till_element_Displayed(sort_dropdown);

        Select objSelect = new Select(getElement(sort_dropdown));

        List<WebElement> list_sorting_Criterion = objSelect.getOptions();

        for (int i=0; i< list_sorting_Criterion.size(); i++){

            if (strCriterion.equalsIgnoreCase(list_sorting_Criterion.get(i).getText())){
                strCriterion = list_sorting_Criterion.get(i).getText();
                result = true;
                break;
            }
        }


        if (result) {
            objSelect.selectByVisibleText(strCriterion);
        }

        Assert.assertEquals(true, result, "Required sorting criterion not found.");

    }
}
