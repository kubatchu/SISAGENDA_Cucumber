package dataProviders;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class ReadPrppertiesFile{
	
	public static void main(String[] args) {
		try {
			File file = new File("C://Users//syagnamu//eclipse-workspace//SisAgendaFirstprogramwithCucumber//configs//Configuration.properties");
			FileInputStream fileInput =new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();
			Enumeration enuKeys = properties.keys();
			while(enuKeys.hasMoreElements()) {
				String Key = (String)enuKeys.nextElement();
				String value = properties.getProperty(Key); 
				System.out.println(Key +":"+value);
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
				
			
				
			}
		}

	}

	

