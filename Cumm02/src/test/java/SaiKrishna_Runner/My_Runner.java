package SaiKrishna_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber .class)
@CucumberOptions(features="MyDemo2ddc22Feature",glue="DDC2_Step_Def",tags= {"@Regression,@smoke"},
plugin={"html:target/cucumber-htmlreport.html"})
public class My_Runner {
	


}
