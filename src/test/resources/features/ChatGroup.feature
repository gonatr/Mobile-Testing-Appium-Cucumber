@ChatGroup @Reg
Feature: Test the Chat Group Functionality in Staging Cicle App

  Background:
    Given User on team page cicle app
    When User click Team, choose Group Chat

  @TS017 @Positive11 @TestRun
  Scenario: Add a new chat to group Team
    When User write the text Text by Automate to the group and send it to the group
    Then User get text the result chat group Text by Automate

  @TS018 @Positive12
  Scenario: User copy a text message
    When User click a text message at group
    And User click a Copy
    Then User get text the result text a copy group

  @TS019 @Positive13
  Scenario: User delete a text message
    When User click a text message at group
    And User click a Delete
    Then User get text the result text a delete group

  @TS020 @TC0131 @Positive14 #1
  Scenario: User mention a people by select
    When User click box a text message
    And User click a Mention Logo
    And User select person to mention
    Then User get the result a mention person

  @TS021 @TC0132 @Positive15 #2
  Scenario: User mention a people by select all
    When User click box a text message
    And User click a Mention Logo
    And User select person by mention all
    Then User get the result a mention person by mention all

  @TS022 @Positive16
  Scenario: User attach a document at chat group
    When User click attach logo group chat
    And User click a document and video group
    And User choose a Document group
    Then User get the Document at group

  @TS023 @Positive17
  Scenario: Add a new long chat to group Team
    When User long write the text to the group and send it to the group
    Then User get long the result text group

  @TS024 @NegativeCG
  Scenario: User attach a document txt at chat group
    When User click attach logo group chat
    And User click a document and video group
    And User choose a Document txt group
    Then User not get the Document text at group

  @TS025 @NegativeCG
  Scenario: Add a new space chat to group Team
    When User wrong write the text blank to the group and send it to the group
    Then User get wrong the result text group blank

  @TS026 @NegativeCG
  Scenario: User attach a document txt at chat group from image gallery
    When User click attach logo group chat
    And User click a image from gallery group
    Then User not get the file at gallery group

  @TS027 @NegativeCG
  Scenario: User attach a document word at chat group group from image gallery
    When User click attach logo group chat
    And User click a image from gallery group
    Then User not get the file at gallery group

  @TS028 @NegativeCG
  Scenario: User attach a video at chat group group from image gallery
    When User click attach logo group chat
    And User click a image from gallery group
    Then User not get the file at gallery group
