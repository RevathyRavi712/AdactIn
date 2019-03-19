package org.maven.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.maven.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
features ="src\\test\\java\\org\\maven\\feature\\",
tags= {"@TC14"},
glue="org.maven.stepdefinition",
dryRun=false,
monochrome=true
)



public class AdactinTestRunner {
	
	public static WebDriver driver;
	@BeforeClass
	
	public static void setUp() throws Exception {
driver=BaseClass.browerLaunch("chrome");
	}
	
	@AfterClass
	
public static void browserQuit() {
driver.quit();
}
	
	

}
