package com.appium.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.example.base.BaseTClass;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class KanbanPage extends BaseTClass {

    public static AppiumDriver appiumDriver;
    public KanbanPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button[@index='2']")
    MobileElement clNewBoard;

    public void clickNewBoard() {
        clNewBoard.click();
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")
    MobileElement clBoardName;

    String text;
    public void inputBoardName(String name) {
        text = name;
        MobileElement a = clBoardName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(name);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
    MobileElement btnSubmitBoard;

    public void clickSubmitBoard() {
        btnSubmitBoard.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
    MobileElement asrtBoard;

    public void assertBoard() {
        asrtBoard.isDisplayed();
        assertTrue(asrtBoard.isDisplayed());
    }

    String longText = "Once upon a time there was a panda bear who was very sad because had no friends to play with.\n" +
            "\n" +
            "One day he met a girl panda bear who was also looking for friends to play with and they became very good friends.\n" +
            "\n" +
            "Some days later, the bear went to her house to look for her, and they went happily together to the park.Short-Stories-bear\n" +
            "Once at the park, another bear with no friends approached them and said:\n" +
            " \n" +
            "\n" +
            "– “Can I play with you?”\n" +
            "\n" +
            "And they said: “Yes, you can play with us”\n" +
            "\n" +
            "Since then they always met new friends and were always playing and laughing. One day, the bear´s parents punished him because he had gone off with his friends, but when they saw the fun they were having, they forgave him.\n" +
            "\n" +
            "And so they were all together again, and were good friends forever.\n" +
            "\n" +
            "THE END ";

    public void inputWrongBoardName() {
        MobileElement a = clBoardName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(longText);
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'THE END')]")
    MobileElement asrtLongText;

    public void assertLongText() {
        asrtLongText.isDisplayed();
        assertTrue(asrtLongText.isDisplayed());
    }

    public void inputBlankBoardName(String text) {
        MobileElement a = clBoardName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(text);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'   ')]")
    MobileElement asrtBlankBoard;

    public void assertBlankBoard() {
        asrtBlankBoard.isDisplayed();
        assertTrue(asrtBlankBoard.isDisplayed());
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Add new card\"]")
    MobileElement clAddNewCard;

    public void clickAddNewCard() {
        clAddNewCard.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText")
    MobileElement inCardName;

    public void inputCardName(String name) {
        text = name;
        MobileElement a = inCardName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(name);
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View")
    MobileElement okCard;

    public void clickOkCard() {
        okCard.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.Button[@index='0'])[1]")
    MobileElement asrtCard;

    public void assertCard() {
        asrtCard.isDisplayed();
        assertTrue(asrtCard.isDisplayed());
    }

    public void inputLongCardName() {
        MobileElement a = inCardName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(longText);
    }

    @AndroidFindBy(xpath = "(//android.widget.Button[@index='0'])[1]")
    MobileElement asrtLongCard;

    public void assertLongCard() {
        asrtLongCard.isDisplayed();
        assertTrue(asrtLongCard.isDisplayed());
    }

    public void inputBlankCardName(String cardBlank){
        MobileElement a = inCardName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(cardBlank);
    }

    @AndroidFindBy(xpath = "(//android.widget.Button[@index='0'])[1]")
    MobileElement asrtBlankCard;

    public void assertBlankCard() {
        asrtBlankCard.isDisplayed();
        assertTrue(asrtBlankCard.isDisplayed());
    }

    @AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View")
    List<MobileElement> clCardName;

    public void clickCardName(int index) {
        clCardName.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Project 1')]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")
    MobileElement edtCardName;

    public void clickEditCard() {
        edtCardName.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Set due date')]/android.view.View[2]")
    MobileElement setDueDate;

    public void clickSetDueDate() {
        setDueDate.click();

    }
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"28, Friday, April 28, 2023\"]")
    MobileElement dueDate;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"OK\"]")
    MobileElement okSetDueDate;

    public void clickDueDate() {
        dueDate.click();
        okSetDueDate.click();
        okSetDueDate.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"update due date success\"]")
    MobileElement asrtDueDate;

    public void assertSetDueDate() {
        String message = asrtDueDate.getAttribute("content-desc");
        try {
            assertTrue(asrtDueDate.isDisplayed());
            Assert.assertEquals(message, "update due date success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Project 1')]/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]")
    MobileElement clLabel;

    public void clickLabel() {
        clLabel.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Create new label\"]")
    MobileElement clCreateLabel;

    public void clickCreateLabel() {
        clCreateLabel.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.widget.EditText[@index='1']")
    MobileElement inNameLabel;

    public void inputNameLabel(String name) {
        text = name;
        MobileElement a = inNameLabel;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(name);
    }

    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.view.View[5]")
    MobileElement colourLabel;

    public void clickColourLabel() {
        colourLabel.click();
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]")
    MobileElement inColourLabel;

    public void enterlabelTag() {

        PointOption pointOption = new PointOption().withCoordinates(434, 770);
        new TouchAction(appiumDriver).tap(pointOption).perform();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"submit\"]")
    MobileElement clSubmit;

    public void clickSubmit() {
        clSubmit.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Creating label for this board is success\"]")
    MobileElement asrtLabel;

    public void assertLabel() {
        String message = asrtLabel.getAttribute("content-desc");
        try {
            assertTrue(asrtLabel.isDisplayed());
            assertTrue(message.contains("Creating label for this board is success"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void inputLongNameLabel() {

        MobileElement a = inNameLabel;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(longText);
    }

    public void inputBlankNameLabel(String labelName1) {
        MobileElement a = inNameLabel;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(labelName1);
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View")
    List<MobileElement> listLabel;

    public void selectListLabel(int position) {
        listLabel.get(position).click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"toggle label card is success\"]")
    MobileElement asrtLabelCard;

    public void assertToggleLabel() {
        String a = asrtLabelCard.getAttribute("content-desc");
        try {
            assertTrue(asrtLabelCard.isDisplayed());
            assertTrue(a.contains("toggle label card is success"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View/android.view.View[6]")
    MobileElement clDescription;

    public void clickDescription() {
        clDescription.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.EditText")
    MobileElement inDescription;

    public void inputDescription() {
        MobileElement a = inDescription;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(longText);
    }

    public void enterDescription() {

        PointOption pointOption = new PointOption().withCoordinates(298, 2468);
        new TouchAction(appiumDriver).tap(pointOption).perform();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Publish']")
    MobileElement clPublish;

    public void clickPublish() {
        clPublish.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"show more note\"]")
    MobileElement clMoreNote;

    public void assertDescription() {
        clMoreNote.isDisplayed();
        assertTrue(clMoreNote.isDisplayed());
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Attach file\"]")
    MobileElement clAttachFile;

    public void clickAttachFile() {
        clAttachFile.click();
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView")
    List<MobileElement> selFile;

    public void selectFile(int index) {
        selFile.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Upload attachments is success\"]")
    MobileElement asrtAttachFile;

    public void assertAttachFile() {
        String message = asrtAttachFile.getAttribute("content-desc");
        try {
            assertTrue(asrtAttachFile.isDisplayed());
            assertTrue(message.contains("Upload attachments is success"));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[4]")
    MobileElement selFile2;

    public void selectFileTxt() {
        selFile2.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Format file not allowed.\"]")
    MobileElement asrtFileTxt;

    public void assertFileTxt() {
        String message = asrtFileTxt.getAttribute("content-desc");
        try {
            assertTrue(asrtFileTxt.isDisplayed());
            Assert.assertEquals(message.toString(), "Format file not allowed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Project')]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]")
    MobileElement clRemoveLabel;

    public void clickRemoveLabel() {
        clRemoveLabel.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"remove due date success\"]")
    MobileElement asrtRemoveDueDate;

    public void assertRemoveDueDate() {
        asrtRemoveDueDate.isDisplayed();
        assertTrue(asrtRemoveDueDate.isDisplayed());
    }

    String updateDesc = "Stories like Life of Pi are inspired by nature and its magnificent wild species. Through the power of theater and immersive storytelling, they make us believe the unbelievable and capture a tiger’s astonishing presence. But in actuality, the reality tigers face in the wild can be far from magical. Wild tigers face threats of poaching, the illegal trade of and demand for tiger parts and products, and rampant habitat loss.\n" +
            "\n" +
            "But, after a century of decline, wild tiger numbers are now on the rise in many places. At least 4,500 tigers remain in the wild, but more work is needed to protect this species that’s still endangered with extinction.\n" +
            "\n" +
            "Tigers face threats of poaching, the illegal trade of and demand for wild tiger parts and products, and rampant habitat loss.\n" +
            "\n" +
            "Together, we can change the story for wild tigers. WWF is working to preserve and connect tiger habitats; monitor tigers and conserve their prey; tackle illegal trade in and reduce demand for tiger parts and products; work with communities to manage human-wildlife conflict; and support governments to stop tiger poaching.";

    public void inputUpdateDesc() {
        MobileElement a = inDescription;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(updateDesc);
    }

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Show menu\"])[2][@index='0']")
    MobileElement clAttachment;

    public void clickAttachment() {
        clAttachment.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Edit Title\"]")
    MobileElement clEditTitle;

    public void clickEditTitle() {
        clEditTitle.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.widget.EditText")
    MobileElement clInputTitle;

    public void clickInputTitle(String title) {
        MobileElement a = clInputTitle;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(title);
    }

    public void clickInputTitleBlank(String title) {
        MobileElement a = clInputTitle;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(title);
    }

    public void clickInputTitleLong() {
        MobileElement a = clInputTitle;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(longText);
    }

    String http = "https://staging.cicle.app/signin ";
    public void clickInputTitleHttp() {

        MobileElement a = clInputTitle;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(http);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Update\"]")
    MobileElement clUpdate;

    public void clickUpdateTitle() {
        clUpdate.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Update attachment is success\"]")
    MobileElement asrtUpdateTitle;

    public void assertUpdateTitle() {
        String message = asrtUpdateTitle.getAttribute("content-desc");
        try {
            assertTrue(asrtUpdateTitle.isDisplayed());
            Assert.assertEquals(message, "Update attachment is success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Remove\"]")
    MobileElement clRemove;

    public void clickRemove() {
        clRemove.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Ok\"]")
    MobileElement clOk;

    public void clickOk() {
        clOk.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Delete attachment is success\"]")
    MobileElement asrtDeleteTitle;

    public void assertRemoveAttachment() {
        String message = asrtDeleteTitle.getAttribute("content-desc");
        try {
            assertTrue(asrtDeleteTitle.isDisplayed());
            Assert.assertEquals(message, "Delete attachment is success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Download\"]")
    MobileElement clDownload;

    public void clickDownload() {
        clDownload.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Ok\"]")
    MobileElement clOkDownload;

    public void clickOkDownload() {
        clOkDownload.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'start to download')]")
    MobileElement asrtDownload;

    public void assertDownload() {
        try {
            assertTrue(asrtDownload.isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Project 1\"]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[6]")
    MobileElement clSubscribers;

    public void clickSubscribers() {
        clSubscribers.click();
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.CheckBox")
    MobileElement clCheckBox;

    public void clickCheckBox() {
        clCheckBox.click();
        clCheckBox.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"done\"]")
    MobileElement clDone;

    public void clickDone() {
        clDone.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Toggle members successful\"]")
    MobileElement asrtSubscribe;

    public void assertSubscribe() {
        String message = asrtSubscribe.getAttribute("content-desc");
        try {
            assertTrue(asrtSubscribe.isDisplayed());
            Assert.assertEquals(message.toString(), "Toggle members successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Show menu\"]")
    MobileElement clCardListMenu;

    public void clickCardListMenu() {
        clCardListMenu.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Share card link\"]")
    MobileElement clShareCardLink;

    public void clickShareCardLink() {
        clShareCardLink.click();
    }

    @AndroidFindBy(id = "android:id/chooser_copy_button")
    MobileElement clCopyCardLink;

    public void selectToShare() {
        MobileElement a = clCopyCardLink;
        a.isDisplayed();
        a.click();
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.Toast")
    MobileElement asrtToast;

    public void assertToast() {
        String txt = "Copied";
        String message = asrtToast.getAttribute("text");

        try {
            assertTrue(asrtToast.isDisplayed());
            Assert.assertEquals(message.toString(), txt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Copy card\"]")
    MobileElement clCopyCard;

    public void clickCopyCard() {
        clCopyCard.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"feature is under development\"]")
    MobileElement asrtFeatureCopy;

    public void assertFeatureCopy() {
        String message = asrtFeatureCopy.getAttribute("content-desc");
        try {
            assertTrue(asrtFeatureCopy.isDisplayed());
            Assert.assertEquals(message.toString(), "feature is under development");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Set card to private\"]")
    MobileElement clSetCardToPrivate;

    public void clickSetCardToPrivate() {
        clSetCardToPrivate.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Update card is success\"]")
    MobileElement asrtPrivateCard;

    public void assertSetCardToPrivate() {
        String message = asrtPrivateCard.getAttribute("content-desc");
        try {
            assertTrue(asrtPrivateCard.isDisplayed());
            Assert.assertEquals(message.toString(), "Update card is success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Archive card\"]")
    MobileElement clArchiveCard;

    public void clickArchiveCard() {
        clArchiveCard.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Archive\"]")
    MobileElement clArchive;

    public void clickArchive() {
        clArchive.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'card has been moved to archived')]")
    MobileElement asrtArchivedCard;

    public void assertArchivedCard() {
        String message = asrtArchivedCard.getAttribute("content-desc");
        try {
            assertTrue(asrtArchivedCard.isDisplayed());
            Assert.assertEquals(message.toString(), "card has been moved to archived");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'ss')]")
    MobileElement editBoard;


    public void clickNameBoard() {

        PointOption pointOption = new PointOption().withCoordinates(50, 110);
        new TouchAction(appiumDriver).tap(pointOption).perform();
    }

    public void clickNameBoardNew() {
        editBoard.click();
    }


    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.widget.EditText")
    MobileElement inNewBoardName;

    public void enterNewBoardName(String newName) {
        MobileElement a = inNewBoardName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(newName);
    }

    @AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
    MobileElement clOkBoards;

    public void clickOkBoards() {
        clOkBoards.click();
    }

    @AndroidFindBy(xpath = "(//android.view.View[@index='0'])[10]")
    MobileElement asrtNewBoardName;

    public String assertNewBoardName() {
        String a = asrtNewBoardName.getAttribute("content-desc");

        return a;
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,' ')]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")
    MobileElement clEditNameCard;

    public void clickEditNameCardLogo() {
        clEditNameCard.click();


//        PointOption pointOption = new PointOption().withCoordinates(447, 113);
//        new TouchAction(appiumDriver).tap(pointOption).perform();
//        new TouchAction(appiumDriver).tap(pointOption).perform();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.widget.EditText")
    MobileElement inEditNameCardName;

    public void enterEditNameCardName(String newName) {
        MobileElement a = inEditNameCardName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(newName);
    }

    public void enterEditNameCardNameBlank(String newName) {
        MobileElement a = inEditNameCardName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(newName);
    }

    public void enterEditNameCardNameLong() {
        MobileElement a = inEditNameCardName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(longText);
    }

    public void enterEditNameCardNameHttp() {
        MobileElement a = inEditNameCardName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(http);
    }

    @AndroidFindBy(xpath = "(//android.view.View/android.widget.Button[1])[last()]")
    MobileElement clOkEditNameCardSave;

    public void clickOkEditNameCardSave() {
        clOkEditNameCardSave.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"update title success\"]")
    MobileElement asrtEditNameCardName;

    public void assertEditNameCardName() {
        String message = asrtEditNameCardName.getAttribute("content-desc");
        try {
            assertTrue(asrtEditNameCardName.isDisplayed());
            Assert.assertEquals(message.toString(), "update title success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




















}
