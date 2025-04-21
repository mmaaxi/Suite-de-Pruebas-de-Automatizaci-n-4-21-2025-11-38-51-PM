Feature: Crear repositorio en GitHub

  Scenario: Crear un repositorio nuevo en GitHub
    Given el usuario está autenticado en GitHub
    When el usuario ejecuta el script de creación de repositorio
    Then el repositorio es creado exitosamente
    And la URL del repositorio es retornada