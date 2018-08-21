package VBFStedefinitions;

import org.openqa.selenium.By;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ReadPrppertiesFile;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ReadPrppertiesFile;

public class TC_001 {
	private static final long timeOutInSeconds = 0;
	WebDriver driver = null;
	ReadPrppertiesFile readprovider;
	
	
	File assessFile = new File( "C:\\Users\\syagnamu\\eclipse-workspace\\SisAgendaFirstprogramwithCucumber\\configs\\Configuration.properties");
    public static Properties assessCheck = new Properties();
    FileInputStream assessCheckInput;

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
		 

	
	@Given("^Login SisAgenda with valid username and password$")
	public void login_SisAgenda_with_valid_username_and_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Users//syagnamu//Desktop//Selenium Dump//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
    	
		driver.get(assessCheck.getProperty("url"));
		driver.findElement(By.xpath("//*[@id=\"txtCPFLogin\"]")).sendKeys(assessCheck.getProperty("username"));
		driver.findElement(By.xpath("//*[@id=\"txtSenha\"]")).sendKeys(assessCheck.getProperty("password")); 
		driver.findElement(By.xpath("//*[@id=\"btnEntrar\"]")).click();
	     
	}

	@When("^click on the Agendamento\\.net link in the Home page$")
	public void click_on_the_Agendamento_net_link_in_the_Home_page() throws Throwable {
		
		driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div[1]/a/span[2]")).click();
		 
	     
	}

	@When("^select \"([^\"]*)\" and  Enter the MarcOptica$")
	public void select_and_Enter_the_MarcOptica(String arg1) throws Throwable {
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
		WebElement unidade = driver.findElement(By.name("ctl00$ctl00$chBco$cBFm$ddlMatrizFilialUsuario"));
		 JavascriptExecutor js1=(JavascriptExecutor)driver;
		 js1.executeScript("arguments[0].click();", unidade);

		 
		
	     
	}

	@When("^Select option as \"([^\"]*)\"$")
	public void select_option_as(String arg1) throws Throwable {
	     
	}

	@When("^Select  unidade as \"([^\"]*)\"$")
	public void select_unidade_as(String arg1) throws Throwable {
	     
	}

	@When("^enter the Usuario and senha$")
	public void enter_the_Usuario_and_senha() throws Throwable {
	     
	}

	@When("^give the justivicativa and click on the Verificar button$")
	public void give_the_justivicativa_and_click_on_the_Verificar_button() throws Throwable {
	     
	}

	@When("^schedule the appointment$")
	public void schedule_the_appointment() throws Throwable {
	     
	}

	@When("^select the Agendamentos Varios precendamentos$")
	public void select_the_Agendamentos_Varios_precendamentos() throws Throwable {
	     
	}

	@Then("^Click on the Agendar and click on the Fetcher$")
	public void click_on_the_Agendar_and_click_on_the_Fetcher() throws Throwable {
	     
	}

}
