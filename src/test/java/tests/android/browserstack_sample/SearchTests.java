package tests.android.browserstack_sample;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import java.net.MalformedURLException;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchTests extends TestBase {

    @Test
    void successSearchTest() throws MalformedURLException, InterruptedException {

        $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        $(AppiumBy.accessibilityId("Search Wikipedia")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));
    }
}
