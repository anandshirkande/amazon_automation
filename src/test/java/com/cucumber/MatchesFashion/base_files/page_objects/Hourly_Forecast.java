package com.cucumber.MatchesFashion.base_files.page_objects;

import com.cucumber.MatchesFashion.base_files.framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by shirkandea on 29/03/2017.
 */
public class Hourly_Forecast extends ParentPage {

    String strDayNumber;
    String strChildNumber;
    String strHourDataSet;
    String strDescription;
    String strmaxTemp;
    String strminTemp;
    String strSpeed;
    String strDirection;
    String strRainfall;
    String strPressure;


    By hour ;
    By aria_condition  ;
    By max_temp  ;
    By min_temp  ;
    By speed  ;
    By direction  ;
    By rainfall  ;
    By pressure  ;

    public Hourly_Forecast(WebDriver driver, String DayNumber, String ChildNumber){

        super(driver);

        strDayNumber = DayNumber.toLowerCase();
        strChildNumber = ChildNumber.toLowerCase();
        Properties configProp = new Properties();
        try {
           // InputStream in = new FileInputStream("/Users/shirkandea/Anand_Workspace/src/test/Resources/data_set.properties");

            InputStream in = this.getClass().getClassLoader().getResourceAsStream("data_set.properties");
            configProp.load(in);
             strHourDataSet = configProp.getProperty("row_"+strDayNumber+"_hour_child_"+strChildNumber);
             strDescription = configProp.getProperty("row_"+strDayNumber+"_description_child_"+strChildNumber);
             strmaxTemp = configProp.getProperty("row_"+strDayNumber+"_max_temp_child_"+strChildNumber);
             strminTemp = configProp.getProperty("row_"+strDayNumber+"_min_temp_child_"+strChildNumber);
             strSpeed = configProp.getProperty("row_"+strDayNumber+"_speed_child_"+strChildNumber);
             strDirection = configProp.getProperty("row_"+strDayNumber+"_direction_child_"+strChildNumber);
             strRainfall = configProp.getProperty("row_"+strDayNumber+"_rainfall_child_"+strChildNumber);
             strPressure = configProp.getProperty("row_"+strDayNumber+"_pressure_child_"+strChildNumber);

        }catch(Exception e){

            e.printStackTrace();
        }

         hour = By.xpath("//span[@class='hour' and @data-test='"+strHourDataSet+"']");
         aria_condition = By.xpath("//*[@class='icon' and @data-test='"+strDescription+"']");
         max_temp = By.xpath("//span[contains(@class,'max') and @data-test='"+strmaxTemp+"']");
         min_temp = By.xpath("//span[contains(@class,'min') and @data-test='"+strminTemp+"']");
         speed = By.xpath("//span[contains(@class,'speed') and @data-test='"+strSpeed+"']");
         direction = By.xpath("//span[contains(@class,'direction') and @data-test='"+strDirection+"']");
         rainfall = By.xpath("//span[contains(@class,'rainfall') and @data-test='"+strRainfall+"']");
         pressure = By.xpath("//span[contains(@class,'pressure') and @data-test='"+strPressure+"']");

    }


    public void Verify_All_Elements_Displayed(String strDayNumber, String hourNumber){

        verify_Element_displayed(hour, "Verify hour element for day row "+strDayNumber+" and hourly report number "+hourNumber);
        verify_Element_displayed(aria_condition,"Verify Aria condition element for day row "+strDayNumber+" and hourly report number "+hourNumber);
        verify_Element_displayed(max_temp,"Verify max temp  element for day row "+strDayNumber+" and hourly report number "+hourNumber);
        verify_Element_displayed(min_temp,"Verify min temp element for day row "+strDayNumber+" and hourly report number "+hourNumber);
        verify_Element_displayed(speed,"Verify speed element for day row "+strDayNumber+" and hourly report number "+hourNumber);
        verify_Element_displayed(direction,"Verify direction element for day row "+strDayNumber+" and hourly report number "+hourNumber);
        verify_Element_displayed(rainfall,"Verify rainfall element for day row "+strDayNumber+" and hourly report number "+hourNumber);
        verify_Element_displayed(pressure,"Verify pressure element for day row "+strDayNumber+" and hourly report number "+hourNumber);

    }
}
