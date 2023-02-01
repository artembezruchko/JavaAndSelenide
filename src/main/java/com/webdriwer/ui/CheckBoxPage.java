package com.webdriwer.ui;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxPage {
    public static CheckBoxPage open() {
        Selenide.open("/checkbox");
        return new CheckBoxPage( );
    }

    public CheckBoxPage clickHomeCheckBox () {
        $(By.xpath("//span[@class='rct-checkbox']")).click();
        return this;
    }

    public CheckBoxPage clickOpenList () {
        $(By.xpath("//button[@aria-label='Expand all']")).click();
        return this;
    }

    public CheckBoxPage clickByNameCheckBox(String name){
        $(By.xpath("//span[text()='" + name + "']")).scrollTo().click();
        return this;
    }

    public String getTextOfResult () {
        return $(By.id("result")).getText();
    }
}
