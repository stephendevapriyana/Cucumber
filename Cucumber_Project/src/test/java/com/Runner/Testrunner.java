package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\VEERASURIYA\\Downloads\\Softwar testing\\Cucumber_Project\\Featurefile\\more.feature",
glue="com.stepdefination",tags=("@multiple"))

//monochrome=true,strict=true,tags=("@select"))
public class Testrunner {
	

}

