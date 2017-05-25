package com.cucumber.Assignment.base_files.framework;

import com.cucumber.Assignment.base_files.page_objects.Google_Home_Page;
import com.cucumber.Assignment.base_files.page_objects.Google_Result_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by shirkandea on 29/03/2017.
 */
public class ParentScenario {


  private static WebDriver driver;

  protected static Google_Home_Page objGoogle_Home_Page;
  protected  static Google_Result_Page objGoogle_Result_Page;

  public void Before_Setup(){

    driver = new ChromeDriver();
    objGoogle_Home_Page = new Google_Home_Page(driver);
    objGoogle_Result_Page = new Google_Result_Page(driver);

  }

  public void After_Setup(){
    //driver.quit();
  }

  public void Launch_URL(String url){

    System.out.println("In launch url setup"+driver);
    driver.get(url);
  }


}
