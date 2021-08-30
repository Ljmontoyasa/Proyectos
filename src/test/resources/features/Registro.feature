#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
@Regresion
Feature: ingreso orange

  @Caso1
  Scenario Outline: ingresó orange
    Given abrir el navegador
    When ingrese el username <userName> y la contraseña <password>

    Examples: 
      | userName | password |
      | Admin    | admin123 |

  @Caso2
  Scenario Outline: crear un employee
    Given abrir el navegador
    When ingrese el username <userName> y la contraseña <password>
    And Acceder a la opcion add employee
    Then diligenciar los campos firt name <firtName> y last name <lastName>

    Examples: 
      | userName | password | firtName      | lastName |
      | Admin    | admin123 | Linda Julieth | Montoya   |