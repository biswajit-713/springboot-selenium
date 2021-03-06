package com.twhydqa.automationdemo.spreedemo.spree.component;


import com.twhydqa.automationdemo.spreedemo.spree.page.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Lazy
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HeaderComponent extends BasePage {

    @FindBy(css = ".search-icons")
    private List<WebElement> searchIcon;

    @FindBy(id = "account-button")
    private WebElement accountIcon;

    @FindBy(name = "")
    private WebElement cartIcon;

    @Override
    public boolean isAt() {
        return wait.until(driver -> accountIcon.isEnabled() && accountIcon.isDisplayed());
    }
}
