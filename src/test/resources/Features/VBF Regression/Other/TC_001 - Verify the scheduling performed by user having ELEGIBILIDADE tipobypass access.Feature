
@tag
Feature: VBF Regression
  TC_001 - Verify the scheduling performed by user having ELEGIBILIDADE tipobypass access

 @tag2
  Scenario Outline: Verify the scheduling performed by user having ELEGIBILIDADE tipobypass access
     Given Login SisAgenda with valid username and password
     When click on the Agendamento.net link in the Home page
     And select "<Filall>" and  Enter the MarcOptica
     And Select option as "<Especialidade>" 
     And Select  unidade as "<Unidade>" 
     And enter the Usuario and senha 
     And  give the justivicativa and click on the Verificar button
     And Select option as "<Professional>"
     And schedule the appointment 
     And  select the Agendamentos Varios precendamentos
     Then Click on the Agendar and click on the Fetcher
     
       	
    Examples: 
      | Filall  | MarcOptica| Especialidade  |Unidade|Professional|
      | SAO PAULO | 219267731|GASTROENTEROLOGIA |CS CARRAO I|MARIANGELA CARDOSO ALVES PEREIRA|
      