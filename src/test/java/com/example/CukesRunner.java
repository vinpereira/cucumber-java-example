package com.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by vinicius on 26/05/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"})
public class CukesRunner {
}
