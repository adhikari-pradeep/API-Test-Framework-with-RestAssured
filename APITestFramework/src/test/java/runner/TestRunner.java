package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = {"steps"},
        plugin = {"json:target/Result.json",
                "rerun:target/failedTest.txt"},
        monochrome = true
)

public class TestRunner {

}
