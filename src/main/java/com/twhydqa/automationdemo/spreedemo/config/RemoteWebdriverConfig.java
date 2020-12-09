package com.twhydqa.automationdemo.spreedemo.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;

import java.net.URL;

@Configuration
@Profile("remote")
public class RemoteWebdriverConfig {

    @Value("${selenium.grid.url}")
    private URL url;

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver remoteFirefoxDriver() {
        return new RemoteWebDriver(url, DesiredCapabilities.firefox());
    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public WebDriver remoteChromeDriver() {
        return new RemoteWebDriver(url, DesiredCapabilities.chrome());
    }

    @Bean
    @ConditionalOnMissingBean
    public WebDriver remoteDefaultDriver() {
        return new RemoteWebDriver(url, DesiredCapabilities.chrome());
    }
}
