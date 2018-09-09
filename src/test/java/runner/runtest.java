package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/test/java/Feature/CreateLead.feature",
                 glue = {"steps","pages"},
                 monochrome=true,
                 snippets =SnippetType.CAMELCASE)
@RunWith(Cucumber.class)                 
                 
public class runtest {

}
