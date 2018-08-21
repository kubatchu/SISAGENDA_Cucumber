package StepDefintion;

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
import dataProviders.ReadPrppertiesFile;

public class LoginTest   {
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
		@Given("^open the browser and enter username and password\\.$")
		public void open_the_browser_and_enter_username_and_password( ) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C://Users//syagnamu//Desktop//Selenium Dump//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
	    	
			driver.get(assessCheck.getProperty("url"));
			driver.findElement(By.xpath("//*[@id=\"txtCPFLogin\"]")).sendKeys(assessCheck.getProperty("username"));
			driver.findElement(By.xpath("//*[@id=\"txtSenha\"]")).sendKeys(assessCheck.getProperty("password"));
		    
		    
		}

		

		@When("^click on the \"([^\"]*)\" button\\.$")
		public void click_on_the_button(String arg1) throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"btnEntrar\"]")).click();
		}

		@When("^Click on the Confirmcao de Agenda$")
		public void click_on_the_Confirmcao_de_Agenda() throws Throwable {
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div[4]/a/span[2]")).click();
			
		}

			@When("^Enter the \"([^\"]*)\" and click on the Enter$")
		public void enter_the_and_click_on_the_Enter(String arg1) throws Throwable {
			Thread.sleep(5000);
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"chBco_cBFm_txtMarcaOtica\"]"));
		       ele.sendKeys("13037757434");
		   ele.sendKeys(Keys.ENTER);
		   //Thread.sleep(5000);
		}

		@When("^Select Fillal option as \"([^\"]*)\"$")
		public void select_Fillal_option_as(String arg1) throws Throwable {
			Thread.sleep(5000);
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul/li[1]/div/ul/li[3]/div/div[2]/div[1]/span[2]/span/input")).click();
			
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul/li[1]/div/ul/li[3]/div/div[2]/div[2]/a[7]/span")).click();
		}

		@When("^Select unidade option as \"([^\"]*)\"$")
		public void select_unidade_option_as(String arg1) throws Throwable {
			Thread.sleep(30000);
			   driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul/li[1]/div/ul/li[4]/div/div[2]/div[1]/span[2]/span/input")).click();	
			   driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul/li[1]/div/ul/li[4]/div/div[2]/div[2]/a[11]/span")).click();
			   
		    
		}

		@When("^Select \"([^\"]*)\"$")
		public void select(String arg1) throws Throwable {
			Thread.sleep(30000);
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul/li[1]/div/ul/li[5]/div/div[2]/div[1]/span[2]/span/input")).click();
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul/li[1]/div/ul/li[5]/div/div[2]/div[2]/a[8]/span")).click();
		}

		@Then("^Click on the \"([^\"]*)\"$")
		public void click_on_the(String arg1) throws Throwable {
			Thread.sleep(30000);
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div/ul/li[1]/div/ul/li[6]/div/div[2]/div[1]/span[2]/span/input")).click();
			driver.findElement(By.linkText("MOTOMU OKAMOTO")).click();
		  Thread.sleep(5000);
		  WebElement element = driver.findElement(By.id("chBco_cBFm_BtnBuscar"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", element);
		}
	}


