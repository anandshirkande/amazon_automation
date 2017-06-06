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
public class Home_Page extends ParentPage {

    WebDriver driver;
    String strMenu="";

    By menu_icon = By.xpath("//span[@id='menu-toggle-button']//span[@class='hamburger__front']//i[contains(@class, 'icons')]");
    By menu_item = By.xpath("//li[@class='navigation__menu__item']");
    By h1_tag = By.xpath("//h1");
    By section_recent_study = By.xpath("//section[@class='startpage__bloglisting']");


    public Home_Page(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void navigate_through_top_navigateion(String strExpectedMenu){

        strMenu=strExpectedMenu;
        wait_explicit_till_element_Displayed(menu_icon);
        click(menu_icon);

        List<WebElement> listMenu = get_Element_List(menu_item);

        for (int i=0; i<listMenu.size(); i++){
            if (strExpectedMenu.trim().equalsIgnoreCase(listMenu.get(i).getText().trim())){
                listMenu.get(i).click();
                break;
            }
        }

    }

    public void verify_latest_news_Section(){
      wait_explicit_till_element_Displayed(section_recent_study);
      verify_Element_displayed(section_recent_study);
    }

    public void verify_H1_tag(String strModulePage){

        String strTag ="";

        switch (strModulePage){

            case "About":
                strTag = "About";
                break;

            case "Services":
                strTag ="Services";
                break;

            case "Work":
                strTag ="Work";
                break;

            default:

        }

        Assert.assertEquals( strTag.trim(), get_Element_Text(h1_tag),"H1 Tag mismatched");



    }
}
