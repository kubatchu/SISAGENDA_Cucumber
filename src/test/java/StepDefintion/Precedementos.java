package StepDefintion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
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
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;

import dataProviders.ReadPrppertiesFile;

public class Precedementos {
	private static final long timeOutInSeconds = 0;
	WebDriver driver = null;
	
	@Given("^Logged in to the SisAgenda credentials with valid username and password$")
	public void logged_in_to_the_SisAgenda_credentials_with_valid_username_and_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Users//syagnamu//Desktop//Selenium Dump//chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
         driver.get("http://smsisagendadeveloper.amil.com.br/SisAgenda/");
		
		//Enter USername and password		
		driver. findElement(By.name("txtCPFLogin")).sendKeys("Sandeep");
		driver.findElement(By.name("txtSenha")).sendKeys("Amil@2018");
		//Click on the Button 
		driver.findElement(By.name("btnEntrar")).click();
		
	}

	@When("^Goto to Procedimentos page$")
	public void goto_to_Procedimentos_page() throws Throwable {
		driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div[2]/div/div[1]/ul[3]/li/a")).click();
		driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div[2]/div/div[1]/ul[3]/li/ul/li[6]/a")).click();
		driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div[2]/div/div[1]/ul[3]/li/ul/li[6]/ul/li[7]/a")).click();
	    
	}

	@When("^Select the Tabela Procedimento$")
	public void select_the_Tabela_Procedimento() throws Throwable {
		driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul[1]/li/div/ul/li[1]/div[1]/div[2]/div[1]/span[1]/img")).click();
		driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul[1]/li/div/ul/li[1]/div[1]/div[2]/div[2]/a[1]/span")).click();
	     
	}

	@Then("^Codigo filed and click on the Alterar$")
	public void codigo_filed_and_click_on_the_Alterar() throws Throwable {
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


	
}
