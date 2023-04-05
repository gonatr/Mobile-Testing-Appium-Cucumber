package com.appium.stepDefinition;

import com.appium.pageObject.HomePage;
import com.appium.pageObject.KanbanPage;
import com.appium.pageObject.TeamPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utils.AppiumDriverEX;

import static org.junit.Assert.assertTrue;

public class KanbanBoardStep {

    public static AppiumDriver appiumDriver;
    public KanbanBoardStep() {
        this.appiumDriver = AppiumDriverEX.appiumDriver;
    }

    HomePage home;
    TeamPage team;
    KanbanPage kanban;

    @Given("User on Home Cicle app")
    public void userOnHomeCicleApp() {
        home = new HomePage(appiumDriver);
        team = new TeamPage(appiumDriver);
        kanban = new KanbanPage(appiumDriver);
        home.assertHomePage();
    }

    @When("User click Team, choose Kanban Board")
    public void userClickTeamChooseKanbanBoard() {
        home.clickTeam(1);
        team.clickBoard();
    }

    @When("User click a add new Board logo")
    public void userClickAAddNewBoardLogo() {
        kanban.clickNewBoard();
    }

    @And("^User set name list board (.*)$")
    public void userSetNameListBoardInProgress(String text) {
        kanban.inputBoardName(text);
    }

    @And("User click a button submit")
    public void userClickAButtonSubmit() {
        kanban.clickSubmitBoard();
    }

    @Then("User get the result of the board")
    public void userGetTheResultOfTheBoard() {
        kanban.assertBoard();
    }

    /*
       ini TS 002
    */

    @And("User set wrong name list board In Progress")
    public void userSetWrongNameListBoardInProgress() {
        kanban.inputWrongBoardName();
    }

    @Then("User get the wrong result of the board")
    public void userGetTheWrongResultOfTheBoard() {
        kanban.assertLongText();
    }

    /*
       ini TS 002
    */

    @And("User set wrong name blank list board In Progress")
    public void userSetWrongNameBlankListBoardInProgress() {
        kanban.inputBlankBoardName("   ");
    }

    @Then("User get the wrong blank result of the board")
    public void userGetTheWrongBlankResultOfTheBoard() {
        kanban.assertBlankBoard();
    }

    /*
       ini TS 002
    */

    @When("User click a Add new card")
    public void userClickAAddNewCard() {
        kanban.clickAddNewCard();
    }

    @And("^User set name card (.*)$")
    public void userSetNameCardProject(String text) {
        kanban.inputCardName(text);
    }

    @And("User click a button ok logo")
    public void userClickAButtonOkLogo() {
        kanban.clickOkCard();
    }

    @Then("User get the result of the card")
    public void userGetTheResultOfTheCard() {
        kanban.assertCard();
    }

    /*
       ini TS 002
    */

    @And("User set name long card")
    public void userSetNameLongCard() {
        kanban.inputLongCardName();
    }

    @Then("User get long the result of the card")
    public void userGetLongTheResultOfTheCard() {
        kanban.assertLongCard();
    }

    /*
       ini TS 002
    */

    @And("User set name blank card")
    public void userSetNameBlankCard() {
        kanban.inputBlankCardName("   ");
    }

    @Then("User get blank the result of the card")
    public void userGetBlankTheResultOfTheCard() {
        kanban.assertBlankCard();
    }

    /*
       ini TS 002
    */

    @When("User click a name card list")
    public void userClickANameCardList() {
        kanban.clickCardName(0);
    }

    @And("User click set due date")
    public void userClickSetDueDate() {
        kanban.clickEditCard();
        kanban.clickSetDueDate();
    }

    @And("User set date, set time, click ok")
    public void userSetDateSetTimeClickOk() {
        kanban.clickDueDate();
    }

    @Then("User get the result of the set due date")
    public void userGetTheResultOfTheSetDueDate() {
        kanban.assertSetDueDate();
    }

    /*
       ini TS 002
    */

    @And("User click add tag +Labels")
    public void userClickAddTagLabels() {
        kanban.clickLabel();
    }

    @And("User click a Create new Label")
    public void userClickACreateNewLabel() {
        kanban.clickCreateLabel();

    }

    @And("^User input name label (.*)$")
    public void userInputNameLabelUrgent(String text) {
        kanban.inputNameLabel(text);
    }

    @And("User set colour, click button submit")
    public void userSetColourClickButtonSubmit() {
        kanban.clickColourLabel();
        kanban.enterlabelTag();
        kanban.clickSubmit();
    }

