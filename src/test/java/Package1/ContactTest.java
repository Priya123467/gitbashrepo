package Package1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createcontacttest(){
		String URL = System.getProperty("url");//provide all these values in commandprompt
		String BROWSER = System.getProperty("browser");
		String USERNAME= System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("execute createcontactTest");
		
	}
	
	@Test
	public void modifycontacttest(){
		System.out.println("execute modify contact Test");
		
	}
	@Test
	public void deletecontacttest(){
		System.out.println("execute deletecontactTest");
		
	}



}
