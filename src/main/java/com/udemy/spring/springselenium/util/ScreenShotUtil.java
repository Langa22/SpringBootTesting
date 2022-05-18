package com.udemy.spring.springselenium.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
@Lazy
@Component
public class ScreenShotUtil {
    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}/img.png")
    private Path path;
    @PostConstruct
    private void init(){
        for(int i=0;i<1;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Sleeping...");
        }
    }
    public void takeScreenShot() throws IOException {
       File file= this.driver.getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(file,this.path.toFile());
    }
}
