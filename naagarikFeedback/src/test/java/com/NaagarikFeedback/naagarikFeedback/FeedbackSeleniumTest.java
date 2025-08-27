import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FeedbackSeleniumTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setup() {
        // Make sure you have chromedriver in PATH
        driver = new ChromeDriver();
    }

    @Test
    public void testHomePageLoads() {
        driver.get("http://localhost:8080/feedback/get-feedback"); // Adjust if frontend exists
        String pageSource = driver.getPageSource();
        assertTrue(pageSource.contains("[")); // crude check: JSON array present
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
