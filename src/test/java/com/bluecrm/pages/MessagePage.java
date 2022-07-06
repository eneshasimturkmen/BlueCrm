package com.bluecrm.pages;

import com.bluecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MessagePage extends BasePage{

    public MessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionButton;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employessanddepartmentsButton;

    //@FindBy(xpath = "//a[@class='bx-finder-company-department-employee  bx-finder-element']")
    //public WebElement allEmployess;


    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkButton;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linktextBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrlbox;

    @FindBy(name = "undefined")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(id = "blog_post_body_701")
    public WebElement link;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    public WebElement insertVideoButton;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoTextButton;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveButtonforVideo;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-quote']")
    public WebElement quoteButton;

    @FindBy(className = "bxhtmled-quote")
    public WebElement quoteInTextBox;

    @FindBy(xpath = "//a[@class='bx-finder-company-department-employee  bx-finder-element'][1]")
    public WebElement departmentEmployees;

    @FindBy(className = "feed-post-text-block-inner-inner")
    public WebElement messagetext;

    @FindBy(className = "bxhtmled-video-error")
    public WebElement videoErrorMessage;

    @FindBy(className = "bxhtmled-dummy-target")
    public WebElement secondQuote;

    @FindBy(id = "bx-b-tag-input-blogPostForm")
    public WebElement addTagButton;

    @FindBy(name = "TAGS_blogPostForm")
    public WebElement addTagTextBox;

    @FindBy(id = "TAGS_blogPostForm67abSn_div_0_NAME")
    public WebElement firstaddedTag;

    @FindBy(xpath = "//span[.='Add']")
    public WebElement addTagButtonForAfterWroteTag;

    @FindBy(className = "feed-add-post-tags")
    public WebElement selectedTag;


    @FindBy(className = "feed-com-tag")
    public WebElement selectedTagınMessage;

    @FindBy(xpath = "(//span[@class='feed-add-post-del-but'])[2]")
    public WebElement deletesymbol;

    @FindBy(id = "post-tags-hidden-blogPostForm")
    public WebElement tagsBox;

    @FindBy(xpath = "(//div[starts-with(@id, 'blogpost-tags')])[1]")
    public WebElement tagforfirstmassege;














}
