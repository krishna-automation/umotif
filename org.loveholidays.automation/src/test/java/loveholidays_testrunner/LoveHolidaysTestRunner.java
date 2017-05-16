package loveholidays_testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//HTML report of the scenarios executed is generated under the folder loveholidays-htmlreport 
@RunWith(Cucumber.class)
@CucumberOptions( features="features_loveholidays"  ,  glue= {"loveholidays_stepdef"},   
                  plugin = {"pretty", "html:loveholidays-htmlreport","json:loveholidays_json_report/cucumber-report.json"})


public class LoveHolidaysTestRunner {
	
}



