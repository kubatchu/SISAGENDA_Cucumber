package StepDefintion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

 

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ReadPrppertiesFile;

public class StepDefinitionTC101 {

	private static final long timeOutInSeconds = 0;
	WebDriver driver = null;
	ReadPrppertiesFile readprovider;
	
	
	File assessFile = new File( "C:\\Users\\syagnamu\\eclipse-workspace\\SisAgendaFirstprogramwithCucumber\\configs\\Configuration.properties");
    public static Properties assessCheck = new Properties();
    FileInputStream assessCheckInput;
	private FluentWait<WebDriver> wait;

    {
        try {
            assessCheckInput = new FileInputStream(assessFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //load properties file
        try {
            assessCheck.load(assessCheckInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
		 
			
		    
		    
		

		@Given("^Login to the SisAgenda credentials with valid username and password$")
		public void login_to_the_SisAgenda_credentials_with_valid_username_and_password() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C://Users//syagnamu//Desktop//Selenium Dump//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
	    	
			driver.get(assessCheck.getProperty("url"));
			driver.findElement(By.xpath("//*[@id=\"txtCPFLogin\"]")).sendKeys(assessCheck.getProperty("username"));
			driver.findElement(By.xpath("//*[@id=\"txtSenha\"]")).sendKeys(assessCheck.getProperty("password")); 
			driver.findElement(By.xpath("//*[@id=\"btnEntrar\"]")).click();
		}

		@When("^Navgate to Procedimentos page$")
		public void navgate_to_Procedimentos_page() throws Throwable {
			Thread.sleep(20000);
			driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div[2]/div/div[1]/ul[3]/li/a")).click();
			driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div[2]/div/div[1]/ul[3]/li/ul/li[6]/a")).click();
			driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div[2]/div/div[1]/ul[3]/li/ul/li[6]/ul/li[7]/a")).click();
			
		    
		}

		@When("^Select the option as Tabela Procedimento$")
		public void select_the_option_as_Tabela_Procedimento() throws Throwable {
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul[1]/li/div/ul/li[1]/div[1]/div[2]/div[1]/span[1]/img")).click();
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul[1]/li/div/ul/li[1]/div[1]/div[2]/div[2]/a[1]/span")).click();
		     
		}

		@When("^user is able to  select Codigo filed and click on the Alterar$")
		public void user_is_able_to_select_Codigo_filed_and_click_on_the_Alterar() throws Throwable {
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul[1]/li/div/ul/li[2]/input[2]")).click();
			Thread.sleep(5000);
			WebElement Cadigo = driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/div[2]/div/div/div/ul[1]/li/input[2]"));
			Cadigo.sendKeys("Ambulatorial");
			Cadigo.sendKeys(Keys.ENTER);
			WebElement Caneler11 = driver.findElement(By.id("ctl00_ctl00_chBco_cBFm_uBuscaProcedimento_GvBusca_DXDataRow1"));
			 JavascriptExecutor js1=(JavascriptExecutor)driver;
			 js1.executeScript("arguments[0].click();", Caneler11);
			 //Thread.sleep(10000);
			//driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/div[2]/div/div/div/ul[2]/li/table/tbody/tr/td/div[2]/table/tbody/tr[1]/td[1]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul[2]/li/span[2]/a/span")).click();
		   driver.findElement(By.xpath("html/body/div[2]/div[2]/div[2]/input")).click();
		   
		    
		}

		@Then("^Navigate to Home page$")
		public void navigate_to_Home_page() throws Throwable {
			Thread.sleep(5000);
			driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div[2]/div/div[1]/ul[1]/li/a")).click();
			driver.findElement(By.linkText("Home")).click();
		     
		}

		@Then("^Navigate Agendamento Exame page$")
		public void navigate_Agendamento_Exame_page() throws Throwable {
			 
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div[2]/a/span[2]")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[1]/td/div[2]/table/tbody/tr[1]/td[1]/span[2]/div/span/div[2]/div[1]/span[1]/img")).click();
			driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[1]/td/div[2]/table/tbody/tr[1]/td[1]/span[2]/div/span/div[2]/div[2]/a[7]/span")).click();
			WebElement MarcOp = driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[1]/td/div[2]/table/tbody/tr[1]/td[1]/span[2]/span[1]/div/input[1]"));
			MarcOp.sendKeys("962021733");
			MarcOp.sendKeys(Keys.ENTER);
//			driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[1]/td/div[2]/table/tbody/tr[1]/td[1]/span[2]/span[1]/div/input[1]")).sendKeys(assessCheck.getProperty("MO"));
			
		     
		}

		@Then("^Enter Ambulatorial Exam in Exam Filed$")
		public void enter_Ambulatorial_Exam_in_Exam_Filed() throws Throwable {
			WebDriverWait wait=new WebDriverWait(driver,10000);
			wait.until(ExpectedConditions.elementToBeClickable(By.name("ctl00$ctl00$chBco$cBFm$TxtPesquisaProcedimento")));
			WebElement Exam= driver.findElement(By.name("ctl00$ctl00$chBco$cBFm$TxtPesquisaProcedimento"));
					Exam.sendKeys("Ambulatorial");
			        Exam.sendKeys(Keys.ENTER);
			        driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[1]/div[2]/div/div/ul/li[1]/div/div/input[2]")).click();
			  	  
			  	   
			
		}

		@Then("^Click on the specialitty and unidade and professional$")
		public void click_on_the_specialitty_and_unidade_and_professional() throws Throwable {
	
			Thread.sleep(40000);
			driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[2]/div/div/div/table/tbody/tr/td[3]/button")).click();
			  Thread.sleep(5000);
			  WebElement oCheckBox = driver.findElement(By.cssSelector("#ui-multiselect-chBco_cBFm_rptAccordionAll_rptComAgendamento_0_LstRegioes_0-option-0"));
			  oCheckBox.click();
			  Thread.sleep(20000);
			  driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[2]/div/div/div/table/thead/tr/th[4]")).click();
			  Thread.sleep(30000);
			  driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[2]/div/div/div/table/tbody/tr/td[4]/button")).click();
			  Thread.sleep(30000);
			  driver.findElement(By.linkText("Marcar todos")).click();
			  Thread.sleep(10000);
			  driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[2]/div/div/div/table/thead/tr/th[5]")).click();
			  Thread.sleep(10000);
			  driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[2]/div/div/div/table/tbody/tr/td[5]/button")).click();
			  Thread.sleep(10000);
			  driver.findElement(By.linkText("Marcar todos")).click();
			  Thread.sleep(10000);
			   driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/div/table/tbody/tr/td[1]/span[2]/a[1]/span")).click();
			   Thread.sleep(10000);
			  
}

		@Then("^click on the Lolizer Agenda$")
		public void click_on_the_Lolizer_Agenda() throws Throwable {
			
			 WebElement LocalizerAgenda = driver.findElement(By.id("chBco_cBFm_BtnLocalizarAgenda"));
			   JavascriptExecutor js=(JavascriptExecutor)driver;
			   js.executeScript("arguments[0].click();", LocalizerAgenda);

		
			

		     
		}

		@Then("^schedule the immediate slot$")
		public void schedule_the_immediate_slot() throws Throwable {
			Thread.sleep(5000);
	driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[2]/tbody/tr/td[2]/div/div/div/div[1]/div/div[1]/table/tbody/tr[1]/td/span/label")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("html/body/form/div[32]/div[1]/a/span")).click();
	 WebElement ConfirmerAgenda = driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/div/table/tbody/tr/td[2]/a/span"));
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click();", ConfirmerAgenda);
	   Thread.sleep(10000);
	   driver.findElement(By.xpath("html/body/form/div[26]/div[2]/div/fieldset[3]/div/span/a/span")).click();
	   
			
        
			
			
			
			
			
		}
			 

		@Then("^click on the Confirmar Agenda\\.$")
		public void click_on_the_Confirmar_Agenda() throws Throwable {
			
			
		   
		}

	}


