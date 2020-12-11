package com.twhydqa.automationdemo.spreedemo.spree;

import com.twhydqa.automationdemo.spreedemo.service.ScreenshotService;
import com.twhydqa.automationdemo.spreedemo.spree.page.SpreeLandingPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class SearchFunctionalityTest extends SpringBaseTest {

    @Lazy
    @Autowired
    private SpreeLandingPage landingPage;

    @Lazy
    @Autowired
    private ScreenshotService screenshotService;

    @Test
    public void verifySearch() {
        landingPage.goTo();
        landingPage.isAt();
        screenshotService.captureScreenshot("search.png");
        landingPage.close();
    }
}
