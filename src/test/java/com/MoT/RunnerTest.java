package com.MoT;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by user on 18/03/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/MoT")
public class RunnerTest {
}
