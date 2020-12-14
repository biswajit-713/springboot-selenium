package com.twhydqa.automationdemo.spreedemo.spree;


import com.twhydqa.automationdemo.spreedemo.annotation.LazyAutowired;
import com.twhydqa.automationdemo.spreedemo.service.ScreenshotService;
import com.twhydqa.automationdemo.spreedemo.spree.page.SpreeLandingPage;
import org.junit.jupiter.api.Test;

//@RunWith(SpringRunner.class)
public class LandingFunctionalityTest extends SpringBaseTest {

    @LazyAutowired
    SpreeLandingPage spreeLandingPage;

    @LazyAutowired
    ScreenshotService screenshotService;

    @Test
    public void verifySearchFunctionality() {
        spreeLandingPage.goTo();
        spreeLandingPage.isAt();
        screenshotService.captureScreenshot("landingPage.png");
        spreeLandingPage.close();
    }

}
