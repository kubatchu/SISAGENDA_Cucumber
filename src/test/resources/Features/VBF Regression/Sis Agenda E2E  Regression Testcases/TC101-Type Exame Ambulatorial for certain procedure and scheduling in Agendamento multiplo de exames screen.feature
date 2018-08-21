@tag
Feature: Regression VBF
  Validate Type Exame Ambulatorial for certain procedure and scheduling in Agendamento multiplo de exames screen

  @tag2
  Scenario Outline: Validate Type Exame Ambulatorial for certain procedure and scheduling in Agendamento multiplo de exames screen
    Given Login to the SisAgenda credentials with valid username and password
    When Navgate to Procedimentos page
    And Select the option as Tabela Procedimento
    And user is able to  select Codigo filed and click on the Alterar
    Then Navigate to Home page
    And Navigate Agendamento Exame page
    And Enter Ambulatorial Exam in Exam Filed
    And Click on the specialitty and unidade and professional
    And click on the Lolizer Agenda
    And schedule the immediate slot
    Then click on the Confirmar Agenda.

    Examples: 
      | Filall    | MarcOptica |
      | SÃO PAULO |  982261446 |
