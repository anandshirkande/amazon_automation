package com.cucumber.Assignment.base_files.glue;

import com.cucumber.Assignment.base_files.framework.ParentScenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by shirkandea on 29/03/2017.
 */
public class Base_Step_Definition extends ParentScenario {

    @Before
    public void BeforeScenario(){
        Before_Setup();
    }


    @After
    public void After_Scenario(){
        After_Setup();
    }

}
