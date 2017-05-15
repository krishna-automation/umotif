package mergermarket_testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//HTML report of the scenarios executed is generated under the folder mergermarket-htmlreport

@RunWith(Cucumber.class)
@CucumberOptions( features="features_mergermarket" ,  glue= {"mergermarket_stepdef"} , tags={"@Chrome"}, // tags={"@Firefox"},
                  plugin = {"pretty", "html:mergermarket-htmlreport","json:mergermarket_json_report/cucumber-report.json"})


public class MergerMarketTestRunner {
	
}



