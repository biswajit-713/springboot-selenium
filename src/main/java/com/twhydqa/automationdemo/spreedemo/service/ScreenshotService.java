package com.twhydqa.automationdemo.spreedemo.service;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@Lazy
@Service
public class ScreenshotService {

    @Autowired
    private ApplicationContext context;

//    @Autowired
//    private TakesScreenshot driver;

    @Value("${screenshot.path}")
    private Path path;

    public void captureScreenshot(final String imgName) {
//        File sourceFile = this.driver.getScreenshotAs(OutputType.FILE);

//        just in time bean collection
        File sourceFile = this.context.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
        try {
            FileCopyUtils.copy(sourceFile, this.path.resolve(imgName).toFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostConstruct
    public void afterConstructorIsCalled() {
    }
}
