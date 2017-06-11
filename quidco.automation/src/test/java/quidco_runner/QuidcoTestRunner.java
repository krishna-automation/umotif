package quidco_runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//HTML report of the scenarios executed is generated under the folder quidco-htmlreport
@RunWith(Cucumber.class)
@CucumberOptions( features="features_quidco" ,  glue= {"quidco_stepdef"}, 
                  plugin = {"pretty", "html:quidco-htmlreport","json:quidco_json_report/cucumber-report.json"})


public class QuidcoTestRunner {
	
}
