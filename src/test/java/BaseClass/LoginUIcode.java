package BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProviders.ReadPrppertiesFile;

public class LoginUIcode {
	private String Login = "";
	public class LoginTest   {
		private static final long timeOutInSeconds = 0;
		WebDriver driver = null;
		ReadPrppertiesFile readprovider;
		
		
		File assessFile = new File( "C:\\Users\\syagnamu\\eclipse-workspace\\SisAgendaFirstprogramwithCucumber\\configs\\Configuration.properties");
	    public Properties assessCheck = new Properties();
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
			 
	    private void usernameandpassword() {
				System.setProperty("webdriver.chrome.driver", "C://Users//syagnamu//Desktop//Selenium Dump//chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().window().maximize();
		    	
				driver.get(assessCheck.getProperty("url"));
				driver.findElement(By.xpath("//*[@id=\"txtCPFLogin\"]")).sendKeys(assessCheck.getProperty("username"));
				driver.findElement(By.xpath("//*[@id=\"txtSenha\"]")).sendKeys(assessCheck.getProperty("password"));
			    
			    
			}

			

			 
			public void click_on_the_button(String arg1) throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"btnEntrar\"]")).click();
			}
}
}
