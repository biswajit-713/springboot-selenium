package com.twhydqa.automationdemo.spreedemo.demo;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class DemoPage {

    private String driverName = "chrome";

    public DemoPage() {
        System.out.println("Demo page is instantiated");
    }

    public String getDriverName() {
        return driverName;
    }
}
