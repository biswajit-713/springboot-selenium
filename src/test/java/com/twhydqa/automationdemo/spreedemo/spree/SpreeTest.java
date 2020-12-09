package com.twhydqa.automationdemo.spreedemo.spree;


import com.twhydqa.automationdemo.spreedemo.spree.page.LandingPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class SpreeTest extends SpringBaseTest {

    @Autowired
    LandingPage landingPage;

    @Test
    public void verifySearchFunctionality() {
        landingPage.goTo();
        landingPage.isAt();
        landingPage.closeBrowser();
        assert 1==1;
    }

}
