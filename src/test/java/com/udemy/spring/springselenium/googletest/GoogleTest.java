package com.udemy.spring.springselenium.googletest;

import com.google.common.util.concurrent.Uninterruptibles;
import com.udemy.spring.springselenium.SpringBaseTestNGTest;
import com.udemy.spring.springselenium.page.google.GooglePage;
import com.udemy.spring.springselenium.util.ScreenShotUtil;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GoogleTest extends SpringBaseTestNGTest{
    @Autowired
    private GooglePage googlePage;
    @Lazy
    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public  void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        this.googlePage.getSearchComponent().search("spring boot");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());

        //Assert.assertFalse(this.googlePage.getSearchResult().getCount()>2);
        //this.screenShotUtil.takeScreenShot();
    }

}
