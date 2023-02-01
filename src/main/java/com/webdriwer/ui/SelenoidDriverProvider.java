package com.webdriwer.ui;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class SelenoidDriverProvider implements WebDriverProvider {

    private static final String hubUrl =  "huburl";

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        DesiredCapabilities browser = new DesiredCapabilities();
        browser.setBrowserName("chrome");
        browser.setVersion("108");
        browser.setCapability("enableVNC", true);

        try {
            RemoteWebDriver driver = null;
                driver = new RemoteWebDriver(
                        URI.create(hubUrl).toURL(),
                        browser
                );
            driver.manage().window().setSize(new Dimension(1280, 1024));
            driver.setFileDetector(new LocalFileDetector());
            return driver;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
