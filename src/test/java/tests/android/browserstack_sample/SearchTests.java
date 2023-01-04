package tests.android.browserstack_sample;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import java.net.MalformedURLException;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {

    @Test
    void successSearchTest() throws MalformedURLException, InterruptedException {
        step("Skip onboarding pages", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0)));
    }

    @Test
    void openArticle() throws MalformedURLException, InterruptedException {
        step("Skip onboarding pages", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Selenide");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0)));
        step("Choose page", () ->
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click());
        step("Verify opened page", () ->
                $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Selenide")));
    }
}
