package com.webdriwer.ui.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseUITest {
    @BeforeClass
    public void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "chrome"; 
    }
    protected <T> T at(Class<T> pageClass){
        return Selenide.page(pageClass);
    }

    public void waitSeconds(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod
    public void cleanCookies() {
        Selenide.clearBrowserCookies();
    }

    @AfterClass
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
