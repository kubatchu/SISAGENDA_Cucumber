package com.SisAgendal.org.SisAgendaFirstprogramwithCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class mutipleunide  {
	
	private static final long timeOutInSeconds = 0;
	WebDriver driver = null;
	

	
		// TODO Auto-generated method stub
		@When("^Navigate to Agendamento Mutiple pro unidade$")
		public void navigate_to_Agendamento_Mutiple_pro_unidade() throws Throwable {
			driver.findElement(By.xpath(".//*[@id='chBco_cBFm_desk_menu']/div[3]/a/span[2]")).click();
			 
			
		    
		}

		@When("^Clicks on  \"([^\"]*)\"$")
		public void clicks_on(String arg1) throws Throwable {
		     
		}

		@When("^Select the Especialidade option as \"([^\"]*)\"$")
		public void select_the_Especialidade_option_as(String arg1) throws Throwable {
		     
		}

		@When("^Localizer Agenda should be performed$")
		public void localizer_Agenda_should_be_performed() throws Throwable {
		     
		}

		@When("^schedule the  availability date$")
		public void schedule_the_availability_date() throws Throwable {
		    
		}

		@Then("^enter Agendar$")
		public void enter_Agendar() throws Throwable {
		     
		}

		@Then("^Canceler should be performed$")
		public void canceler_should_be_performed() throws Throwable {
		     
		}


	


}