    @Then("User get the result of the create label tag")
    public void userGetTheResultOfTheCreateLabelTag() {
        kanban.assertLabel();
    }

    @And("User input long name label Urgent")
    public void userInputLongNameLabelUrgent() {
        kanban.inputLongNameLabel();
    }

    @And("User input blank name label Urgent")
    public void userInputBlankNameLabelUrgent() {
        kanban.inputBlankNameLabel("   ");
    }

    /*
       ini TS 002
    */

    @And("User select tag label")
    public void userSelectTagLabel() {
        kanban.selectListLabel(0);;
    }

    @Then("User get the result of the select label tag")
    public void userGetTheResultOfTheSelectLabelTag() {
        kanban.assertToggleLabel();
    }

    /*
       ini TS 002
    */

    @And("User click Description logo +")
    public void userClickDescriptionLogo() {
        kanban.clickDescription();
    }

    @And("User input set Desription")
    public void userInputSetDesription() {
        kanban.inputDescription();
        kanban.enterDescription();
    }

    @And("User click button publish")
    public void userClickButtonPublish() {
//        kanban.clickPublish();
    }

    @Then("User get the result of the description")
    public void userGetTheResultOfTheDescription() {
//        kanban.assertDescription();
    }

    /*
       ini TS 002
    */

    @And("User click Attach file logo +")
    public void userClickAttachFileLogo() {
        team.scrollTo();
        kanban.clickAttachFile();
    }

    @And("User select file to attach")
    public void userSelectFileToAttach() {
        kanban.selectFile(2);
    }

    @Then("User get the result of the attach file")
    public void userGetTheResultOfTheAttachFile() {
        kanban.assertAttachFile();
    }

    /*
       ini TS 002
    */

    @And("User select file txt to attach")
    public void userSelectFileTxtToAttach() {
        kanban.selectFileTxt();

    }

    @Then("User not get the result of the attach file")
    public void userNotGetTheResultOfTheAttachFile() {
        kanban.assertFileTxt();
    }

    /*
       ini TS 002
    */

    @And("User click remove logo + due date")
    public void userClickRemoveLogoDueDate() {
        kanban.clickRemoveLabel();
    }

    @Then("User get the result of the remove due date")
    public void userGetTheResultOfTheRemoveDueDate() {
        kanban.assertRemoveDueDate();
    }

    /*
       ini TS 002
    */

    @And("User click Description logo + to update")
    public void userClickDescriptionLogoToUpdate() {
        kanban.clickDescription();
        kanban.inputUpdateDesc();
    }

    @Then("User click button publish update description")
    public void userClickButtonPublishUpdateDescription() {
        kanban.clickPublish();
        kanban.assertDescription();
    }

    /*
       ini TS 002
    */

    @And("User click Attachment logo *** to update")
    public void userClickAttachmentLogoToUpdate() {
        kanban.clickAttachment();
    }

    @And("^User click Edit title valid (.*)$")
    public void userClickEditTitle(String title) {
        kanban.clickEditTitle();
        kanban.clickInputTitle(title);
    }

    @And("User click Edit title write blank text {string}")
    public void userClickEditTitleWriteBlankText(String text) {
        kanban.clickEditTitle();
        kanban.clickInputTitleBlank(text);
    }

    @And("User click Edit title write long text")
    public void userClickEditTitleWriteLongText() {
        kanban.clickEditTitle();
        kanban.clickInputTitleLong();

    }

    @And("User click Edit title write http text")
    public void userClickEditTitleWriteHttpText() {
        kanban.clickEditTitle();
        kanban.clickInputTitleHttp();
    }

    @And("User click button update title")
    public void userClickButtonUpdateTitle() {
        kanban.clickUpdateTitle();
    }

    @Then("User get the result of the update title")
    public void userGetTheResultOfTheUpdateTitle() {
        kanban.assertUpdateTitle();
    }

    /*
       ini TS 002
    */

    @And("User click Remove attachment")
    public void userClickRemoveAttachment() {
        kanban.clickRemove();
    }

    @And("User click button ok to remove")
    public void userClickButtonOkToRemove() {
        kanban.clickOk();
    }

    @Then("User get the result of the remove attachment")
    public void userGetTheResultOfTheRemoveAttachment() {
        kanban.assertRemoveAttachment();
    }

    /*
       ini TS 002
    */

    @And("User click Download attachment")
    public void userClickDownloadAttachment() {
        kanban.clickDownload();
    }

    @And("User click button ok to download")
    public void userClickButtonOkToDownload() {
        kanban.clickOkDownload();
    }

