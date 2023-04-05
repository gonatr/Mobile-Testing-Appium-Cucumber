package com.appium.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.example.base.BaseTClass;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class CheckInsPage extends BaseTClass {
    public static AppiumDriver appiumDriver;
    public CheckInsPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button")
    MobileElement newQusttionButton;

    public void clickNewQuestionButton() {
        newQusttionButton.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
    MobileElement inputQuestion;

    String text;
    public void inputSetQuestion(String name) {
        text = name;
        MobileElement a = inputQuestion;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(name);
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


    public void inputSetLongQuestion() {
        MobileElement a = inputQuestion;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(longText);
    }

    public void inputSetBlankQuestion(String blanks) {
        MobileElement a = inputQuestion;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(blanks);
    }

    String abc = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15";
    public void inputSetNumberQuestion() {
        MobileElement a = inputQuestion;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(abc);
    }

    String sp = "✊♨  ＷＨ\uD835\uDCB6\uD835\uDD31 ίＳ \uD835\uDD43\uD835\uDC28ŕ\uD835\uDC52๓ 丨ρᔕ\uD835\uDD4C\uD835\uDCF6?";

    public void inputSetSpecialQuestion() {
        MobileElement a = inputQuestion;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(sp);
    }



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sun\"]")
    MobileElement clDay;

    public void clickDay() {
        clDay.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.widget.ScrollView/android.view.View[11]")
    MobileElement clTime;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Switch to text input mode\"]")
    MobileElement clModeTime;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]")
    MobileElement clHour;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]")
    MobileElement clMinute;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"OK\"]")
    MobileElement clOkButton;

    public void clickSetTime() {
        clTime.click();
        clModeTime.click();
        MobileElement jam = clHour;
        jam.click();
        jam.clear();
        jam.sendKeys("10");
        MobileElement jam2 = clMinute;
        jam2.click();
        jam2.clear();
        jam2.sendKeys("10");
        clOkButton.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.widget.ScrollView/android.view.View[15]")
    MobileElement clAddMember;

    public void clickAddMember() {
        clAddMember.click();
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.CheckBox")
    MobileElement clCheckAll;

    public void clickCheckAll() {
        clCheckAll.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"done\"]")
    MobileElement clDoneButton;

    public void clickDoneButton() {
        clDoneButton.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Start collecting answer!\"]")
    MobileElement clStartButton;

    public void clickStartCollectingAnswer() {
        clStartButton.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Create question successful\"]")
    MobileElement asrtQuestionNew;

    public void assertQuestionNew() {
        String message = asrtQuestionNew.getAttribute("content-desc");
        try {
            assertTrue(asrtQuestionNew.isDisplayed());
            Assert.assertEquals(message.toString(), "Create question successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View")
    List<MobileElement> clQuestion;

    public void clickQuestionList(int index){
       MobileElement ab = clQuestion.get(index);
       ab.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add new comment...\"]")
    MobileElement clAddComment;

    public void clickBoxAddNewComment() {
        clAddComment.click();
    }

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText")
    MobileElement inComment;

    public void inputCommment(String text) {
        MobileElement a = inComment;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(text);
    }

    public void inputCommmentBlank(String text) {
        MobileElement a = inComment;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(text);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"submit\"]")
    MobileElement clSubmit;

    public void clickSendMessage() {
        clSubmit.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'a moment ago')]")
    MobileElement assertSendComment;

    public void assertCommentNew() {
        String a = assertSendComment.getAttribute("content-desc");
        try {
            assertTrue(assertSendComment.isDisplayed());
            assertTrue(a.contains("a moment ago"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"comments can't be empty\"]")
    MobileElement asrtCommentEmpty;

    public void assertCommentEmpty() {
        String message = asrtCommentEmpty.getAttribute("content-desc");
        try {
            assertTrue(asrtCommentEmpty.isDisplayed());
            Assert.assertEquals(message.toString(), "comments can't be empty");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Reply\"]")
    MobileElement clReply;

    public void clickReplyComment() {
        clReply.click();
    }

    public void tapPointer() {

        PointOption pointOption = new PointOption().withCoordinates(435, 452);
        new TouchAction(appiumDriver).tap(pointOption).perform();
    }

    public void inputReplyComment(String name) {
        text = name;
        MobileElement a = inComment;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(name);
    }



    @AndroidFindBy(xpath = "//android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[1]")
    MobileElement clMentionLogo;

    public void clickMentionLogo() {
        clMentionLogo.click();
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ImageView")
    List<MobileElement> mentionList;

    public void clickMentionList(int index) {
        mentionList.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.view.View[2]/android.widget.EditText")
    MobileElement asrtMember;

    public void assertMentionMemberNew() {
        String a = asrtMember.getAttribute("content-desc");
        try {
            asrtMember.isDisplayed();
            assertTrue(asrtMember.isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ToggleButton")
    List<MobileElement> clFormatText;

    public void clickFormatText(int index){
        clFormatText.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[1]/android.widget.Button[2]")
    MobileElement clAttachLogo;

    public void clickAttachLogo() {
        clAttachLogo.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.widget.Button[1]")
    MobileElement clAttachImage;

    public void clickAttachImageLogo() {
        clAttachImage.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"by upload\"]")
    MobileElement clUpload;

    public void clickAttachByUpload() {
        clUpload.click();
    }

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.RelativeLayout")
    List<MobileElement> selImageView;

    public void clickSelImageView(int index) {
        selImageView.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"submit\"]")
    MobileElement clSubmitAttach;

    public void clickSubmitAttach() {
        clSubmitAttach.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'a moment ago')]")
    MobileElement assertSendAttach;

    public void assertAttachNew() {
        String a = assertSendAttach.getAttribute("content-desc");
        try {
            assertTrue(assertSendAttach.isDisplayed());
            assertTrue(a.contains("a moment ago"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"comments can't be empty\"]")
    MobileElement asrtCommentsEmpty;

    public void assertCommentsEmpty() {
        String message = asrtCommentsEmpty.getAttribute("content-desc");
        try {
            assertTrue(asrtCommentsEmpty.isDisplayed());
            Assert.assertEquals(message.toString(), "comments can't be empty");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.widget.Button[2]")
    MobileElement clAttachDocument;

    public void clickAttachDocumentLogo() {
        clAttachDocument.click();
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView")
    List<MobileElement> selDocumentView;

    public void clickSelFile(int index) {
        selDocumentView.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.widget.Button[2]")
    MobileElement clAttachVideo;

    public void clickAttachVideoLogo() {
        clAttachVideo.click();
    }

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[3]")
    MobileElement clNumbering;

    public void clickNumbering() {
        clNumbering.click();
    }

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
    MobileElement clBullets;

    public void clickBullets() {
        clBullets.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[@index='1']/android.widget.ImageView[last()]")
    MobileElement clCheers;

    public void clickCheersLogo() {
        clCheers.click();
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Give’em cheers!']")
    MobileElement inTextCheers;

    public void inputTextCheers(String textCheers) {
        MobileElement a = inTextCheers;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(textCheers);
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[@index='1']/android.view.View[2]")
    MobileElement clOkCheers;

    public void clickClOkCheers() {
        clOkCheers.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[@index='1']/android.widget.ImageView[last()-1]")
    MobileElement asrtCheers;

    public String assertCheers() {
        String a = asrtCheers.getAttribute("content-desc");

        return a;

    }
























}
