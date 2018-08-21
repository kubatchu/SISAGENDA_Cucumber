 @tag
Feature: MutiplePorUnidade
   Verify the End to End flow of MutiplePorUnidade 

  
  @tag2
  Scenario: Verify the End to End flow of MutiplePorUnidade
     Given Login username password and Entrar button
     When  Click on the Agendamento Mutiple unidade 
     And Enter MarcOptica and enter "<Unidade>"
     And Select Especiliadade  and professional
     And click on the Localizer agenda
     And schedule availabitility time and click on the aleragologia
     Then click on the confirm agenda and agenda.
     

    
