package com.twhydqa.automationdemo.spreedemo;

import com.twhydqa.automationdemo.spreedemo.demo.DemoPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpreedemoApplicationTests {

    @Value("${test.driver:chrome}")
    String testDriver;

    @Test
    public void contextLoad() {
        DemoPage page = new DemoPage();
        assert page.getDriverName().equalsIgnoreCase(testDriver);
    }
}
