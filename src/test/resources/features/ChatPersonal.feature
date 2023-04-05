@ChatPersonal @Reg
Feature: Test the Chat Personal Functionality in Staging Cicle App

  Background: Scope chat personal
    Given User on app cicle stage
    When User click menu, and click Inbox

  @TS01 @PositionCP @Positive1
  Scenario: User add a new Chat personal
    And User add a new Chat
    And User chose friend to add new chat
    And User type text Testing by Automation
    Then User get the result text Testing by Automation

  @TS02 @PositionCP @Positive2
  Scenario: User copy a text chat
    When User choose a friend to select a chat
    And User click a text message
    And User click copy
    Then User get the copy a text

  @TS03 @PositionCP @Positive3
  Scenario: User delete a text chat
    When User choose a friend to select a chat
    And User click a text message
    And User click delete
    Then User get the delete a text

  @TS04 @CDD @PositionCP @Positive4
  Scenario: User attach a document at chat
    When User choose a friend to select a chat
    And User click attach logo
    And User click a document and video
    And User select a Document
    Then User get the Document

  @TS05 @CDD @PositionCP @Positive5
  Scenario: User delete a attachment document
    When User choose a friend to select a chat
    And User click file document ***
    And User click delete
    Then User get the delete chat attachment a text

  @TS06 @CDV @PositionCP @Positive6
  Scenario: User attach a video a chat
    When User choose a friend to select a chat
    And User click attach logo
    And User click a document and video
    And User choose a Video
    Then User get the Video

  @TS07 @CDV @PositionCP @Positive7
  Scenario: User delete a attachment video
    When User choose a friend to select a chat
    And User click file video ***
    And User click delete
    Then User get the delete chat attachment a text

  @TS08 @PositionCP @Positive8
  Scenario: User attach image from camera
    When User choose a friend to select a chat
    And User click attach logo
    And User click a Image from Camera
    And User click camera button
    Then User get the image from camera

  @TS09 @PositionCP @Positive9
  Scenario: User attach image from gallery
    When User choose a friend to select a chat
    And User click attach logo
    And User click a Image from Gallery
    And User choose image from gallery
    Then User get the image from gallery

  @TS010 @PositionCP @Positive10
  Scenario: User search valid history Private Message
    When User type valid a Kiki at box search
    Then User can see get the history search name true

  @TS011 @NegativeCP @Negative1
  Scenario: User search invalid history Private Message
    When User type invalid a Sumanto at box search
    Then User can not get the history search name false

  @TS012 @NegativeCP @Negative2
  Scenario: User add a new Chat blank text personal
    And User add a new Chat
    And User chose friend to add new chat
    And User not type text blank
    Then User not get the result text

  @TS013 @NegativeCP @Negative3
  Scenario: User attach a document txt at chat
    When User choose a friend to select a chat
    And User click attach logo
    And User click a document and video
    And User choose a not Document
    Then User not get the Document

  @TS014 @NegativeCP @Negative4
  Scenario: User attach a document txt at chat from image gallery
    When User choose a friend to select a chat
    And User click attach logo
    And User click a Image from Gallery
    Then User not get the file at the gallery

  @TS015 @NegativeCP @Negative5
  Scenario: User attach a document word at chat from image gallery
    When User choose a friend to select a chat
    And User click attach logo
    And User click a Image from Gallery
    Then User not get the file at the gallery

  @TS016 @NegativeCP @Negative6
  Scenario: User attach a video at chat from image gallery
    When User choose a friend to select a chat
    And User click attach logo
    And User click a Image from Gallery
    Then User not get the file at the gallery






