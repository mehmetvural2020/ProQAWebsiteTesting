package proqa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"proqa.stepDef"},
              // Glue path must start after java folder. (after this -> src/test/java)
                features = "src/test/resources/features/",
                dryRun = false,
//              strict = false,
                tags = "@mainMenu",
                plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"})
public class Runner {

}

