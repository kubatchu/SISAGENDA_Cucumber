package StepDefintion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.eclipse.jetty.websocket.api.InvalidWebSocketException;
import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import okhttp3.internal.connection.RouteSelector.Selection;

public class MutipleExameStepandCode {
	
	private static final FluentWait<WebDriver> wait = null;
	WebDriver driver = null;
	@When("^Click on the AgendamentoMutipleExame link$")
	public void click_on_the_AgendamentoMutipleExame_link() throws Throwable {
		 
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div[2]/a/span[2]")).click();
		
	}

	@When("^Select the filall option as \"([^\"]*)\"$")
	public void select_the_filall_option_as(String arg1) throws Throwable {
		driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[1]/td/div[2]/table/tbody/tr[1]/td[1]/span[2]/div/span/div[2]/div[1]/span[1]/img")).click();
		driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[1]/td/div[2]/table/tbody/tr[1]/td[1]/span[2]/div/span/div[2]/div[2]/a[7]/span")).click();
	}

	@When("^Enter M(\\d+) as \"([^\"]*)\"$")
	public void enter_M_as(int arg1, String arg2) throws Throwable {
		WebElement MO=driver.findElement(By.name("ctl00$ctl00$chBco$cBFm$txtBuscaMO"));
		MO.sendKeys("904486222");
		MO.sendKeys(Keys.ENTER);

	}

	@When("^Enter the Exame as \"([^\"]*)\"$")
	public void enter_the_Exame_as(String arg1) throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver,10000);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("ctl00$ctl00$chBco$cBFm$TxtPesquisaProcedimento")));
		WebElement Exam= driver.findElement(By.name("ctl00$ctl00$chBco$cBFm$TxtPesquisaProcedimento"));
				Exam.sendKeys("ECG");
		        Exam.sendKeys(Keys.ENTER);
	}

	@When("^Select the available Exame$")
	public void select_the_available_Exame() throws Throwable {
		 driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[1]/div[2]/div/div/ul/li[1]/div/div/input[2]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[2]/div/div/div/table/tbody/tr/td[3]/button")).click();
		  Thread.sleep(5000);
		  
	}

	@When("^Select Marcartodas from \"([^\"]*)\" dropdown$")
	public void select_Marcartodas_from_dropdown(String arg1) throws Throwable {
		WebElement oCheckBox = driver.findElement(By.cssSelector("#ui-multiselect-chBco_cBFm_rptAccordionAll_rptComAgendamento_0_LstRegioes_0-option-0"));
		  oCheckBox.click();
		  Thread.sleep(10000);
		  driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[2]/div/div/div/table/thead/tr/th[4]")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[2]/div/div/div/table/tbody/tr/td[4]/button")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.linkText("Marcar todos")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[2]/div/div/div/table/thead/tr/th[5]")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[2]/div/div/div/table/tbody/tr/td[5]/button")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.linkText("Marcar todos")).click();
		  Thread.sleep(10000);
		   driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/div/table/tbody/tr/td[1]/span[2]/a[1]/span")).click();
	}

	@When("^Click on the LocalizerAgenda$")
	public void click_on_the_LocalizerAgenda() throws Throwable {
		Thread.sleep(10000);
		 WebElement LocalizerAgenda = driver.findElement(By.id("chBco_cBFm_BtnLocalizarAgenda"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", LocalizerAgenda);
		 
	}

	@When("^Scedule the appointment based on the availability$")
	public void scedule_the_appointment_based_on_the_availability() throws Throwable {
		Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver, 60) ;
		List<WebElement>availableSlots=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//td[contains(@class,'CalendarMultiploDiaTotal')]")));
		 if(availableSlots.size()>0)
		 {
			   availableSlots.get(0);
			   
		 }
		 else
		 {
			   throw new Exception("There are no slots are available in current month");
		 }
	}

	@When("^Select Professional$")
	public void select_Professional() throws Throwable {
		Thread.sleep(10000);
		 driver.findElement(By.xpath(".//*[@id='chBco_cBFm_RptHorariosExames_RptHorariosExamesItens_0_RblHorarios_0']/tbody/tr[1]/td/span/label")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.id("dialog-button")).click();
		 Thread.sleep(10000);
	}

	@When("^click on the Confirmaragenda$")
	public void click_on_the_Confirmaragenda() throws Throwable {
		WebElement Caneler = driver.findElement(By.id("chBco_cBFm_PreparoCondicao1_btnFecharCondicao"));
		 JavascriptExecutor js1=(JavascriptExecutor)driver;
		 js1.executeScript("arguments[0].click();", Caneler);
		 Thread.sleep(10000);
		 WebElement confirmAgenda = driver.findElement(By.id("chBco_cBFm_BtnConfirmarAgendaMultipla"));
		 JavascriptExecutor js2=(JavascriptExecutor)driver;
		 js2.executeScript("arguments[0].click();", confirmAgenda);
	}

	@Then("^Click on the\"([^\"]*)\"$")
	public void click_on_the(String arg1) throws Throwable {
		//Agebsa
		 Thread.sleep(10000);
		// driver.findElement(By.xpath(".//*[@id='chBco_cBFm_IncluirAgendamento1_BtnAgendar']/span/img")).click();
		 WebElement Dialogue =  driver.findElement(By.xpath(".//*[@id='chBco_cBFm_IncluirAgendamento1_BtnAgendar']/span/img"));
		 JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click();", Dialogue);
		// //Agenda
		WebDriverWait AgendaWait=new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/form/div[26]/div[2]/div/fieldset[3]/div/span/a/span")));
		WebElement Agenda= driver.findElement(By.xpath("html/body/form/div[26]/div[2]/div/fieldset[3]/div/span/a/span"));
		Thread.sleep(5000);
	    	}
}
