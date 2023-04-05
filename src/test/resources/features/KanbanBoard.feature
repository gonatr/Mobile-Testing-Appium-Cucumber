@KanbanTest
Feature: Test the Kanban Board Functionality in Staging Cicle App

  Background:
    Given User on Home Cicle app
    When User click Team, choose Kanban Board

  @TS029 @Positive18
  Scenario: User Create Add List Backlog in Kanban board page
    When User click a add new Board logo
    And User set name list board In Progress
    And User click a button submit
    Then User get the result of the board

  @TS030 @Positive19
  Scenario: User Create Add Card in Kanban board
    When User click a Add new card
    And User set name card Project 1
    And User click a button ok logo
    Then User get the result of the card

  @TS031 @Positive20
  Scenario: User set due date at card list
    When User click a name card list
    And User click set due date
    And User set date, set time, click ok
    Then User get the result of the set due date

  @TS032 @Positive21
  Scenario: User create label tag at card list
    When User click a name card list
    And User click add tag +Labels
    And User input name label Urgent
    And User set colour, click button submit
    Then User get the result of the create label tag

  @TS033 @Positive22
  Scenario: User add label tag at card list
    When User click a name card list
    And User click add tag +Labels
    And User select tag label
    Then User get the result of the select label tag

  @TS034 @Positive23
  Scenario: User set description at card list
    When User click a name card list
    And User click Description logo +
    And User input set Desription
    And User click button publish
    Then User get the result of the description

  @TS035 @Positive24
  Scenario: User attachments file at card list
    When User click a name card list
    And User click Attach file logo +
    And User select file to attach
    Then User get the result of the attach file

  @TS036 @Positive25
  Scenario: User remove due date at card list
    When User click a name card list
    And User click remove logo + due date
    Then User get the result of the remove due date

  @TS037 @Positive26
  Scenario: User update description at card list
    When User click a name card list
    And User click Description logo + to update
    Then User click button publish update description

  @TS038 @TC00111 @Positive27  #1
  Scenario: User update title Attachment at card list
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Edit title valid revisi file
    And User click button update title
    Then User get the result of the update title

  @TS039 @NegativeKB
  Scenario: User update title Attachment at card list with blank text
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Edit title write blank text "   "
    And User click button update title
    Then User get the result of the update title

  @TS040 @NegativeKB
  Scenario: User update title Attachment at card list with long text
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Edit title write long text
    And User click button update title
    Then User get the result of the update title

  @TS041 @NegativeKB
  Scenario: User update title Attachment at card list with web text
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Edit title write http text
    And User click button update title
    Then User get the result of the update title

  @TS042 @TC00113 @Positive29 #3
  Scenario: User download title Attachment at card list
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Download attachment
    And User click button ok to download
    Then User get the result of the download attachment

  @TS043 @TC00112 @Positive30 #2
  Scenario: User remove title Attachment at card list
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Remove attachment
    And User click button ok to remove
    Then User get the result of the remove attachment

  @TS044 @Positive31
  Scenario: User remove title Subscibers at card list
    When User click a name card list
    And User click subscribers logo +
    And User click uncheck member
    And User click done to uncheck member
    Then User get the result of the uncheck member

  @TS045 @Positive32
  Scenario: User share card to another member/platform
    When User click a name card list
    When User click a card list *** button
    And User click Share card link
    And User select to share
    Then User get the result of the share card

  @TS046 @Positive33
  Scenario: User copy card
    When User click a name card list
    When User click a card list *** button
    And User click Copy card
    Then User get the result of the copy card

  @TS047 @Positive34
  Scenario: User set card to private
    When User click a name card list
    When User click a card list *** button
    And User click set card to Private
    And User click private
    Then User get the result of the set card to private

  @TS048 @Positive35
  Scenario: User update title board
    When User click name board
    And User set new name board Complete
    And User click ok logo button
    Then User get the result of the set new name board Complete

  @TS049 @Positive36
  Scenario: User update title card
    When User click a card list
    And User click edit logo title card
    And User set new name card Project 2
    And User click ok logo button to new name card
    Then User get the result of the new name card

  @TS050 @NegativeKB @KNegT
  Scenario: User update title card with blank text
    When User click a card list
    And User click edit logo title card
    And User set new name blank card text blank
    And User click ok logo button to new name card
    Then User get the result of the new name card

  @TS051 @NegativeKB
  Scenario: User update title card
    When User click a card list
    And User click edit logo title card
    And User set new name long card text long
    And User click ok logo button to new name card
    Then User get the result of the new name card

  @TS052 @NegativeKB
  Scenario: User update title card
    When User click a card list
    And User click edit logo title card
    And User set new name http card text http
    And User click ok logo button to new name card
    Then User get the result of the new name card

  @TS053 @Positive37
  Scenario: User archive card
    When User click a name card list
    When User click a card list *** button
    And User click Archive card
    And User click archive
    Then User get the result of the archive button

  @TS054 #reportbug
  Scenario: User Unarchive card
    When User click a archive card logo
    And User click restore card item
    And User click ok to restore card
    Then User get the result of the restore card

  @TS055 @NegativeKB @TS026Neg
  Scenario: User Create Add List Backlog in Kanban board page with long text
    When User click a add new Board logo
    And User set wrong name list board In Progress
    And User click a button submit
    Then User get the wrong result of the board

  @TS056 @NegativeKB
  Scenario: User Create Add List Backlog in Kanban board page
    When User click a add new Board logo
    And User set wrong name blank list board In Progress
    And User click a button submit
    Then User get the wrong blank result of the board

  @TS057 @NegativeKB
  Scenario: User Create Add Card in Kanban board with long text
    When User click a Add new card
    And User set name long card
    And User click a button ok logo
    Then User get long the result of the card

  @TS058 @NegativeKB
  Scenario: User Create Add Card in Kanban board with blank text
    When User click a Add new card
    And User set name blank card
    And User click a button ok logo
    Then User get blank the result of the card

  @TS059 @NegativeKB
  Scenario: User set label tag at card list long text
    When User click a name card list
    And User click add tag +Labels
    And User click a Create new Label
    And User input long name label Urgent
    And User set colour, click button submit
    Then User get the result of the create label tag

  @TS060 @NegativeKB
  Scenario: User set label tag at card list with blank text
    When User click a name card list
    And User click add tag +Labels
    And User click a Create new Label
    And User input blank name label Urgent
    And User set colour, click button submit
    Then User get the result of the create label tag

  @TS061 @NegativeKB
  Scenario: User attachments file txt at card list
    When User click a name card list
    And User click Attach file logo +
    And User select file txt to attach
    Then User not get the result of the attach file


