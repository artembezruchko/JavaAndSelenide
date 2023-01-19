package com.webdriwer.ui.test;

import com.webdriwer.ui.TexBoxPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Login  {

    @Test
    public void userLoginWithValidCredentials() {
//        open("https://demoqa.com/text-box");
//        $(By.id("userName")).setValue("Artem");
//        $(By.id("userEmail")).setValue("art@art.com");
//        $(By.id("submit")).click();
        String expectedText = "Name:name\n" +
                "Email:email@email.com\n" +
                "Current Address :text1\n" +
                "Permananet Address :text2";
        String text = TexBoxPage.open().fillTextBoxForm("name", "email@email.com", "text1", "text2")
                .sendTextBoxForm().getTextResponse();

        Assert.assertEquals(text, expectedText);

    }

}
