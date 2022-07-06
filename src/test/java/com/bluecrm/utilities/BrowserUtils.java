package com.bluecrm.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    /*
       This method will accept int (in seconds) and execute Thread.sleep
       for given duration
        */
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }

    }

    /**
     * This method will accept a dropdown as a WebElement
     * and return all the options' text in a List of String.
     * @param dropdownElement
     * @return List<String> actualOptionsAsString
     */

    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){

        Select select = new Select(dropdownElement);
        //create a list of string and pass all of the actual web element options string into that new list
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        //List of all ACTUAL month <options> as a String
        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }

        return actualOptionsAsString;

    }


    /*
   This method accepts 3 arguments.
   Arg1: webdriver
   Arg2: expectedInUrl : for verify if the url contains given String.
       - If condition matches, will break loop.
   Arg3: expectedInTitle to be compared against actualTitle
    */
}