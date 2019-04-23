package MyProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void login() throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\prashanth\\workspace\\Selenium Project\\src\\Credentials.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println("Login");
	}
	
	@Test
	public void InteractbyCSS()
	{
		System.out.println("Interact");
	}
	
	@Test
	public void Logoff()
	{
		System.out.println("Logoff");
	}

}
