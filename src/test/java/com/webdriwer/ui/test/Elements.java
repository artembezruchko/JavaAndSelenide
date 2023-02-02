package com.webdriwer.ui.test;

import com.webdriwer.ui.CheckBoxPage;
import com.webdriwer.ui.TexBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Elements extends BaseUITest {

    @Test
    public void userLoginWithValidCredentials() {
        String expectedText = "Name:name\n" +
                "Email:email@email.com\n" +
                "Current Address :text1\n" +
                "Permananet Address :text2";
        String text = TexBoxPage.open().fillTextBoxForm("name", "email@email.com", "text1", "text2")
                .sendTextBoxForm().getTextResponse();

        Assert.assertEquals(text, expectedText);

        TexBoxPage texBoxPage = at(TexBoxPage.class);
        texBoxPage.getTextResponse();
    }

    @Test
    public void testSelectCheckBoxAll() {
        String expectedText = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        String text = CheckBoxPage.open().clickHomeCheckBox().getTextOfResult();

        Assert.assertEquals(text, expectedText);
        waitSeconds(5);
    }

    @Test
    public void testSelectCheckBoxByName() {
        String expectedText = "You have selected :\n" +
                "general";
        String text = CheckBoxPage.open().clickOpenList().clickByNameCheckBox("General").getTextOfResult();
        Assert.assertEquals(text, expectedText);
    }

}
