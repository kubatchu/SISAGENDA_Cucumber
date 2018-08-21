package StepDefintion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class searchexam {
	WebDriver driver = null;
	@Given("^Navigate to the Home page$")
	public void navigate_to_the_Home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Users//syagnamu//Desktop//Selenium Dump//chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		//Enter URL
         driver.get("http://smsisagendadeveloper.amil.com.br/SisAgenda/");
		
		//Enter USername and password		
		driver. findElement(By.name("txtCPFLogin")).sendKeys("Sandeep");
		driver.findElement(By.name("txtSenha")).sendKeys("Amil@2018");
		//Click on the Button 
		driver.findElement(By.name("btnEntrar")).click();
		
	    
	}

	@When("^Navigate to the Agendamento Exame page$")
	public void navigate_to_the_Agendamento_Exame_page() throws Throwable {
		//Click on the Agendamento Exam
		driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div[2]/a/span[2]")).click();
		Thread.sleep(10000);
		//Select Fillal
		driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[1]/td/div[2]/table/tbody/tr[1]/td[1]/span[2]/div/span/div[2]/div[1]/span[1]/img")).click();
		//Enter Marc Optica
		driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[1]/td/div[2]/table/tbody/tr[1]/td[1]/span[2]/div/span/div[2]/div[2]/a[7]/span")).click();
		WebElement MarcOp = driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[1]/td/div[2]/table/tbody/tr[1]/td[1]/span[2]/span[1]/div/input[1]"));
		MarcOp.sendKeys("444060006");
		MarcOp.sendKeys(Keys.ENTER);
	    
	     
	}

	@Then("^Enter Ambulatorial Exam$")
	public void enter_Ambulatorial_Exam() throws Throwable {
		//Search Exam
		WebDriverWait wait=new WebDriverWait(driver,10000);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("ctl00$ctl00$chBco$cBFm$TxtPesquisaProcedimento")));
		WebElement Exam= driver.findElement(By.name("ctl00$ctl00$chBco$cBFm$TxtPesquisaProcedimento"));
				Exam.sendKeys("Ambulatorial");
		        Exam.sendKeys(Keys.ENTER);
		        //Adding ECG
		        driver.findElement(By.xpath("html/body/form/div[3]/div[4]/div/table[1]/tbody/tr[2]/td[1]/div[2]/div/div/ul/li[1]/div/div/input[2]")).click();
		
	     
	}

}
