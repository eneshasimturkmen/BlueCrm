package com.bluecrm.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */

import com.bluecrm.utilities.BrowserUtils;
import com.bluecrm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After
    public void teardownScenerio(Scenario scenario){

      if (scenario.isFailed()) {

          byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
          scenario.attach(screenshot, "image/png", scenario.getName());

      }

        BrowserUtils.sleep(1);
        Driver.closeDriver();

        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/ Take screenshot if failed!");
    }


}
