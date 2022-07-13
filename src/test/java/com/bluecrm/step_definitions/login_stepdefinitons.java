package com.bluecrm.step_definitions;

import com.bluecrm.pages.MessagePage;
import com.bluecrm.utilities.BrowserUtils;
import com.bluecrm.utilities.ConfigurationReader;
import com.bluecrm.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

public class login_stepdefinitons {
    MessagePage messagePage = new MessagePage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();



    @Given("User should login with correct credential")
    public void userShouldLoginWithCorrectCredential() {

            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        messagePage.usernamebox.clear();
        BrowserUtils.sleep(1);

        messagePage.usernamebox.sendKeys(ConfigurationReader.getProperty("username"));
       // Faker faker = new Faker();
       // messagePage.usernamebox.sendKeys("hr" + faker.numerify("##") + "@cybertekschool.com");


        BrowserUtils.sleep(1);
        messagePage.passwordbox.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(1);
        messagePage.loginbutton.click();

/*
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleContains("portal"));
 */

         Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));


        Assert.assertTrue(messagePage.sendmessagetext.isDisplayed());

        BrowserUtils.sleep(2);

        actions.click(messagePage.sendmessagetext).perform();

        BrowserUtils.sleep(2);

        }


    @When("User, Should be click Add Mention button.")
    public void userShouldBeClickAddMentionButton() {

        messagePage.addMentionButton.click();
        BrowserUtils.sleep(2);

    }

    @And("User should be click Emmployess and departments button")
    public void userShouldBeClickEmmployessAndDepartmentsButton() {

        messagePage.employessanddepartmentsButton.click();



    }



    @Then("User should be add deparmants employess")
    public void userShouldBeAddDeparmantsEmployess() {

        BrowserUtils.sleep(2);
        messagePage.departmentEmployees.click();
        BrowserUtils.sleep(2);






    }

    @Then("Verification The chosen departments employess should be see in")
    public void verificationTheChosenDepartmentsEmployessShouldBeSeeIn() {


        BrowserUtils.sleep(3);
        Assert.assertTrue(messagePage.selectedEmployess.isDisplayed());


        Driver.closeDriver();

    }




    @When("Users should click link button and should be able to write the {string} and {string}")
    public void usersShouldClickLinkButtonAndShouldBeAbleToWriteTheAnd(String string1, String string2) {

        BrowserUtils.sleep(2);
        messagePage.linkButton.click();
        BrowserUtils.sleep(3);
        messagePage.linktextBox.sendKeys(string1);

        BrowserUtils.sleep(2);






        BrowserUtils.sleep(2);
        messagePage.linkUrlBox.click();
        messagePage.linkUrlbox.sendKeys(string2);
        BrowserUtils.sleep(2);



    }

    @And("User,After write a link, should click save button")
    public void userAfterWriteALinkShouldClickSaveButton() {
        BrowserUtils.sleep(2);
        messagePage.saveButton.click();
    }

    @Then("Verification Users should click send button and user should be see in message")
    public void Usersshouldclicksendbuttonandusershouldbseeinmessage() {

        BrowserUtils.sleep(2);
        messagePage.sendButton.click();


        BrowserUtils.sleep(5);

        Assert.assertTrue(messagePage.linkInMessage.isDisplayed());


        Driver.closeDriver();

    }


    @When("users should click link button and should be able to write incorrect the {string} and {string}")
    public void usersShouldClickLinkButtonAndShouldBeAbleToWriteIncorrectTheAnd(String arg0, String arg1) {

        BrowserUtils.sleep(2);
        messagePage.linkButton.click();
        BrowserUtils.sleep(3);
        messagePage.linktextBox.sendKeys(arg0);
        BrowserUtils.sleep(2);
        messagePage.linkUrlBox.click();
        messagePage.linkUrlbox.sendKeys(arg1);
        BrowserUtils.sleep(2);

    }


    @Then("İf the link is not correct,User  should be take error before than click save button")
    public void ifTheLinkIsNotCorrectUserShouldBeTakeErrorBeforeThanClickSaveButton() {

        messagePage.saveButtonforVideo.click();

        BrowserUtils.sleep(3);

        Assert.assertTrue(messagePage.videoErrorMessage.isDisplayed());


        Driver.closeDriver();

    }





    @When("User should be click insert video button")
    public void userShouldBeClickInsertVideoButton() {

        messagePage.insertVideoButton.click();

    }

    @And("User should be add Youtube link {string}")
    public void userShouldBeAddYoutubeLink(String youtubelink) {

        BrowserUtils.sleep(2);
        messagePage.videoTextButton.sendKeys(youtubelink);

        Assert.assertTrue(messagePage.textBox.getText().contains(youtubelink));


    }

    @Then("User after add a video link,should be click save button,The video should be see in message")
    public void userAfterAddAVideoLinkShouldBeClickSaveButton() {


        BrowserUtils.sleep(10);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(messagePage.videoErrorMessage));
        Assert.assertTrue(messagePage.videoErrorMessage.isDisplayed());

        BrowserUtils.sleep(3);

        Driver.closeDriver();



    }


    @And("User should be add other video link {string}")
    public void userShouldBeAddOtherVideoLink(String string) {

        BrowserUtils.sleep(2);
        messagePage.videoTextButton.sendKeys(string);








    }


    @Then("İf the link is not about youtube or vimeo,User  should be take error before than click save button")
    public void ifTheLinkIsNotAboutYoutubeOrVimeoUserShouldBeTakeErrorBeforeThanClickSaveButton() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(messagePage.videoErrorMessage.isDisplayed());


        Driver.closeDriver();

    }


    @And("User should be add Vimeo link {string}")
    public void userShouldBeAddVimeoLink(String arg0) {


        BrowserUtils.sleep(2);
        messagePage.videoTextButton.sendKeys(arg0+faker.numerify("##"));

        BrowserUtils.sleep(15);



    }

    @And("User should be click Quote text button")
    public void userShouldBeClickQuoteTextButton() {

        messagePage.quoteButton.click();

        BrowserUtils.sleep(2);


    }

    @And("User should be see Quote box after the click")
    public void userShouldBeSeeQuoteBoxAfterTheClick() {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        Assert.assertTrue(messagePage.quoteInTextBox.isDisplayed());

        BrowserUtils.sleep(3);

        Driver.getDriver().switchTo().parentFrame();
    }


    @Then("Verification User should be see Quote box after the click")
    public void userShouldBeSeeYellowBoxAfterTheClick() {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        Assert.assertTrue(messagePage.quoteInTextBox.isDisplayed());

        BrowserUtils.sleep(3);

        Driver.getDriver().switchTo().parentFrame();


    }

    @Then("User should be able add link in Quote box and than click send button")
    public void userShouldBeAbleAddLinkInQuoteBoxAndThanClickSendButton() {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        messagePage.quoteInTextBox.sendKeys("https://github.com/devdeals/devdeals.org/blob/main/README.md?gclid=EAIaIQobChMI1raE-_fV-AIVmLp3Ch0qCgM7EAAYAyAAEgIxk_D_BwE"+faker.numerify("##"));

        Driver.getDriver().switchTo().parentFrame();

        BrowserUtils.sleep(3);

        messagePage.sendButton.click();

        BrowserUtils.sleep(3);






    }



    @Then("Verification User should be see link in message")
    public void verificationUserShouldBeSeeLinkInMessage() {


        BrowserUtils.sleep(3);

        Assert.assertTrue(messagePage.linkInMessage.isDisplayed());

        Driver.closeDriver();
    }


    @And("The user should delete the quote one quote")
    public void theUserShouldDeleteTheQuoteOneQuote() {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        BrowserUtils.sleep(2);


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(messagePage.textBox));

        messagePage.textBox.click();

        messagePage.textBox.sendKeys(Keys.ARROW_DOWN);

        messagePage.textBox.sendKeys(Keys.DELETE);



        BrowserUtils.sleep(2);




    }



     




        @And("User should be click Add tag button")
    public void userShouldBeClickAddTagButton() {
        BrowserUtils.sleep(2);
        messagePage.addTagButton.click();
        BrowserUtils.sleep(2);

    }

    @And("User should be write tag name in this box {string}")
    public void userShouldBeWriteTagNameInThisBox(String tag) {
        BrowserUtils.sleep(2);
        messagePage.addTagTextBox.sendKeys(tag);
        BrowserUtils.sleep(2);

    }


    @And("User should be click add button")
    public void userShouldBeClickAddButton() {

        BrowserUtils.sleep(2);
        messagePage.addTagButtonForAfterWroteTag.click();
    }

    @And("User should be see tag in the tags box {string}")
    public void userShouldBeSeeTagInTheTagsBox(String tag) {

        BrowserUtils.sleep(2);
        Assert.assertEquals("Its working tag is same",tag,messagePage.selectedTag.getText());

    }

    @Then("Verification User after send message,should be see tag in message {string}")
    public void userAfterSendMessageShouldBeSeeTagInMessage(String tag) {
        BrowserUtils.sleep(2);
        Assert.assertEquals(tag,messagePage.selectedTagınMessage.getText());

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        messagePage.textBox.sendKeys("tagVerification");

        Driver.getDriver().switchTo().parentFrame();

        BrowserUtils.sleep(2);

        messagePage.sendButton.click();


        BrowserUtils.sleep(3);

        Assert.assertTrue(messagePage.tagforfirstmassege.getText().contains("soccer"));










    }

    @And("The user must press the cross")
    public void theUserMustPressTheCross() {

        BrowserUtils.sleep(2);

        messagePage.deletesymbol.click();

    }

    @Then("Verification The tag name must be deleted")
    public void theTagNameMustBeDeleted() {
        BrowserUtils.sleep(2);

        Assert.assertFalse(messagePage.tagsBox.getText().contains("soccer"));



      }



}

