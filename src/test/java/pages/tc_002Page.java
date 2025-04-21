package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    private WebDriver driver;

    // Elementos Web
    private By newRepoButton = By.xpath("//button[@aria-label='New repository']");
    private By repoNameField = By.id("repository_name");
    private By repoDescriptionField = By.id("repository_description");
    private By createRepoButton = By.xpath("//button[contains(text(),'Create repository')]");
    private By repoUrlField = By.xpath("//a[@id='repository-url']");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaPrincipal() {
        driver.get("https://github.com");
    }

    public void crearNuevoRepositorio(String repoName, String repoDescription) {
        driver.findElement(newRepoButton).click();
        driver.findElement(repoNameField).sendKeys(repoName);
        driver.findElement(repoDescriptionField).sendKeys(repoDescription);
        driver.findElement(createRepoButton).click();
    }

    public boolean verificarRepositorioCreado() {
        return driver.findElement(repoUrlField).isDisplayed();
    }

    public String obtenerUrlRepositorio() {
        return driver.findElement(repoUrlField).getText();
    }
}