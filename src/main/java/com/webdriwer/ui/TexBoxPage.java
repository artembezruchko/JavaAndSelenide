package com.webdriwer.ui;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TexBoxPage {

    public static TexBoxPage open() {
        Selenide.open("https://demoqa.com/text-box");
        return new TexBoxPage( );
    }

    public TexBoxPage fillTextBoxForm (String userName, String userEmail, String currentAddress, String permanentAddress) {
        $(By.id("userName")).setValue(userName);
        $(By.id("userEmail")).setValue(userEmail);
        $(By.id("currentAddress")).setValue(currentAddress);
        $(By.id("permanentAddress")).setValue(permanentAddress);
        return this;
    }

    public TexBoxPage sendTextBoxForm(){
        $(By.id("submit")).scrollTo().click();
        return this;
    }

    public String getTextResponse(){
        return $(By.id("output")).getText();
    }
}
