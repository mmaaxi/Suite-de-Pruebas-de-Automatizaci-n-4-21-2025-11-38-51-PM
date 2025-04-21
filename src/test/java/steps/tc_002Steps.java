package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;
import static org.junit.Assert.assertTrue;

public class tc_002Steps {
    private WebDriver driver;
    private tc_002Page repoPage;

    @Given("el usuario está autenticado en GitHub")
    public void usuarioAutenticadoEnGitHub() {
        // Suponiendo que el driver se haya inicializado y el usuario está autenticado
        // Iniciar Page Object para la página
        repoPage = new tc_002Page(driver);
        repoPage.navegarAPaginaPrincipal();
    }

    @When("el usuario ejecuta el script de creación de repositorio")
    public void usuarioEjecutaScriptCreacionRepositorio() {
        repoPage.crearNuevoRepositorio("NuevoRepositorio", "Este es un nuevo repositorio de prueba");
    }

    @Then("el repositorio es creado exitosamente")
    public void repositorioCreadoExitosamente() {
        assertTrue(repoPage.verificarRepositorioCreado());
    }

    @Then("la URL del repositorio es retornada")
    public void urlRepositorioRetornada() {
        String url = repoPage.obtenerUrlRepositorio();
        assertTrue(url.contains("NuevoRepositorio"));
    }
}