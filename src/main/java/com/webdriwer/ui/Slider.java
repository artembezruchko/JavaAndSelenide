package com.webdriwer.ui;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class Slider {

    public static Slider open() {
        Selenide.open("/slider");
        return new Slider();
    }

    public Slider clickAndMoveSlider(int x) {
       SelenideElement element  = $(By.xpath("//div[@class='range-slider__tooltip range-slider__tooltip--auto range-slider__tooltip--bottom']"));
       actions().moveToElement(element).clickAndHold().moveByOffset(x, 0).perform();
       return this;
    }

    public String getResult() {
        return $(By.id("sliderValue")).getValue();
    }
}
