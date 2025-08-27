package com.NaagarikFeedback.naagarikFeedback;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FeedbackSeleniumTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setup() {
        // No manual driver download needed if Edge is installed
        driver = new EdgeDriver();
    }

    @Test
    public void testHomePageLoads() {
        driver.get("http://localhost:8080/feedback/get-feedback");
        String pageSource = driver.getPageSource();
        assertTrue(pageSource.contains("["));
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
