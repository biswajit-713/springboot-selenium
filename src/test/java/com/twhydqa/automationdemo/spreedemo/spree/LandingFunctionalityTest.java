package com.twhydqa.automationdemo.spreedemo.spree;


import com.twhydqa.automationdemo.spreedemo.service.ScreenshotService;
import com.twhydqa.automationdemo.spreedemo.spree.page.SpreeLandingPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

//@RunWith(SpringRunner.class)
public class LandingFunctionalityTest extends SpringBaseTest {

    @Lazy
    @Autowired
    SpreeLandingPage spreeLandingPage;

    @Lazy
    @Autowired
    ScreenshotService screenshotService;

    @Test
    public void verifySearchFunctionality() {
        spreeLandingPage.goTo();
        spreeLandingPage.isAt();
        screenshotService.captureScreenshot("landingPage.png");
        spreeLandingPage.close();
    }

}
