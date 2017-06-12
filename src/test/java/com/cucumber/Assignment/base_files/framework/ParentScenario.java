package com.cucumber.Assignment.base_files.framework;

import com.cucumber.Assignment.base_files.page_objects.Amazon_Search_Result_Page;
import com.cucumber.Assignment.base_files.page_objects.Amazon_home_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by shirkandea on 29/03/2017.
 */
public class ParentScenario {


  private static WebDriver driver;
  protected static Amazon_home_page objAmazon_Home_Page;
  protected static Amazon_Search_Result_Page objAmazon_Result_Page;


  public void before_Setup(){

    driver = new ChromeDriver();
    objAmazon_Home_Page = new Amazon_home_page(driver);
    objAmazon_Result_Page = new Amazon_Search_Result_Page(driver);
  }

  public void after_Setup(){
    driver.quit();
  }

  public void launch_URL(String url){

    System.out.println("In launch url setup"+driver);
    driver.get(url);
  }


}
