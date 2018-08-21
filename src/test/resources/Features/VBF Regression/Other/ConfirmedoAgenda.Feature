@tag
Feature: Preparation required for the procedure and configured for the unit.



  Scenario Outline: Preparation required for the procedure and configured for the unit.
    Given open the browser and enter username and password.
    When click on the "<Entrar>" button.
    And Click on the Confirmcao de Agenda
    And Enter the "<MarcOptica>" and click on the Enter
    And Select Fillal option as "<fillal>"
    And Select unidade option as "<Unidade>"
    And Select "<Especiliadade>"
    And Select "<Professional>"
    Then Click on the "<Buscar>"

Examples:

|fillal|Unidade|Especiliadade|Professional| 
|SÃO PAULO|CS BELEM I|UROLOGIA|MOTOMU OKAMOTO| 