    @Then("User get the result of the download attachment")
    public void userGetTheResultOfTheDownloadAttachment() {
        kanban.assertDownload();
    }

    /*
       ini TS 002
    */

    @And("User click subscribers logo +")
    public void userClickSubscribersLogo() {
        team.scrollTo();
        kanban.clickSubscribers();
    }

    @And("User click uncheck member")
    public void userClickUncheckMember() {
        kanban.clickCheckBox();
    }

    @And("User click done to uncheck member")
    public void userClickDoneToUncheckMember() {
        kanban.clickDone();
    }

    @Then("User get the result of the uncheck member")
    public void userGetTheResultOfTheUncheckMember() {
        kanban.assertSubscribe();
    }

    /*
       ini TS 002
    */

    @When("User click a card list *** button")
    public void userClickACardListButton() {
        kanban.clickCardListMenu();
    }

    @And("User click Share card link")
    public void userClickShareCardLink() {
        kanban.clickShareCardLink();
    }

    @And("User select to share")
    public void userSelectToShare() {
        kanban.selectToShare();
    }

    @Then("User get the result of the share card")
    public void userGetTheResultOfTheShareCard() {
        kanban.assertToast();

    }

    /*
       ini TS 002
    */

    @And("User click Copy card")
    public void userClickCopyCard() {
        kanban.clickCopyCard();
    }

    @Then("User get the result of the copy card")
    public void userGetTheResultOfTheCopyCard() {
        kanban.assertFeatureCopy();
    }

    /*
       ini TS 002
    */

    @And("User click Archive card")
    public void userClickArchiveCard() {
        kanban.clickArchiveCard();
    }

    @And("User click archive")
    public void userClickArchive() {
        kanban.clickArchive();
    }

    @Then("User get the result of the archive button")
    public void userGetTheResultOfTheArchiveButton() {
        kanban.assertArchivedCard();
    }

    /*
       ini TS 002
    */

    @And("User click set card to Private")
    public void userClickSetCardToPrivate() {
        kanban.clickSetCardToPrivate();
    }

    @And("User click private")
    public void userClickPrivate() {
    }

    @Then("User get the result of the set card to private")
    public void userGetTheResultOfTheSetCardToPrivate() {
        kanban.assertSetCardToPrivate();
    }

    /*
       ini TS 002
    */

    @When("User click a archive card logo")
    public void userClickAArchiveCardLogo() {
    }

    @And("User click restore card item")
    public void userClickRestoreCardItem() {
    }

    @And("User click ok to restore card")
    public void userClickOkToRestoreCard() {
    }

    @Then("User get the result of the restore card")
    public void userGetTheResultOfTheRestoreCard() {
    }

    /*
       ini TS 002
    */

    @When("User click name board")
    public void userClickNameBoard() {
        kanban.clickNameBoardNew();
    }

    @And("^User set new name board (.*)$")
    public void userSetNewNameBoard(String nameBoard) {
        kanban.enterNewBoardName(nameBoard);

    }

    @And("User click ok logo button")
    public void userClickOkLogoButton() {
        kanban.clickOkBoards();
    }

    @Then("^User get the result of the set new name board (.*)$")
    public void userGetTheResultOfTheSetNewNameBoard(String nameBoard) {
        String a = kanban.assertNewBoardName();
        assertTrue(a.equals(nameBoard));

    }

    /*
       ini TS 002
    */

    @When("User click a card list")
    public void userClickACardList() {
        kanban.clickCardName(0);
    }

    @And("User click edit logo title card")
    public void userClickEditLogoTitleCard() {
        kanban.clickEditNameCardLogo();
    }

    @And("^User set new name card (.*)$")
    public void userSetNewNameCard(String textName) {
        kanban.enterEditNameCardName(textName);
    }

    @And("^User set new name (?:blank|long|http) card text (.*)$")
    public void userSetNewNameBlankCardProject(String textName) {
        if (textName.contains("blank")){
            kanban.enterEditNameCardNameBlank("   ");
        } else if (textName.contains("long")){
            kanban.enterEditNameCardNameLong();
        } else if (textName.contains("http")){
            kanban.enterEditNameCardNameHttp();
        }
    }

    @And("User click ok logo button to new name card")
    public void userClickOkLogoButtonToNewNameCard() {
        kanban.clickOkEditNameCardSave();
    }

    @Then("^User get the result of the new name card$")
    public void userGetTheResultOfTheNewNameCard() {
        kanban.assertEditNameCardName();

    }










    /*
       ini TS 002
    */
}
