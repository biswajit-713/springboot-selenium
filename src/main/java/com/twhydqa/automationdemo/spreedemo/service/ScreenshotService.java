package com.twhydqa.automationdemo.spreedemo.service;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

//@Service
public class ScreenshotService {

//    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}")
    private Path path;

//    public void captureScreenshot(final String imgName) throws IOException {
//        File sourceFile = this.driver.getScreenshotAs(OutputType.FILE);
//        FileCopyUtils.copy(sourceFile, this.path.resolve(imgName).toFile());
//    }

//    @PostConstruct
//    public void afterConstructorIsCalled() {
//    }
}
