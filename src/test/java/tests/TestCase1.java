package tests;

import org.testng.annotations.Test;

public class TestCase1 { 

	@Test
	public void Open_Browser(){
		
		System.out.println("Open the browser");
	}
	
	@Test
	public void Launching_URL(){
		
		System.out.println("Launching URL");
	}
	
	@Test
	public void Click_Signup_Link(){
		System.out.println("Click Signup Link");  
	}
	
	@Test
	public void Enter_Username(){
		System.out.println("Enter Username");
	}
	
	@Test
	public void Enter_Password(){
		System.out.println("Enter Password");
	}
	
	@Test
	public void Click_Next_Button(){
		System.out.println("Click Next Button");
	}
	
	@Test
	public void GoTo_Gmail(){
		System.out.println("Go to Gmail");
	}
	
	@Test
	public void Navigate_HomePage(){
		System.out.println("Navigate to Home Page");
	}
}
