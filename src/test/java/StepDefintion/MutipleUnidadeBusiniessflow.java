package StepDefintion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ReadPrppertiesFile;

public class MutipleUnidadeBusiniessflow {
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

	@Given("^Login username password and Entrar button$")
	public void login_username_password_and_Entrar_button() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Users//syagnamu//Desktop//Selenium Dump//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
    	
		driver.get(assessCheck.getProperty("url"));
		driver.findElement(By.xpath("//*[@id=\"txtCPFLogin\"]")).sendKeys(assessCheck.getProperty("username"));
		driver.findElement(By.xpath("//*[@id=\"txtSenha\"]")).sendKeys(assessCheck.getProperty("password"));
		driver.findElement(By.xpath("//*[@id=\"btnEntrar\"]")).click();
	    
	}

	@When("^Click on the Agendamento Mutiple unidade$")
	public void click_on_the_Agendamento_Mutiple_unidade() throws Throwable {
		driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div[3]/a/span[2]")).click();
		
	}

	@When("^Enter MarcOptica and enter \"([^\"]*)\"$")
	public void enter_MarcOptica_and_enter(String arg1) throws Throwable {
		WebElement MO=driver.findElement(By.name("ctl00$ctl00$chBco$cBFm$txtBuscaMO "));
		MO.sendKeys("904486222");
		MO.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/table/tbody/tr[1]/td/div/fieldset/table/tbody/tr/td[2]/div/div[2]/div[1]/span[1]/img")).click();
		driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/table/tbody/tr[1]/td/div/fieldset/table/tbody/tr/td[2]/div/div[2]/div[1]/span[2]/span/input")).click();
		Thread.sleep(10000);
	     
	}

	@When("^Select Especiliadade  and professional$")
	public void select_Especiliadade_and_professional() throws Throwable {
		driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/table/tbody/tr[2]/td/div/fieldset/div/div/div/table/tbody/tr[4]/td[1]/input")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/table/tbody/tr[2]/td/div/fieldset/div/div/div/table/tbody/tr[4]/td[3]/div[1]/select")).click();
		  
	     
	}

	@When("^click on the Localizer agenda$")
	public void click_on_the_Localizer_agenda() throws Throwable {
		Thread.sleep(10000);
	     driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/table/tbody/tr[3]/td[1]/div/fieldset/table/tbody/tr/td[3]/div[1]/span/div/a/span")).click();
	}

	@When("^schedule availabitility time and click on the aleragologia$")
	public void schedule_availabitility_time_and_click_on_the_aleragologia() throws Throwable {
	     
	}

	@Then("^click on the confirm agenda and agenda\\.$")
	public void click_on_the_confirm_agenda_and_agenda() throws Throwable {
	     
	}


}
