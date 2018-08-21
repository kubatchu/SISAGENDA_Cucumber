@tag
Feature: Agendamento Mutiple Exame
   Verify the Agendamento Mutiple Exame End to End flow

  @tag2
  Scenario Outline: Validate user is able to confirm the Agendamento Mutiple Exame
    Given open the browser and enter username and password.
    When click on the "<Entrar>" button.
    And Click on the AgendamentoMutipleExame link
    And Select the filall option as "<Filall>"
    And Enter M0 as "<MarcOptica>"
    And Enter the Exame as "<Exam>"
    And Select the available Exame
    And Select Marcartodas from "<Regiao>" dropdown
    And Select Marcartodas from "<Unidade>" dropdown
    And Select Marcartodas from "<Professional>" dropdown
    And Click on the LocalizerAgenda
    And Scedule the appointment based on the availability
    And Select Professional
    And click on the Confirmaragenda
    Then Click on the"<Agendar>"

    Examples: 
      | Filall    | MarcOptica | Agendar |
      | SÃO PAULO |  450429474 | Agendar |
