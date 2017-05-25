package com.cucumber.MatchesFashion.base_files.framework;

import com.cucumber.MatchesFashion.base_files.page_objects.Home_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by shirkandea on 29/03/2017.
 */
public class ParentScenario {


  private WebDriver driver;
  protected static Home_Page obj_Home_Page;

  public void Before_Setup(){

    driver = new ChromeDriver();
    obj_Home_Page= new Home_Page(driver);

  }

  public void After_Setup(){
    driver.quit();
    obj_Home_Page=null;
  }

  public void Launch_URL(String url){

    driver.get(url);
  }


}
