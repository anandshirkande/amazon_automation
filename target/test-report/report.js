$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Verify_Default_Values.feature");
formatter.feature({
  "line": 1,
  "name": "To verify default screen /home screen for weather forecast report application.",
  "description": "",
  "id": "to-verify-default-screen-/home-screen-for-weather-forecast-report-application.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify headline and number of columns",
  "description": "",
  "id": "to-verify-default-screen-/home-screen-for-weather-forecast-report-application.;verify-headline-and-number-of-columns",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I have entered the city as \"\u003cCity\u003e\" to know weather forecast report",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I see weather forecast report",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see headline with city name as \"\u003cCity\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "to-verify-default-screen-/home-screen-for-weather-forecast-report-application.;verify-headline-and-number-of-columns;",
  "rows": [
    {
      "cells": [
        "City"
      ],
      "line": 10,
      "id": "to-verify-default-screen-/home-screen-for-weather-forecast-report-application.;verify-headline-and-number-of-columns;;1"
    },
    {
      "cells": [
        "Glasgow"
      ],
      "line": 11,
      "id": "to-verify-default-screen-/home-screen-for-weather-forecast-report-application.;verify-headline-and-number-of-columns;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2523317555,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify headline and number of columns",
  "description": "",
  "id": "to-verify-default-screen-/home-screen-for-weather-forecast-report-application.;verify-headline-and-number-of-columns;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I have entered the city as \"Glasgow\" to know weather forecast report",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I see weather forecast report",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see headline with city name as \"Glasgow\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Glasgow",
      "offset": 28
    }
  ],
  "location": "Base_Step_Definition.Fetch_Weather_Forcast_For_City(String)"
});
formatter.result({
  "duration": 1673154957,
  "status": "passed"
});
formatter.match({
  "location": "Base_Step_Definition.Verify_Home_Page()"
});
formatter.result({
  "duration": 42183641,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Glasgow",
      "offset": 52
    }
  ],
  "location": "Verify_Default_Values.Verify_Headline(String)"
});
formatter.result({
  "duration": 198956793,
  "status": "passed"
});
formatter.after({
  "duration": 135403062,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Verify dates and day",
  "description": "",
  "id": "to-verify-default-screen-/home-screen-for-weather-forecast-report-application.;verify-dates-and-day",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "I have entered the city as \"\u003cCity\u003e\" to know weather forecast report",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I see weather forecast report",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I should be able to see five dates starting from current date",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Each date should be mapped with correct day",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "to-verify-default-screen-/home-screen-for-weather-forecast-report-application.;verify-dates-and-day;",
  "rows": [
    {
      "cells": [
        "City"
      ],
      "line": 23,
      "id": "to-verify-default-screen-/home-screen-for-weather-forecast-report-application.;verify-dates-and-day;;1"
    },
    {
      "cells": [
        "Glasgow"
      ],
      "line": 24,
      "id": "to-verify-default-screen-/home-screen-for-weather-forecast-report-application.;verify-dates-and-day;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1116789108,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Verify dates and day",
  "description": "",
  "id": "to-verify-default-screen-/home-screen-for-weather-forecast-report-application.;verify-dates-and-day;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "I have entered the city as \"Glasgow\" to know weather forecast report",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I see weather forecast report",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I should be able to see five dates starting from current date",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Each date should be mapped with correct day",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Glasgow",
      "offset": 28
    }
  ],
  "location": "Base_Step_Definition.Fetch_Weather_Forcast_For_City(String)"
});
formatter.result({
  "duration": 1448590028,
  "status": "passed"
});
formatter.match({
  "location": "Base_Step_Definition.Verify_Home_Page()"
});
formatter.result({
  "duration": 31095216,
  "status": "passed"
});
formatter.match({
  "location": "Verify_Default_Values.Verify_Dates()"
});
formatter.result({
  "duration": 219928111,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\t Date does not match in first row expected [31] but found [20],\n\t Date does not match in second row expected [1] but found [21],\n\t Date does not match in third row expected [2] but found [22],\n\t Date does not match in fourth row expected [3] but found [23],\n\t Date does not match in fifth row expected [4] but found [24]\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\n\tat com.cucumber.BuildIT.base_files.page_objects.Home_Page.Verify_Dates(Home_Page.java:92)\n\tat com.cucumber.BuildIT.base_files.glue.Verify_Default_Values.Verify_Dates(Verify_Default_Values.java:19)\n\tat ✽.Then I should be able to see five dates starting from current date(Verify_Default_Values.feature:19)\n",
  "status": "failed"
});
formatter.match({
  "location": "Verify_Default_Values.Verify_Day()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 78280445,
  "status": "passed"
});
formatter.uri("Verify_Weather_Forecast_Report.feature");
formatter.feature({
  "line": 1,
  "name": "To verify different functionalities /features in report",
  "description": "",
  "id": "to-verify-different-functionalities-/features-in-report",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify user can see five day weather forecast report. Verify all fields displayed.",
  "description": "",
  "id": "to-verify-different-functionalities-/features-in-report;verify-user-can-see-five-day-weather-forecast-report.-verify-all-fields-displayed.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I have entered the city as \"\u003cCity\u003e\" to know weather forecast report",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I see weather forecast report",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should be able to see all fields for five days",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "to-verify-different-functionalities-/features-in-report;verify-user-can-see-five-day-weather-forecast-report.-verify-all-fields-displayed.;",
  "rows": [
    {
      "cells": [
        "City"
      ],
      "line": 12,
      "id": "to-verify-different-functionalities-/features-in-report;verify-user-can-see-five-day-weather-forecast-report.-verify-all-fields-displayed.;;1"
    },
    {
      "cells": [
        "Glasgow"
      ],
      "line": 13,
      "id": "to-verify-different-functionalities-/features-in-report;verify-user-can-see-five-day-weather-forecast-report.-verify-all-fields-displayed.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1299633882,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify user can see five day weather forecast report. Verify all fields displayed.",
  "description": "",
  "id": "to-verify-different-functionalities-/features-in-report;verify-user-can-see-five-day-weather-forecast-report.-verify-all-fields-displayed.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I have entered the city as \"Glasgow\" to know weather forecast report",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I see weather forecast report",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should be able to see all fields for five days",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Glasgow",
      "offset": 28
    }
  ],
  "location": "Base_Step_Definition.Fetch_Weather_Forcast_For_City(String)"
});
