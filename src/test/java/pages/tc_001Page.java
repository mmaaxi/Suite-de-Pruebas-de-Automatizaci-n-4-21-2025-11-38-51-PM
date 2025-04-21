package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_001Page {

    WebDriver driver;

    public tc_001Page() {
        // You would typically set up your WebDriver here
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    public void navigateToGoogleSheets() {
        driver.get("https://docs.google.com/spreadsheets/d/19D4nTni00KCRxsznO0dT01hVmAfVRuf5oGO1QnrfUNo");
    }

    public void verifyConnection() {
        // Implementation to verify if the connection is successful
        WebElement sheetElement = driver.findElement(By.id("doc-title")); // Example element
        if (!sheetElement.isDisplayed()) {
            throw new RuntimeException("Failed to connect to Google Sheets");
        }
    }

    public void readDataFromSheet() {
        // Implementation to read data from the Google Sheet
        WebElement dataCell = driver.findElement(By.xpath("//div[@class='cell-input']")); // Example cell
        String data = dataCell.getText();
        if (data.isEmpty()) {
            throw new RuntimeException("No data present in the sheet");
        }
        System.out.println("Data from sheet: " + data);
    }
}