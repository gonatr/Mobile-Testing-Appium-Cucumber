@CheckinsTest
Feature: Test the Check-Ins Functionality in Staging Cicle App

  Background:
    Given User allready on Home page
    When User click Team, choose Checkins Page

  @TS062 @Positive37
  Scenario: User add new a title check ins question

    And User click logo add a new checkins
    And User set name question Sunday Morings
    And User click day to schedule
    And User click set time
    And User click to add member
    And User click button Start collecting answer!
    Then User get the results of the qustions

  @TS063 @Positive38
  Scenario: User add new a comment
    When User click a checkins question
    And User click box add new comment
    And User type to question text Hallo
    And User send a message
    Then User get the result of the text question

  @TS064 @Positive39
  Scenario: User reply comment
    When User click a checkins question
    And User click button reply comment
    And User click box add new comment
    And User type reply a text Hallo
    And User send a message
    Then User get the result of the reply text

  @TS065 @Positive40
  Scenario: User add tag mention member at chat comment
    When User click a checkins question
    And User click box add new comment
    And User click mention logo @
    And User select member to mention
    Then User get the result of the mention member

  @TS066 @Positive41
  Scenario: User add Bold to make text bold at chat comment
    When User click a checkins question
    And User click box add new comment
    And User click Bold logo
    And User type to question text Test by Automate
    And User send a message with text bold at chat comment
    Then User get the result of the text bold at chat comment

  @TS067 @Positive42
  Scenario: User add Italic to make text italicsize at chat comment
    When User click a checkins question
    And User click box add new comment
    And User click Italic logo
    And User type to question text Test by Automate
    And User send a message with text italicsize at chat comment
    Then User get the result of the text italicsize at chat comment

  @TS068 @Positive43
  Scenario: User add strike through to make text drawing line at chat comment
    When User click a checkins question
    And User click box add new comment
    And User click strike through logo
    And User type to question text Test by Automate
    And User send a message with text strike through at chat comment
    Then User get the result of the text strike through at chat comment

  @TS069 @Positive44
  Scenario: User add attach image to chat with comment
    When User click a checkins question
    And User click box add new comment
    And User type to question text Test by Automate
    And User click attach + logo
    And User click a image logo
    And User click by upload
    And User select image
    And User submit attachment
    Then User get the result of the attach image at chat comment

  @TS070 @Positive45
  Scenario: User add attach document to chat with comment
    When User click a checkins question
    And User click box add new comment
    And User type to question text Test by Automate
    And User click attach + logo
    And User click a document logo
    And User click by upload
    And User select document
    And User submit attachment
    Then User get the result of the attach document at chat comment

  @TS071 @Positive46
  Scenario: User add attach video to chat with comment
    When User click a checkins question
    And User click box add new comment
    And User type to question text Test by Automate
    And User click attach + logo
    And User click a video logo
    And User click by upload
    And User select video
    And User submit attachment
    Then User get the result of the attach video at chat comment

  @TS072 @Positive47
  Scenario: User add numbering text to chat comment
    When User click a checkins question
    And User click box add new comment
    And User User click attach numbering logo
    And User type to question text Test by Automate
    And User send a message with text numbering at chat comment
    Then User get the result of the text numbering at chat comment

  @TS073 @Positive48
  Scenario: User add bullets to text chat comment
    When User click a checkins question
    And User click box add new comment
    And User User click attach bullets logo
    And User type to question text Test by Automate
    And User send a message with text bullets at chat comment
    Then User get the result of the text bullets at chat comment

  @TS074 @Positive49
  Scenario: User add cheers features comment
    When User click a checkins question
    And User click cheers logo
    And User input text "text" to cheers
    Then User get the result of the cheers "text"

  @TS075 @NegativeCk
  Scenario: User add attach image to chat without comment
    When User click a checkins question
    And User click box add new comment
    And User click attach + logo
    And User click a image logo
    And User click by upload
    And User select image
    And User submit attachment
    Then User get the result of the attach file at chat comment

  @TS076 @NegativeCK
  Scenario: User add new a comment with blank text
    When User click a checkins question
    And User click box add new comment
    And User input text blank comment question text "   "
    And User send a message
    Then User get the result of comment with blank text the question

  @TS077 @NegativeCK
  Scenario: User add cheers features comment with blank text
    When User click a checkins question
    And User click cheers logo
    And User input text "   " to cheers
    Then User get the result of the cheers "   "

  @TS078 @NegativeCK
  Scenario: User add new a title check ins long question
    And User click logo add a new checkins
    And User set long name question
    And User click day to schedule
    And User click set time
    And User click to add member
    And User click button Start collecting answer!
    Then User get the results of the long question

  @TS079 @NegativeCK
  Scenario: User add new a title check ins blank question
    And User click logo add a new checkins
    And User set blank name question
    And User click day to schedule
    And User click set time
    And User click to add member
    And User click button Start collecting answer!
    Then User get the results of the blank question

  @TS080 @NegativeCK
  Scenario: User add new a title check ins number question
    And User click logo add a new checkins
    And User set number name question
    And User click day to schedule
    And User click set time
    And User click to add member
    And User click button Start collecting answer!
    Then User get the results of the number question

  @TS081 @NegativeCK
  Scenario: User add new a title check ins special character question
    And User click logo add a new checkins
    And User set special character name question
    And User click day to schedule
    And User click set time
    And User click to add member
    And User click button Start collecting answer!
    Then User get the results of the special character question

