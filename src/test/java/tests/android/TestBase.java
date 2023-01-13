package tests.android;

import com.codeborne.selenide.Configuration;
import drivers.BrowserstackMobileDriver;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.Attach.getSessionId;

public class TestBase {
    public static String testType = System.getProperty("testType");
    @BeforeAll
    public static void setup() {
        if (testType == null) {
            testType = "local";
        }
// gradle clean test -DtestType=browserstack/local
        switch (testType) {
            case "local":
                Configuration.browser = LocalMobileDriver.class.getName();
                System.out.println("local test start");
                break;
            case "browserstack":
                Configuration.browser = BrowserstackMobileDriver.class.getName();
                System.out.println("remote test start");
                break;
        }

        Configuration.browserSize = null;
    }

    @BeforeEach
    void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void tearDown() {

        String sessionId = getSessionId();

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        closeWebDriver();

        switch (testType) {
            case "browserstack":
                Attach.video(sessionId);
                break;
        }
    }
}
