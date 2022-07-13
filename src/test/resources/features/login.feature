 @login
Feature: app login feature
  User Story:
  As a user,I should be able to add link, insert video, mention, quote, add tag in message.

  Account is mail:helpdesk1@cybertekschool.com
  password:UserUser

  @smoke
  Scenario: As a user, Users should be add mentions only depertmant employess
    Given User should login with correct credential
    When User, Should be click Add Mention button.
    And User should be click Emmployess and departments button
    Then User should be add deparmants employess
    Then Verification The chosen departments employess should be see in


  @smoke
  Scenario:As a User, Users should be able to add a link to the typed text
    Given User should login with correct credential
    When Users should click link button and should be able to write the "Amazon" and "https://www.amazon.com/"
    And User,After write a link, should click save button
    Then Verification Users should click send button and user should be see in message


  @fail
  Scenario: The link format of the link written by the user must be correct
    Given User should login with correct credential
    When users should click link button and should be able to write incorrect the "facebook" and "https://www.facebook."
    Then  İf the link is not correct,User  should be take error before than click save button

  @fail
  Scenario: As a user,User should be able to insert video.There can be only (Youtube)
    Given User should login with correct credential
    When User should be click insert video button
    And User should be add Youtube link "https://www.youtube.com/watch?v=rhE45ihB26E"
    Then User after add a video link,should be click save button,The video should be see in message



  Scenario: As a user,User should be able to insert video.There can be only (Vimeo)
    Given User should login with correct credential
    When User should be click insert video button
    And User should be add Vimeo link "https://vimeo.com/499694935"
    Then User after add a video link,should be click save button,The video should be see in message


  @wip
  Scenario:   As a user, User shouldn't be able to insert other videos.(Negative Scenerio)
    Given User should login with correct credential
    When User should be click insert video button
    And User should be add other video link "https://www.izlesene.com/"
    Then User after add a video link,should be click save button,The video should be see in message


  @smoke
  Scenario: As a user,User should be add quotes in text
    Given User should login with correct credential
    And User should be click Quote text button
    Then Verification User should be see Quote box after the click

  @smoke
  Scenario: As a user,User added link in the quotes The link should be work
    Given User should login with correct credential
    And User should be click Quote text button
    And User should be see Quote box after the click
    Then User should be able add link in Quote box and than click send button
    Then Verification User should be see link in message


  @smoke
  Scenario: As a user,User should be able add tags in message text
    Given User should login with correct credential
    And User should be click Add tag button
    And User should be write tag name in this box "soccer"
    And User should be click add button
    And User should be see tag in the tags box "soccer"
    Then Verification User after send message,should be see tag in message "soccer"

  @smoke
  Scenario: As a user,User should be able remove tags before save the message
    Given User should login with correct credential
    And User should be click Add tag button
    And User should be write tag name in this box "soccer"
    And User should be click add button
    And The user must press the cross
    Then Verification The tag name must be deleted










