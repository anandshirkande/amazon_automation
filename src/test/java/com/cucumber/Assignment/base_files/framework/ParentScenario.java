package com.cucumber.Assignment.base_files.framework;

import com.cucumber.Assignment.base_files.glue.Valtech_Home_Page_Steps;
import com.cucumber.Assignment.base_files.pageObjects.Contact_Page;
import com.cucumber.Assignment.base_files.pageObjects.Home_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by shirkandea on 29/03/2017.
 */
public class ParentScenario {


  private static WebDriver driver;
  protected  static Home_Page obj_home_Page;
  protected  static Contact_Page obj_contact_page;

  public void before_Setup(){

    driver = new ChromeDriver();
    obj_home_Page = new Home_Page(driver);
    obj_contact_page = new Contact_Page(driver);

  }

  public void after_Setup(){
    driver.quit();
  }

  public void launch_URL(String url){

    System.out.println("In launch url setup"+driver);
    driver.get(url);
  }


}
