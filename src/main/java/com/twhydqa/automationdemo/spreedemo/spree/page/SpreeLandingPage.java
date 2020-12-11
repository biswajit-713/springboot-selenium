package com.twhydqa.automationdemo.spreedemo.spree.page;

import com.twhydqa.automationdemo.spreedemo.spree.component.HeaderComponent;
import com.twhydqa.automationdemo.spreedemo.spree.page.basepage.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpreeLandingPage extends BasePage {

    @Lazy
    @Autowired
    private HeaderComponent header;

    @Value("${application.url}")
    private String url;

    public HeaderComponent getHeaderComponent() {
        return header;
    }

    public void goTo() {
        driver.get(url);
    }

    @Override
    public boolean isAt() {
        return header.isAt();
    }
}
