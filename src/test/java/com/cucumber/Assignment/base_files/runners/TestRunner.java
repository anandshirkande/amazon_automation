package com.cucumber.Assignment.base_files.runners;


import com.cucumber.listener.ExtentCucumberFormatter;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.NetworkMode;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;


@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.cucumber.Assignment.base_files.glue",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
        tags = "@runSmoke"
)
public class TestRunner  extends AbstractTestNGCucumberTests{

    @BeforeClass
    public static void setup() {

        String reportDir="target/Automation_Reports/";
        File reportFolder = new File(reportDir);
        reportFolder.mkdir();

        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();

        String reportFile=s+"/"+reportDir+"Automation_Report.html";
        ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File (reportFile), true, DisplayOrder.OLDEST_FIRST, NetworkMode.ONLINE);

        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));


    }

}
