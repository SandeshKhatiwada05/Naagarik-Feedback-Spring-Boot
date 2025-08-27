package com.NaagarikFeedback.naagarikFeedback;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FeedbackSeleniumTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setup() {
        // Setup EdgeDriver automatically
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testFeedbackListPageLoads() {
        // Open the page
        driver.get("http://localhost:8080/feedback-list.html");

        // Wait for the table to be visible (up to 20 seconds)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement feedbackTable = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.tagName("table"))
        );

        // Check that the table contains some content
        String tableText = feedbackTable.getText();
        System.out.println("Table content:\n" + tableText);
        assertTrue(tableText.length() > 0, "The feedback table should contain data");
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        if (driver != null) {
            // Optional: Wait a bit before closing to see the result
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
