package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\NAVYA\\eclipse-workspace\\com.qa.bddframework\\src\\main\\java\\Features\\login.feature",//the path of the feature files
		glue= {"StepDefinations"},//the path of the step definition files
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},//to generate different types of reporting
		dryRun=false, //to check the mapping is proper between feature file and step definition file
		monochrome=true,//display the console output in a proper readable format
		strict=true//it will check if any step is not defined in step definition file
		//tags= {"@End2End" , "~@SmokeTest"}
		)

public class TestRunner {

}

//or operator = {"@End2End , @SmokeTest"}
//AND operator= {"@End2End" , "@SmokeTest"}
//ignore the tags = "~"


