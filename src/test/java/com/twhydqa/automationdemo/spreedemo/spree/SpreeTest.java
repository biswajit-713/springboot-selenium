package com.twhydqa.automationdemo.spreedemo.spree;


import com.twhydqa.automationdemo.spreedemo.service.ScreenshotService;
import com.twhydqa.automationdemo.spreedemo.spree.page.LandingPage;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
public class SpreeTest extends SpringBaseTest {

    @Lazy
    @Autowired
    LandingPage landingPage;

    @Lazy
    @Autowired
    ScreenshotService screenshotService;

    @Test
    public void verifySearchFunctionality() {
        landingPage.goTo();
        landingPage.isAt();
        screenshotService.captureScreenshot("landingPage.png");
        landingPage.closeBrowser();
        assert 1==1;
    }

}
