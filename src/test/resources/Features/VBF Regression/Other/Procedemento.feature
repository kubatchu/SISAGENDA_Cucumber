
@tag
Feature: Validate the precedemtos page.

  @tag1
  Scenario: Validate Type Ambulatorial for certain procedure
    Given Logged in to the SisAgenda credentials with valid username and password
    When Goto to Procedimentos page
    And Select the Tabela Procedimento
    Then  Codigo filed and click on the Alterar
    

  